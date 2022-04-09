package dev.codehistory.core.index.sources.parsers.visitors;

import dev.codehistory.core.entities.sources.Module;
import dev.codehistory.core.entities.sources.*;
import dev.codehistory.core.exceptions.CodeHistoryParseException;
import dev.codehistory.core.index.sources.data.LocalSourceIndexData;
import dev.codehistory.core.index.sources.generated.java.JavaParser;
import dev.codehistory.core.index.sources.generated.java.JavaParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class JavaVisitor extends JavaParserBaseVisitor<Object> {
  private final LocalSourceIndexData sourceIndexData;
  private Module currentModule;
  private final Deque<ModuleUnit> moduleUnits = new LinkedList<>();
  private final Deque<ParserRuleContext> sourcePieces = new LinkedList<>();
  private final DefinitionBuilder currentDefinition = new DefinitionBuilder();

  public JavaVisitor(LocalSourceIndexData sourceIndexData) {
    this.sourceIndexData = sourceIndexData;
  }

  // ============================== Module ==============================

  @Override
  public Object visitPackageDeclaration(JavaParser.PackageDeclarationContext ctx) {
    StringBuilder packageModifier = new StringBuilder();
    for(JavaParser.AnnotationContext context : ctx.annotation()) {
      packageModifier.append(context.getText() + " ");
    }

    if(packageModifier.length() > 0) {
      packageModifier.setLength(packageModifier.length() - 2);
    }

    putModule(packageModifier.toString(), ctx.qualifiedName().getText());

    return super.visitPackageDeclaration(ctx);
  }

  // ============================== ModuleUnit ==============================

  @Override
  public Object visitTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
    for(JavaParser.ClassOrInterfaceModifierContext modifier : ctx.classOrInterfaceModifier()) {
      currentDefinition.append(modifier);
    }

    sourcePieces.push(ctx);
    super.visitTypeDeclaration(ctx);
    sourcePieces.pop();
    return true;
  }

  @Override
  public Object visitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
    currentDefinition
        .appendKeywordPlaceholder()
        .appendIdentifierPlaceholder()
        .append(ctx.typeParameters())
        .append(ctx.EXTENDS())
        .append(ctx.typeType())
        .append(ctx.IMPLEMENTS())
        .append(ctx.typeList());
  
    Token definitionEnd = currentDefinition.getLastAppended() == null ? ctx.IDENTIFIER().getSymbol() : currentDefinition.getLastAppended().stop;
    putModuleUnit(ctx.CLASS().getText(), ctx.IDENTIFIER().getText(), currentDefinition.flush(), definitionEnd);
    Object res = super.visitClassDeclaration(ctx);
    moduleUnits.pop();

    return res;
  }

  @Override
  public Object visitEnumDeclaration(JavaParser.EnumDeclarationContext ctx) {
    currentDefinition
        .appendKeywordPlaceholder()
        .appendIdentifierPlaceholder()
        .append(ctx.IMPLEMENTS())
        .append(ctx.typeList());
  
    Token definitionEnd = currentDefinition.getLastAppended() == null ? ctx.IDENTIFIER().getSymbol() : currentDefinition.getLastAppended().stop;
    putModuleUnit(ctx.ENUM().getText(), ctx.IDENTIFIER().getText(), currentDefinition.flush(), definitionEnd);
    Object res = super.visitEnumDeclaration(ctx);
    moduleUnits.pop();

    return res;
  }
  
  @Override
  public Object visitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) {
    currentDefinition
        .appendKeywordPlaceholder()
        .appendIdentifierPlaceholder()
        .append(ctx.typeParameters())
        .append(ctx.EXTENDS())
        .append(ctx.typeList());
  
    Token definitionEnd = currentDefinition.getLastAppended() == null ? ctx.IDENTIFIER().getSymbol() : currentDefinition.getLastAppended().stop;
    putModuleUnit(ctx.INTERFACE().getText(), ctx.IDENTIFIER().getText(), currentDefinition.flush(), definitionEnd);
    Object res = super.visitInterfaceDeclaration(ctx);
    moduleUnits.pop();

    return res;
  }

  @Override
  public Object visitAnnotationTypeDeclaration(JavaParser.AnnotationTypeDeclarationContext ctx) {
    currentDefinition
        .append(ctx.AT())
        .appendKeywordPlaceholder()
        .appendIdentifierPlaceholder();
  
    Token definitionEnd = currentDefinition.getLastAppended() == null ? ctx.IDENTIFIER().getSymbol() : currentDefinition.getLastAppended().stop;
    putModuleUnit(ctx.INTERFACE().getText(), ctx.IDENTIFIER().getText(), currentDefinition.flush(), definitionEnd);
    Object res = super.visitAnnotationTypeDeclaration(ctx);
    moduleUnits.pop();

    return res;
  }

  // ============================== ModuleUnitMember ==============================

    // == declaration prebuilt
  @Override
  public Object visitInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx) {
    for(JavaParser.ModifierContext modifier : ctx.modifier()) {
      currentDefinition.append(modifier);
    }

    sourcePieces.push(ctx);
    super.visitInterfaceBodyDeclaration(ctx);
    sourcePieces.pop();
    return true;
  }
  
  @Override
  public Object visitAnnotationTypeElementDeclaration(JavaParser.AnnotationTypeElementDeclarationContext ctx) {
    for(JavaParser.ModifierContext modifier : ctx.modifier()) {
      currentDefinition.append(modifier);
    }
  
    sourcePieces.push(ctx);
    super.visitAnnotationTypeElementDeclaration(ctx);
    sourcePieces.pop();
    return true;
  }
  
  @Override
  public Object visitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
    for(JavaParser.ModifierContext modifier : ctx.modifier()) {
      currentDefinition.append(modifier);
    }

    sourcePieces.push(ctx);
    super.visitClassBodyDeclaration(ctx);
    sourcePieces.pop();
    return true;
  }
  // == declaration prebuilt

  @Override
  public Object visitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
      currentDefinition.append(ctx.typeTypeOrVoid());
      currentDefinition.appendIdentifierPlaceholder();
      currentDefinition.appendArgList(ctx.formalParameters());
  
      append_LBRACK_RBRACK(currentDefinition, ctx.LBRACK(), ctx.RBRACK());
      currentDefinition.append(ctx.THROWS());
      currentDefinition.append(ctx.qualifiedNameList());
  
      ParserRuleContext definitionEnd = ctx.qualifiedNameList() == null ? ctx.formalParameters() : ctx.qualifiedNameList();
      String argList = currentDefinition.getArgList();
      putModuleUnitMember(ModuleUnitMember.Method, ctx.IDENTIFIER().getText(), currentDefinition.flush(), argList, definitionEnd.stop);

    return super.visitMethodDeclaration(ctx);
  }
  
  @Override
  public Object visitMethodBody(JavaParser.MethodBodyContext ctx) {
    // ignore method body to skip internal interface dynamic implementation
    return null;
  }
  
  @Override
  public Object visitInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx) {
    for (JavaParser.InterfaceMethodModifierContext context : ctx.interfaceMethodModifier()) {
      currentDefinition.append(context);
    }
    
    currentDefinition.append(ctx.typeParameters());
    for (JavaParser.AnnotationContext context : ctx.annotation()) {
      currentDefinition.append(context);
    }
    currentDefinition.append(ctx.typeTypeOrVoid());
    currentDefinition.appendIdentifierPlaceholder();
    currentDefinition.appendArgList(ctx.formalParameters());
  
    append_LBRACK_RBRACK(currentDefinition, ctx.LBRACK(), ctx.RBRACK());
    currentDefinition.append(ctx.THROWS());
    currentDefinition.append(ctx.qualifiedNameList());
  
    ParserRuleContext definitionEnd = ctx.qualifiedNameList() == null ? ctx.formalParameters() : ctx.qualifiedNameList();
    String argList = currentDefinition.getArgList();
    putModuleUnitMember(ModuleUnitMember.Method, ctx.IDENTIFIER().getText(), currentDefinition.flush(), argList, definitionEnd.stop);
    
    return super.visitInterfaceMethodDeclaration(ctx);
  }
  
  @Override
  public Object visitConstDeclaration(JavaParser.ConstDeclarationContext ctx) {
    currentDefinition.append(ctx.typeType());
    
    for (JavaParser.ConstantDeclaratorContext context : ctx.constantDeclarator()) {
      DefinitionBuilder def = currentDefinition.copy();
      def.appendIdentifierPlaceholder();
      append_LBRACK_RBRACK(currentDefinition,
          context.LBRACK(),
          context.RBRACK());
  
      putModuleUnitMember(
          ModuleUnitMember.Field,
          context.IDENTIFIER().getText(),
          def.flush(),
          "",
          context.stop);
    }
    currentDefinition.flush();
    
    return super.visitConstDeclaration(ctx);
  }
  
  @Override
  public Object visitGenericMethodDeclaration(JavaParser.GenericMethodDeclarationContext ctx) {
    currentDefinition.append(ctx.typeParameters());
    return super.visitGenericMethodDeclaration(ctx);
  }

  @Override
  public Object visitFieldDeclaration(JavaParser.FieldDeclarationContext ctx) {
    currentDefinition.append(ctx.typeType());

    for(JavaParser.VariableDeclaratorContext variableDeclaratorCtx : ctx.variableDeclarators().variableDeclarator()) {
      DefinitionBuilder def = currentDefinition.copy();
      def.appendIdentifierPlaceholder();
      append_LBRACK_RBRACK(currentDefinition,
          variableDeclaratorCtx.variableDeclaratorId().LBRACK(),
          variableDeclaratorCtx.variableDeclaratorId().RBRACK());

      putModuleUnitMember(
          ModuleUnitMember.Field,
          variableDeclaratorCtx.variableDeclaratorId().IDENTIFIER().getText(),
          def.flush(),
          "",
          variableDeclaratorCtx.variableDeclaratorId().stop);
    }
    currentDefinition.flush();

    return super.visitFieldDeclaration(ctx);
  }
  
  @Override
  public Object visitEnumConstant(JavaParser.EnumConstantContext ctx) {
    for (JavaParser.AnnotationContext context : ctx.annotation()) {
      currentDefinition.append(context);
    }
    
    currentDefinition.appendIdentifierPlaceholder();
    currentDefinition.appendArgList(ctx.arguments());
  
    Token definitionEnd = ctx.arguments() == null ? ctx.IDENTIFIER().getSymbol() : ctx.arguments().stop;
    String argList = currentDefinition.getArgList();
    putModuleUnitMember(ModuleUnitMember.Field, ctx.IDENTIFIER().getText(), currentDefinition.flush(), argList, definitionEnd);
    
    return super.visitEnumConstant(ctx);
  }
  
  @Override
  public Object visitAnnotationMethodRest(JavaParser.AnnotationMethodRestContext ctx) {
    currentDefinition.appendIdentifierPlaceholder();
    currentDefinition.append(ctx.LPAREN());
    currentDefinition.append(ctx.RPAREN());
    currentDefinition.append(ctx.defaultValue());
  
    Token definitionEnd = ctx.defaultValue() == null ? ctx.RPAREN().getSymbol() : ctx.defaultValue().stop;
    putModuleUnitMember(ModuleUnitMember.Field, ctx.IDENTIFIER().getText(), currentDefinition.flush(), "", definitionEnd);
    
    return super.visitAnnotationMethodRest(ctx);
  }
  
  @Override
  public Object visitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) {
    currentDefinition.appendIdentifierPlaceholder();
    currentDefinition.appendArgList(ctx.formalParameters());
    currentDefinition.append(ctx.THROWS());
    currentDefinition.append(ctx.qualifiedNameList());

    ParserRuleContext definitionEnd = ctx.qualifiedNameList() == null ? ctx.formalParameters() : ctx.qualifiedNameList();
    String argList = currentDefinition.getArgList();
    putModuleUnitMember(ModuleUnitMember.Constructor, ctx.IDENTIFIER().getText(), currentDefinition.flush(), argList, definitionEnd.stop);

    return super.visitConstructorDeclaration(ctx);
  }

  @Override
  public Object visitGenericConstructorDeclaration(JavaParser.GenericConstructorDeclarationContext ctx) {
    currentDefinition.append(ctx.typeParameters());
    return super.visitGenericConstructorDeclaration(ctx);
  }
  
  private int staticBLocksCount = 1;
  @Override
  public Object visitBlock(JavaParser.BlockContext ctx) {
    
    if(ctx.parent instanceof JavaParser.ClassBodyDeclarationContext) {
      currentDefinition.appendIdentifierPlaceholder();
      Token definitionEnd = ctx.start;
      putModuleUnitMember(ModuleUnitMember.StaticBlock, String.format("block %d", staticBLocksCount++), currentDefinition.flush(), "", definitionEnd);
    }

    return super.visitBlock(ctx);
  }
  
  private void append_LBRACK_RBRACK(DefinitionBuilder def, List<TerminalNode> lbrack, List<TerminalNode> rbrack){
    for (int i = 0; i < lbrack.size(); i++) {
      TerminalNode item = lbrack.get(i);
      def.append(item);
      def.append(rbrack.get(i));
    }
  }

  // ============================== Service methods ==============================

  private void putModule(String packageModifier, String packageName) {
    Module module = new Module();
    module.setModuleType(ModuleType.CODE);
    module.setPrefix(packageModifier + " package");
    module.setName(packageName);

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
    moduleUnit.setRealm(Realm.JAVA);
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
    String sha1Source = formatUnitMemberSha1Source(currentPiece);
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
  
  private String formatUnitMemberSha1Source(ParserRuleContext currentPiece) {
    String sha1Source = currentPiece.getText();
    return sha1Source;
  }
}
