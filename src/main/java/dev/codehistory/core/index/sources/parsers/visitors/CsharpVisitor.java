package dev.codehistory.core.index.sources.parsers.visitors;

import dev.codehistory.core.entities.sources.Module;
import dev.codehistory.core.entities.sources.*;
import dev.codehistory.core.exceptions.CodeHistoryParseException;
import dev.codehistory.core.index.sources.data.LocalSourceIndexData;
import dev.codehistory.core.index.sources.generated.csharp.CSharpParser;
import dev.codehistory.core.index.sources.generated.csharp.CSharpParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class CsharpVisitor extends CSharpParserBaseVisitor<Object> {
  private final LocalSourceIndexData sourceIndexData;
  private Module currentModule;
  private final Deque<ModuleUnit> moduleUnits = new LinkedList<>();
  private final Deque<ParserRuleContext> sourcePieces = new LinkedList<>();
  private final DefinitionBuilder currentDefinition = new DefinitionBuilder();

  public CsharpVisitor(LocalSourceIndexData sourceIndexData) {
    this.sourceIndexData = sourceIndexData;
  }

  // ============================== Module ==============================
  @Override
  public Object visitNamespace_declaration(CSharpParser.Namespace_declarationContext ctx) {
    putModule(ctx.qi.getText());
    return super.visitNamespace_declaration(ctx);
  }

  // ============================== ModuleUnit ==============================

  @Override
  public Object visitType_declaration(CSharpParser.Type_declarationContext ctx) {
    currentDefinition
        .append(ctx.attributes())
        .append(ctx.all_member_modifiers());

    sourcePieces.push(ctx);
    super.visitType_declaration(ctx);
    sourcePieces.pop();
    return true;
  }

  @Override
  public Object visitClass_definition(CSharpParser.Class_definitionContext ctx) {
    currentDefinition
        .appendKeywordPlaceholder()
        .appendIdentifierPlaceholder()
        .append(ctx.type_parameter_list())
        .append(ctx.type_parameter_constraints_clauses())
        .append(ctx.class_base());
  
    DefinitionBuilder identifier = new DefinitionBuilder();
    identifier.append(ctx.identifier()).append(ctx.type_parameter_list());
    
    Token definitionEnd = currentDefinition.getLastAppended() == null ? ctx.identifier().stop : currentDefinition.getLastAppended().stop;
    putModuleUnit(ctx.CLASS().getText(), identifier.flush(), currentDefinition.flush(), definitionEnd);
    super.visitChildren(ctx);
    moduleUnits.pop();
    return true;
  }
  
  @Override
  public Object visitStruct_definition(CSharpParser.Struct_definitionContext ctx) {
    currentDefinition
        .appendKeywordPlaceholder()
        .appendIdentifierPlaceholder()
        .append(ctx.type_parameter_list())
        .append(ctx.struct_interfaces())
        .append(ctx.type_parameter_constraints_clauses());
  
    DefinitionBuilder identifier = new DefinitionBuilder();
    identifier.append(ctx.identifier()).append(ctx.type_parameter_list());
    
    Token definitionEnd = currentDefinition.getLastAppended() == null ? ctx.identifier().stop : currentDefinition.getLastAppended().stop;
    putModuleUnit(ctx.STRUCT().getText(), identifier.flush(), currentDefinition.flush(), definitionEnd);
    super.visitChildren(ctx);
    moduleUnits.pop();
    return true;
  }

  @Override
  public Object visitInterface_definition(CSharpParser.Interface_definitionContext ctx) {
    currentDefinition
        .appendKeywordPlaceholder()
        .appendIdentifierPlaceholder()
        .append(ctx.variant_type_parameter_list())
        .append(ctx.interface_base())
        .append(ctx.type_parameter_constraints_clauses());
  
    DefinitionBuilder identifier = new DefinitionBuilder();
    identifier.append(ctx.identifier()).append(ctx.variant_type_parameter_list());
    
    Token definitionEnd = currentDefinition.getLastAppended() == null ? ctx.identifier().stop : currentDefinition.getLastAppended().stop;
    putModuleUnit(ctx.INTERFACE().getText(), identifier.flush(), currentDefinition.flush(), definitionEnd);
    super.visitChildren(ctx);
    moduleUnits.pop();
    return true;
  }

  @Override
  public Object visitEnum_definition(CSharpParser.Enum_definitionContext ctx) {
    currentDefinition
        .appendKeywordPlaceholder()
        .appendIdentifierPlaceholder()
        .append(ctx.enum_base());
  
    Token definitionEnd = currentDefinition.getLastAppended() == null ? ctx.identifier().stop : currentDefinition.getLastAppended().stop;
    putModuleUnit(ctx.ENUM().getText(), ctx.identifier().getText(), currentDefinition.flush(), definitionEnd);
    super.visitChildren(ctx);
    moduleUnits.pop();
    return true;
  }

  @Override
  public Object visitDelegate_definition(CSharpParser.Delegate_definitionContext ctx) {
    currentDefinition
        .appendKeywordPlaceholder()
        .append(ctx.return_type())
        .appendIdentifierPlaceholder(true)
        .append(ctx.variant_type_parameter_list())
        .append(ctx.OPEN_PARENS(), true)
        .append(ctx.formal_parameter_list(), true)
        .append(ctx.CLOSE_PARENS())
        .append(ctx.type_parameter_constraints_clauses());
  
    DefinitionBuilder identifier = new DefinitionBuilder();
    identifier.append(ctx.identifier()).append(ctx.variant_type_parameter_list());
    
    Token definitionEnd = currentDefinition.getLastAppended() == null ? ctx.identifier().stop : currentDefinition.getLastAppended().stop;
    putModuleUnit(ctx.DELEGATE().getText(), identifier.flush(), currentDefinition.flush(), definitionEnd);
    super.visitChildren(ctx);
    moduleUnits.pop();
    return true;
  }

  // ============================== ModuleUnitMember ==============================

  @Override
  public Object visitClass_member_declaration(CSharpParser.Class_member_declarationContext ctx) {
    currentDefinition
        .append(ctx.attributes())
        .append(ctx.all_member_modifiers());

    sourcePieces.push(ctx);
    super.visitChildren(ctx);
    sourcePieces.pop();
    return true;
  }

  @Override
  public Object visitStruct_member_declaration(CSharpParser.Struct_member_declarationContext ctx) {
    sourcePieces.push(ctx);
    currentDefinition
        .append(ctx.attributes())
        .append(ctx.all_member_modifiers());

    if (ctx.FIXED() != null) {
      currentDefinition.append(ctx.FIXED());
      currentDefinition.append(ctx.type_());
      currentDefinition.appendIdentifierPlaceholder(true);

      for (CSharpParser.Fixed_size_buffer_declaratorContext decl : ctx.fixed_size_buffer_declarator()) {
        sourcePieces.push(decl);
        DefinitionBuilder def = currentDefinition.copy();
        def.append(decl.OPEN_BRACKET(), true);
        def.append(decl.expression(), true);
        def.append(decl.CLOSE_BRACKET());

        putModuleUnitMember(ModuleUnitMember.Field, decl.identifier().getText(), def.flush(), "", decl.stop);
        sourcePieces.pop();
      }

      currentDefinition.flush();
      sourcePieces.pop();
    } else {
      super.visitStruct_member_declaration(ctx);
      sourcePieces.pop();
    }

    return true;
  }

  @Override
  public Object visitInterface_member_declaration(CSharpParser.Interface_member_declarationContext ctx) {
    sourcePieces.push(ctx);

    currentDefinition
        .append(ctx.attributes())
        .append(ctx.NEW())
        .append(ctx.UNSAFE())
        .append(ctx.EVENT())
        .append(ctx.type_())
        .append(ctx.VOID())
        .appendIdentifierPlaceholder();

    if (ctx.EVENT() != null) {
      putModuleUnitMember(ModuleUnitMember.Event, ctx.identifier().getText(), currentDefinition.flush(), "", ctx.identifier().stop);
    } else {
      if (ctx.VOID() != null) {
        currentDefinition.append(ctx.type_parameter_list(), true)
            .append(ctx.OPEN_PARENS(), true)
            .appendArgList(ctx.formal_parameter_list(), true)
            .append(ctx.CLOSE_PARENS(), true)
            .append(ctx.type_parameter_constraints_clauses());
  
        String argList = currentDefinition.getArgList();
        putModuleUnitMember(ModuleUnitMember.Method, ctx.identifier().getText(), currentDefinition.flush(), argList, ctx.CLOSE_PARENS().getSymbol());
      } else if (ctx.THIS() != null) {
        currentDefinition.append(ctx.OPEN_BRACE())
            .append(ctx.interface_accessors())
            .append(ctx.CLOSE_BRACE());

        DefinitionBuilder id = new DefinitionBuilder();
        id.append(ctx.THIS(), true)
            .append(ctx.OPEN_BRACKET(), true)
            .append(ctx.formal_parameter_list(), true)
            .append(ctx.CLOSE_BRACKET());

        putModuleUnitMember(ModuleUnitMember.Indexer, id.flush(), currentDefinition.flush(), "", ctx.CLOSE_BRACKET().getSymbol());
      } else {
        currentDefinition.append(ctx.type_parameter_list())
            .append(ctx.OPEN_PARENS(), true)
            .append(ctx.OPEN_BRACE())
            .appendArgList(ctx.formal_parameter_list(), true)
            .append(ctx.interface_accessors())
            .append(ctx.CLOSE_PARENS(), true)
            .append(ctx.CLOSE_BRACE())
            .append(ctx.type_parameter_constraints_clauses());

        String category = ctx.OPEN_PARENS() == null ? ModuleUnitMember.Property : ModuleUnitMember.Method;
        Token definitionStop = null;
        if(ctx.OPEN_PARENS() != null) {
          definitionStop = ctx.CLOSE_PARENS().getSymbol();
        } else if(ctx.OPEN_BRACE() != null) {
          definitionStop = ctx.OPEN_BRACE().getSymbol();
        } else {
          definitionStop = ctx.right_arrow().first;
        }
  
        String argList = currentDefinition.getArgList();
        putModuleUnitMember(category, ctx.identifier().getText(), currentDefinition.flush(), argList, definitionStop);
      }
    }

    super.visitInterface_member_declaration(ctx);
    sourcePieces.pop();
    return true;
  }

  @Override
  public Object visitCommon_member_declaration(CSharpParser.Common_member_declarationContext ctx) {
    if (ctx.VOID() != null) {
      currentDefinition.append(ctx.VOID());
      appendMethod_declaration(ctx.method_declaration());
      return true;
    } else {
      return super.visitCommon_member_declaration(ctx);
    }
  }

  @Override
  public Object visitConstant_declaration(CSharpParser.Constant_declarationContext ctx) {
    currentDefinition
        .append(ctx.CONST())
        .append(ctx.type_())
        .appendIdentifierPlaceholder();

    for (CSharpParser.Constant_declaratorContext decl : ctx.constant_declarators().constant_declarator()) {
      sourcePieces.push(decl);
      DefinitionBuilder def = currentDefinition.copy();
      def.append(decl.ASSIGNMENT())
          .append(decl.expression());

      putModuleUnitMember(ModuleUnitMember.Field, decl.identifier().getText(), def.flush(), "", decl.stop);
      sourcePieces.pop();
    }

    currentDefinition.flush();
    return super.visitConstant_declaration(ctx);
  }

  @Override
  public Object visitTyped_member_declaration(CSharpParser.Typed_member_declarationContext ctx) {
    currentDefinition.append(ctx.type_());

    if (ctx.namespace_or_type_name() != null) {
      currentDefinition.append(ctx.namespace_or_type_name());
      appendIndexer_declaration(ctx.indexer_declaration());
    } else if (ctx.method_declaration() != null) {
      appendMethod_declaration(ctx.method_declaration());
    } else if (ctx.property_declaration() != null) {
      appendProperty_declaration(ctx.property_declaration());
    } else if (ctx.indexer_declaration() != null) {
      appendIndexer_declaration(ctx.indexer_declaration());
    } else if (ctx.operator_declaration() != null) {
      appendOperator_declaration(ctx.operator_declaration());
    } else if (ctx.field_declaration() != null) {
      appendField_declaration(ctx.field_declaration());
    }

    return super.visitTyped_member_declaration(ctx);
  }

  @Override
  public Object visitEnum_member_declaration(CSharpParser.Enum_member_declarationContext ctx) {
    currentDefinition
        .append(ctx.attributes())
        .appendIdentifierPlaceholder()
        .append(ctx.ASSIGNMENT())
        .append(ctx.expression());

    sourcePieces.push(ctx);
    putModuleUnitMember(ModuleUnitMember.Field, ctx.identifier().getText(), currentDefinition.flush(), "", ctx.identifier().getStop());
    sourcePieces.pop();

    return super.visitEnum_member_declaration(ctx);
  }
  
  @Override
  public Object visitMethod_body(CSharpParser.Method_bodyContext ctx) {
    return true;
  }
  
  private void appendIndexer_declaration(CSharpParser.Indexer_declarationContext ctx) {
    currentDefinition.appendIdentifierPlaceholder();
    DefinitionBuilder id = new DefinitionBuilder();
    id.append(ctx.THIS(), true)
        .append(ctx.OPEN_BRACKET(), true)
        .append(ctx.formal_parameter_list(), true)
        .append(ctx.CLOSE_BRACKET());

    putModuleUnitMember(ModuleUnitMember.Indexer, id.flush(), currentDefinition.flush(), "", ctx.CLOSE_BRACKET().getSymbol());
  }

  private void appendMethod_declaration(CSharpParser.Method_declarationContext ctx) {
    currentDefinition.appendIdentifierPlaceholder();

    DefinitionBuilder id = new DefinitionBuilder();
    id.append(ctx.method_member_name(), true)
        .append(ctx.type_parameter_list(), true)
        .append(ctx.OPEN_PARENS(), true)
        .appendArgList(ctx.formal_parameter_list(), true)
        .append(ctx.CLOSE_PARENS());

    Token definitionEnd = ctx.CLOSE_PARENS() != null ? ctx.CLOSE_PARENS().getSymbol() : ctx.formal_parameter_list().stop;
    
    String argList = currentDefinition.getArgList();
    putModuleUnitMember(ModuleUnitMember.Method, id.flush(), currentDefinition.flush(), argList, definitionEnd);
  }

  private void appendProperty_declaration(CSharpParser.Property_declarationContext ctx) {
    currentDefinition.appendIdentifierPlaceholder();
    DefinitionBuilder id = new DefinitionBuilder();
    id.append(ctx.member_name());

    Token definitionEnd = ctx.OPEN_BRACE() != null ? ctx.OPEN_BRACE().getSymbol() : ctx.right_arrow().start;
    putModuleUnitMember(ModuleUnitMember.Property, id.flush(), currentDefinition.flush(), "", definitionEnd);
  }

  private void appendOperator_declaration(CSharpParser.Operator_declarationContext ctx) {
    currentDefinition.appendIdentifierPlaceholder();
    DefinitionBuilder id = new DefinitionBuilder();
    id.append(ctx.OPERATOR(), true)
        .append(ctx.overloadable_operator(), true)
        .append(ctx.OPEN_PARENS(), true);
    List<CSharpParser.Arg_declarationContext> arg_declaration = ctx.arg_declaration();
    for (int i = 0; i < arg_declaration.size(); i++) {
      CSharpParser.Arg_declarationContext arg = arg_declaration.get(i);
      id.append(arg, false);

      if (i == 0 && arg_declaration.size() > 1) {
        id.append(ctx.COMMA());
      }
    }
    id.append(ctx.CLOSE_PARENS());

    putModuleUnitMember(ModuleUnitMember.Operator, id.flush(), currentDefinition.flush(), "", ctx.CLOSE_PARENS().getSymbol());
  }

  private void appendField_declaration(CSharpParser.Field_declarationContext ctx) {
    currentDefinition.appendIdentifierPlaceholder();

    for (CSharpParser.Variable_declaratorContext decl : ctx.variable_declarators().variable_declarator()) {
      sourcePieces.push(decl);
      DefinitionBuilder def = currentDefinition.copy();
      def.append(decl.ASSIGNMENT());
      def.append(decl.variable_initializer());
      DefinitionBuilder id = new DefinitionBuilder();
      id.append(decl.identifier());

      putModuleUnitMember(ModuleUnitMember.Field, id.flush(), def.flush(), "", decl.identifier().stop);
      sourcePieces.pop();
    }

    currentDefinition.flush();
  }

  @Override
  public Object visitEvent_declaration(CSharpParser.Event_declarationContext ctx) {
    currentDefinition.append(ctx.EVENT());
    currentDefinition.append(ctx.type_());
    currentDefinition.appendIdentifierPlaceholder();

    if (ctx.variable_declarators() != null
        && ctx.variable_declarators().variable_declarator() != null
        && ctx.variable_declarators().variable_declarator().isEmpty()) {
      for (CSharpParser.Variable_declaratorContext decl : ctx.variable_declarators().variable_declarator()) {
        DefinitionBuilder def = currentDefinition.copy();
        def.append(decl.ASSIGNMENT());
        def.append(decl.variable_initializer());
        DefinitionBuilder id = new DefinitionBuilder();
        id.append(decl.identifier());

        putModuleUnitMember(ModuleUnitMember.Event, id.flush(), def.flush(), "", decl.identifier().stop);
      }
      currentDefinition.flush();
    } else {
      putModuleUnitMember(ModuleUnitMember.Event, ctx.member_name().getText(), currentDefinition.flush(), "", ctx.member_name().stop);
    }

    return super.visitEvent_declaration(ctx);
  }

  @Override
  public Object visitConversion_operator_declarator(CSharpParser.Conversion_operator_declaratorContext ctx) {
    currentDefinition.append(ctx.IMPLICIT());
    currentDefinition.append(ctx.EXPLICIT());
    currentDefinition.append(ctx.OPERATOR());
    currentDefinition.appendIdentifierPlaceholder();

    DefinitionBuilder id = new DefinitionBuilder();
    id.append(ctx.type_(), true);
    id.append(ctx.OPEN_PARENS(), true);
    id.append(ctx.arg_declaration(), true);
    id.append(ctx.CLOSE_PARENS());

    putModuleUnitMember(ModuleUnitMember.Operator, id.flush(), currentDefinition.flush(), "", ctx.CLOSE_PARENS().getSymbol());
    return super.visitConversion_operator_declarator(ctx);
  }

  @Override
  public Object visitConstructor_declaration(CSharpParser.Constructor_declarationContext ctx) {
    currentDefinition.appendIdentifierPlaceholder();

    DefinitionBuilder id = new DefinitionBuilder();
    id.append(ctx.identifier(), true);
    id.append(ctx.OPEN_PARENS(), true);
    id.appendArgList(ctx.formal_parameter_list(), true);
    id.append(ctx.CLOSE_PARENS(), true);
  
    String argList = currentDefinition.getArgList();
    putModuleUnitMember(ModuleUnitMember.Constructor, id.flush(), currentDefinition.flush(), argList, ctx.CLOSE_PARENS().getSymbol());
    return super.visitConstructor_declaration(ctx);
  }

  @Override
  public Object visitMethod_declaration(CSharpParser.Method_declarationContext ctx) {
    return super.visitMethod_declaration(ctx);
  }

  @Override
  public Object visitDestructor_definition(CSharpParser.Destructor_definitionContext ctx) {
    currentDefinition
        .appendKeywordPlaceholder(true)
        .appendIdentifierPlaceholder();

    putModuleUnitMember("~", ctx.identifier().getText(), currentDefinition.flush(), "", ctx.identifier().stop);
    return super.visitChildren(ctx);
  }

  // ============================== Service methods ==============================

  private void putModule(String namespace) {
    Module module = new Module();
    module.setModuleType(ModuleType.CODE);
    module.setName(namespace);

    currentModule = sourceIndexData.put(module);
  }

  private void putModuleUnit(String keyword, String identifier, String definition, Token definitionEnd) {
    if (currentModule == null) {
      throw new CodeHistoryParseException("currentModule is null");
    }

    StringBuilder parentBuilder = new StringBuilder();
    for (ModuleUnit parent : moduleUnits) {
      parentBuilder.append(parent.getIdentifier()).append(".");
    }
    parentBuilder.append(identifier);

    ModuleUnit moduleUnit = new ModuleUnit();
    moduleUnit.setRealm(Realm.CSHARP);
    moduleUnit.setKeyword(keyword);
    moduleUnit.setIdentifier(parentBuilder.toString());
    moduleUnit.getSourceState().setDefinition(definition);
    moduleUnit.setModule(currentModule);
    currentModule.getModuleUnits().add(moduleUnit);

    ParserRuleContext currentPiece = sourcePieces.peek();
    setSourcePieceState(moduleUnit.getSourceState(), currentPiece, currentPiece.getText(), definitionEnd);

    moduleUnits.push(sourceIndexData.put(moduleUnit));
  }

  private void putModuleUnitMember(
      String category,
      String identifier,
      String definition,
      String distinguisher,
      Token definitionEnd) {
    if (moduleUnits.isEmpty()) {
      throw new IllegalStateException("currentModuleUnit is null");
    }

    ModuleUnit currentModuleUnit = moduleUnits.peek();
    ModuleUnitMember moduleUnitMember = new ModuleUnitMember();
    moduleUnitMember.setCategory(category);
    moduleUnitMember.getSourceState().setDefinition(definition);
    moduleUnitMember.setModuleUnit(currentModuleUnit);
    moduleUnitMember.setIdentifier(identifier);
    moduleUnitMember.setDistinguisher(distinguisher);

    currentModuleUnit.getModuleUnitMembers().add(moduleUnitMember);

    ParserRuleContext currentPiece = getCurrentPiece();
    String sha1Source = formatUnitMemberSha1Source(identifier, definition, category, currentPiece);
    setSourcePieceState(moduleUnitMember.getSourceState(), currentPiece, sha1Source, definitionEnd);

    sourceIndexData.put(moduleUnitMember);
  }

  private void setSourcePieceState(SourceState sourceState, ParserRuleContext piece, String sha1source, Token definitionEnd) {
    sourceState.setStartPos(piece.start.getCharPositionInLine());
    sourceState.setStartLine(piece.start.getLine());
    sourceState.setEndPos(piece.stop.getCharPositionInLine() + piece.stop.getText().length());
    sourceState.setEndLine(piece.stop.getLine());
    sourceState.setDefinitioneEdLine(definitionEnd.getLine());
    sourceState.setDefinitioneEdPos(definitionEnd.getCharPositionInLine() + definitionEnd.getText().length());

    String sha1 = DigestUtils.sha1Hex(sha1source);
    sourceState.setSha1(sha1);
  }

  private ParserRuleContext getCurrentPiece() {
    return sourcePieces.peek();
  }

  private String formatUnitMemberSha1Source(
      String identifier,
      String definition,
      String category,
      ParserRuleContext currentPiece) {
//    String sha1Source = category.equals(ModuleUnitMember.Field)
//        ? SourcesUtil.fillMemberDefinition(definition, identifier)
//        : currentPiece.getText();
  
    String sha1Source = currentPiece.getText();

    return sha1Source;
  }
}
