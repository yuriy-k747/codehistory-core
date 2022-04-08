// Generated from c:/tools/antlr/grammars/csharp/CSharpParser.g4 by ANTLR 4.8
package dev.codehistory.core.index.sources.generated.csharp;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSharpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BYTE_ORDER_MARK=1, SINGLE_LINE_DOC_COMMENT=2, DELIMITED_DOC_COMMENT=3, 
		SINGLE_LINE_COMMENT=4, DELIMITED_COMMENT=5, WHITESPACES=6, SHARP=7, ABSTRACT=8, 
		ADD=9, ALIAS=10, ARGLIST=11, AS=12, ASCENDING=13, ASYNC=14, AWAIT=15, 
		BASE=16, BOOL=17, BREAK=18, BY=19, BYTE=20, CASE=21, CATCH=22, CHAR=23, 
		CHECKED=24, CLASS=25, CONST=26, CONTINUE=27, DECIMAL=28, DEFAULT=29, DELEGATE=30, 
		DESCENDING=31, DO=32, DOUBLE=33, DYNAMIC=34, ELSE=35, ENUM=36, EQUALS=37, 
		EVENT=38, EXPLICIT=39, EXTERN=40, FALSE=41, FINALLY=42, FIXED=43, FLOAT=44, 
		FOR=45, FOREACH=46, FROM=47, GET=48, GOTO=49, GROUP=50, IF=51, IMPLICIT=52, 
		IN=53, INT=54, INTERFACE=55, INTERNAL=56, INTO=57, IS=58, JOIN=59, LET=60, 
		LOCK=61, LONG=62, NAMEOF=63, NAMESPACE=64, NEW=65, NULL=66, OBJECT=67, 
		ON=68, OPERATOR=69, ORDERBY=70, OUT=71, OVERRIDE=72, PARAMS=73, PARTIAL=74, 
		PRIVATE=75, PROTECTED=76, PUBLIC=77, READONLY=78, REF=79, REMOVE=80, RETURN=81, 
		SBYTE=82, SEALED=83, SELECT=84, SET=85, SHORT=86, SIZEOF=87, STACKALLOC=88, 
		STATIC=89, STRING=90, STRUCT=91, SWITCH=92, THIS=93, THROW=94, TRUE=95, 
		TRY=96, TYPEOF=97, UINT=98, ULONG=99, UNCHECKED=100, UNSAFE=101, USHORT=102, 
		USING=103, VAR=104, VIRTUAL=105, VOID=106, VOLATILE=107, WHEN=108, WHERE=109, 
		WHILE=110, YIELD=111, IDENTIFIER=112, LITERAL_ACCESS=113, INTEGER_LITERAL=114, 
		HEX_INTEGER_LITERAL=115, REAL_LITERAL=116, CHARACTER_LITERAL=117, REGULAR_STRING=118, 
		VERBATIUM_STRING=119, INTERPOLATED_REGULAR_STRING_START=120, INTERPOLATED_VERBATIUM_STRING_START=121, 
		OPEN_BRACE=122, CLOSE_BRACE=123, OPEN_BRACKET=124, CLOSE_BRACKET=125, 
		OPEN_PARENS=126, CLOSE_PARENS=127, DOT=128, COMMA=129, COLON=130, SEMICOLON=131, 
		PLUS=132, MINUS=133, STAR=134, DIV=135, PERCENT=136, AMP=137, BITWISE_OR=138, 
		CARET=139, BANG=140, TILDE=141, ASSIGNMENT=142, LT=143, GT=144, INTERR=145, 
		DOUBLE_COLON=146, OP_COALESCING=147, OP_INC=148, OP_DEC=149, OP_AND=150, 
		OP_OR=151, OP_PTR=152, OP_EQ=153, OP_NE=154, OP_LE=155, OP_GE=156, OP_ADD_ASSIGNMENT=157, 
		OP_SUB_ASSIGNMENT=158, OP_MULT_ASSIGNMENT=159, OP_DIV_ASSIGNMENT=160, 
		OP_MOD_ASSIGNMENT=161, OP_AND_ASSIGNMENT=162, OP_OR_ASSIGNMENT=163, OP_XOR_ASSIGNMENT=164, 
		OP_LEFT_SHIFT=165, OP_LEFT_SHIFT_ASSIGNMENT=166, DOUBLE_CURLY_INSIDE=167, 
		OPEN_BRACE_INSIDE=168, REGULAR_CHAR_INSIDE=169, VERBATIUM_DOUBLE_QUOTE_INSIDE=170, 
		DOUBLE_QUOTE_INSIDE=171, REGULAR_STRING_INSIDE=172, VERBATIUM_INSIDE_STRING=173, 
		CLOSE_BRACE_INSIDE=174, FORMAT_STRING=175, DIRECTIVE_WHITESPACES=176, 
		DIGITS=177, DEFINE=178, UNDEF=179, ELIF=180, ENDIF=181, LINE=182, ERROR=183, 
		WARNING=184, REGION=185, ENDREGION=186, PRAGMA=187, DIRECTIVE_HIDDEN=188, 
		CONDITIONAL_SYMBOL=189, DIRECTIVE_NEW_LINE=190, TEXT=191, DOUBLE_CURLY_CLOSE_INSIDE=192;
	public static final int
		RULE_compilation_unit = 0, RULE_namespace_or_type_name = 1, RULE_type_ = 2, 
		RULE_base_type = 3, RULE_simple_type = 4, RULE_numeric_type = 5, RULE_integral_type = 6, 
		RULE_floating_point_type = 7, RULE_class_type = 8, RULE_type_argument_list = 9, 
		RULE_argument_list = 10, RULE_argument = 11, RULE_expression = 12, RULE_non_assignment_expression = 13, 
		RULE_assignment = 14, RULE_assignment_operator = 15, RULE_conditional_expression = 16, 
		RULE_null_coalescing_expression = 17, RULE_conditional_or_expression = 18, 
		RULE_conditional_and_expression = 19, RULE_inclusive_or_expression = 20, 
		RULE_exclusive_or_expression = 21, RULE_and_expression = 22, RULE_equality_expression = 23, 
		RULE_relational_expression = 24, RULE_shift_expression = 25, RULE_additive_expression = 26, 
		RULE_multiplicative_expression = 27, RULE_unary_expression = 28, RULE_primary_expression = 29, 
		RULE_primary_expression_start = 30, RULE_member_access = 31, RULE_bracket_expression = 32, 
		RULE_indexer_argument = 33, RULE_predefined_type = 34, RULE_expression_list = 35, 
		RULE_object_or_collection_initializer = 36, RULE_object_initializer = 37, 
		RULE_member_initializer_list = 38, RULE_member_initializer = 39, RULE_initializer_value = 40, 
		RULE_collection_initializer = 41, RULE_element_initializer = 42, RULE_anonymous_object_initializer = 43, 
		RULE_member_declarator_list = 44, RULE_member_declarator = 45, RULE_unbound_type_name = 46, 
		RULE_generic_dimension_specifier = 47, RULE_isType = 48, RULE_lambda_expression = 49, 
		RULE_anonymous_function_signature = 50, RULE_explicit_anonymous_function_parameter_list = 51, 
		RULE_explicit_anonymous_function_parameter = 52, RULE_implicit_anonymous_function_parameter_list = 53, 
		RULE_anonymous_function_body = 54, RULE_query_expression = 55, RULE_from_clause = 56, 
		RULE_query_body = 57, RULE_query_body_clause = 58, RULE_let_clause = 59, 
		RULE_where_clause = 60, RULE_combined_join_clause = 61, RULE_orderby_clause = 62, 
		RULE_ordering = 63, RULE_select_or_group_clause = 64, RULE_query_continuation = 65, 
		RULE_statement = 66, RULE_labeled_Statement = 67, RULE_embedded_statement = 68, 
		RULE_simple_embedded_statement = 69, RULE_block = 70, RULE_local_variable_declaration = 71, 
		RULE_local_variable_type = 72, RULE_local_variable_declarator = 73, RULE_local_variable_initializer = 74, 
		RULE_local_constant_declaration = 75, RULE_if_body = 76, RULE_switch_section = 77, 
		RULE_switch_label = 78, RULE_statement_list = 79, RULE_for_initializer = 80, 
		RULE_for_iterator = 81, RULE_catch_clauses = 82, RULE_specific_catch_clause = 83, 
		RULE_general_catch_clause = 84, RULE_exception_filter = 85, RULE_finally_clause = 86, 
		RULE_resource_acquisition = 87, RULE_namespace_declaration = 88, RULE_qualified_identifier = 89, 
		RULE_namespace_body = 90, RULE_extern_alias_directives = 91, RULE_extern_alias_directive = 92, 
		RULE_using_directives = 93, RULE_using_directive = 94, RULE_namespace_member_declarations = 95, 
		RULE_namespace_member_declaration = 96, RULE_type_declaration = 97, RULE_qualified_alias_member = 98, 
		RULE_type_parameter_list = 99, RULE_type_parameter = 100, RULE_class_base = 101, 
		RULE_interface_type_list = 102, RULE_type_parameter_constraints_clauses = 103, 
		RULE_type_parameter_constraints_clause = 104, RULE_type_parameter_constraints = 105, 
		RULE_primary_constraint = 106, RULE_secondary_constraints = 107, RULE_constructor_constraint = 108, 
		RULE_class_body = 109, RULE_class_member_declarations = 110, RULE_class_member_declaration = 111, 
		RULE_all_member_modifiers = 112, RULE_all_member_modifier = 113, RULE_common_member_declaration = 114, 
		RULE_typed_member_declaration = 115, RULE_constant_declarators = 116, 
		RULE_constant_declarator = 117, RULE_variable_declarators = 118, RULE_variable_declarator = 119, 
		RULE_variable_initializer = 120, RULE_return_type = 121, RULE_member_name = 122, 
		RULE_method_body = 123, RULE_formal_parameter_list = 124, RULE_fixed_parameters = 125, 
		RULE_fixed_parameter = 126, RULE_parameter_modifier = 127, RULE_parameter_array = 128, 
		RULE_accessor_declarations = 129, RULE_get_accessor_declaration = 130, 
		RULE_set_accessor_declaration = 131, RULE_accessor_modifier = 132, RULE_accessor_body = 133, 
		RULE_event_accessor_declarations = 134, RULE_add_accessor_declaration = 135, 
		RULE_remove_accessor_declaration = 136, RULE_overloadable_operator = 137, 
		RULE_conversion_operator_declarator = 138, RULE_constructor_initializer = 139, 
		RULE_body = 140, RULE_struct_interfaces = 141, RULE_struct_body = 142, 
		RULE_struct_member_declaration = 143, RULE_array_type = 144, RULE_rank_specifier = 145, 
		RULE_array_initializer = 146, RULE_variant_type_parameter_list = 147, 
		RULE_variant_type_parameter = 148, RULE_variance_annotation = 149, RULE_interface_base = 150, 
		RULE_interface_body = 151, RULE_interface_member_declaration = 152, RULE_interface_accessors = 153, 
		RULE_enum_base = 154, RULE_enum_body = 155, RULE_enum_member_declaration = 156, 
		RULE_global_attribute_section = 157, RULE_global_attribute_target = 158, 
		RULE_attributes = 159, RULE_attribute_section = 160, RULE_attribute_target = 161, 
		RULE_attribute_list = 162, RULE_attribute = 163, RULE_attribute_argument = 164, 
		RULE_pointer_type = 165, RULE_fixed_pointer_declarators = 166, RULE_fixed_pointer_declarator = 167, 
		RULE_fixed_pointer_initializer = 168, RULE_fixed_size_buffer_declarator = 169, 
		RULE_local_variable_initializer_unsafe = 170, RULE_right_arrow = 171, 
		RULE_right_shift = 172, RULE_right_shift_assignment = 173, RULE_tuple_type = 174, 
		RULE_tuple_type_element_list = 175, RULE_tuple_type_element = 176, RULE_tuple_literal = 177, 
		RULE_tuple_literal_element_list = 178, RULE_tuple_literal_element = 179, 
		RULE_literal = 180, RULE_boolean_literal = 181, RULE_string_literal = 182, 
		RULE_interpolated_regular_string = 183, RULE_interpolated_verbatium_string = 184, 
		RULE_interpolated_regular_string_part = 185, RULE_interpolated_verbatium_string_part = 186, 
		RULE_interpolated_string_expression = 187, RULE_keyword = 188, RULE_class_definition = 189, 
		RULE_struct_definition = 190, RULE_interface_definition = 191, RULE_enum_definition = 192, 
		RULE_delegate_definition = 193, RULE_event_declaration = 194, RULE_field_declaration = 195, 
		RULE_property_declaration = 196, RULE_constant_declaration = 197, RULE_indexer_declaration = 198, 
		RULE_destructor_definition = 199, RULE_constructor_declaration = 200, 
		RULE_method_declaration = 201, RULE_method_member_name = 202, RULE_operator_declaration = 203, 
		RULE_arg_declaration = 204, RULE_method_invocation = 205, RULE_object_creation_expression = 206, 
		RULE_identifier = 207;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilation_unit", "namespace_or_type_name", "type_", "base_type", "simple_type", 
			"numeric_type", "integral_type", "floating_point_type", "class_type", 
			"type_argument_list", "argument_list", "argument", "expression", "non_assignment_expression", 
			"assignment", "assignment_operator", "conditional_expression", "null_coalescing_expression", 
			"conditional_or_expression", "conditional_and_expression", "inclusive_or_expression", 
			"exclusive_or_expression", "and_expression", "equality_expression", "relational_expression", 
			"shift_expression", "additive_expression", "multiplicative_expression", 
			"unary_expression", "primary_expression", "primary_expression_start", 
			"member_access", "bracket_expression", "indexer_argument", "predefined_type", 
			"expression_list", "object_or_collection_initializer", "object_initializer", 
			"member_initializer_list", "member_initializer", "initializer_value", 
			"collection_initializer", "element_initializer", "anonymous_object_initializer", 
			"member_declarator_list", "member_declarator", "unbound_type_name", "generic_dimension_specifier", 
			"isType", "lambda_expression", "anonymous_function_signature", "explicit_anonymous_function_parameter_list", 
			"explicit_anonymous_function_parameter", "implicit_anonymous_function_parameter_list", 
			"anonymous_function_body", "query_expression", "from_clause", "query_body", 
			"query_body_clause", "let_clause", "where_clause", "combined_join_clause", 
			"orderby_clause", "ordering", "select_or_group_clause", "query_continuation", 
			"statement", "labeled_Statement", "embedded_statement", "simple_embedded_statement", 
			"block", "local_variable_declaration", "local_variable_type", "local_variable_declarator", 
			"local_variable_initializer", "local_constant_declaration", "if_body", 
			"switch_section", "switch_label", "statement_list", "for_initializer", 
			"for_iterator", "catch_clauses", "specific_catch_clause", "general_catch_clause", 
			"exception_filter", "finally_clause", "resource_acquisition", "namespace_declaration", 
			"qualified_identifier", "namespace_body", "extern_alias_directives", 
			"extern_alias_directive", "using_directives", "using_directive", "namespace_member_declarations", 
			"namespace_member_declaration", "type_declaration", "qualified_alias_member", 
			"type_parameter_list", "type_parameter", "class_base", "interface_type_list", 
			"type_parameter_constraints_clauses", "type_parameter_constraints_clause", 
			"type_parameter_constraints", "primary_constraint", "secondary_constraints", 
			"constructor_constraint", "class_body", "class_member_declarations", 
			"class_member_declaration", "all_member_modifiers", "all_member_modifier", 
			"common_member_declaration", "typed_member_declaration", "constant_declarators", 
			"constant_declarator", "variable_declarators", "variable_declarator", 
			"variable_initializer", "return_type", "member_name", "method_body", 
			"formal_parameter_list", "fixed_parameters", "fixed_parameter", "parameter_modifier", 
			"parameter_array", "accessor_declarations", "get_accessor_declaration", 
			"set_accessor_declaration", "accessor_modifier", "accessor_body", "event_accessor_declarations", 
			"add_accessor_declaration", "remove_accessor_declaration", "overloadable_operator", 
			"conversion_operator_declarator", "constructor_initializer", "body", 
			"struct_interfaces", "struct_body", "struct_member_declaration", "array_type", 
			"rank_specifier", "array_initializer", "variant_type_parameter_list", 
			"variant_type_parameter", "variance_annotation", "interface_base", "interface_body", 
			"interface_member_declaration", "interface_accessors", "enum_base", "enum_body", 
			"enum_member_declaration", "global_attribute_section", "global_attribute_target", 
			"attributes", "attribute_section", "attribute_target", "attribute_list", 
			"attribute", "attribute_argument", "pointer_type", "fixed_pointer_declarators", 
			"fixed_pointer_declarator", "fixed_pointer_initializer", "fixed_size_buffer_declarator", 
			"local_variable_initializer_unsafe", "right_arrow", "right_shift", "right_shift_assignment", 
			"tuple_type", "tuple_type_element_list", "tuple_type_element", "tuple_literal", 
			"tuple_literal_element_list", "tuple_literal_element", "literal", "boolean_literal", 
			"string_literal", "interpolated_regular_string", "interpolated_verbatium_string", 
			"interpolated_regular_string_part", "interpolated_verbatium_string_part", 
			"interpolated_string_expression", "keyword", "class_definition", "struct_definition", 
			"interface_definition", "enum_definition", "delegate_definition", "event_declaration", 
			"field_declaration", "property_declaration", "constant_declaration", 
			"indexer_declaration", "destructor_definition", "constructor_declaration", 
			"method_declaration", "method_member_name", "operator_declaration", "arg_declaration", 
			"method_invocation", "object_creation_expression", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\u00EF\u00BB\u00BF'", null, null, null, null, null, "'#'", "'abstract'", 
			"'add'", "'alias'", "'__arglist'", "'as'", "'ascending'", "'async'", 
			"'await'", "'base'", "'bool'", "'break'", "'by'", "'byte'", "'case'", 
			"'catch'", "'char'", "'checked'", "'class'", "'const'", "'continue'", 
			"'decimal'", "'default'", "'delegate'", "'descending'", "'do'", "'double'", 
			"'dynamic'", "'else'", "'enum'", "'equals'", "'event'", "'explicit'", 
			"'extern'", "'false'", "'finally'", "'fixed'", "'float'", "'for'", "'foreach'", 
			"'from'", "'get'", "'goto'", "'group'", "'if'", "'implicit'", "'in'", 
			"'int'", "'interface'", "'internal'", "'into'", "'is'", "'join'", "'let'", 
			"'lock'", "'long'", "'nameof'", "'namespace'", "'new'", "'null'", "'object'", 
			"'on'", "'operator'", "'orderby'", "'out'", "'override'", "'params'", 
			"'partial'", "'private'", "'protected'", "'public'", "'readonly'", "'ref'", 
			"'remove'", "'return'", "'sbyte'", "'sealed'", "'select'", "'set'", "'short'", 
			"'sizeof'", "'stackalloc'", "'static'", "'string'", "'struct'", "'switch'", 
			"'this'", "'throw'", "'true'", "'try'", "'typeof'", "'uint'", "'ulong'", 
			"'unchecked'", "'unsafe'", "'ushort'", "'using'", "'var'", "'virtual'", 
			"'void'", "'volatile'", "'when'", "'where'", "'while'", "'yield'", null, 
			null, null, null, null, null, null, null, null, null, "'{'", "'}'", "'['", 
			"']'", "'('", "')'", "'.'", "','", "':'", "';'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'&'", "'|'", "'^'", "'!'", "'~'", "'='", "'<'", "'>'", 
			"'?'", "'::'", "'??'", "'++'", "'--'", "'&&'", "'||'", "'->'", "'=='", 
			"'!='", "'<='", "'>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", 
			"'|='", "'^='", "'<<'", "'<<='", "'{{'", null, null, null, null, null, 
			null, null, null, null, null, "'define'", "'undef'", "'elif'", "'endif'", 
			"'line'", null, null, null, null, null, "'hidden'", null, null, null, 
			"'}}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BYTE_ORDER_MARK", "SINGLE_LINE_DOC_COMMENT", "DELIMITED_DOC_COMMENT", 
			"SINGLE_LINE_COMMENT", "DELIMITED_COMMENT", "WHITESPACES", "SHARP", "ABSTRACT", 
			"ADD", "ALIAS", "ARGLIST", "AS", "ASCENDING", "ASYNC", "AWAIT", "BASE", 
			"BOOL", "BREAK", "BY", "BYTE", "CASE", "CATCH", "CHAR", "CHECKED", "CLASS", 
			"CONST", "CONTINUE", "DECIMAL", "DEFAULT", "DELEGATE", "DESCENDING", 
			"DO", "DOUBLE", "DYNAMIC", "ELSE", "ENUM", "EQUALS", "EVENT", "EXPLICIT", 
			"EXTERN", "FALSE", "FINALLY", "FIXED", "FLOAT", "FOR", "FOREACH", "FROM", 
			"GET", "GOTO", "GROUP", "IF", "IMPLICIT", "IN", "INT", "INTERFACE", "INTERNAL", 
			"INTO", "IS", "JOIN", "LET", "LOCK", "LONG", "NAMEOF", "NAMESPACE", "NEW", 
			"NULL", "OBJECT", "ON", "OPERATOR", "ORDERBY", "OUT", "OVERRIDE", "PARAMS", 
			"PARTIAL", "PRIVATE", "PROTECTED", "PUBLIC", "READONLY", "REF", "REMOVE", 
			"RETURN", "SBYTE", "SEALED", "SELECT", "SET", "SHORT", "SIZEOF", "STACKALLOC", 
			"STATIC", "STRING", "STRUCT", "SWITCH", "THIS", "THROW", "TRUE", "TRY", 
			"TYPEOF", "UINT", "ULONG", "UNCHECKED", "UNSAFE", "USHORT", "USING", 
			"VAR", "VIRTUAL", "VOID", "VOLATILE", "WHEN", "WHERE", "WHILE", "YIELD", 
			"IDENTIFIER", "LITERAL_ACCESS", "INTEGER_LITERAL", "HEX_INTEGER_LITERAL", 
			"REAL_LITERAL", "CHARACTER_LITERAL", "REGULAR_STRING", "VERBATIUM_STRING", 
			"INTERPOLATED_REGULAR_STRING_START", "INTERPOLATED_VERBATIUM_STRING_START", 
			"OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PARENS", 
			"CLOSE_PARENS", "DOT", "COMMA", "COLON", "SEMICOLON", "PLUS", "MINUS", 
			"STAR", "DIV", "PERCENT", "AMP", "BITWISE_OR", "CARET", "BANG", "TILDE", 
			"ASSIGNMENT", "LT", "GT", "INTERR", "DOUBLE_COLON", "OP_COALESCING", 
			"OP_INC", "OP_DEC", "OP_AND", "OP_OR", "OP_PTR", "OP_EQ", "OP_NE", "OP_LE", 
			"OP_GE", "OP_ADD_ASSIGNMENT", "OP_SUB_ASSIGNMENT", "OP_MULT_ASSIGNMENT", 
			"OP_DIV_ASSIGNMENT", "OP_MOD_ASSIGNMENT", "OP_AND_ASSIGNMENT", "OP_OR_ASSIGNMENT", 
			"OP_XOR_ASSIGNMENT", "OP_LEFT_SHIFT", "OP_LEFT_SHIFT_ASSIGNMENT", "DOUBLE_CURLY_INSIDE", 
			"OPEN_BRACE_INSIDE", "REGULAR_CHAR_INSIDE", "VERBATIUM_DOUBLE_QUOTE_INSIDE", 
			"DOUBLE_QUOTE_INSIDE", "REGULAR_STRING_INSIDE", "VERBATIUM_INSIDE_STRING", 
			"CLOSE_BRACE_INSIDE", "FORMAT_STRING", "DIRECTIVE_WHITESPACES", "DIGITS", 
			"DEFINE", "UNDEF", "ELIF", "ENDIF", "LINE", "ERROR", "WARNING", "REGION", 
			"ENDREGION", "PRAGMA", "DIRECTIVE_HIDDEN", "CONDITIONAL_SYMBOL", "DIRECTIVE_NEW_LINE", 
			"TEXT", "DOUBLE_CURLY_CLOSE_INSIDE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CSharpParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSharpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Compilation_unitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CSharpParser.EOF, 0); }
		public TerminalNode BYTE_ORDER_MARK() { return getToken(CSharpParser.BYTE_ORDER_MARK, 0); }
		public Extern_alias_directivesContext extern_alias_directives() {
			return getRuleContext(Extern_alias_directivesContext.class,0);
		}
		public Using_directivesContext using_directives() {
			return getRuleContext(Using_directivesContext.class,0);
		}
		public List<Global_attribute_sectionContext> global_attribute_section() {
			return getRuleContexts(Global_attribute_sectionContext.class);
		}
		public Global_attribute_sectionContext global_attribute_section(int i) {
			return getRuleContext(Global_attribute_sectionContext.class,i);
		}
		public Namespace_member_declarationsContext namespace_member_declarations() {
			return getRuleContext(Namespace_member_declarationsContext.class,0);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCompilation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCompilation_unit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitCompilation_unit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BYTE_ORDER_MARK) {
				{
				setState(416);
				match(BYTE_ORDER_MARK);
				}
			}

			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(419);
				extern_alias_directives();
				}
				break;
			}
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(422);
				using_directives();
				}
			}

			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(425);
					global_attribute_section();
					}
					} 
				}
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << CLASS) | (1L << DELEGATE) | (1L << ENUM) | (1L << EXTERN) | (1L << INTERFACE) | (1L << INTERNAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMESPACE - 64)) | (1L << (NEW - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARTIAL - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (SEALED - 64)) | (1L << (STATIC - 64)) | (1L << (STRUCT - 64)) | (1L << (UNSAFE - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0)) {
				{
				setState(431);
				namespace_member_declarations();
				}
			}

			setState(434);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_or_type_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Qualified_alias_memberContext qualified_alias_member() {
			return getRuleContext(Qualified_alias_memberContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(CSharpParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CSharpParser.DOT, i);
		}
		public List<Type_argument_listContext> type_argument_list() {
			return getRuleContexts(Type_argument_listContext.class);
		}
		public Type_argument_listContext type_argument_list(int i) {
			return getRuleContext(Type_argument_listContext.class,i);
		}
		public Namespace_or_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_or_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNamespace_or_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNamespace_or_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitNamespace_or_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_or_type_nameContext namespace_or_type_name() throws RecognitionException {
		Namespace_or_type_nameContext _localctx = new Namespace_or_type_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_namespace_or_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(436);
				identifier();
				setState(438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(437);
					type_argument_list();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(440);
				qualified_alias_member();
				}
				break;
			}
			setState(450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(443);
					match(DOT);
					setState(444);
					identifier();
					setState(446);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(445);
						type_argument_list();
						}
						break;
					}
					}
					} 
				}
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_Context extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public List<TerminalNode> INTERR() { return getTokens(CSharpParser.INTERR); }
		public TerminalNode INTERR(int i) {
			return getToken(CSharpParser.INTERR, i);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(CSharpParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(CSharpParser.STAR, i);
		}
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_type_);
		try {
			int _alt;
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case USHORT:
			case VAR:
			case VOID:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				base_type();
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(457);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case INTERR:
							{
							setState(454);
							match(INTERR);
							}
							break;
						case OPEN_BRACKET:
							{
							setState(455);
							rank_specifier();
							}
							break;
						case STAR:
							{
							setState(456);
							match(STAR);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(461);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case OPEN_PARENS:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				tuple_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_typeContext extends ParserRuleContext {
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public TerminalNode STAR() { return getToken(CSharpParser.STAR, 0); }
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBase_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitBase_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_base_type);
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				simple_type();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case STRING:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				class_type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				match(VOID);
				setState(468);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_typeContext extends ParserRuleContext {
		public Numeric_typeContext numeric_type() {
			return getRuleContext(Numeric_typeContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(CSharpParser.BOOL, 0); }
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSimple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSimple_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSimple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simple_type);
		try {
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				numeric_type();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numeric_typeContext extends ParserRuleContext {
		public Integral_typeContext integral_type() {
			return getRuleContext(Integral_typeContext.class,0);
		}
		public Floating_point_typeContext floating_point_type() {
			return getRuleContext(Floating_point_typeContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(CSharpParser.DECIMAL, 0); }
		public Numeric_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNumeric_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNumeric_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitNumeric_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_typeContext numeric_type() throws RecognitionException {
		Numeric_typeContext _localctx = new Numeric_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_numeric_type);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				integral_type();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				floating_point_type();
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(477);
				match(DECIMAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integral_typeContext extends ParserRuleContext {
		public TerminalNode SBYTE() { return getToken(CSharpParser.SBYTE, 0); }
		public TerminalNode BYTE() { return getToken(CSharpParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(CSharpParser.SHORT, 0); }
		public TerminalNode USHORT() { return getToken(CSharpParser.USHORT, 0); }
		public TerminalNode INT() { return getToken(CSharpParser.INT, 0); }
		public TerminalNode UINT() { return getToken(CSharpParser.UINT, 0); }
		public TerminalNode LONG() { return getToken(CSharpParser.LONG, 0); }
		public TerminalNode ULONG() { return getToken(CSharpParser.ULONG, 0); }
		public TerminalNode CHAR() { return getToken(CSharpParser.CHAR, 0); }
		public Integral_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integral_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIntegral_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIntegral_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitIntegral_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integral_typeContext integral_type() throws RecognitionException {
		Integral_typeContext _localctx = new Integral_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_integral_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (SBYTE - 82)) | (1L << (SHORT - 82)) | (1L << (UINT - 82)) | (1L << (ULONG - 82)) | (1L << (USHORT - 82)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Floating_point_typeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(CSharpParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(CSharpParser.DOUBLE, 0); }
		public Floating_point_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating_point_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFloating_point_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFloating_point_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFloating_point_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Floating_point_typeContext floating_point_type() throws RecognitionException {
		Floating_point_typeContext _localctx = new Floating_point_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_floating_point_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_typeContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode OBJECT() { return getToken(CSharpParser.OBJECT, 0); }
		public TerminalNode DYNAMIC() { return getToken(CSharpParser.DYNAMIC, 0); }
		public TerminalNode STRING() { return getToken(CSharpParser.STRING, 0); }
		public Class_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitClass_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_typeContext class_type() throws RecognitionException {
		Class_typeContext _localctx = new Class_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_class_type);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				namespace_or_type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				match(OBJECT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				match(DYNAMIC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_argument_listContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CSharpParser.LT, 0); }
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public TerminalNode GT() { return getToken(CSharpParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Type_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitType_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_argument_listContext type_argument_list() throws RecognitionException {
		Type_argument_listContext _localctx = new Type_argument_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(LT);
			setState(491);
			type_();
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(492);
				match(COMMA);
				setState(493);
				type_();
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_listContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitArgument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitArgument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			argument();
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(502);
				match(COMMA);
				setState(503);
				argument();
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public Token refout;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public TerminalNode VAR() { return getToken(CSharpParser.VAR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(509);
				identifier();
				setState(510);
				match(COLON);
				}
				break;
			}
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUT || _la==REF) {
				{
				setState(514);
				((ArgumentContext)_localctx).refout = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OUT || _la==REF) ) {
					((ArgumentContext)_localctx).refout = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(517);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(518);
				type_();
				}
				break;
			}
			setState(521);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Non_assignment_expressionContext non_assignment_expression() {
			return getRuleContext(Non_assignment_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				non_assignment_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_assignment_expressionContext extends ParserRuleContext {
		public Lambda_expressionContext lambda_expression() {
			return getRuleContext(Lambda_expressionContext.class,0);
		}
		public Query_expressionContext query_expression() {
			return getRuleContext(Query_expressionContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Non_assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNon_assignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNon_assignment_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitNon_assignment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_assignment_expressionContext non_assignment_expression() throws RecognitionException {
		Non_assignment_expressionContext _localctx = new Non_assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_non_assignment_expression);
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				lambda_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				query_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				conditional_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			unary_expression();
			setState(533);
			assignment_operator();
			setState(534);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public TerminalNode OP_ADD_ASSIGNMENT() { return getToken(CSharpParser.OP_ADD_ASSIGNMENT, 0); }
		public TerminalNode OP_SUB_ASSIGNMENT() { return getToken(CSharpParser.OP_SUB_ASSIGNMENT, 0); }
		public TerminalNode OP_MULT_ASSIGNMENT() { return getToken(CSharpParser.OP_MULT_ASSIGNMENT, 0); }
		public TerminalNode OP_DIV_ASSIGNMENT() { return getToken(CSharpParser.OP_DIV_ASSIGNMENT, 0); }
		public TerminalNode OP_MOD_ASSIGNMENT() { return getToken(CSharpParser.OP_MOD_ASSIGNMENT, 0); }
		public TerminalNode OP_AND_ASSIGNMENT() { return getToken(CSharpParser.OP_AND_ASSIGNMENT, 0); }
		public TerminalNode OP_OR_ASSIGNMENT() { return getToken(CSharpParser.OP_OR_ASSIGNMENT, 0); }
		public TerminalNode OP_XOR_ASSIGNMENT() { return getToken(CSharpParser.OP_XOR_ASSIGNMENT, 0); }
		public TerminalNode OP_LEFT_SHIFT_ASSIGNMENT() { return getToken(CSharpParser.OP_LEFT_SHIFT_ASSIGNMENT, 0); }
		public Right_shift_assignmentContext right_shift_assignment() {
			return getRuleContext(Right_shift_assignmentContext.class,0);
		}
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment_operator);
		try {
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGNMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				match(ASSIGNMENT);
				}
				break;
			case OP_ADD_ASSIGNMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				match(OP_ADD_ASSIGNMENT);
				}
				break;
			case OP_SUB_ASSIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
				match(OP_SUB_ASSIGNMENT);
				}
				break;
			case OP_MULT_ASSIGNMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(539);
				match(OP_MULT_ASSIGNMENT);
				}
				break;
			case OP_DIV_ASSIGNMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(540);
				match(OP_DIV_ASSIGNMENT);
				}
				break;
			case OP_MOD_ASSIGNMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(541);
				match(OP_MOD_ASSIGNMENT);
				}
				break;
			case OP_AND_ASSIGNMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(542);
				match(OP_AND_ASSIGNMENT);
				}
				break;
			case OP_OR_ASSIGNMENT:
				enterOuterAlt(_localctx, 8);
				{
				setState(543);
				match(OP_OR_ASSIGNMENT);
				}
				break;
			case OP_XOR_ASSIGNMENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(544);
				match(OP_XOR_ASSIGNMENT);
				}
				break;
			case OP_LEFT_SHIFT_ASSIGNMENT:
				enterOuterAlt(_localctx, 10);
				{
				setState(545);
				match(OP_LEFT_SHIFT_ASSIGNMENT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 11);
				{
				setState(546);
				right_shift_assignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Null_coalescing_expressionContext null_coalescing_expression() {
			return getRuleContext(Null_coalescing_expressionContext.class,0);
		}
		public TerminalNode INTERR() { return getToken(CSharpParser.INTERR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConditional_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConditional_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditional_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			null_coalescing_expression();
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(550);
				match(INTERR);
				setState(551);
				expression();
				setState(552);
				match(COLON);
				setState(553);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_coalescing_expressionContext extends ParserRuleContext {
		public Conditional_or_expressionContext conditional_or_expression() {
			return getRuleContext(Conditional_or_expressionContext.class,0);
		}
		public TerminalNode OP_COALESCING() { return getToken(CSharpParser.OP_COALESCING, 0); }
		public Null_coalescing_expressionContext null_coalescing_expression() {
			return getRuleContext(Null_coalescing_expressionContext.class,0);
		}
		public Null_coalescing_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_coalescing_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNull_coalescing_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNull_coalescing_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitNull_coalescing_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_coalescing_expressionContext null_coalescing_expression() throws RecognitionException {
		Null_coalescing_expressionContext _localctx = new Null_coalescing_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_null_coalescing_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			conditional_or_expression();
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(558);
				match(OP_COALESCING);
				setState(559);
				null_coalescing_expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_or_expressionContext extends ParserRuleContext {
		public List<Conditional_and_expressionContext> conditional_and_expression() {
			return getRuleContexts(Conditional_and_expressionContext.class);
		}
		public Conditional_and_expressionContext conditional_and_expression(int i) {
			return getRuleContext(Conditional_and_expressionContext.class,i);
		}
		public List<TerminalNode> OP_OR() { return getTokens(CSharpParser.OP_OR); }
		public TerminalNode OP_OR(int i) {
			return getToken(CSharpParser.OP_OR, i);
		}
		public Conditional_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConditional_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConditional_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConditional_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_or_expressionContext conditional_or_expression() throws RecognitionException {
		Conditional_or_expressionContext _localctx = new Conditional_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_conditional_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			conditional_and_expression();
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(563);
					match(OP_OR);
					setState(564);
					conditional_and_expression();
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_and_expressionContext extends ParserRuleContext {
		public List<Inclusive_or_expressionContext> inclusive_or_expression() {
			return getRuleContexts(Inclusive_or_expressionContext.class);
		}
		public Inclusive_or_expressionContext inclusive_or_expression(int i) {
			return getRuleContext(Inclusive_or_expressionContext.class,i);
		}
		public List<TerminalNode> OP_AND() { return getTokens(CSharpParser.OP_AND); }
		public TerminalNode OP_AND(int i) {
			return getToken(CSharpParser.OP_AND, i);
		}
		public Conditional_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConditional_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConditional_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConditional_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_and_expressionContext conditional_and_expression() throws RecognitionException {
		Conditional_and_expressionContext _localctx = new Conditional_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conditional_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			inclusive_or_expression();
			setState(575);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(571);
					match(OP_AND);
					setState(572);
					inclusive_or_expression();
					}
					} 
				}
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public List<Exclusive_or_expressionContext> exclusive_or_expression() {
			return getRuleContexts(Exclusive_or_expressionContext.class);
		}
		public Exclusive_or_expressionContext exclusive_or_expression(int i) {
			return getRuleContext(Exclusive_or_expressionContext.class,i);
		}
		public List<TerminalNode> BITWISE_OR() { return getTokens(CSharpParser.BITWISE_OR); }
		public TerminalNode BITWISE_OR(int i) {
			return getToken(CSharpParser.BITWISE_OR, i);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_inclusive_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			exclusive_or_expression();
			setState(583);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(579);
					match(BITWISE_OR);
					setState(580);
					exclusive_or_expression();
					}
					} 
				}
				setState(585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(CSharpParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(CSharpParser.CARET, i);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitExclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exclusive_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			and_expression();
			setState(591);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(587);
					match(CARET);
					setState(588);
					and_expression();
					}
					} 
				}
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_expressionContext extends ParserRuleContext {
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<TerminalNode> AMP() { return getTokens(CSharpParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(CSharpParser.AMP, i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			equality_expression();
			setState(599);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(595);
					match(AMP);
					setState(596);
					equality_expression();
					}
					} 
				}
				setState(601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public List<TerminalNode> OP_EQ() { return getTokens(CSharpParser.OP_EQ); }
		public TerminalNode OP_EQ(int i) {
			return getToken(CSharpParser.OP_EQ, i);
		}
		public List<TerminalNode> OP_NE() { return getTokens(CSharpParser.OP_NE); }
		public TerminalNode OP_NE(int i) {
			return getToken(CSharpParser.OP_NE, i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_equality_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			relational_expression();
			setState(607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(603);
					_la = _input.LA(1);
					if ( !(_la==OP_EQ || _la==OP_NE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(604);
					relational_expression();
					}
					} 
				}
				setState(609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public List<TerminalNode> IS() { return getTokens(CSharpParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(CSharpParser.IS, i);
		}
		public List<IsTypeContext> isType() {
			return getRuleContexts(IsTypeContext.class);
		}
		public IsTypeContext isType(int i) {
			return getRuleContext(IsTypeContext.class,i);
		}
		public List<TerminalNode> AS() { return getTokens(CSharpParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(CSharpParser.AS, i);
		}
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(CSharpParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CSharpParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(CSharpParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CSharpParser.GT, i);
		}
		public List<TerminalNode> OP_LE() { return getTokens(CSharpParser.OP_LE); }
		public TerminalNode OP_LE(int i) {
			return getToken(CSharpParser.OP_LE, i);
		}
		public List<TerminalNode> OP_GE() { return getTokens(CSharpParser.OP_GE); }
		public TerminalNode OP_GE(int i) {
			return getToken(CSharpParser.OP_GE, i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_relational_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			shift_expression();
			setState(619);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(617);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LT:
					case GT:
					case OP_LE:
					case OP_GE:
						{
						setState(611);
						_la = _input.LA(1);
						if ( !(((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (LT - 143)) | (1L << (GT - 143)) | (1L << (OP_LE - 143)) | (1L << (OP_GE - 143)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(612);
						shift_expression();
						}
						break;
					case IS:
						{
						setState(613);
						match(IS);
						setState(614);
						isType();
						}
						break;
					case AS:
						{
						setState(615);
						match(AS);
						setState(616);
						type_();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<TerminalNode> OP_LEFT_SHIFT() { return getTokens(CSharpParser.OP_LEFT_SHIFT); }
		public TerminalNode OP_LEFT_SHIFT(int i) {
			return getToken(CSharpParser.OP_LEFT_SHIFT, i);
		}
		public List<Right_shiftContext> right_shift() {
			return getRuleContexts(Right_shiftContext.class);
		}
		public Right_shiftContext right_shift(int i) {
			return getRuleContext(Right_shiftContext.class,i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_shift_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			additive_expression();
			setState(630);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(625);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OP_LEFT_SHIFT:
						{
						setState(623);
						match(OP_LEFT_SHIFT);
						}
						break;
					case GT:
						{
						setState(624);
						right_shift();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(627);
					additive_expression();
					}
					} 
				}
				setState(632);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Additive_expressionContext extends ParserRuleContext {
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CSharpParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CSharpParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CSharpParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CSharpParser.MINUS, i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAdditive_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAdditive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_additive_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			multiplicative_expression();
			setState(638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(634);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(635);
					multiplicative_expression();
					}
					} 
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(CSharpParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(CSharpParser.STAR, i);
		}
		public List<TerminalNode> DIV() { return getTokens(CSharpParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CSharpParser.DIV, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(CSharpParser.PERCENT); }
		public TerminalNode PERCENT(int i) {
			return getToken(CSharpParser.PERCENT, i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMultiplicative_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMultiplicative_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_multiplicative_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			unary_expression();
			setState(646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(642);
					_la = _input.LA(1);
					if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (STAR - 134)) | (1L << (DIV - 134)) | (1L << (PERCENT - 134)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(643);
					unary_expression();
					}
					} 
				}
				setState(648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CSharpParser.PLUS, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CSharpParser.MINUS, 0); }
		public TerminalNode BANG() { return getToken(CSharpParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(CSharpParser.TILDE, 0); }
		public TerminalNode OP_INC() { return getToken(CSharpParser.OP_INC, 0); }
		public TerminalNode OP_DEC() { return getToken(CSharpParser.OP_DEC, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode AWAIT() { return getToken(CSharpParser.AWAIT, 0); }
		public TerminalNode AMP() { return getToken(CSharpParser.AMP, 0); }
		public TerminalNode STAR() { return getToken(CSharpParser.STAR, 0); }
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unary_expression);
		try {
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				primary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				match(PLUS);
				setState(651);
				unary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(652);
				match(MINUS);
				setState(653);
				unary_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(654);
				match(BANG);
				setState(655);
				unary_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(656);
				match(TILDE);
				setState(657);
				unary_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(658);
				match(OP_INC);
				setState(659);
				unary_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(660);
				match(OP_DEC);
				setState(661);
				unary_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(662);
				match(OPEN_PARENS);
				setState(663);
				type_();
				setState(664);
				match(CLOSE_PARENS);
				setState(665);
				unary_expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(667);
				match(AWAIT);
				setState(668);
				unary_expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(669);
				match(AMP);
				setState(670);
				unary_expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(671);
				match(STAR);
				setState(672);
				unary_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public Primary_expression_startContext pe;
		public Primary_expression_startContext primary_expression_start() {
			return getRuleContext(Primary_expression_startContext.class,0);
		}
		public List<Bracket_expressionContext> bracket_expression() {
			return getRuleContexts(Bracket_expressionContext.class);
		}
		public Bracket_expressionContext bracket_expression(int i) {
			return getRuleContext(Bracket_expressionContext.class,i);
		}
		public List<Member_accessContext> member_access() {
			return getRuleContexts(Member_accessContext.class);
		}
		public Member_accessContext member_access(int i) {
			return getRuleContext(Member_accessContext.class,i);
		}
		public List<Method_invocationContext> method_invocation() {
			return getRuleContexts(Method_invocationContext.class);
		}
		public Method_invocationContext method_invocation(int i) {
			return getRuleContext(Method_invocationContext.class,i);
		}
		public List<TerminalNode> OP_INC() { return getTokens(CSharpParser.OP_INC); }
		public TerminalNode OP_INC(int i) {
			return getToken(CSharpParser.OP_INC, i);
		}
		public List<TerminalNode> OP_DEC() { return getTokens(CSharpParser.OP_DEC); }
		public TerminalNode OP_DEC(int i) {
			return getToken(CSharpParser.OP_DEC, i);
		}
		public List<TerminalNode> OP_PTR() { return getTokens(CSharpParser.OP_PTR); }
		public TerminalNode OP_PTR(int i) {
			return getToken(CSharpParser.OP_PTR, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_primary_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			((Primary_expressionContext)_localctx).pe = primary_expression_start();
			setState(679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(676);
					bracket_expression();
					}
					} 
				}
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(698);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(688);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
					case INTERR:
						{
						setState(682);
						member_access();
						}
						break;
					case OPEN_PARENS:
						{
						setState(683);
						method_invocation();
						}
						break;
					case OP_INC:
						{
						setState(684);
						match(OP_INC);
						}
						break;
					case OP_DEC:
						{
						setState(685);
						match(OP_DEC);
						}
						break;
					case OP_PTR:
						{
						setState(686);
						match(OP_PTR);
						setState(687);
						identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(693);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(690);
							bracket_expression();
							}
							} 
						}
						setState(695);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
					}
					}
					} 
				}
				setState(700);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expression_startContext extends ParserRuleContext {
		public Primary_expression_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression_start; }
	 
		public Primary_expression_startContext() { }
		public void copyFrom(Primary_expression_startContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralAccessExpressionContext extends Primary_expression_startContext {
		public TerminalNode LITERAL_ACCESS() { return getToken(CSharpParser.LITERAL_ACCESS, 0); }
		public LiteralAccessExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLiteralAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLiteralAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLiteralAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefaultValueExpressionContext extends Primary_expression_startContext {
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public DefaultValueExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterDefaultValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitDefaultValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitDefaultValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BaseAccessExpressionContext extends Primary_expression_startContext {
		public TerminalNode BASE() { return getToken(CSharpParser.BASE, 0); }
		public TerminalNode DOT() { return getToken(CSharpParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public BaseAccessExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBaseAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBaseAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitBaseAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SizeofExpressionContext extends Primary_expression_startContext {
		public TerminalNode SIZEOF() { return getToken(CSharpParser.SIZEOF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public SizeofExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSizeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSizeofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSizeofExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExpressionsContext extends Primary_expression_startContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public ParenthesisExpressionsContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterParenthesisExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitParenthesisExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitParenthesisExpressions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisReferenceExpressionContext extends Primary_expression_startContext {
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public ThisReferenceExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterThisReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitThisReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitThisReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectCreationExpressionContext extends Primary_expression_startContext {
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Anonymous_object_initializerContext anonymous_object_initializer() {
			return getRuleContext(Anonymous_object_initializerContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Object_creation_expressionContext object_creation_expression() {
			return getRuleContext(Object_creation_expressionContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public ObjectCreationExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterObjectCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitObjectCreationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitObjectCreationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnonymousMethodExpressionContext extends Primary_expression_startContext {
		public TerminalNode DELEGATE() { return getToken(CSharpParser.DELEGATE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() {
			return getRuleContext(Explicit_anonymous_function_parameter_listContext.class,0);
		}
		public AnonymousMethodExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAnonymousMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAnonymousMethodExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAnonymousMethodExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeofExpressionContext extends Primary_expression_startContext {
		public TerminalNode TYPEOF() { return getToken(CSharpParser.TYPEOF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Unbound_type_nameContext unbound_type_name() {
			return getRuleContext(Unbound_type_nameContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public TypeofExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTypeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTypeofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitTypeofExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncheckedExpressionContext extends Primary_expression_startContext {
		public TerminalNode UNCHECKED() { return getToken(CSharpParser.UNCHECKED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public UncheckedExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUncheckedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUncheckedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUncheckedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleNameExpressionContext extends Primary_expression_startContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public SimpleNameExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSimpleNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSimpleNameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSimpleNameExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberAccessExpressionContext extends Primary_expression_startContext {
		public Predefined_typeContext predefined_type() {
			return getRuleContext(Predefined_typeContext.class,0);
		}
		public Qualified_alias_memberContext qualified_alias_member() {
			return getRuleContext(Qualified_alias_memberContext.class,0);
		}
		public MemberAccessExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMemberAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMemberAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMemberAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CheckedExpressionContext extends Primary_expression_startContext {
		public TerminalNode CHECKED() { return getToken(CSharpParser.CHECKED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public CheckedExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCheckedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCheckedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitCheckedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExpressionContext extends Primary_expression_startContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameofExpressionContext extends Primary_expression_startContext {
		public TerminalNode NAMEOF() { return getToken(CSharpParser.NAMEOF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public List<TerminalNode> DOT() { return getTokens(CSharpParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CSharpParser.DOT, i);
		}
		public NameofExpressionContext(Primary_expression_startContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNameofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNameofExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitNameofExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expression_startContext primary_expression_start() throws RecognitionException {
		Primary_expression_startContext _localctx = new Primary_expression_startContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_primary_expression_start);
		int _la;
		try {
			int _alt;
			setState(812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				_localctx = new LiteralExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				literal();
				}
				break;
			case 2:
				_localctx = new SimpleNameExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				identifier();
				setState(704);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(703);
					type_argument_list();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ParenthesisExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(706);
				match(OPEN_PARENS);
				setState(707);
				expression();
				setState(708);
				match(CLOSE_PARENS);
				}
				break;
			case 4:
				_localctx = new MemberAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(710);
				predefined_type();
				}
				break;
			case 5:
				_localctx = new MemberAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(711);
				qualified_alias_member();
				}
				break;
			case 6:
				_localctx = new LiteralAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(712);
				match(LITERAL_ACCESS);
				}
				break;
			case 7:
				_localctx = new ThisReferenceExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(713);
				match(THIS);
				}
				break;
			case 8:
				_localctx = new BaseAccessExpressionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(714);
				match(BASE);
				setState(724);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(715);
					match(DOT);
					setState(716);
					identifier();
					setState(718);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(717);
						type_argument_list();
						}
						break;
					}
					}
					break;
				case OPEN_BRACKET:
					{
					setState(720);
					match(OPEN_BRACKET);
					setState(721);
					expression_list();
					setState(722);
					match(CLOSE_BRACKET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				_localctx = new ObjectCreationExpressionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(726);
				match(NEW);
				setState(755);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BOOL:
				case BY:
				case BYTE:
				case CHAR:
				case DECIMAL:
				case DESCENDING:
				case DOUBLE:
				case DYNAMIC:
				case EQUALS:
				case FLOAT:
				case FROM:
				case GET:
				case GROUP:
				case INT:
				case INTO:
				case JOIN:
				case LET:
				case LONG:
				case NAMEOF:
				case OBJECT:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SBYTE:
				case SELECT:
				case SET:
				case SHORT:
				case STRING:
				case UINT:
				case ULONG:
				case USHORT:
				case VAR:
				case VOID:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
				case OPEN_PARENS:
					{
					setState(727);
					type_();
					setState(749);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(728);
						object_creation_expression();
						}
						break;
					case 2:
						{
						setState(729);
						object_or_collection_initializer();
						}
						break;
					case 3:
						{
						setState(730);
						match(OPEN_BRACKET);
						setState(731);
						expression_list();
						setState(732);
						match(CLOSE_BRACKET);
						setState(736);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(733);
								rank_specifier();
								}
								} 
							}
							setState(738);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
						}
						setState(740);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
						case 1:
							{
							setState(739);
							array_initializer();
							}
							break;
						}
						}
						break;
					case 4:
						{
						setState(743); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(742);
							rank_specifier();
							}
							}
							setState(745); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==OPEN_BRACKET );
						setState(747);
						array_initializer();
						}
						break;
					}
					}
					break;
				case OPEN_BRACE:
					{
					setState(751);
					anonymous_object_initializer();
					}
					break;
				case OPEN_BRACKET:
					{
					setState(752);
					rank_specifier();
					setState(753);
					array_initializer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				_localctx = new TypeofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(757);
				match(TYPEOF);
				setState(758);
				match(OPEN_PARENS);
				setState(762);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(759);
					unbound_type_name();
					}
					break;
				case 2:
					{
					setState(760);
					type_();
					}
					break;
				case 3:
					{
					setState(761);
					match(VOID);
					}
					break;
				}
				setState(764);
				match(CLOSE_PARENS);
				}
				break;
			case 11:
				_localctx = new CheckedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(765);
				match(CHECKED);
				setState(766);
				match(OPEN_PARENS);
				setState(767);
				expression();
				setState(768);
				match(CLOSE_PARENS);
				}
				break;
			case 12:
				_localctx = new UncheckedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(770);
				match(UNCHECKED);
				setState(771);
				match(OPEN_PARENS);
				setState(772);
				expression();
				setState(773);
				match(CLOSE_PARENS);
				}
				break;
			case 13:
				_localctx = new DefaultValueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(775);
				match(DEFAULT);
				setState(780);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(776);
					match(OPEN_PARENS);
					setState(777);
					type_();
					setState(778);
					match(CLOSE_PARENS);
					}
					break;
				}
				}
				break;
			case 14:
				_localctx = new AnonymousMethodExpressionContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC) {
					{
					setState(782);
					match(ASYNC);
					}
				}

				setState(785);
				match(DELEGATE);
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PARENS) {
					{
					setState(786);
					match(OPEN_PARENS);
					setState(788);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (OPEN_PARENS - 67)))) != 0)) {
						{
						setState(787);
						explicit_anonymous_function_parameter_list();
						}
					}

					setState(790);
					match(CLOSE_PARENS);
					}
				}

				setState(793);
				block();
				}
				break;
			case 15:
				_localctx = new SizeofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(794);
				match(SIZEOF);
				setState(795);
				match(OPEN_PARENS);
				setState(796);
				type_();
				setState(797);
				match(CLOSE_PARENS);
				}
				break;
			case 16:
				_localctx = new NameofExpressionContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(799);
				match(NAMEOF);
				setState(800);
				match(OPEN_PARENS);
				setState(806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(801);
						identifier();
						setState(802);
						match(DOT);
						}
						} 
					}
					setState(808);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(809);
				identifier();
				setState(810);
				match(CLOSE_PARENS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_accessContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(CSharpParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INTERR() { return getToken(CSharpParser.INTERR, 0); }
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public Member_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMember_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMember_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMember_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_accessContext member_access() throws RecognitionException {
		Member_accessContext _localctx = new Member_accessContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_member_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERR) {
				{
				setState(814);
				match(INTERR);
				}
			}

			setState(817);
			match(DOT);
			setState(818);
			identifier();
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(819);
				type_argument_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bracket_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public List<Indexer_argumentContext> indexer_argument() {
			return getRuleContexts(Indexer_argumentContext.class);
		}
		public Indexer_argumentContext indexer_argument(int i) {
			return getRuleContext(Indexer_argumentContext.class,i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public TerminalNode INTERR() { return getToken(CSharpParser.INTERR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Bracket_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBracket_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBracket_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitBracket_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bracket_expressionContext bracket_expression() throws RecognitionException {
		Bracket_expressionContext _localctx = new Bracket_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_bracket_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERR) {
				{
				setState(822);
				match(INTERR);
				}
			}

			setState(825);
			match(OPEN_BRACKET);
			setState(826);
			indexer_argument();
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(827);
				match(COMMA);
				setState(828);
				indexer_argument();
				}
				}
				setState(833);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(834);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexer_argumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Indexer_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexer_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIndexer_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIndexer_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitIndexer_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexer_argumentContext indexer_argument() throws RecognitionException {
		Indexer_argumentContext _localctx = new Indexer_argumentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_indexer_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(836);
				identifier();
				setState(837);
				match(COLON);
				}
				break;
			}
			setState(841);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Predefined_typeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(CSharpParser.BOOL, 0); }
		public TerminalNode BYTE() { return getToken(CSharpParser.BYTE, 0); }
		public TerminalNode CHAR() { return getToken(CSharpParser.CHAR, 0); }
		public TerminalNode DECIMAL() { return getToken(CSharpParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(CSharpParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(CSharpParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(CSharpParser.INT, 0); }
		public TerminalNode LONG() { return getToken(CSharpParser.LONG, 0); }
		public TerminalNode OBJECT() { return getToken(CSharpParser.OBJECT, 0); }
		public TerminalNode SBYTE() { return getToken(CSharpParser.SBYTE, 0); }
		public TerminalNode SHORT() { return getToken(CSharpParser.SHORT, 0); }
		public TerminalNode STRING() { return getToken(CSharpParser.STRING, 0); }
		public TerminalNode UINT() { return getToken(CSharpParser.UINT, 0); }
		public TerminalNode ULONG() { return getToken(CSharpParser.ULONG, 0); }
		public TerminalNode USHORT() { return getToken(CSharpParser.USHORT, 0); }
		public Predefined_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefined_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterPredefined_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitPredefined_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitPredefined_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Predefined_typeContext predefined_type() throws RecognitionException {
		Predefined_typeContext _localctx = new Predefined_typeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_predefined_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (SBYTE - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			expression();
			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(846);
				match(COMMA);
				setState(847);
				expression();
				}
				}
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_or_collection_initializerContext extends ParserRuleContext {
		public Object_initializerContext object_initializer() {
			return getRuleContext(Object_initializerContext.class,0);
		}
		public Collection_initializerContext collection_initializer() {
			return getRuleContext(Collection_initializerContext.class,0);
		}
		public Object_or_collection_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_or_collection_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterObject_or_collection_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitObject_or_collection_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitObject_or_collection_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_or_collection_initializerContext object_or_collection_initializer() throws RecognitionException {
		Object_or_collection_initializerContext _localctx = new Object_or_collection_initializerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_object_or_collection_initializer);
		try {
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				object_initializer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
				collection_initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Member_initializer_listContext member_initializer_list() {
			return getRuleContext(Member_initializer_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CSharpParser.COMMA, 0); }
		public Object_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterObject_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitObject_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitObject_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_initializerContext object_initializer() throws RecognitionException {
		Object_initializerContext _localctx = new Object_initializerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_object_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(OPEN_BRACE);
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << NAMEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ON - 68)) | (1L << (ORDERBY - 68)) | (1L << (PARTIAL - 68)) | (1L << (REMOVE - 68)) | (1L << (SELECT - 68)) | (1L << (SET - 68)) | (1L << (VAR - 68)) | (1L << (WHEN - 68)) | (1L << (WHERE - 68)) | (1L << (YIELD - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (OPEN_BRACKET - 68)))) != 0)) {
				{
				setState(858);
				member_initializer_list();
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(859);
					match(COMMA);
					}
				}

				}
			}

			setState(864);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_initializer_listContext extends ParserRuleContext {
		public List<Member_initializerContext> member_initializer() {
			return getRuleContexts(Member_initializerContext.class);
		}
		public Member_initializerContext member_initializer(int i) {
			return getRuleContext(Member_initializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Member_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMember_initializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMember_initializer_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMember_initializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_initializer_listContext member_initializer_list() throws RecognitionException {
		Member_initializer_listContext _localctx = new Member_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_member_initializer_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			member_initializer();
			setState(871);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(867);
					match(COMMA);
					setState(868);
					member_initializer();
					}
					} 
				}
				setState(873);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_initializerContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public Initializer_valueContext initializer_value() {
			return getRuleContext(Initializer_valueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public Member_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMember_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMember_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMember_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_initializerContext member_initializer() throws RecognitionException {
		Member_initializerContext _localctx = new Member_initializerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_member_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				{
				setState(874);
				identifier();
				}
				break;
			case OPEN_BRACKET:
				{
				setState(875);
				match(OPEN_BRACKET);
				setState(876);
				expression();
				setState(877);
				match(CLOSE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(881);
			match(ASSIGNMENT);
			setState(882);
			initializer_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Initializer_valueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public Initializer_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInitializer_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInitializer_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInitializer_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_valueContext initializer_value() throws RecognitionException {
		Initializer_valueContext _localctx = new Initializer_valueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_initializer_value);
		try {
			setState(886);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STATIC:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(884);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(885);
				object_or_collection_initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collection_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public List<Element_initializerContext> element_initializer() {
			return getRuleContexts(Element_initializerContext.class);
		}
		public Element_initializerContext element_initializer(int i) {
			return getRuleContext(Element_initializerContext.class,i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Collection_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCollection_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCollection_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitCollection_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collection_initializerContext collection_initializer() throws RecognitionException {
		Collection_initializerContext _localctx = new Collection_initializerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_collection_initializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(OPEN_BRACE);
			setState(889);
			element_initializer();
			setState(894);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(890);
					match(COMMA);
					setState(891);
					element_initializer();
					}
					} 
				}
				setState(896);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(897);
				match(COMMA);
				}
			}

			setState(900);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Element_initializerContext extends ParserRuleContext {
		public Non_assignment_expressionContext non_assignment_expression() {
			return getRuleContext(Non_assignment_expressionContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Element_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterElement_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitElement_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitElement_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_initializerContext element_initializer() throws RecognitionException {
		Element_initializerContext _localctx = new Element_initializerContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_element_initializer);
		try {
			setState(907);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STATIC:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(902);
				non_assignment_expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(903);
				match(OPEN_BRACE);
				setState(904);
				expression_list();
				setState(905);
				match(CLOSE_BRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anonymous_object_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Member_declarator_listContext member_declarator_list() {
			return getRuleContext(Member_declarator_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CSharpParser.COMMA, 0); }
		public Anonymous_object_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_object_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAnonymous_object_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAnonymous_object_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAnonymous_object_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Anonymous_object_initializerContext anonymous_object_initializer() throws RecognitionException {
		Anonymous_object_initializerContext _localctx = new Anonymous_object_initializerContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_anonymous_object_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(OPEN_BRACE);
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0)) {
				{
				setState(910);
				member_declarator_list();
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(911);
					match(COMMA);
					}
				}

				}
			}

			setState(916);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_declarator_listContext extends ParserRuleContext {
		public List<Member_declaratorContext> member_declarator() {
			return getRuleContexts(Member_declaratorContext.class);
		}
		public Member_declaratorContext member_declarator(int i) {
			return getRuleContext(Member_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Member_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMember_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMember_declarator_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMember_declarator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_declarator_listContext member_declarator_list() throws RecognitionException {
		Member_declarator_listContext _localctx = new Member_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_member_declarator_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			member_declarator();
			setState(923);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(919);
					match(COMMA);
					setState(920);
					member_declarator();
					}
					} 
				}
				setState(925);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_declaratorContext extends ParserRuleContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Member_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMember_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMember_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMember_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_declaratorContext member_declarator() throws RecognitionException {
		Member_declaratorContext _localctx = new Member_declaratorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_member_declarator);
		try {
			setState(931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				primary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				identifier();
				setState(928);
				match(ASSIGNMENT);
				setState(929);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unbound_type_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(CSharpParser.DOUBLE_COLON, 0); }
		public List<TerminalNode> DOT() { return getTokens(CSharpParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CSharpParser.DOT, i);
		}
		public List<Generic_dimension_specifierContext> generic_dimension_specifier() {
			return getRuleContexts(Generic_dimension_specifierContext.class);
		}
		public Generic_dimension_specifierContext generic_dimension_specifier(int i) {
			return getRuleContext(Generic_dimension_specifierContext.class,i);
		}
		public Unbound_type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unbound_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUnbound_type_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUnbound_type_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUnbound_type_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unbound_type_nameContext unbound_type_name() throws RecognitionException {
		Unbound_type_nameContext _localctx = new Unbound_type_nameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unbound_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			identifier();
			setState(942);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE_PARENS:
			case DOT:
			case LT:
				{
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(934);
					generic_dimension_specifier();
					}
				}

				}
				break;
			case DOUBLE_COLON:
				{
				setState(937);
				match(DOUBLE_COLON);
				setState(938);
				identifier();
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(939);
					generic_dimension_specifier();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(944);
				match(DOT);
				setState(945);
				identifier();
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(946);
					generic_dimension_specifier();
					}
				}

				}
				}
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_dimension_specifierContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CSharpParser.LT, 0); }
		public TerminalNode GT() { return getToken(CSharpParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Generic_dimension_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_dimension_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterGeneric_dimension_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitGeneric_dimension_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitGeneric_dimension_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_dimension_specifierContext generic_dimension_specifier() throws RecognitionException {
		Generic_dimension_specifierContext _localctx = new Generic_dimension_specifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_generic_dimension_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			match(LT);
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(955);
				match(COMMA);
				}
				}
				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(961);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsTypeContext extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(CSharpParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(CSharpParser.STAR, i);
		}
		public TerminalNode INTERR() { return getToken(CSharpParser.INTERR, 0); }
		public IsTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIsType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIsType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitIsType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsTypeContext isType() throws RecognitionException {
		IsTypeContext _localctx = new IsTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_isType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			base_type();
			setState(968);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(966);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_BRACKET:
						{
						setState(964);
						rank_specifier();
						}
						break;
					case STAR:
						{
						setState(965);
						match(STAR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(970);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(971);
				match(INTERR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lambda_expressionContext extends ParserRuleContext {
		public Anonymous_function_signatureContext anonymous_function_signature() {
			return getRuleContext(Anonymous_function_signatureContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public Anonymous_function_bodyContext anonymous_function_body() {
			return getRuleContext(Anonymous_function_bodyContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public Lambda_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLambda_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLambda_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLambda_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_expressionContext lambda_expression() throws RecognitionException {
		Lambda_expressionContext _localctx = new Lambda_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_lambda_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(974);
				match(STATIC);
				}
			}

			setState(978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(977);
				match(ASYNC);
				}
				break;
			}
			setState(980);
			anonymous_function_signature();
			setState(981);
			right_arrow();
			setState(982);
			anonymous_function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anonymous_function_signatureContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() {
			return getRuleContext(Explicit_anonymous_function_parameter_listContext.class,0);
		}
		public Implicit_anonymous_function_parameter_listContext implicit_anonymous_function_parameter_list() {
			return getRuleContext(Implicit_anonymous_function_parameter_listContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Anonymous_function_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAnonymous_function_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAnonymous_function_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAnonymous_function_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Anonymous_function_signatureContext anonymous_function_signature() throws RecognitionException {
		Anonymous_function_signatureContext _localctx = new Anonymous_function_signatureContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_anonymous_function_signature);
		try {
			setState(995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(984);
				match(OPEN_PARENS);
				setState(985);
				match(CLOSE_PARENS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				match(OPEN_PARENS);
				setState(987);
				explicit_anonymous_function_parameter_list();
				setState(988);
				match(CLOSE_PARENS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(990);
				match(OPEN_PARENS);
				setState(991);
				implicit_anonymous_function_parameter_list();
				setState(992);
				match(CLOSE_PARENS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(994);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explicit_anonymous_function_parameter_listContext extends ParserRuleContext {
		public List<Explicit_anonymous_function_parameterContext> explicit_anonymous_function_parameter() {
			return getRuleContexts(Explicit_anonymous_function_parameterContext.class);
		}
		public Explicit_anonymous_function_parameterContext explicit_anonymous_function_parameter(int i) {
			return getRuleContext(Explicit_anonymous_function_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Explicit_anonymous_function_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_anonymous_function_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExplicit_anonymous_function_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExplicit_anonymous_function_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitExplicit_anonymous_function_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explicit_anonymous_function_parameter_listContext explicit_anonymous_function_parameter_list() throws RecognitionException {
		Explicit_anonymous_function_parameter_listContext _localctx = new Explicit_anonymous_function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_explicit_anonymous_function_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			explicit_anonymous_function_parameter();
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(998);
				match(COMMA);
				setState(999);
				explicit_anonymous_function_parameter();
				}
				}
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explicit_anonymous_function_parameterContext extends ParserRuleContext {
		public Token refout;
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public Explicit_anonymous_function_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicit_anonymous_function_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExplicit_anonymous_function_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExplicit_anonymous_function_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitExplicit_anonymous_function_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explicit_anonymous_function_parameterContext explicit_anonymous_function_parameter() throws RecognitionException {
		Explicit_anonymous_function_parameterContext _localctx = new Explicit_anonymous_function_parameterContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_explicit_anonymous_function_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUT || _la==REF) {
				{
				setState(1005);
				((Explicit_anonymous_function_parameterContext)_localctx).refout = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OUT || _la==REF) ) {
					((Explicit_anonymous_function_parameterContext)_localctx).refout = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1008);
			type_();
			setState(1009);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implicit_anonymous_function_parameter_listContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Implicit_anonymous_function_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicit_anonymous_function_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterImplicit_anonymous_function_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitImplicit_anonymous_function_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitImplicit_anonymous_function_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implicit_anonymous_function_parameter_listContext implicit_anonymous_function_parameter_list() throws RecognitionException {
		Implicit_anonymous_function_parameter_listContext _localctx = new Implicit_anonymous_function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_implicit_anonymous_function_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			identifier();
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1012);
				match(COMMA);
				setState(1013);
				identifier();
				}
				}
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anonymous_function_bodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Anonymous_function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAnonymous_function_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAnonymous_function_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAnonymous_function_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Anonymous_function_bodyContext anonymous_function_body() throws RecognitionException {
		Anonymous_function_bodyContext _localctx = new Anonymous_function_bodyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_anonymous_function_body);
		try {
			setState(1021);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STATIC:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1019);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1020);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_expressionContext extends ParserRuleContext {
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Query_bodyContext query_body() {
			return getRuleContext(Query_bodyContext.class,0);
		}
		public Query_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterQuery_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitQuery_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitQuery_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_expressionContext query_expression() throws RecognitionException {
		Query_expressionContext _localctx = new Query_expressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_query_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			from_clause();
			setState(1024);
			query_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(CSharpParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_from_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(FROM);
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(1027);
				type_();
				}
				break;
			}
			setState(1030);
			identifier();
			setState(1031);
			match(IN);
			setState(1032);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_bodyContext extends ParserRuleContext {
		public Select_or_group_clauseContext select_or_group_clause() {
			return getRuleContext(Select_or_group_clauseContext.class,0);
		}
		public List<Query_body_clauseContext> query_body_clause() {
			return getRuleContexts(Query_body_clauseContext.class);
		}
		public Query_body_clauseContext query_body_clause(int i) {
			return getRuleContext(Query_body_clauseContext.class,i);
		}
		public Query_continuationContext query_continuation() {
			return getRuleContext(Query_continuationContext.class,0);
		}
		public Query_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterQuery_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitQuery_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitQuery_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_bodyContext query_body() throws RecognitionException {
		Query_bodyContext _localctx = new Query_bodyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_query_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (FROM - 47)) | (1L << (JOIN - 47)) | (1L << (LET - 47)) | (1L << (ORDERBY - 47)) | (1L << (WHERE - 47)))) != 0)) {
				{
				{
				setState(1034);
				query_body_clause();
				}
				}
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1040);
			select_or_group_clause();
			setState(1042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(1041);
				query_continuation();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_body_clauseContext extends ParserRuleContext {
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Let_clauseContext let_clause() {
			return getRuleContext(Let_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Combined_join_clauseContext combined_join_clause() {
			return getRuleContext(Combined_join_clauseContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Query_body_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_body_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterQuery_body_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitQuery_body_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitQuery_body_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_body_clauseContext query_body_clause() throws RecognitionException {
		Query_body_clauseContext _localctx = new Query_body_clauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_query_body_clause);
		try {
			setState(1049);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044);
				from_clause();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1045);
				let_clause();
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1046);
				where_clause();
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1047);
				combined_join_clause();
				}
				break;
			case ORDERBY:
				enterOuterAlt(_localctx, 5);
				{
				setState(1048);
				orderby_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Let_clauseContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(CSharpParser.LET, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Let_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLet_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLet_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_clauseContext let_clause() throws RecognitionException {
		Let_clauseContext _localctx = new Let_clauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_let_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			match(LET);
			setState(1052);
			identifier();
			setState(1053);
			match(ASSIGNMENT);
			setState(1054);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(CSharpParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(WHERE);
			setState(1057);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Combined_join_clauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(CSharpParser.JOIN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ON() { return getToken(CSharpParser.ON, 0); }
		public TerminalNode EQUALS() { return getToken(CSharpParser.EQUALS, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode INTO() { return getToken(CSharpParser.INTO, 0); }
		public Combined_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combined_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCombined_join_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCombined_join_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitCombined_join_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Combined_join_clauseContext combined_join_clause() throws RecognitionException {
		Combined_join_clauseContext _localctx = new Combined_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_combined_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			match(JOIN);
			setState(1061);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(1060);
				type_();
				}
				break;
			}
			setState(1063);
			identifier();
			setState(1064);
			match(IN);
			setState(1065);
			expression();
			setState(1066);
			match(ON);
			setState(1067);
			expression();
			setState(1068);
			match(EQUALS);
			setState(1069);
			expression();
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1070);
				match(INTO);
				setState(1071);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Orderby_clauseContext extends ParserRuleContext {
		public TerminalNode ORDERBY() { return getToken(CSharpParser.ORDERBY, 0); }
		public List<OrderingContext> ordering() {
			return getRuleContexts(OrderingContext.class);
		}
		public OrderingContext ordering(int i) {
			return getRuleContext(OrderingContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Orderby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterOrderby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitOrderby_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitOrderby_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Orderby_clauseContext orderby_clause() throws RecognitionException {
		Orderby_clauseContext _localctx = new Orderby_clauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_orderby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			match(ORDERBY);
			setState(1075);
			ordering();
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1076);
				match(COMMA);
				setState(1077);
				ordering();
				}
				}
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderingContext extends ParserRuleContext {
		public Token dir;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASCENDING() { return getToken(CSharpParser.ASCENDING, 0); }
		public TerminalNode DESCENDING() { return getToken(CSharpParser.DESCENDING, 0); }
		public OrderingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterOrdering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitOrdering(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitOrdering(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderingContext ordering() throws RecognitionException {
		OrderingContext _localctx = new OrderingContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_ordering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			expression();
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASCENDING || _la==DESCENDING) {
				{
				setState(1084);
				((OrderingContext)_localctx).dir = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASCENDING || _la==DESCENDING) ) {
					((OrderingContext)_localctx).dir = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_or_group_clauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(CSharpParser.SELECT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GROUP() { return getToken(CSharpParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(CSharpParser.BY, 0); }
		public Select_or_group_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_group_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSelect_or_group_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSelect_or_group_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSelect_or_group_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_group_clauseContext select_or_group_clause() throws RecognitionException {
		Select_or_group_clauseContext _localctx = new Select_or_group_clauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_select_or_group_clause);
		try {
			setState(1094);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1087);
				match(SELECT);
				setState(1088);
				expression();
				}
				break;
			case GROUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
				match(GROUP);
				setState(1090);
				expression();
				setState(1091);
				match(BY);
				setState(1092);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_continuationContext extends ParserRuleContext {
		public TerminalNode INTO() { return getToken(CSharpParser.INTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Query_bodyContext query_body() {
			return getRuleContext(Query_bodyContext.class,0);
		}
		public Query_continuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_continuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterQuery_continuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitQuery_continuation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitQuery_continuation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_continuationContext query_continuation() throws RecognitionException {
		Query_continuationContext _localctx = new Query_continuationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_query_continuation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			match(INTO);
			setState(1097);
			identifier();
			setState(1098);
			query_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationStatementContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public Local_constant_declarationContext local_constant_declaration() {
			return getRuleContext(Local_constant_declarationContext.class,0);
		}
		public DeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmbeddedStatementContext extends StatementContext {
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public EmbeddedStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEmbeddedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEmbeddedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitEmbeddedStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LabeledStatementContext extends StatementContext {
		public Labeled_StatementContext labeled_Statement() {
			return getRuleContext(Labeled_StatementContext.class,0);
		}
		public LabeledStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_statement);
		try {
			setState(1108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				_localctx = new LabeledStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1100);
				labeled_Statement();
				}
				break;
			case 2:
				_localctx = new DeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1103);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BOOL:
				case BY:
				case BYTE:
				case CHAR:
				case DECIMAL:
				case DESCENDING:
				case DOUBLE:
				case DYNAMIC:
				case EQUALS:
				case FLOAT:
				case FROM:
				case GET:
				case GROUP:
				case INT:
				case INTO:
				case JOIN:
				case LET:
				case LONG:
				case NAMEOF:
				case OBJECT:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SBYTE:
				case SELECT:
				case SET:
				case SHORT:
				case STRING:
				case UINT:
				case ULONG:
				case USHORT:
				case VAR:
				case VOID:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
				case OPEN_PARENS:
					{
					setState(1101);
					local_variable_declaration();
					}
					break;
				case CONST:
					{
					setState(1102);
					local_constant_declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1105);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new EmbeddedStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1107);
				embedded_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Labeled_StatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Labeled_StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_Statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLabeled_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLabeled_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLabeled_Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labeled_StatementContext labeled_Statement() throws RecognitionException {
		Labeled_StatementContext _localctx = new Labeled_StatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_labeled_Statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			identifier();
			setState(1111);
			match(COLON);
			setState(1112);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Embedded_statementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_embedded_statementContext simple_embedded_statement() {
			return getRuleContext(Simple_embedded_statementContext.class,0);
		}
		public Embedded_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_embedded_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEmbedded_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEmbedded_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitEmbedded_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Embedded_statementContext embedded_statement() throws RecognitionException {
		Embedded_statementContext _localctx = new Embedded_statementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_embedded_statement);
		try {
			setState(1116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1114);
				block();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BREAK:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case CONTINUE:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DO:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FIXED:
			case FLOAT:
			case FOR:
			case FOREACH:
			case FROM:
			case GET:
			case GOTO:
			case GROUP:
			case IF:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LOCK:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case RETURN:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STATIC:
			case STRING:
			case SWITCH:
			case THIS:
			case THROW:
			case TRUE:
			case TRY:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNSAFE:
			case USHORT:
			case USING:
			case VAR:
			case WHEN:
			case WHERE:
			case WHILE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case SEMICOLON:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1115);
				simple_embedded_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_embedded_statementContext extends ParserRuleContext {
		public Simple_embedded_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_embedded_statement; }
	 
		public Simple_embedded_statementContext() { }
		public void copyFrom(Simple_embedded_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TryStatementContext extends Simple_embedded_statementContext {
		public TerminalNode TRY() { return getToken(CSharpParser.TRY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Catch_clausesContext catch_clauses() {
			return getRuleContext(Catch_clausesContext.class,0);
		}
		public Finally_clauseContext finally_clause() {
			return getRuleContext(Finally_clauseContext.class,0);
		}
		public TryStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CheckedStatementContext extends Simple_embedded_statementContext {
		public TerminalNode CHECKED() { return getToken(CSharpParser.CHECKED, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CheckedStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCheckedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCheckedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitCheckedStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThrowStatementContext extends Simple_embedded_statementContext {
		public TerminalNode THROW() { return getToken(CSharpParser.THROW, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TheEmptyStatementContext extends Simple_embedded_statementContext {
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public TheEmptyStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTheEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTheEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitTheEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsafeStatementContext extends Simple_embedded_statementContext {
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UnsafeStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUnsafeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUnsafeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUnsafeStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends Simple_embedded_statementContext {
		public TerminalNode FOR() { return getToken(CSharpParser.FOR, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CSharpParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CSharpParser.SEMICOLON, i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public For_initializerContext for_initializer() {
			return getRuleContext(For_initializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public For_iteratorContext for_iterator() {
			return getRuleContext(For_iteratorContext.class,0);
		}
		public ForStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStatementContext extends Simple_embedded_statementContext {
		public TerminalNode BREAK() { return getToken(CSharpParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public BreakStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends Simple_embedded_statementContext {
		public TerminalNode IF() { return getToken(CSharpParser.IF, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public List<If_bodyContext> if_body() {
			return getRuleContexts(If_bodyContext.class);
		}
		public If_bodyContext if_body(int i) {
			return getRuleContext(If_bodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CSharpParser.ELSE, 0); }
		public IfStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends Simple_embedded_statementContext {
		public TerminalNode RETURN() { return getToken(CSharpParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GotoStatementContext extends Simple_embedded_statementContext {
		public TerminalNode GOTO() { return getToken(CSharpParser.GOTO, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CASE() { return getToken(CSharpParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public GotoStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchStatementContext extends Simple_embedded_statementContext {
		public TerminalNode SWITCH() { return getToken(CSharpParser.SWITCH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Switch_sectionContext> switch_section() {
			return getRuleContexts(Switch_sectionContext.class);
		}
		public Switch_sectionContext switch_section(int i) {
			return getRuleContext(Switch_sectionContext.class,i);
		}
		public SwitchStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FixedStatementContext extends Simple_embedded_statementContext {
		public TerminalNode FIXED() { return getToken(CSharpParser.FIXED, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Pointer_typeContext pointer_type() {
			return getRuleContext(Pointer_typeContext.class,0);
		}
		public Fixed_pointer_declaratorsContext fixed_pointer_declarators() {
			return getRuleContext(Fixed_pointer_declaratorsContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public FixedStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFixedStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatementContext extends Simple_embedded_statementContext {
		public TerminalNode WHILE() { return getToken(CSharpParser.WHILE, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public WhileStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoStatementContext extends Simple_embedded_statementContext {
		public TerminalNode DO() { return getToken(CSharpParser.DO, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CSharpParser.WHILE, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public DoStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForeachStatementContext extends Simple_embedded_statementContext {
		public TerminalNode FOREACH() { return getToken(CSharpParser.FOREACH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Local_variable_typeContext local_variable_type() {
			return getRuleContext(Local_variable_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public ForeachStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitForeachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncheckedStatementContext extends Simple_embedded_statementContext {
		public TerminalNode UNCHECKED() { return getToken(CSharpParser.UNCHECKED, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UncheckedStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUncheckedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUncheckedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUncheckedStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionStatementContext extends Simple_embedded_statementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public ExpressionStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStatementContext extends Simple_embedded_statementContext {
		public TerminalNode CONTINUE() { return getToken(CSharpParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public ContinueStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UsingStatementContext extends Simple_embedded_statementContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Resource_acquisitionContext resource_acquisition() {
			return getRuleContext(Resource_acquisitionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public UsingStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUsingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUsingStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUsingStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LockStatementContext extends Simple_embedded_statementContext {
		public TerminalNode LOCK() { return getToken(CSharpParser.LOCK, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Embedded_statementContext embedded_statement() {
			return getRuleContext(Embedded_statementContext.class,0);
		}
		public LockStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class YieldStatementContext extends Simple_embedded_statementContext {
		public TerminalNode YIELD() { return getToken(CSharpParser.YIELD, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(CSharpParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(CSharpParser.BREAK, 0); }
		public YieldStatementContext(Simple_embedded_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterYieldStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitYieldStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitYieldStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_embedded_statementContext simple_embedded_statement() throws RecognitionException {
		Simple_embedded_statementContext _localctx = new Simple_embedded_statementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_simple_embedded_statement);
		int _la;
		try {
			setState(1245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				_localctx = new TheEmptyStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1118);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1119);
				expression();
				setState(1120);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1122);
				match(IF);
				setState(1123);
				match(OPEN_PARENS);
				setState(1124);
				expression();
				setState(1125);
				match(CLOSE_PARENS);
				setState(1126);
				if_body();
				setState(1129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(1127);
					match(ELSE);
					setState(1128);
					if_body();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new SwitchStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1131);
				match(SWITCH);
				setState(1132);
				match(OPEN_PARENS);
				setState(1133);
				expression();
				setState(1134);
				match(CLOSE_PARENS);
				setState(1135);
				match(OPEN_BRACE);
				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1136);
					switch_section();
					}
					}
					setState(1141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1142);
				match(CLOSE_BRACE);
				}
				break;
			case 5:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1144);
				match(WHILE);
				setState(1145);
				match(OPEN_PARENS);
				setState(1146);
				expression();
				setState(1147);
				match(CLOSE_PARENS);
				setState(1148);
				embedded_statement();
				}
				break;
			case 6:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1150);
				match(DO);
				setState(1151);
				embedded_statement();
				setState(1152);
				match(WHILE);
				setState(1153);
				match(OPEN_PARENS);
				setState(1154);
				expression();
				setState(1155);
				match(CLOSE_PARENS);
				setState(1156);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1158);
				match(FOR);
				setState(1159);
				match(OPEN_PARENS);
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VOID - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(1160);
					for_initializer();
					}
				}

				setState(1163);
				match(SEMICOLON);
				setState(1165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(1164);
					expression();
					}
				}

				setState(1167);
				match(SEMICOLON);
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(1168);
					for_iterator();
					}
				}

				setState(1171);
				match(CLOSE_PARENS);
				setState(1172);
				embedded_statement();
				}
				break;
			case 8:
				_localctx = new ForeachStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1173);
				match(FOREACH);
				setState(1174);
				match(OPEN_PARENS);
				setState(1175);
				local_variable_type();
				setState(1176);
				identifier();
				setState(1177);
				match(IN);
				setState(1178);
				expression();
				setState(1179);
				match(CLOSE_PARENS);
				setState(1180);
				embedded_statement();
				}
				break;
			case 9:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1182);
				match(BREAK);
				setState(1183);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1184);
				match(CONTINUE);
				setState(1185);
				match(SEMICOLON);
				}
				break;
			case 11:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1186);
				match(GOTO);
				setState(1191);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BY:
				case DESCENDING:
				case DYNAMIC:
				case EQUALS:
				case FROM:
				case GET:
				case GROUP:
				case INTO:
				case JOIN:
				case LET:
				case NAMEOF:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SELECT:
				case SET:
				case VAR:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
					{
					setState(1187);
					identifier();
					}
					break;
				case CASE:
					{
					setState(1188);
					match(CASE);
					setState(1189);
					expression();
					}
					break;
				case DEFAULT:
					{
					setState(1190);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1193);
				match(SEMICOLON);
				}
				break;
			case 12:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1194);
				match(RETURN);
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(1195);
					expression();
					}
				}

				setState(1198);
				match(SEMICOLON);
				}
				break;
			case 13:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(1199);
				match(THROW);
				setState(1201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(1200);
					expression();
					}
				}

				setState(1203);
				match(SEMICOLON);
				}
				break;
			case 14:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(1204);
				match(TRY);
				setState(1205);
				block();
				setState(1211);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(1206);
					catch_clauses();
					setState(1208);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(1207);
						finally_clause();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(1210);
					finally_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 15:
				_localctx = new CheckedStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(1213);
				match(CHECKED);
				setState(1214);
				block();
				}
				break;
			case 16:
				_localctx = new UncheckedStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(1215);
				match(UNCHECKED);
				setState(1216);
				block();
				}
				break;
			case 17:
				_localctx = new LockStatementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(1217);
				match(LOCK);
				setState(1218);
				match(OPEN_PARENS);
				setState(1219);
				expression();
				setState(1220);
				match(CLOSE_PARENS);
				setState(1221);
				embedded_statement();
				}
				break;
			case 18:
				_localctx = new UsingStatementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(1223);
				match(USING);
				setState(1224);
				match(OPEN_PARENS);
				setState(1225);
				resource_acquisition();
				setState(1226);
				match(CLOSE_PARENS);
				setState(1227);
				embedded_statement();
				}
				break;
			case 19:
				_localctx = new YieldStatementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(1229);
				match(YIELD);
				setState(1233);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RETURN:
					{
					setState(1230);
					match(RETURN);
					setState(1231);
					expression();
					}
					break;
				case BREAK:
					{
					setState(1232);
					match(BREAK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1235);
				match(SEMICOLON);
				}
				break;
			case 20:
				_localctx = new UnsafeStatementContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(1236);
				match(UNSAFE);
				setState(1237);
				block();
				}
				break;
			case 21:
				_localctx = new FixedStatementContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(1238);
				match(FIXED);
				setState(1239);
				match(OPEN_PARENS);
				setState(1240);
				pointer_type();
				setState(1241);
				fixed_pointer_declarators();
				setState(1242);
				match(CLOSE_PARENS);
				setState(1243);
				embedded_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			match(OPEN_BRACE);
			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BREAK) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << CONST) | (1L << CONTINUE) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DO) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FIXED) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << FROM) | (1L << GET) | (1L << GOTO) | (1L << GROUP) | (1L << IF) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LOCK) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (RETURN - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (SWITCH - 65)) | (1L << (THIS - 65)) | (1L << (THROW - 65)) | (1L << (TRUE - 65)) | (1L << (TRY - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (UNSAFE - 65)) | (1L << (USHORT - 65)) | (1L << (USING - 65)) | (1L << (VAR - 65)) | (1L << (VOID - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (WHILE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_BRACE - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (SEMICOLON - 131)) | (1L << (PLUS - 131)) | (1L << (MINUS - 131)) | (1L << (STAR - 131)) | (1L << (AMP - 131)) | (1L << (BANG - 131)) | (1L << (TILDE - 131)) | (1L << (OP_INC - 131)) | (1L << (OP_DEC - 131)))) != 0)) {
				{
				setState(1248);
				statement_list();
				}
			}

			setState(1251);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_declarationContext extends ParserRuleContext {
		public Local_variable_typeContext local_variable_type() {
			return getRuleContext(Local_variable_typeContext.class,0);
		}
		public List<Local_variable_declaratorContext> local_variable_declarator() {
			return getRuleContexts(Local_variable_declaratorContext.class);
		}
		public Local_variable_declaratorContext local_variable_declarator(int i) {
			return getRuleContext(Local_variable_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Local_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_variable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLocal_variable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_variable_declarationContext local_variable_declaration() throws RecognitionException {
		Local_variable_declarationContext _localctx = new Local_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_local_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			local_variable_type();
			setState(1254);
			local_variable_declarator();
			setState(1259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1255);
				match(COMMA);
				setState(1256);
				local_variable_declarator();
				}
				}
				setState(1261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_typeContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(CSharpParser.VAR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Local_variable_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_variable_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_variable_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLocal_variable_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_variable_typeContext local_variable_type() throws RecognitionException {
		Local_variable_typeContext _localctx = new Local_variable_typeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_local_variable_type);
		try {
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1262);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1263);
				type_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public Local_variable_initializerContext local_variable_initializer() {
			return getRuleContext(Local_variable_initializerContext.class,0);
		}
		public Local_variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_variable_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_variable_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLocal_variable_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_variable_declaratorContext local_variable_declarator() throws RecognitionException {
		Local_variable_declaratorContext _localctx = new Local_variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_local_variable_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			identifier();
			setState(1269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(1267);
				match(ASSIGNMENT);
				setState(1268);
				local_variable_initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public Local_variable_initializer_unsafeContext local_variable_initializer_unsafe() {
			return getRuleContext(Local_variable_initializer_unsafeContext.class,0);
		}
		public Local_variable_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_variable_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_variable_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLocal_variable_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_variable_initializerContext local_variable_initializer() throws RecognitionException {
		Local_variable_initializerContext _localctx = new Local_variable_initializerContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_local_variable_initializer);
		try {
			setState(1274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STATIC:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1271);
				expression();
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1272);
				array_initializer();
				}
				break;
			case STACKALLOC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1273);
				local_variable_initializer_unsafe();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(CSharpParser.CONST, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Constant_declaratorsContext constant_declarators() {
			return getRuleContext(Constant_declaratorsContext.class,0);
		}
		public Local_constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_constant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_constant_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLocal_constant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_constant_declarationContext local_constant_declaration() throws RecognitionException {
		Local_constant_declarationContext _localctx = new Local_constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_local_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			match(CONST);
			setState(1277);
			type_();
			setState(1278);
			constant_declarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_embedded_statementContext simple_embedded_statement() {
			return getRuleContext(Simple_embedded_statementContext.class,0);
		}
		public If_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIf_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIf_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitIf_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bodyContext if_body() throws RecognitionException {
		If_bodyContext _localctx = new If_bodyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_if_body);
		try {
			setState(1282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1280);
				block();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BREAK:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case CONTINUE:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DO:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FIXED:
			case FLOAT:
			case FOR:
			case FOREACH:
			case FROM:
			case GET:
			case GOTO:
			case GROUP:
			case IF:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LOCK:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case RETURN:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STATIC:
			case STRING:
			case SWITCH:
			case THIS:
			case THROW:
			case TRUE:
			case TRY:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNSAFE:
			case USHORT:
			case USING:
			case VAR:
			case WHEN:
			case WHERE:
			case WHILE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case SEMICOLON:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1281);
				simple_embedded_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_sectionContext extends ParserRuleContext {
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public List<Switch_labelContext> switch_label() {
			return getRuleContexts(Switch_labelContext.class);
		}
		public Switch_labelContext switch_label(int i) {
			return getRuleContext(Switch_labelContext.class,i);
		}
		public Switch_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSwitch_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSwitch_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSwitch_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_sectionContext switch_section() throws RecognitionException {
		Switch_sectionContext _localctx = new Switch_sectionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_switch_section);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1285); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1284);
					switch_label();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1287); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1289);
			statement_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_labelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(CSharpParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public Switch_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSwitch_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSwitch_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSwitch_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_labelContext switch_label() throws RecognitionException {
		Switch_labelContext _localctx = new Switch_labelContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_switch_label);
		try {
			setState(1297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1291);
				match(CASE);
				setState(1292);
				expression();
				setState(1293);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1295);
				match(DEFAULT);
				setState(1296);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_listContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitStatement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitStatement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_statement_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1300); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1299);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1302); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_initializerContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public For_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFor_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFor_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFor_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_initializerContext for_initializer() throws RecognitionException {
		For_initializerContext _localctx = new For_initializerContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_for_initializer);
		int _la;
		try {
			setState(1313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304);
				local_variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1305);
				expression();
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1306);
					match(COMMA);
					setState(1307);
					expression();
					}
					}
					setState(1312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_iteratorContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public For_iteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_iterator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFor_iterator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFor_iterator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFor_iterator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_iteratorContext for_iterator() throws RecognitionException {
		For_iteratorContext _localctx = new For_iteratorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_for_iterator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			expression();
			setState(1320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1316);
				match(COMMA);
				setState(1317);
				expression();
				}
				}
				setState(1322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Catch_clausesContext extends ParserRuleContext {
		public List<Specific_catch_clauseContext> specific_catch_clause() {
			return getRuleContexts(Specific_catch_clauseContext.class);
		}
		public Specific_catch_clauseContext specific_catch_clause(int i) {
			return getRuleContext(Specific_catch_clauseContext.class,i);
		}
		public General_catch_clauseContext general_catch_clause() {
			return getRuleContext(General_catch_clauseContext.class,0);
		}
		public Catch_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catch_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCatch_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCatch_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitCatch_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Catch_clausesContext catch_clauses() throws RecognitionException {
		Catch_clausesContext _localctx = new Catch_clausesContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_catch_clauses);
		int _la;
		try {
			int _alt;
			setState(1334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1323);
				specific_catch_clause();
				setState(1327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1324);
						specific_catch_clause();
						}
						} 
					}
					setState(1329);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
				}
				setState(1331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1330);
					general_catch_clause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1333);
				general_catch_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Specific_catch_clauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(CSharpParser.CATCH, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Exception_filterContext exception_filter() {
			return getRuleContext(Exception_filterContext.class,0);
		}
		public Specific_catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specific_catch_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSpecific_catch_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSpecific_catch_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSpecific_catch_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Specific_catch_clauseContext specific_catch_clause() throws RecognitionException {
		Specific_catch_clauseContext _localctx = new Specific_catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_specific_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			match(CATCH);
			setState(1337);
			match(OPEN_PARENS);
			setState(1338);
			class_type();
			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << NAMEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ON - 68)) | (1L << (ORDERBY - 68)) | (1L << (PARTIAL - 68)) | (1L << (REMOVE - 68)) | (1L << (SELECT - 68)) | (1L << (SET - 68)) | (1L << (VAR - 68)) | (1L << (WHEN - 68)) | (1L << (WHERE - 68)) | (1L << (YIELD - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) {
				{
				setState(1339);
				identifier();
				}
			}

			setState(1342);
			match(CLOSE_PARENS);
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1343);
				exception_filter();
				}
			}

			setState(1346);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class General_catch_clauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(CSharpParser.CATCH, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Exception_filterContext exception_filter() {
			return getRuleContext(Exception_filterContext.class,0);
		}
		public General_catch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_catch_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterGeneral_catch_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitGeneral_catch_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitGeneral_catch_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final General_catch_clauseContext general_catch_clause() throws RecognitionException {
		General_catch_clauseContext _localctx = new General_catch_clauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_general_catch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			match(CATCH);
			setState(1350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1349);
				exception_filter();
				}
			}

			setState(1352);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_filterContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(CSharpParser.WHEN, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Exception_filterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterException_filter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitException_filter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitException_filter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_filterContext exception_filter() throws RecognitionException {
		Exception_filterContext _localctx = new Exception_filterContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_exception_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			match(WHEN);
			setState(1355);
			match(OPEN_PARENS);
			setState(1356);
			expression();
			setState(1357);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_clauseContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(CSharpParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFinally_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFinally_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFinally_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finally_clauseContext finally_clause() throws RecognitionException {
		Finally_clauseContext _localctx = new Finally_clauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_finally_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			match(FINALLY);
			setState(1360);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Resource_acquisitionContext extends ParserRuleContext {
		public Local_variable_declarationContext local_variable_declaration() {
			return getRuleContext(Local_variable_declarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Resource_acquisitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_acquisition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterResource_acquisition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitResource_acquisition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitResource_acquisition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resource_acquisitionContext resource_acquisition() throws RecognitionException {
		Resource_acquisitionContext _localctx = new Resource_acquisitionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_resource_acquisition);
		try {
			setState(1364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1362);
				local_variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1363);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_declarationContext extends ParserRuleContext {
		public Qualified_identifierContext qi;
		public TerminalNode NAMESPACE() { return getToken(CSharpParser.NAMESPACE, 0); }
		public Namespace_bodyContext namespace_body() {
			return getRuleContext(Namespace_bodyContext.class,0);
		}
		public Qualified_identifierContext qualified_identifier() {
			return getRuleContext(Qualified_identifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Namespace_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNamespace_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNamespace_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitNamespace_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_declarationContext namespace_declaration() throws RecognitionException {
		Namespace_declarationContext _localctx = new Namespace_declarationContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_namespace_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			match(NAMESPACE);
			setState(1367);
			((Namespace_declarationContext)_localctx).qi = qualified_identifier();
			setState(1368);
			namespace_body();
			setState(1370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(1369);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_identifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(CSharpParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CSharpParser.DOT, i);
		}
		public Qualified_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterQualified_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitQualified_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitQualified_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_identifierContext qualified_identifier() throws RecognitionException {
		Qualified_identifierContext _localctx = new Qualified_identifierContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_qualified_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372);
			identifier();
			setState(1377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1373);
				match(DOT);
				setState(1374);
				identifier();
				}
				}
				setState(1379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Extern_alias_directivesContext extern_alias_directives() {
			return getRuleContext(Extern_alias_directivesContext.class,0);
		}
		public Using_directivesContext using_directives() {
			return getRuleContext(Using_directivesContext.class,0);
		}
		public Namespace_member_declarationsContext namespace_member_declarations() {
			return getRuleContext(Namespace_member_declarationsContext.class,0);
		}
		public Namespace_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNamespace_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNamespace_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitNamespace_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_bodyContext namespace_body() throws RecognitionException {
		Namespace_bodyContext _localctx = new Namespace_bodyContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_namespace_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			match(OPEN_BRACE);
			setState(1382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1381);
				extern_alias_directives();
				}
				break;
			}
			setState(1385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1384);
				using_directives();
				}
			}

			setState(1388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << CLASS) | (1L << DELEGATE) | (1L << ENUM) | (1L << EXTERN) | (1L << INTERFACE) | (1L << INTERNAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMESPACE - 64)) | (1L << (NEW - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARTIAL - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (SEALED - 64)) | (1L << (STATIC - 64)) | (1L << (STRUCT - 64)) | (1L << (UNSAFE - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0)) {
				{
				setState(1387);
				namespace_member_declarations();
				}
			}

			setState(1390);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extern_alias_directivesContext extends ParserRuleContext {
		public List<Extern_alias_directiveContext> extern_alias_directive() {
			return getRuleContexts(Extern_alias_directiveContext.class);
		}
		public Extern_alias_directiveContext extern_alias_directive(int i) {
			return getRuleContext(Extern_alias_directiveContext.class,i);
		}
		public Extern_alias_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern_alias_directives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExtern_alias_directives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExtern_alias_directives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitExtern_alias_directives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extern_alias_directivesContext extern_alias_directives() throws RecognitionException {
		Extern_alias_directivesContext _localctx = new Extern_alias_directivesContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_extern_alias_directives);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1393); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1392);
					extern_alias_directive();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1395); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extern_alias_directiveContext extends ParserRuleContext {
		public TerminalNode EXTERN() { return getToken(CSharpParser.EXTERN, 0); }
		public TerminalNode ALIAS() { return getToken(CSharpParser.ALIAS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Extern_alias_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern_alias_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterExtern_alias_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitExtern_alias_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitExtern_alias_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extern_alias_directiveContext extern_alias_directive() throws RecognitionException {
		Extern_alias_directiveContext _localctx = new Extern_alias_directiveContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_extern_alias_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			match(EXTERN);
			setState(1398);
			match(ALIAS);
			setState(1399);
			identifier();
			setState(1400);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_directivesContext extends ParserRuleContext {
		public List<Using_directiveContext> using_directive() {
			return getRuleContexts(Using_directiveContext.class);
		}
		public Using_directiveContext using_directive(int i) {
			return getRuleContext(Using_directiveContext.class,i);
		}
		public Using_directivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUsing_directives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUsing_directives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUsing_directives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Using_directivesContext using_directives() throws RecognitionException {
		Using_directivesContext _localctx = new Using_directivesContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_using_directives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1402);
				using_directive();
				}
				}
				setState(1405); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==USING );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_directiveContext extends ParserRuleContext {
		public Using_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directive; }
	 
		public Using_directiveContext() { }
		public void copyFrom(Using_directiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UsingAliasDirectiveContext extends Using_directiveContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public UsingAliasDirectiveContext(Using_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUsingAliasDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUsingAliasDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUsingAliasDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UsingNamespaceDirectiveContext extends Using_directiveContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public UsingNamespaceDirectiveContext(Using_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUsingNamespaceDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUsingNamespaceDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUsingNamespaceDirective(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UsingStaticDirectiveContext extends Using_directiveContext {
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public UsingStaticDirectiveContext(Using_directiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterUsingStaticDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitUsingStaticDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitUsingStaticDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Using_directiveContext using_directive() throws RecognitionException {
		Using_directiveContext _localctx = new Using_directiveContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_using_directive);
		try {
			setState(1422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				_localctx = new UsingAliasDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1407);
				match(USING);
				setState(1408);
				identifier();
				setState(1409);
				match(ASSIGNMENT);
				setState(1410);
				namespace_or_type_name();
				setState(1411);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new UsingNamespaceDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1413);
				match(USING);
				setState(1414);
				namespace_or_type_name();
				setState(1415);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new UsingStaticDirectiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1417);
				match(USING);
				setState(1418);
				match(STATIC);
				setState(1419);
				namespace_or_type_name();
				setState(1420);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_member_declarationsContext extends ParserRuleContext {
		public List<Namespace_member_declarationContext> namespace_member_declaration() {
			return getRuleContexts(Namespace_member_declarationContext.class);
		}
		public Namespace_member_declarationContext namespace_member_declaration(int i) {
			return getRuleContext(Namespace_member_declarationContext.class,i);
		}
		public Namespace_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_member_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNamespace_member_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNamespace_member_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitNamespace_member_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_member_declarationsContext namespace_member_declarations() throws RecognitionException {
		Namespace_member_declarationsContext _localctx = new Namespace_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_namespace_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1424);
				namespace_member_declaration();
				}
				}
				setState(1427); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << CLASS) | (1L << DELEGATE) | (1L << ENUM) | (1L << EXTERN) | (1L << INTERFACE) | (1L << INTERNAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMESPACE - 64)) | (1L << (NEW - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARTIAL - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (SEALED - 64)) | (1L << (STATIC - 64)) | (1L << (STRUCT - 64)) | (1L << (UNSAFE - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (OPEN_BRACKET - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Namespace_member_declarationContext extends ParserRuleContext {
		public Namespace_declarationContext namespace_declaration() {
			return getRuleContext(Namespace_declarationContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public Namespace_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterNamespace_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitNamespace_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitNamespace_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_member_declarationContext namespace_member_declaration() throws RecognitionException {
		Namespace_member_declarationContext _localctx = new Namespace_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_namespace_member_declaration);
		try {
			setState(1431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1429);
				namespace_declaration();
				}
				break;
			case ABSTRACT:
			case ASYNC:
			case CLASS:
			case DELEGATE:
			case ENUM:
			case EXTERN:
			case INTERFACE:
			case INTERNAL:
			case NEW:
			case OVERRIDE:
			case PARTIAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case READONLY:
			case SEALED:
			case STATIC:
			case STRUCT:
			case UNSAFE:
			case VIRTUAL:
			case VOLATILE:
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1430);
				type_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_declarationContext extends ParserRuleContext {
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public Struct_definitionContext struct_definition() {
			return getRuleContext(Struct_definitionContext.class,0);
		}
		public Interface_definitionContext interface_definition() {
			return getRuleContext(Interface_definitionContext.class,0);
		}
		public Enum_definitionContext enum_definition() {
			return getRuleContext(Enum_definitionContext.class,0);
		}
		public Delegate_definitionContext delegate_definition() {
			return getRuleContext(Delegate_definitionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitType_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1433);
				attributes();
				}
			}

			setState(1437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << EXTERN) | (1L << INTERNAL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (SEALED - 65)) | (1L << (STATIC - 65)) | (1L << (UNSAFE - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOLATILE - 65)))) != 0)) {
				{
				setState(1436);
				all_member_modifiers();
				}
			}

			setState(1444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(1439);
				class_definition();
				}
				break;
			case STRUCT:
				{
				setState(1440);
				struct_definition();
				}
				break;
			case INTERFACE:
				{
				setState(1441);
				interface_definition();
				}
				break;
			case ENUM:
				{
				setState(1442);
				enum_definition();
				}
				break;
			case DELEGATE:
				{
				setState(1443);
				delegate_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_alias_memberContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(CSharpParser.DOUBLE_COLON, 0); }
		public Type_argument_listContext type_argument_list() {
			return getRuleContext(Type_argument_listContext.class,0);
		}
		public Qualified_alias_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_alias_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterQualified_alias_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitQualified_alias_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitQualified_alias_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_alias_memberContext qualified_alias_member() throws RecognitionException {
		Qualified_alias_memberContext _localctx = new Qualified_alias_memberContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_qualified_alias_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			identifier();
			setState(1447);
			match(DOUBLE_COLON);
			setState(1448);
			identifier();
			setState(1450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1449);
				type_argument_list();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameter_listContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CSharpParser.LT, 0); }
		public List<Type_parameterContext> type_parameter() {
			return getRuleContexts(Type_parameterContext.class);
		}
		public Type_parameterContext type_parameter(int i) {
			return getRuleContext(Type_parameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(CSharpParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Type_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitType_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_parameter_listContext type_parameter_list() throws RecognitionException {
		Type_parameter_listContext _localctx = new Type_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_type_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			match(LT);
			setState(1453);
			type_parameter();
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1454);
				match(COMMA);
				setState(1455);
				type_parameter();
				}
				}
				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1461);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitType_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_parameterContext type_parameter() throws RecognitionException {
		Type_parameterContext _localctx = new Type_parameterContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_type_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1463);
				attributes();
				}
			}

			setState(1466);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_baseContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public Class_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_base(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_base(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitClass_base(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_baseContext class_base() throws RecognitionException {
		Class_baseContext _localctx = new Class_baseContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_class_base);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1468);
			match(COLON);
			setState(1469);
			class_type();
			setState(1474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1470);
				match(COMMA);
				setState(1471);
				namespace_or_type_name();
				}
				}
				setState(1476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_type_listContext extends ParserRuleContext {
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Interface_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_type_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterface_type_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_type_listContext interface_type_list() throws RecognitionException {
		Interface_type_listContext _localctx = new Interface_type_listContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_interface_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			namespace_or_type_name();
			setState(1482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1478);
				match(COMMA);
				setState(1479);
				namespace_or_type_name();
				}
				}
				setState(1484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameter_constraints_clausesContext extends ParserRuleContext {
		public List<Type_parameter_constraints_clauseContext> type_parameter_constraints_clause() {
			return getRuleContexts(Type_parameter_constraints_clauseContext.class);
		}
		public Type_parameter_constraints_clauseContext type_parameter_constraints_clause(int i) {
			return getRuleContext(Type_parameter_constraints_clauseContext.class,i);
		}
		public Type_parameter_constraints_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_constraints_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_parameter_constraints_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_parameter_constraints_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitType_parameter_constraints_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() throws RecognitionException {
		Type_parameter_constraints_clausesContext _localctx = new Type_parameter_constraints_clausesContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_type_parameter_constraints_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1485);
				type_parameter_constraints_clause();
				}
				}
				setState(1488); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHERE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameter_constraints_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(CSharpParser.WHERE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Type_parameter_constraintsContext type_parameter_constraints() {
			return getRuleContext(Type_parameter_constraintsContext.class,0);
		}
		public Type_parameter_constraints_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_constraints_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_parameter_constraints_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_parameter_constraints_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitType_parameter_constraints_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_parameter_constraints_clauseContext type_parameter_constraints_clause() throws RecognitionException {
		Type_parameter_constraints_clauseContext _localctx = new Type_parameter_constraints_clauseContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_type_parameter_constraints_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			match(WHERE);
			setState(1491);
			identifier();
			setState(1492);
			match(COLON);
			setState(1493);
			type_parameter_constraints();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_parameter_constraintsContext extends ParserRuleContext {
		public Constructor_constraintContext constructor_constraint() {
			return getRuleContext(Constructor_constraintContext.class,0);
		}
		public Primary_constraintContext primary_constraint() {
			return getRuleContext(Primary_constraintContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Secondary_constraintsContext secondary_constraints() {
			return getRuleContext(Secondary_constraintsContext.class,0);
		}
		public Type_parameter_constraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_parameter_constraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterType_parameter_constraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitType_parameter_constraints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitType_parameter_constraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_parameter_constraintsContext type_parameter_constraints() throws RecognitionException {
		Type_parameter_constraintsContext _localctx = new Type_parameter_constraintsContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_type_parameter_constraints);
		int _la;
		try {
			setState(1505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1495);
				constructor_constraint();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case CLASS:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case STRING:
			case STRUCT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1496);
				primary_constraint();
				setState(1499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1497);
					match(COMMA);
					setState(1498);
					secondary_constraints();
					}
					break;
				}
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1501);
					match(COMMA);
					setState(1502);
					constructor_constraint();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_constraintContext extends ParserRuleContext {
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(CSharpParser.CLASS, 0); }
		public TerminalNode STRUCT() { return getToken(CSharpParser.STRUCT, 0); }
		public Primary_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterPrimary_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitPrimary_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitPrimary_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_constraintContext primary_constraint() throws RecognitionException {
		Primary_constraintContext _localctx = new Primary_constraintContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_primary_constraint);
		try {
			setState(1510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case STRING:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1507);
				class_type();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1508);
				match(CLASS);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1509);
				match(STRUCT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Secondary_constraintsContext extends ParserRuleContext {
		public List<Namespace_or_type_nameContext> namespace_or_type_name() {
			return getRuleContexts(Namespace_or_type_nameContext.class);
		}
		public Namespace_or_type_nameContext namespace_or_type_name(int i) {
			return getRuleContext(Namespace_or_type_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Secondary_constraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondary_constraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSecondary_constraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSecondary_constraints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSecondary_constraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Secondary_constraintsContext secondary_constraints() throws RecognitionException {
		Secondary_constraintsContext _localctx = new Secondary_constraintsContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_secondary_constraints);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			namespace_or_type_name();
			setState(1517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1513);
					match(COMMA);
					setState(1514);
					namespace_or_type_name();
					}
					} 
				}
				setState(1519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_constraintContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Constructor_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConstructor_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConstructor_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConstructor_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_constraintContext constructor_constraint() throws RecognitionException {
		Constructor_constraintContext _localctx = new Constructor_constraintContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_constructor_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520);
			match(NEW);
			setState(1521);
			match(OPEN_PARENS);
			setState(1522);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Class_member_declarationsContext class_member_declarations() {
			return getRuleContext(Class_member_declarationsContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			match(OPEN_BRACE);
			setState(1526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << DECIMAL) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << ENUM) | (1L << EQUALS) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IMPLICIT) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SEALED - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (STRUCT - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNSAFE - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOID - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (OPEN_BRACKET - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || _la==TILDE) {
				{
				setState(1525);
				class_member_declarations();
				}
			}

			setState(1528);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_member_declarationsContext extends ParserRuleContext {
		public List<Class_member_declarationContext> class_member_declaration() {
			return getRuleContexts(Class_member_declarationContext.class);
		}
		public Class_member_declarationContext class_member_declaration(int i) {
			return getRuleContext(Class_member_declarationContext.class,i);
		}
		public Class_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_member_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_member_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitClass_member_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_member_declarationsContext class_member_declarations() throws RecognitionException {
		Class_member_declarationsContext _localctx = new Class_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_class_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1530);
				class_member_declaration();
				}
				}
				setState(1533); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << DECIMAL) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << ENUM) | (1L << EQUALS) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IMPLICIT) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SEALED - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (STRUCT - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNSAFE - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOID - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (OPEN_BRACKET - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || _la==TILDE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_member_declarationContext extends ParserRuleContext {
		public Common_member_declarationContext common_member_declaration() {
			return getRuleContext(Common_member_declarationContext.class,0);
		}
		public Destructor_definitionContext destructor_definition() {
			return getRuleContext(Destructor_definitionContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public Class_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitClass_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_member_declarationContext class_member_declaration() throws RecognitionException {
		Class_member_declarationContext _localctx = new Class_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_class_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1535);
				attributes();
				}
			}

			setState(1539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1538);
				all_member_modifiers();
				}
				break;
			}
			setState(1543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CLASS:
			case CONST:
			case DECIMAL:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case ENUM:
			case EQUALS:
			case EVENT:
			case EXPLICIT:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case IMPLICIT:
			case INT:
			case INTERFACE:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case STRUCT:
			case UINT:
			case ULONG:
			case USHORT:
			case VAR:
			case VOID:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case OPEN_PARENS:
				{
				setState(1541);
				common_member_declaration();
				}
				break;
			case TILDE:
				{
				setState(1542);
				destructor_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_member_modifiersContext extends ParserRuleContext {
		public List<All_member_modifierContext> all_member_modifier() {
			return getRuleContexts(All_member_modifierContext.class);
		}
		public All_member_modifierContext all_member_modifier(int i) {
			return getRuleContext(All_member_modifierContext.class,i);
		}
		public All_member_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_member_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAll_member_modifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAll_member_modifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAll_member_modifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_member_modifiersContext all_member_modifiers() throws RecognitionException {
		All_member_modifiersContext _localctx = new All_member_modifiersContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_all_member_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1546); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1545);
					all_member_modifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1548); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class All_member_modifierContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode PUBLIC() { return getToken(CSharpParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(CSharpParser.PROTECTED, 0); }
		public TerminalNode INTERNAL() { return getToken(CSharpParser.INTERNAL, 0); }
		public TerminalNode PRIVATE() { return getToken(CSharpParser.PRIVATE, 0); }
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public TerminalNode VOLATILE() { return getToken(CSharpParser.VOLATILE, 0); }
		public TerminalNode VIRTUAL() { return getToken(CSharpParser.VIRTUAL, 0); }
		public TerminalNode SEALED() { return getToken(CSharpParser.SEALED, 0); }
		public TerminalNode OVERRIDE() { return getToken(CSharpParser.OVERRIDE, 0); }
		public TerminalNode ABSTRACT() { return getToken(CSharpParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public TerminalNode EXTERN() { return getToken(CSharpParser.EXTERN, 0); }
		public TerminalNode PARTIAL() { return getToken(CSharpParser.PARTIAL, 0); }
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public All_member_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_member_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAll_member_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAll_member_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAll_member_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_member_modifierContext all_member_modifier() throws RecognitionException {
		All_member_modifierContext _localctx = new All_member_modifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_all_member_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASYNC) | (1L << EXTERN) | (1L << INTERNAL))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (SEALED - 65)) | (1L << (STATIC - 65)) | (1L << (UNSAFE - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOLATILE - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_member_declarationContext extends ParserRuleContext {
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Typed_member_declarationContext typed_member_declaration() {
			return getRuleContext(Typed_member_declarationContext.class,0);
		}
		public Event_declarationContext event_declaration() {
			return getRuleContext(Event_declarationContext.class,0);
		}
		public Conversion_operator_declaratorContext conversion_operator_declarator() {
			return getRuleContext(Conversion_operator_declaratorContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Constructor_declarationContext constructor_declaration() {
			return getRuleContext(Constructor_declarationContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Class_definitionContext class_definition() {
			return getRuleContext(Class_definitionContext.class,0);
		}
		public Struct_definitionContext struct_definition() {
			return getRuleContext(Struct_definitionContext.class,0);
		}
		public Interface_definitionContext interface_definition() {
			return getRuleContext(Interface_definitionContext.class,0);
		}
		public Enum_definitionContext enum_definition() {
			return getRuleContext(Enum_definitionContext.class,0);
		}
		public Delegate_definitionContext delegate_definition() {
			return getRuleContext(Delegate_definitionContext.class,0);
		}
		public Common_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterCommon_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitCommon_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitCommon_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_member_declarationContext common_member_declaration() throws RecognitionException {
		Common_member_declarationContext _localctx = new Common_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_common_member_declaration);
		try {
			setState(1571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1552);
				constant_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1553);
				typed_member_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1554);
				event_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1555);
				conversion_operator_declarator();
				setState(1561);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACE:
				case SEMICOLON:
					{
					setState(1556);
					body();
					}
					break;
				case ASSIGNMENT:
					{
					setState(1557);
					right_arrow();
					setState(1558);
					expression();
					setState(1559);
					match(SEMICOLON);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1563);
				constructor_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1564);
				match(VOID);
				setState(1565);
				method_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1566);
				class_definition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1567);
				struct_definition();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1568);
				interface_definition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1569);
				enum_definition();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1570);
				delegate_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typed_member_declarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CSharpParser.DOT, 0); }
		public Indexer_declarationContext indexer_declaration() {
			return getRuleContext(Indexer_declarationContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Property_declarationContext property_declaration() {
			return getRuleContext(Property_declarationContext.class,0);
		}
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
		}
		public Field_declarationContext field_declaration() {
			return getRuleContext(Field_declarationContext.class,0);
		}
		public Typed_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTyped_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTyped_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitTyped_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typed_member_declarationContext typed_member_declaration() throws RecognitionException {
		Typed_member_declarationContext _localctx = new Typed_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_typed_member_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			type_();
			setState(1583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1574);
				namespace_or_type_name();
				setState(1575);
				match(DOT);
				setState(1576);
				indexer_declaration();
				}
				break;
			case 2:
				{
				setState(1578);
				method_declaration();
				}
				break;
			case 3:
				{
				setState(1579);
				property_declaration();
				}
				break;
			case 4:
				{
				setState(1580);
				indexer_declaration();
				}
				break;
			case 5:
				{
				setState(1581);
				operator_declaration();
				}
				break;
			case 6:
				{
				setState(1582);
				field_declaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declaratorsContext extends ParserRuleContext {
		public List<Constant_declaratorContext> constant_declarator() {
			return getRuleContexts(Constant_declaratorContext.class);
		}
		public Constant_declaratorContext constant_declarator(int i) {
			return getRuleContext(Constant_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Constant_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConstant_declarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConstant_declarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConstant_declarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declaratorsContext constant_declarators() throws RecognitionException {
		Constant_declaratorsContext _localctx = new Constant_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_constant_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			constant_declarator();
			setState(1590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1586);
				match(COMMA);
				setState(1587);
				constant_declarator();
				}
				}
				setState(1592);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Constant_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConstant_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConstant_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConstant_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declaratorContext constant_declarator() throws RecognitionException {
		Constant_declaratorContext _localctx = new Constant_declaratorContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_constant_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1593);
			identifier();
			setState(1594);
			match(ASSIGNMENT);
			setState(1595);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declaratorsContext extends ParserRuleContext {
		public List<Variable_declaratorContext> variable_declarator() {
			return getRuleContexts(Variable_declaratorContext.class);
		}
		public Variable_declaratorContext variable_declarator(int i) {
			return getRuleContext(Variable_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Variable_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterVariable_declarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitVariable_declarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitVariable_declarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaratorsContext variable_declarators() throws RecognitionException {
		Variable_declaratorsContext _localctx = new Variable_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_variable_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597);
			variable_declarator();
			setState(1602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1598);
				match(COMMA);
				setState(1599);
				variable_declarator();
				}
				}
				setState(1604);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public Variable_initializerContext variable_initializer() {
			return getRuleContext(Variable_initializerContext.class,0);
		}
		public Variable_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterVariable_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitVariable_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitVariable_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaratorContext variable_declarator() throws RecognitionException {
		Variable_declaratorContext _localctx = new Variable_declaratorContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_variable_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			identifier();
			setState(1608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(1606);
				match(ASSIGNMENT);
				setState(1607);
				variable_initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_initializerContext array_initializer() {
			return getRuleContext(Array_initializerContext.class,0);
		}
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Variable_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterVariable_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitVariable_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitVariable_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_initializerContext variable_initializer() throws RecognitionException {
		Variable_initializerContext _localctx = new Variable_initializerContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_variable_initializer);
		int _la;
		try {
			setState(1621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1610);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1611);
				array_initializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1612);
				match(NEW);
				setState(1613);
				match(OPEN_PARENS);
				setState(1615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OUT - 65)) | (1L << (PARTIAL - 65)) | (1L << (REF - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VOID - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(1614);
					argument_list();
					}
				}

				setState(1617);
				match(CLOSE_PARENS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1618);
				match(NEW);
				setState(1619);
				match(OPEN_PARENS);
				setState(1620);
				match(CLOSE_PARENS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_typeContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_return_type);
		try {
			setState(1625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1623);
				type_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1624);
				match(VOID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_nameContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public Member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMember_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMember_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMember_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_nameContext member_name() throws RecognitionException {
		Member_nameContext _localctx = new Member_nameContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_member_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			namespace_or_type_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Method_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMethod_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMethod_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMethod_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_bodyContext method_body() throws RecognitionException {
		Method_bodyContext _localctx = new Method_bodyContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_method_body);
		try {
			setState(1631);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1629);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1630);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Formal_parameter_listContext extends ParserRuleContext {
		public Parameter_arrayContext parameter_array() {
			return getRuleContext(Parameter_arrayContext.class,0);
		}
		public Fixed_parametersContext fixed_parameters() {
			return getRuleContext(Fixed_parametersContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CSharpParser.COMMA, 0); }
		public Formal_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFormal_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFormal_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFormal_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_parameter_listContext formal_parameter_list() throws RecognitionException {
		Formal_parameter_listContext _localctx = new Formal_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_formal_parameter_list);
		int _la;
		try {
			setState(1639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1633);
				parameter_array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1634);
				fixed_parameters();
				setState(1637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1635);
					match(COMMA);
					setState(1636);
					parameter_array();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_parametersContext extends ParserRuleContext {
		public List<Fixed_parameterContext> fixed_parameter() {
			return getRuleContexts(Fixed_parameterContext.class);
		}
		public Fixed_parameterContext fixed_parameter(int i) {
			return getRuleContext(Fixed_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Fixed_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixed_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixed_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFixed_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed_parametersContext fixed_parameters() throws RecognitionException {
		Fixed_parametersContext _localctx = new Fixed_parametersContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_fixed_parameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			fixed_parameter();
			setState(1646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1642);
					match(COMMA);
					setState(1643);
					fixed_parameter();
					}
					} 
				}
				setState(1648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_parameterContext extends ParserRuleContext {
		public Arg_declarationContext arg_declaration() {
			return getRuleContext(Arg_declarationContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Parameter_modifierContext parameter_modifier() {
			return getRuleContext(Parameter_modifierContext.class,0);
		}
		public TerminalNode ARGLIST() { return getToken(CSharpParser.ARGLIST, 0); }
		public Fixed_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixed_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixed_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFixed_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed_parameterContext fixed_parameter() throws RecognitionException {
		Fixed_parameterContext _localctx = new Fixed_parameterContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_fixed_parameter);
		int _la;
		try {
			setState(1657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(1649);
					attributes();
					}
				}

				setState(1653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (IN - 53)) | (1L << (OUT - 53)) | (1L << (REF - 53)) | (1L << (THIS - 53)))) != 0)) {
					{
					setState(1652);
					parameter_modifier();
					}
				}

				setState(1655);
				arg_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1656);
				match(ARGLIST);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_modifierContext extends ParserRuleContext {
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public Parameter_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterParameter_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitParameter_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitParameter_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_modifierContext parameter_modifier() throws RecognitionException {
		Parameter_modifierContext _localctx = new Parameter_modifierContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_parameter_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (IN - 53)) | (1L << (OUT - 53)) | (1L << (REF - 53)) | (1L << (THIS - 53)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_arrayContext extends ParserRuleContext {
		public TerminalNode PARAMS() { return getToken(CSharpParser.PARAMS, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Parameter_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterParameter_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitParameter_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitParameter_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_arrayContext parameter_array() throws RecognitionException {
		Parameter_arrayContext _localctx = new Parameter_arrayContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_parameter_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1661);
				attributes();
				}
			}

			setState(1664);
			match(PARAMS);
			setState(1665);
			array_type();
			setState(1666);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Accessor_declarationsContext extends ParserRuleContext {
		public AttributesContext attrs;
		public Accessor_modifierContext mods;
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public Accessor_bodyContext accessor_body() {
			return getRuleContext(Accessor_bodyContext.class,0);
		}
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Accessor_modifierContext accessor_modifier() {
			return getRuleContext(Accessor_modifierContext.class,0);
		}
		public Set_accessor_declarationContext set_accessor_declaration() {
			return getRuleContext(Set_accessor_declarationContext.class,0);
		}
		public Get_accessor_declarationContext get_accessor_declaration() {
			return getRuleContext(Get_accessor_declarationContext.class,0);
		}
		public Accessor_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAccessor_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAccessor_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAccessor_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Accessor_declarationsContext accessor_declarations() throws RecognitionException {
		Accessor_declarationsContext _localctx = new Accessor_declarationsContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_accessor_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1668);
				((Accessor_declarationsContext)_localctx).attrs = attributes();
				}
			}

			setState(1672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (INTERNAL - 56)) | (1L << (PRIVATE - 56)) | (1L << (PROTECTED - 56)))) != 0)) {
				{
				setState(1671);
				((Accessor_declarationsContext)_localctx).mods = accessor_modifier();
				}
			}

			setState(1684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(1674);
				match(GET);
				setState(1675);
				accessor_body();
				setState(1677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTERNAL || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (PRIVATE - 75)) | (1L << (PROTECTED - 75)) | (1L << (SET - 75)) | (1L << (OPEN_BRACKET - 75)))) != 0)) {
					{
					setState(1676);
					set_accessor_declaration();
					}
				}

				}
				break;
			case SET:
				{
				setState(1679);
				match(SET);
				setState(1680);
				accessor_body();
				setState(1682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GET || _la==INTERNAL || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (PRIVATE - 75)) | (1L << (PROTECTED - 75)) | (1L << (OPEN_BRACKET - 75)))) != 0)) {
					{
					setState(1681);
					get_accessor_declaration();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public Accessor_bodyContext accessor_body() {
			return getRuleContext(Accessor_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Accessor_modifierContext accessor_modifier() {
			return getRuleContext(Accessor_modifierContext.class,0);
		}
		public Get_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_accessor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterGet_accessor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitGet_accessor_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitGet_accessor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_accessor_declarationContext get_accessor_declaration() throws RecognitionException {
		Get_accessor_declarationContext _localctx = new Get_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_get_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1686);
				attributes();
				}
			}

			setState(1690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (INTERNAL - 56)) | (1L << (PRIVATE - 56)) | (1L << (PROTECTED - 56)))) != 0)) {
				{
				setState(1689);
				accessor_modifier();
				}
			}

			setState(1692);
			match(GET);
			setState(1693);
			accessor_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public Accessor_bodyContext accessor_body() {
			return getRuleContext(Accessor_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Accessor_modifierContext accessor_modifier() {
			return getRuleContext(Accessor_modifierContext.class,0);
		}
		public Set_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_accessor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterSet_accessor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitSet_accessor_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitSet_accessor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_accessor_declarationContext set_accessor_declaration() throws RecognitionException {
		Set_accessor_declarationContext _localctx = new Set_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_set_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1695);
				attributes();
				}
			}

			setState(1699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (INTERNAL - 56)) | (1L << (PRIVATE - 56)) | (1L << (PROTECTED - 56)))) != 0)) {
				{
				setState(1698);
				accessor_modifier();
				}
			}

			setState(1701);
			match(SET);
			setState(1702);
			accessor_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Accessor_modifierContext extends ParserRuleContext {
		public TerminalNode PROTECTED() { return getToken(CSharpParser.PROTECTED, 0); }
		public TerminalNode INTERNAL() { return getToken(CSharpParser.INTERNAL, 0); }
		public TerminalNode PRIVATE() { return getToken(CSharpParser.PRIVATE, 0); }
		public Accessor_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAccessor_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAccessor_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAccessor_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Accessor_modifierContext accessor_modifier() throws RecognitionException {
		Accessor_modifierContext _localctx = new Accessor_modifierContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_accessor_modifier);
		try {
			setState(1711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1704);
				match(PROTECTED);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1705);
				match(INTERNAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1706);
				match(PRIVATE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1707);
				match(PROTECTED);
				setState(1708);
				match(INTERNAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1709);
				match(INTERNAL);
				setState(1710);
				match(PROTECTED);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Accessor_bodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Accessor_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessor_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAccessor_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAccessor_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAccessor_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Accessor_bodyContext accessor_body() throws RecognitionException {
		Accessor_bodyContext _localctx = new Accessor_bodyContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_accessor_body);
		try {
			setState(1715);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1713);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1714);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_accessor_declarationsContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CSharpParser.ADD, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Remove_accessor_declarationContext remove_accessor_declaration() {
			return getRuleContext(Remove_accessor_declarationContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(CSharpParser.REMOVE, 0); }
		public Add_accessor_declarationContext add_accessor_declaration() {
			return getRuleContext(Add_accessor_declarationContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Event_accessor_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_accessor_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEvent_accessor_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEvent_accessor_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitEvent_accessor_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_accessor_declarationsContext event_accessor_declarations() throws RecognitionException {
		Event_accessor_declarationsContext _localctx = new Event_accessor_declarationsContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_event_accessor_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1717);
				attributes();
				}
			}

			setState(1728);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				{
				setState(1720);
				match(ADD);
				setState(1721);
				block();
				setState(1722);
				remove_accessor_declaration();
				}
				break;
			case REMOVE:
				{
				setState(1724);
				match(REMOVE);
				setState(1725);
				block();
				setState(1726);
				add_accessor_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CSharpParser.ADD, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Add_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_accessor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAdd_accessor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAdd_accessor_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAdd_accessor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_accessor_declarationContext add_accessor_declaration() throws RecognitionException {
		Add_accessor_declarationContext _localctx = new Add_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_add_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1730);
				attributes();
				}
			}

			setState(1733);
			match(ADD);
			setState(1734);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Remove_accessor_declarationContext extends ParserRuleContext {
		public TerminalNode REMOVE() { return getToken(CSharpParser.REMOVE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Remove_accessor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove_accessor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRemove_accessor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRemove_accessor_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitRemove_accessor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Remove_accessor_declarationContext remove_accessor_declaration() throws RecognitionException {
		Remove_accessor_declarationContext _localctx = new Remove_accessor_declarationContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_remove_accessor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1736);
				attributes();
				}
			}

			setState(1739);
			match(REMOVE);
			setState(1740);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Overloadable_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CSharpParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CSharpParser.MINUS, 0); }
		public TerminalNode BANG() { return getToken(CSharpParser.BANG, 0); }
		public TerminalNode TILDE() { return getToken(CSharpParser.TILDE, 0); }
		public TerminalNode OP_INC() { return getToken(CSharpParser.OP_INC, 0); }
		public TerminalNode OP_DEC() { return getToken(CSharpParser.OP_DEC, 0); }
		public TerminalNode TRUE() { return getToken(CSharpParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CSharpParser.FALSE, 0); }
		public TerminalNode STAR() { return getToken(CSharpParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(CSharpParser.DIV, 0); }
		public TerminalNode PERCENT() { return getToken(CSharpParser.PERCENT, 0); }
		public TerminalNode AMP() { return getToken(CSharpParser.AMP, 0); }
		public TerminalNode BITWISE_OR() { return getToken(CSharpParser.BITWISE_OR, 0); }
		public TerminalNode CARET() { return getToken(CSharpParser.CARET, 0); }
		public TerminalNode OP_LEFT_SHIFT() { return getToken(CSharpParser.OP_LEFT_SHIFT, 0); }
		public Right_shiftContext right_shift() {
			return getRuleContext(Right_shiftContext.class,0);
		}
		public TerminalNode OP_EQ() { return getToken(CSharpParser.OP_EQ, 0); }
		public TerminalNode OP_NE() { return getToken(CSharpParser.OP_NE, 0); }
		public TerminalNode GT() { return getToken(CSharpParser.GT, 0); }
		public TerminalNode LT() { return getToken(CSharpParser.LT, 0); }
		public TerminalNode OP_GE() { return getToken(CSharpParser.OP_GE, 0); }
		public TerminalNode OP_LE() { return getToken(CSharpParser.OP_LE, 0); }
		public Overloadable_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overloadable_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterOverloadable_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitOverloadable_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitOverloadable_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Overloadable_operatorContext overloadable_operator() throws RecognitionException {
		Overloadable_operatorContext _localctx = new Overloadable_operatorContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_overloadable_operator);
		try {
			setState(1764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1742);
				match(PLUS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1743);
				match(MINUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1744);
				match(BANG);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1745);
				match(TILDE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1746);
				match(OP_INC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1747);
				match(OP_DEC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1748);
				match(TRUE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1749);
				match(FALSE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1750);
				match(STAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1751);
				match(DIV);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1752);
				match(PERCENT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1753);
				match(AMP);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1754);
				match(BITWISE_OR);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1755);
				match(CARET);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1756);
				match(OP_LEFT_SHIFT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1757);
				right_shift();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1758);
				match(OP_EQ);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1759);
				match(OP_NE);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1760);
				match(GT);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1761);
				match(LT);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1762);
				match(OP_GE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1763);
				match(OP_LE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conversion_operator_declaratorContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(CSharpParser.OPERATOR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Arg_declarationContext arg_declaration() {
			return getRuleContext(Arg_declarationContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode IMPLICIT() { return getToken(CSharpParser.IMPLICIT, 0); }
		public TerminalNode EXPLICIT() { return getToken(CSharpParser.EXPLICIT, 0); }
		public Conversion_operator_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion_operator_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConversion_operator_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConversion_operator_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConversion_operator_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conversion_operator_declaratorContext conversion_operator_declarator() throws RecognitionException {
		Conversion_operator_declaratorContext _localctx = new Conversion_operator_declaratorContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_conversion_operator_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			_la = _input.LA(1);
			if ( !(_la==EXPLICIT || _la==IMPLICIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1767);
			match(OPERATOR);
			setState(1768);
			type_();
			setState(1769);
			match(OPEN_PARENS);
			setState(1770);
			arg_declaration();
			setState(1771);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_initializerContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode BASE() { return getToken(CSharpParser.BASE, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Constructor_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConstructor_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConstructor_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConstructor_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_initializerContext constructor_initializer() throws RecognitionException {
		Constructor_initializerContext _localctx = new Constructor_initializerContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_constructor_initializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
			match(COLON);
			setState(1774);
			_la = _input.LA(1);
			if ( !(_la==BASE || _la==THIS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1775);
			match(OPEN_PARENS);
			setState(1777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OUT - 65)) | (1L << (PARTIAL - 65)) | (1L << (REF - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VOID - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
				{
				setState(1776);
				argument_list();
				}
			}

			setState(1779);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_body);
		try {
			setState(1783);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1781);
				block();
				}
				break;
			case SEMICOLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1782);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_interfacesContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Interface_type_listContext interface_type_list() {
			return getRuleContext(Interface_type_listContext.class,0);
		}
		public Struct_interfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_interfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterStruct_interfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitStruct_interfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitStruct_interfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_interfacesContext struct_interfaces() throws RecognitionException {
		Struct_interfacesContext _localctx = new Struct_interfacesContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_struct_interfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
			match(COLON);
			setState(1786);
			interface_type_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Struct_member_declarationContext> struct_member_declaration() {
			return getRuleContexts(Struct_member_declarationContext.class);
		}
		public Struct_member_declarationContext struct_member_declaration(int i) {
			return getRuleContext(Struct_member_declarationContext.class,i);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterStruct_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitStruct_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitStruct_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			match(OPEN_BRACE);
			setState(1792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONST) | (1L << DECIMAL) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << ENUM) | (1L << EQUALS) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FIXED) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IMPLICIT) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OVERRIDE - 65)) | (1L << (PARTIAL - 65)) | (1L << (PRIVATE - 65)) | (1L << (PROTECTED - 65)) | (1L << (PUBLIC - 65)) | (1L << (READONLY - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SEALED - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (STRUCT - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNSAFE - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VIRTUAL - 65)) | (1L << (VOID - 65)) | (1L << (VOLATILE - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (OPEN_BRACKET - 65)) | (1L << (OPEN_PARENS - 65)))) != 0)) {
				{
				{
				setState(1789);
				struct_member_declaration();
				}
				}
				setState(1794);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1795);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_member_declarationContext extends ParserRuleContext {
		public Common_member_declarationContext common_member_declaration() {
			return getRuleContext(Common_member_declarationContext.class,0);
		}
		public TerminalNode FIXED() { return getToken(CSharpParser.FIXED, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public All_member_modifiersContext all_member_modifiers() {
			return getRuleContext(All_member_modifiersContext.class,0);
		}
		public List<Fixed_size_buffer_declaratorContext> fixed_size_buffer_declarator() {
			return getRuleContexts(Fixed_size_buffer_declaratorContext.class);
		}
		public Fixed_size_buffer_declaratorContext fixed_size_buffer_declarator(int i) {
			return getRuleContext(Fixed_size_buffer_declaratorContext.class,i);
		}
		public Struct_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterStruct_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitStruct_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitStruct_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_member_declarationContext struct_member_declaration() throws RecognitionException {
		Struct_member_declarationContext _localctx = new Struct_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_struct_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1797);
				attributes();
				}
			}

			setState(1801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1800);
				all_member_modifiers();
				}
				break;
			}
			setState(1813);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CLASS:
			case CONST:
			case DECIMAL:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case ENUM:
			case EQUALS:
			case EVENT:
			case EXPLICIT:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case IMPLICIT:
			case INT:
			case INTERFACE:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case STRUCT:
			case UINT:
			case ULONG:
			case USHORT:
			case VAR:
			case VOID:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case OPEN_PARENS:
				{
				setState(1803);
				common_member_declaration();
				}
				break;
			case FIXED:
				{
				setState(1804);
				match(FIXED);
				setState(1805);
				type_();
				setState(1807); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1806);
					fixed_size_buffer_declarator();
					}
					}
					setState(1809); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << NAMEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ON - 68)) | (1L << (ORDERBY - 68)) | (1L << (PARTIAL - 68)) | (1L << (REMOVE - 68)) | (1L << (SELECT - 68)) | (1L << (SET - 68)) | (1L << (VAR - 68)) | (1L << (WHEN - 68)) | (1L << (WHERE - 68)) | (1L << (YIELD - 68)) | (1L << (IDENTIFIER - 68)))) != 0) );
				setState(1811);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_typeContext extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(CSharpParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(CSharpParser.STAR, i);
		}
		public List<TerminalNode> INTERR() { return getTokens(CSharpParser.INTERR); }
		public TerminalNode INTERR(int i) {
			return getToken(CSharpParser.INTERR, i);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_array_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1815);
			base_type();
			setState(1823); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STAR || _la==INTERR) {
					{
					{
					setState(1816);
					_la = _input.LA(1);
					if ( !(_la==STAR || _la==INTERR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(1821);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1822);
				rank_specifier();
				}
				}
				setState(1825); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (OPEN_BRACKET - 124)) | (1L << (STAR - 124)) | (1L << (INTERR - 124)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rank_specifierContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Rank_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rank_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRank_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRank_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitRank_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rank_specifierContext rank_specifier() throws RecognitionException {
		Rank_specifierContext _localctx = new Rank_specifierContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_rank_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1827);
			match(OPEN_BRACKET);
			setState(1831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1828);
				match(COMMA);
				}
				}
				setState(1833);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1834);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_initializerContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Variable_initializerContext> variable_initializer() {
			return getRuleContexts(Variable_initializerContext.class);
		}
		public Variable_initializerContext variable_initializer(int i) {
			return getRuleContext(Variable_initializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Array_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterArray_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitArray_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitArray_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_initializerContext array_initializer() throws RecognitionException {
		Array_initializerContext _localctx = new Array_initializerContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_array_initializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			match(OPEN_BRACE);
			setState(1848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_BRACE - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
				{
				setState(1837);
				variable_initializer();
				setState(1842);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1838);
						match(COMMA);
						setState(1839);
						variable_initializer();
						}
						} 
					}
					setState(1844);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
				}
				setState(1846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1845);
					match(COMMA);
					}
				}

				}
			}

			setState(1850);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variant_type_parameter_listContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CSharpParser.LT, 0); }
		public List<Variant_type_parameterContext> variant_type_parameter() {
			return getRuleContexts(Variant_type_parameterContext.class);
		}
		public Variant_type_parameterContext variant_type_parameter(int i) {
			return getRuleContext(Variant_type_parameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(CSharpParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Variant_type_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant_type_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterVariant_type_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitVariant_type_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitVariant_type_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variant_type_parameter_listContext variant_type_parameter_list() throws RecognitionException {
		Variant_type_parameter_listContext _localctx = new Variant_type_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_variant_type_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			match(LT);
			setState(1853);
			variant_type_parameter();
			setState(1858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1854);
				match(COMMA);
				setState(1855);
				variant_type_parameter();
				}
				}
				setState(1860);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1861);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variant_type_parameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Variance_annotationContext variance_annotation() {
			return getRuleContext(Variance_annotationContext.class,0);
		}
		public Variant_type_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant_type_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterVariant_type_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitVariant_type_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitVariant_type_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variant_type_parameterContext variant_type_parameter() throws RecognitionException {
		Variant_type_parameterContext _localctx = new Variant_type_parameterContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_variant_type_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1863);
				attributes();
				}
			}

			setState(1867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==OUT) {
				{
				setState(1866);
				variance_annotation();
				}
			}

			setState(1869);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variance_annotationContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public Variance_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variance_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterVariance_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitVariance_annotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitVariance_annotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variance_annotationContext variance_annotation() throws RecognitionException {
		Variance_annotationContext _localctx = new Variance_annotationContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_variance_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1871);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==OUT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_baseContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Interface_type_listContext interface_type_list() {
			return getRuleContext(Interface_type_listContext.class,0);
		}
		public Interface_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_base(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_base(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterface_base(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_baseContext interface_base() throws RecognitionException {
		Interface_baseContext _localctx = new Interface_baseContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_interface_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1873);
			match(COLON);
			setState(1874);
			interface_type_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Interface_member_declarationContext> interface_member_declaration() {
			return getRuleContexts(Interface_member_declarationContext.class);
		}
		public Interface_member_declarationContext interface_member_declaration(int i) {
			return getRuleContext(Interface_member_declarationContext.class,i);
		}
		public Interface_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterface_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_bodyContext interface_body() throws RecognitionException {
		Interface_bodyContext _localctx = new Interface_bodyContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_interface_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
			match(OPEN_BRACE);
			setState(1880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << EVENT) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (STRING - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNSAFE - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VOID - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (OPEN_BRACKET - 65)) | (1L << (OPEN_PARENS - 65)))) != 0)) {
				{
				{
				setState(1877);
				interface_member_declaration();
				}
				}
				setState(1882);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1883);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_member_declarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public TerminalNode EVENT() { return getToken(CSharpParser.EVENT, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Interface_accessorsContext interface_accessors() {
			return getRuleContext(Interface_accessorsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Interface_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterface_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_member_declarationContext interface_member_declaration() throws RecognitionException {
		Interface_member_declarationContext _localctx = new Interface_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_interface_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1885);
				attributes();
				}
			}

			setState(1889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW) {
				{
				setState(1888);
				match(NEW);
				}
			}

			setState(1952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSAFE) {
					{
					setState(1891);
					match(UNSAFE);
					}
				}

				setState(1894);
				type_();
				setState(1927);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1895);
					identifier();
					setState(1897);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1896);
						type_parameter_list();
						}
					}

					setState(1899);
					match(OPEN_PARENS);
					setState(1901);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IN) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARAMS - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (THIS - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (OPEN_BRACKET - 67)) | (1L << (OPEN_PARENS - 67)))) != 0)) {
						{
						setState(1900);
						formal_parameter_list();
						}
					}

					setState(1903);
					match(CLOSE_PARENS);
					setState(1905);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHERE) {
						{
						setState(1904);
						type_parameter_constraints_clauses();
						}
					}

					setState(1907);
					match(SEMICOLON);
					}
					break;
				case 2:
					{
					setState(1909);
					identifier();
					setState(1910);
					match(OPEN_BRACE);
					setState(1911);
					interface_accessors();
					setState(1912);
					match(CLOSE_BRACE);
					}
					break;
				case 3:
					{
					setState(1914);
					identifier();
					setState(1915);
					right_arrow();
					setState(1916);
					expression();
					setState(1917);
					match(SEMICOLON);
					}
					break;
				case 4:
					{
					setState(1919);
					match(THIS);
					setState(1920);
					match(OPEN_BRACKET);
					setState(1921);
					formal_parameter_list();
					setState(1922);
					match(CLOSE_BRACKET);
					setState(1923);
					match(OPEN_BRACE);
					setState(1924);
					interface_accessors();
					setState(1925);
					match(CLOSE_BRACE);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSAFE) {
					{
					setState(1929);
					match(UNSAFE);
					}
				}

				setState(1932);
				match(VOID);
				setState(1933);
				identifier();
				setState(1935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1934);
					type_parameter_list();
					}
				}

				setState(1937);
				match(OPEN_PARENS);
				setState(1939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IN) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARAMS - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (THIS - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (OPEN_BRACKET - 67)) | (1L << (OPEN_PARENS - 67)))) != 0)) {
					{
					setState(1938);
					formal_parameter_list();
					}
				}

				setState(1941);
				match(CLOSE_PARENS);
				setState(1943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1942);
					type_parameter_constraints_clauses();
					}
				}

				setState(1945);
				match(SEMICOLON);
				}
				break;
			case 3:
				{
				setState(1947);
				match(EVENT);
				setState(1948);
				type_();
				setState(1949);
				identifier();
				setState(1950);
				match(SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_accessorsContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(CSharpParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CSharpParser.SEMICOLON, i);
		}
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public Interface_accessorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_accessors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_accessors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_accessors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterface_accessors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_accessorsContext interface_accessors() throws RecognitionException {
		Interface_accessorsContext _localctx = new Interface_accessorsContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_interface_accessors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1954);
				attributes();
				}
			}

			setState(1975);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
				{
				setState(1957);
				match(GET);
				setState(1958);
				match(SEMICOLON);
				setState(1964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET || _la==OPEN_BRACKET) {
					{
					setState(1960);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_BRACKET) {
						{
						setState(1959);
						attributes();
						}
					}

					setState(1962);
					match(SET);
					setState(1963);
					match(SEMICOLON);
					}
				}

				}
				break;
			case SET:
				{
				setState(1966);
				match(SET);
				setState(1967);
				match(SEMICOLON);
				setState(1973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GET || _la==OPEN_BRACKET) {
					{
					setState(1969);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_BRACKET) {
						{
						setState(1968);
						attributes();
						}
					}

					setState(1971);
					match(GET);
					setState(1972);
					match(SEMICOLON);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_baseContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Enum_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEnum_base(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEnum_base(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitEnum_base(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_baseContext enum_base() throws RecognitionException {
		Enum_baseContext _localctx = new Enum_baseContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_enum_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1977);
			match(COLON);
			setState(1978);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public List<Enum_member_declarationContext> enum_member_declaration() {
			return getRuleContexts(Enum_member_declarationContext.class);
		}
		public Enum_member_declarationContext enum_member_declaration(int i) {
			return getRuleContext(Enum_member_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Enum_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEnum_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEnum_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitEnum_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_bodyContext enum_body() throws RecognitionException {
		Enum_bodyContext _localctx = new Enum_bodyContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_enum_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1980);
			match(OPEN_BRACE);
			setState(1992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << NAMEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ON - 68)) | (1L << (ORDERBY - 68)) | (1L << (PARTIAL - 68)) | (1L << (REMOVE - 68)) | (1L << (SELECT - 68)) | (1L << (SET - 68)) | (1L << (VAR - 68)) | (1L << (WHEN - 68)) | (1L << (WHERE - 68)) | (1L << (YIELD - 68)) | (1L << (IDENTIFIER - 68)) | (1L << (OPEN_BRACKET - 68)))) != 0)) {
				{
				setState(1981);
				enum_member_declaration();
				setState(1986);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1982);
						match(COMMA);
						setState(1983);
						enum_member_declaration();
						}
						} 
					}
					setState(1988);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,234,_ctx);
				}
				setState(1990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1989);
					match(COMMA);
					}
				}

				}
			}

			setState(1994);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_member_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Enum_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEnum_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEnum_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitEnum_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_member_declarationContext enum_member_declaration() throws RecognitionException {
		Enum_member_declarationContext _localctx = new Enum_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_enum_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACKET) {
				{
				setState(1996);
				attributes();
				}
			}

			setState(1999);
			identifier();
			setState(2002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(2000);
				match(ASSIGNMENT);
				setState(2001);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_attribute_sectionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public Global_attribute_targetContext global_attribute_target() {
			return getRuleContext(Global_attribute_targetContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(CSharpParser.COMMA, 0); }
		public Global_attribute_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_attribute_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterGlobal_attribute_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitGlobal_attribute_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitGlobal_attribute_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_attribute_sectionContext global_attribute_section() throws RecognitionException {
		Global_attribute_sectionContext _localctx = new Global_attribute_sectionContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_global_attribute_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2004);
			match(OPEN_BRACKET);
			setState(2005);
			global_attribute_target();
			setState(2006);
			match(COLON);
			setState(2007);
			attribute_list();
			setState(2009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2008);
				match(COMMA);
				}
			}

			setState(2011);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Global_attribute_targetContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Global_attribute_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_attribute_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterGlobal_attribute_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitGlobal_attribute_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitGlobal_attribute_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_attribute_targetContext global_attribute_target() throws RecognitionException {
		Global_attribute_targetContext _localctx = new Global_attribute_targetContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_global_attribute_target);
		try {
			setState(2015);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case AS:
			case BASE:
			case BOOL:
			case BREAK:
			case BYTE:
			case CASE:
			case CATCH:
			case CHAR:
			case CHECKED:
			case CLASS:
			case CONST:
			case CONTINUE:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DO:
			case DOUBLE:
			case ELSE:
			case ENUM:
			case EVENT:
			case EXPLICIT:
			case EXTERN:
			case FALSE:
			case FINALLY:
			case FIXED:
			case FLOAT:
			case FOR:
			case FOREACH:
			case GOTO:
			case IF:
			case IMPLICIT:
			case IN:
			case INT:
			case INTERFACE:
			case INTERNAL:
			case IS:
			case LOCK:
			case LONG:
			case NAMESPACE:
			case NEW:
			case NULL:
			case OBJECT:
			case OPERATOR:
			case OUT:
			case OVERRIDE:
			case PARAMS:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case READONLY:
			case REF:
			case RETURN:
			case SBYTE:
			case SEALED:
			case SHORT:
			case SIZEOF:
			case STACKALLOC:
			case STATIC:
			case STRING:
			case STRUCT:
			case SWITCH:
			case THIS:
			case THROW:
			case TRUE:
			case TRY:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNSAFE:
			case USHORT:
			case USING:
			case VIRTUAL:
			case VOID:
			case VOLATILE:
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2013);
				keyword();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2014);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<Attribute_sectionContext> attribute_section() {
			return getRuleContexts(Attribute_sectionContext.class);
		}
		public Attribute_sectionContext attribute_section(int i) {
			return getRuleContext(Attribute_sectionContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2017);
				attribute_section();
				}
				}
				setState(2020); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_BRACKET );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_sectionContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public Attribute_targetContext attribute_target() {
			return getRuleContext(Attribute_targetContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(CSharpParser.COMMA, 0); }
		public Attribute_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAttribute_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAttribute_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAttribute_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_sectionContext attribute_section() throws RecognitionException {
		Attribute_sectionContext _localctx = new Attribute_sectionContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_attribute_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2022);
			match(OPEN_BRACKET);
			setState(2026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(2023);
				attribute_target();
				setState(2024);
				match(COLON);
				}
				break;
			}
			setState(2028);
			attribute_list();
			setState(2030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2029);
				match(COMMA);
				}
			}

			setState(2032);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_targetContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Attribute_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAttribute_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAttribute_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAttribute_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_targetContext attribute_target() throws RecognitionException {
		Attribute_targetContext _localctx = new Attribute_targetContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_attribute_target);
		try {
			setState(2036);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case AS:
			case BASE:
			case BOOL:
			case BREAK:
			case BYTE:
			case CASE:
			case CATCH:
			case CHAR:
			case CHECKED:
			case CLASS:
			case CONST:
			case CONTINUE:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DO:
			case DOUBLE:
			case ELSE:
			case ENUM:
			case EVENT:
			case EXPLICIT:
			case EXTERN:
			case FALSE:
			case FINALLY:
			case FIXED:
			case FLOAT:
			case FOR:
			case FOREACH:
			case GOTO:
			case IF:
			case IMPLICIT:
			case IN:
			case INT:
			case INTERFACE:
			case INTERNAL:
			case IS:
			case LOCK:
			case LONG:
			case NAMESPACE:
			case NEW:
			case NULL:
			case OBJECT:
			case OPERATOR:
			case OUT:
			case OVERRIDE:
			case PARAMS:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case READONLY:
			case REF:
			case RETURN:
			case SBYTE:
			case SEALED:
			case SHORT:
			case SIZEOF:
			case STACKALLOC:
			case STATIC:
			case STRING:
			case STRUCT:
			case SWITCH:
			case THIS:
			case THROW:
			case TRUE:
			case TRY:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case UNSAFE:
			case USHORT:
			case USING:
			case VIRTUAL:
			case VOID:
			case VOLATILE:
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2034);
				keyword();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2035);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_listContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAttribute_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAttribute_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAttribute_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_attribute_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2038);
			attribute();
			setState(2043);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2039);
					match(COMMA);
					setState(2040);
					attribute();
					}
					} 
				}
				setState(2045);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public Namespace_or_type_nameContext namespace_or_type_name() {
			return getRuleContext(Namespace_or_type_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public List<Attribute_argumentContext> attribute_argument() {
			return getRuleContexts(Attribute_argumentContext.class);
		}
		public Attribute_argumentContext attribute_argument(int i) {
			return getRuleContext(Attribute_argumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2046);
			namespace_or_type_name();
			setState(2059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PARENS) {
				{
				setState(2047);
				match(OPEN_PARENS);
				setState(2056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
					{
					setState(2048);
					attribute_argument();
					setState(2053);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2049);
						match(COMMA);
						setState(2050);
						attribute_argument();
						}
						}
						setState(2055);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2058);
				match(CLOSE_PARENS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_argumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Attribute_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterAttribute_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitAttribute_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitAttribute_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_argumentContext attribute_argument() throws RecognitionException {
		Attribute_argumentContext _localctx = new Attribute_argumentContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_attribute_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				setState(2061);
				identifier();
				setState(2062);
				match(COLON);
				}
				break;
			}
			setState(2066);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pointer_typeContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(CSharpParser.STAR, 0); }
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public List<Rank_specifierContext> rank_specifier() {
			return getRuleContexts(Rank_specifierContext.class);
		}
		public Rank_specifierContext rank_specifier(int i) {
			return getRuleContext(Rank_specifierContext.class,i);
		}
		public List<TerminalNode> INTERR() { return getTokens(CSharpParser.INTERR); }
		public TerminalNode INTERR(int i) {
			return getToken(CSharpParser.INTERR, i);
		}
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public Pointer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterPointer_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitPointer_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitPointer_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pointer_typeContext pointer_type() throws RecognitionException {
		Pointer_typeContext _localctx = new Pointer_typeContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_pointer_type);
		int _la;
		try {
			setState(2083);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case STRING:
			case UINT:
			case ULONG:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2070);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
				case BYTE:
				case CHAR:
				case DECIMAL:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SBYTE:
				case SHORT:
				case UINT:
				case ULONG:
				case USHORT:
					{
					setState(2068);
					simple_type();
					}
					break;
				case ADD:
				case ALIAS:
				case ARGLIST:
				case ASCENDING:
				case ASYNC:
				case AWAIT:
				case BY:
				case DESCENDING:
				case DYNAMIC:
				case EQUALS:
				case FROM:
				case GET:
				case GROUP:
				case INTO:
				case JOIN:
				case LET:
				case NAMEOF:
				case OBJECT:
				case ON:
				case ORDERBY:
				case PARTIAL:
				case REMOVE:
				case SELECT:
				case SET:
				case STRING:
				case VAR:
				case WHEN:
				case WHERE:
				case YIELD:
				case IDENTIFIER:
					{
					setState(2069);
					class_type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_BRACKET || _la==INTERR) {
					{
					setState(2074);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_BRACKET:
						{
						setState(2072);
						rank_specifier();
						}
						break;
					case INTERR:
						{
						setState(2073);
						match(INTERR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(2078);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2079);
				match(STAR);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(2081);
				match(VOID);
				setState(2082);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_pointer_declaratorsContext extends ParserRuleContext {
		public List<Fixed_pointer_declaratorContext> fixed_pointer_declarator() {
			return getRuleContexts(Fixed_pointer_declaratorContext.class);
		}
		public Fixed_pointer_declaratorContext fixed_pointer_declarator(int i) {
			return getRuleContext(Fixed_pointer_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public Fixed_pointer_declaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pointer_declarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixed_pointer_declarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixed_pointer_declarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFixed_pointer_declarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed_pointer_declaratorsContext fixed_pointer_declarators() throws RecognitionException {
		Fixed_pointer_declaratorsContext _localctx = new Fixed_pointer_declaratorsContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_fixed_pointer_declarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2085);
			fixed_pointer_declarator();
			setState(2090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2086);
				match(COMMA);
				setState(2087);
				fixed_pointer_declarator();
				}
				}
				setState(2092);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_pointer_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public Fixed_pointer_initializerContext fixed_pointer_initializer() {
			return getRuleContext(Fixed_pointer_initializerContext.class,0);
		}
		public Fixed_pointer_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pointer_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixed_pointer_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixed_pointer_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFixed_pointer_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed_pointer_declaratorContext fixed_pointer_declarator() throws RecognitionException {
		Fixed_pointer_declaratorContext _localctx = new Fixed_pointer_declaratorContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_fixed_pointer_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
			identifier();
			setState(2094);
			match(ASSIGNMENT);
			setState(2095);
			fixed_pointer_initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_pointer_initializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AMP() { return getToken(CSharpParser.AMP, 0); }
		public Local_variable_initializer_unsafeContext local_variable_initializer_unsafe() {
			return getRuleContext(Local_variable_initializer_unsafeContext.class,0);
		}
		public Fixed_pointer_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_pointer_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixed_pointer_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixed_pointer_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFixed_pointer_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed_pointer_initializerContext fixed_pointer_initializer() throws RecognitionException {
		Fixed_pointer_initializerContext _localctx = new Fixed_pointer_initializerContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_fixed_pointer_initializer);
		try {
			setState(2102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STATIC:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2098);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(2097);
					match(AMP);
					}
					break;
				}
				setState(2100);
				expression();
				}
				break;
			case STACKALLOC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2101);
				local_variable_initializer_unsafe();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fixed_size_buffer_declaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public Fixed_size_buffer_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_size_buffer_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterFixed_size_buffer_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitFixed_size_buffer_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitFixed_size_buffer_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed_size_buffer_declaratorContext fixed_size_buffer_declarator() throws RecognitionException {
		Fixed_size_buffer_declaratorContext _localctx = new Fixed_size_buffer_declaratorContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_fixed_size_buffer_declarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2104);
			identifier();
			setState(2105);
			match(OPEN_BRACKET);
			setState(2106);
			expression();
			setState(2107);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_variable_initializer_unsafeContext extends ParserRuleContext {
		public TerminalNode STACKALLOC() { return getToken(CSharpParser.STACKALLOC, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public Local_variable_initializer_unsafeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_variable_initializer_unsafe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLocal_variable_initializer_unsafe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLocal_variable_initializer_unsafe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLocal_variable_initializer_unsafe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_variable_initializer_unsafeContext local_variable_initializer_unsafe() throws RecognitionException {
		Local_variable_initializer_unsafeContext _localctx = new Local_variable_initializer_unsafeContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_local_variable_initializer_unsafe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2109);
			match(STACKALLOC);
			setState(2110);
			type_();
			setState(2111);
			match(OPEN_BRACKET);
			setState(2112);
			expression();
			setState(2113);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_arrowContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public TerminalNode GT() { return getToken(CSharpParser.GT, 0); }
		public Right_arrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_arrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRight_arrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRight_arrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitRight_arrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_arrowContext right_arrow() throws RecognitionException {
		Right_arrowContext _localctx = new Right_arrowContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_right_arrow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2115);
			((Right_arrowContext)_localctx).first = match(ASSIGNMENT);
			setState(2116);
			((Right_arrowContext)_localctx).second = match(GT);
			setState(2117);
			if (!((((Right_arrowContext)_localctx).first!=null?((Right_arrowContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_arrowContext)_localctx).second!=null?((Right_arrowContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_shiftContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public List<TerminalNode> GT() { return getTokens(CSharpParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CSharpParser.GT, i);
		}
		public Right_shiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_shift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRight_shift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRight_shift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitRight_shift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_shiftContext right_shift() throws RecognitionException {
		Right_shiftContext _localctx = new Right_shiftContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_right_shift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2119);
			((Right_shiftContext)_localctx).first = match(GT);
			setState(2120);
			((Right_shiftContext)_localctx).second = match(GT);
			setState(2121);
			if (!((((Right_shiftContext)_localctx).first!=null?((Right_shiftContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shiftContext)_localctx).second!=null?((Right_shiftContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Right_shift_assignmentContext extends ParserRuleContext {
		public Token first;
		public Token second;
		public TerminalNode GT() { return getToken(CSharpParser.GT, 0); }
		public TerminalNode OP_GE() { return getToken(CSharpParser.OP_GE, 0); }
		public Right_shift_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_shift_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterRight_shift_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitRight_shift_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitRight_shift_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_shift_assignmentContext right_shift_assignment() throws RecognitionException {
		Right_shift_assignmentContext _localctx = new Right_shift_assignmentContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_right_shift_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2123);
			((Right_shift_assignmentContext)_localctx).first = match(GT);
			setState(2124);
			((Right_shift_assignmentContext)_localctx).second = match(OP_GE);
			setState(2125);
			if (!((((Right_shift_assignmentContext)_localctx).first!=null?((Right_shift_assignmentContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shift_assignmentContext)_localctx).second!=null?((Right_shift_assignmentContext)_localctx).second.getTokenIndex():0))) throw new FailedPredicateException(this, "$first.index + 1 == $second.index");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_typeContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Tuple_type_element_listContext tuple_type_element_list() {
			return getRuleContext(Tuple_type_element_listContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTuple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTuple_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitTuple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_tuple_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2127);
			match(OPEN_PARENS);
			setState(2128);
			tuple_type_element_list(0);
			setState(2129);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_type_element_listContext extends ParserRuleContext {
		public List<Tuple_type_elementContext> tuple_type_element() {
			return getRuleContexts(Tuple_type_elementContext.class);
		}
		public Tuple_type_elementContext tuple_type_element(int i) {
			return getRuleContext(Tuple_type_elementContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(CSharpParser.COMMA, 0); }
		public Tuple_type_element_listContext tuple_type_element_list() {
			return getRuleContext(Tuple_type_element_listContext.class,0);
		}
		public Tuple_type_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTuple_type_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTuple_type_element_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitTuple_type_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_element_listContext tuple_type_element_list() throws RecognitionException {
		return tuple_type_element_list(0);
	}

	private Tuple_type_element_listContext tuple_type_element_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tuple_type_element_listContext _localctx = new Tuple_type_element_listContext(_ctx, _parentState);
		Tuple_type_element_listContext _prevctx = _localctx;
		int _startState = 350;
		enterRecursionRule(_localctx, 350, RULE_tuple_type_element_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2132);
			tuple_type_element();
			setState(2133);
			match(COMMA);
			setState(2134);
			tuple_type_element();
			}
			_ctx.stop = _input.LT(-1);
			setState(2141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Tuple_type_element_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tuple_type_element_list);
					setState(2136);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2137);
					match(COMMA);
					setState(2138);
					tuple_type_element();
					}
					} 
				}
				setState(2143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Tuple_type_elementContext extends ParserRuleContext {
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Class_typeContext class_type() {
			return getRuleContext(Class_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Tuple_type_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTuple_type_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTuple_type_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitTuple_type_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_elementContext tuple_type_element() throws RecognitionException {
		Tuple_type_elementContext _localctx = new Tuple_type_elementContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_tuple_type_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case BYTE:
			case CHAR:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SBYTE:
			case SHORT:
			case UINT:
			case ULONG:
			case USHORT:
				{
				setState(2144);
				simple_type();
				}
				break;
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BY:
			case DESCENDING:
			case DYNAMIC:
			case EQUALS:
			case FROM:
			case GET:
			case GROUP:
			case INTO:
			case JOIN:
			case LET:
			case NAMEOF:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SELECT:
			case SET:
			case STRING:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
				{
				setState(2145);
				class_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(2148);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_literalContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public Tuple_literal_element_listContext tuple_literal_element_list() {
			return getRuleContext(Tuple_literal_element_listContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Tuple_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTuple_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTuple_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitTuple_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_literalContext tuple_literal() throws RecognitionException {
		Tuple_literalContext _localctx = new Tuple_literalContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_tuple_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2151);
			match(OPEN_PARENS);
			setState(2152);
			tuple_literal_element_list(0);
			setState(2153);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tuple_literal_element_listContext extends ParserRuleContext {
		public List<Tuple_literal_elementContext> tuple_literal_element() {
			return getRuleContexts(Tuple_literal_elementContext.class);
		}
		public Tuple_literal_elementContext tuple_literal_element(int i) {
			return getRuleContext(Tuple_literal_elementContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(CSharpParser.COMMA, 0); }
		public Tuple_literal_element_listContext tuple_literal_element_list() {
			return getRuleContext(Tuple_literal_element_listContext.class,0);
		}
		public Tuple_literal_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_literal_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTuple_literal_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTuple_literal_element_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitTuple_literal_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_literal_element_listContext tuple_literal_element_list() throws RecognitionException {
		return tuple_literal_element_list(0);
	}

	private Tuple_literal_element_listContext tuple_literal_element_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tuple_literal_element_listContext _localctx = new Tuple_literal_element_listContext(_ctx, _parentState);
		Tuple_literal_element_listContext _prevctx = _localctx;
		int _startState = 356;
		enterRecursionRule(_localctx, 356, RULE_tuple_literal_element_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2156);
			tuple_literal_element();
			setState(2157);
			match(COMMA);
			setState(2158);
			tuple_literal_element();
			}
			_ctx.stop = _input.LT(-1);
			setState(2165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Tuple_literal_element_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tuple_literal_element_list);
					setState(2160);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2161);
					match(COMMA);
					setState(2162);
					tuple_literal_element();
					}
					} 
				}
				setState(2167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Tuple_literal_elementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public Tuple_literal_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_literal_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterTuple_literal_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitTuple_literal_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitTuple_literal_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_literal_elementContext tuple_literal_element() throws RecognitionException {
		Tuple_literal_elementContext _localctx = new Tuple_literal_elementContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_tuple_literal_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(2168);
				identifier();
				setState(2169);
				match(COLON);
				}
				break;
			}
			setState(2173);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(CSharpParser.INTEGER_LITERAL, 0); }
		public TerminalNode HEX_INTEGER_LITERAL() { return getToken(CSharpParser.HEX_INTEGER_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(CSharpParser.REAL_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(CSharpParser.CHARACTER_LITERAL, 0); }
		public TerminalNode NULL() { return getToken(CSharpParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_literal);
		try {
			setState(2182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2175);
				boolean_literal();
				}
				break;
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(2176);
				string_literal();
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2177);
				match(INTEGER_LITERAL);
				}
				break;
			case HEX_INTEGER_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(2178);
				match(HEX_INTEGER_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(2179);
				match(REAL_LITERAL);
				}
				break;
			case CHARACTER_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(2180);
				match(CHARACTER_LITERAL);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(2181);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CSharpParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CSharpParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2184);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public Interpolated_regular_stringContext interpolated_regular_string() {
			return getRuleContext(Interpolated_regular_stringContext.class,0);
		}
		public Interpolated_verbatium_stringContext interpolated_verbatium_string() {
			return getRuleContext(Interpolated_verbatium_stringContext.class,0);
		}
		public TerminalNode REGULAR_STRING() { return getToken(CSharpParser.REGULAR_STRING, 0); }
		public TerminalNode VERBATIUM_STRING() { return getToken(CSharpParser.VERBATIUM_STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitString_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitString_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_string_literal);
		try {
			setState(2190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERPOLATED_REGULAR_STRING_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(2186);
				interpolated_regular_string();
				}
				break;
			case INTERPOLATED_VERBATIUM_STRING_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(2187);
				interpolated_verbatium_string();
				}
				break;
			case REGULAR_STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(2188);
				match(REGULAR_STRING);
				}
				break;
			case VERBATIUM_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2189);
				match(VERBATIUM_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_regular_stringContext extends ParserRuleContext {
		public TerminalNode INTERPOLATED_REGULAR_STRING_START() { return getToken(CSharpParser.INTERPOLATED_REGULAR_STRING_START, 0); }
		public TerminalNode DOUBLE_QUOTE_INSIDE() { return getToken(CSharpParser.DOUBLE_QUOTE_INSIDE, 0); }
		public List<Interpolated_regular_string_partContext> interpolated_regular_string_part() {
			return getRuleContexts(Interpolated_regular_string_partContext.class);
		}
		public Interpolated_regular_string_partContext interpolated_regular_string_part(int i) {
			return getRuleContext(Interpolated_regular_string_partContext.class,i);
		}
		public Interpolated_regular_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_regular_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterpolated_regular_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterpolated_regular_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterpolated_regular_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interpolated_regular_stringContext interpolated_regular_string() throws RecognitionException {
		Interpolated_regular_stringContext _localctx = new Interpolated_regular_stringContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_interpolated_regular_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			match(INTERPOLATED_REGULAR_STRING_START);
			setState(2196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)) | (1L << (DOUBLE_CURLY_INSIDE - 132)) | (1L << (REGULAR_CHAR_INSIDE - 132)) | (1L << (REGULAR_STRING_INSIDE - 132)))) != 0)) {
				{
				{
				setState(2193);
				interpolated_regular_string_part();
				}
				}
				setState(2198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2199);
			match(DOUBLE_QUOTE_INSIDE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_verbatium_stringContext extends ParserRuleContext {
		public TerminalNode INTERPOLATED_VERBATIUM_STRING_START() { return getToken(CSharpParser.INTERPOLATED_VERBATIUM_STRING_START, 0); }
		public TerminalNode DOUBLE_QUOTE_INSIDE() { return getToken(CSharpParser.DOUBLE_QUOTE_INSIDE, 0); }
		public List<Interpolated_verbatium_string_partContext> interpolated_verbatium_string_part() {
			return getRuleContexts(Interpolated_verbatium_string_partContext.class);
		}
		public Interpolated_verbatium_string_partContext interpolated_verbatium_string_part(int i) {
			return getRuleContext(Interpolated_verbatium_string_partContext.class,i);
		}
		public Interpolated_verbatium_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_verbatium_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterpolated_verbatium_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterpolated_verbatium_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterpolated_verbatium_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interpolated_verbatium_stringContext interpolated_verbatium_string() throws RecognitionException {
		Interpolated_verbatium_stringContext _localctx = new Interpolated_verbatium_stringContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_interpolated_verbatium_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			match(INTERPOLATED_VERBATIUM_STRING_START);
			setState(2205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (PARTIAL - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)) | (1L << (DOUBLE_CURLY_INSIDE - 132)) | (1L << (VERBATIUM_DOUBLE_QUOTE_INSIDE - 132)) | (1L << (VERBATIUM_INSIDE_STRING - 132)))) != 0)) {
				{
				{
				setState(2202);
				interpolated_verbatium_string_part();
				}
				}
				setState(2207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2208);
			match(DOUBLE_QUOTE_INSIDE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_regular_string_partContext extends ParserRuleContext {
		public Interpolated_string_expressionContext interpolated_string_expression() {
			return getRuleContext(Interpolated_string_expressionContext.class,0);
		}
		public TerminalNode DOUBLE_CURLY_INSIDE() { return getToken(CSharpParser.DOUBLE_CURLY_INSIDE, 0); }
		public TerminalNode REGULAR_CHAR_INSIDE() { return getToken(CSharpParser.REGULAR_CHAR_INSIDE, 0); }
		public TerminalNode REGULAR_STRING_INSIDE() { return getToken(CSharpParser.REGULAR_STRING_INSIDE, 0); }
		public Interpolated_regular_string_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_regular_string_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterpolated_regular_string_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterpolated_regular_string_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterpolated_regular_string_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interpolated_regular_string_partContext interpolated_regular_string_part() throws RecognitionException {
		Interpolated_regular_string_partContext _localctx = new Interpolated_regular_string_partContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_interpolated_regular_string_part);
		try {
			setState(2214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STATIC:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2210);
				interpolated_string_expression();
				}
				break;
			case DOUBLE_CURLY_INSIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2211);
				match(DOUBLE_CURLY_INSIDE);
				}
				break;
			case REGULAR_CHAR_INSIDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2212);
				match(REGULAR_CHAR_INSIDE);
				}
				break;
			case REGULAR_STRING_INSIDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2213);
				match(REGULAR_STRING_INSIDE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_verbatium_string_partContext extends ParserRuleContext {
		public Interpolated_string_expressionContext interpolated_string_expression() {
			return getRuleContext(Interpolated_string_expressionContext.class,0);
		}
		public TerminalNode DOUBLE_CURLY_INSIDE() { return getToken(CSharpParser.DOUBLE_CURLY_INSIDE, 0); }
		public TerminalNode VERBATIUM_DOUBLE_QUOTE_INSIDE() { return getToken(CSharpParser.VERBATIUM_DOUBLE_QUOTE_INSIDE, 0); }
		public TerminalNode VERBATIUM_INSIDE_STRING() { return getToken(CSharpParser.VERBATIUM_INSIDE_STRING, 0); }
		public Interpolated_verbatium_string_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_verbatium_string_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterpolated_verbatium_string_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterpolated_verbatium_string_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterpolated_verbatium_string_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interpolated_verbatium_string_partContext interpolated_verbatium_string_part() throws RecognitionException {
		Interpolated_verbatium_string_partContext _localctx = new Interpolated_verbatium_string_partContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_interpolated_verbatium_string_part);
		try {
			setState(2220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ALIAS:
			case ARGLIST:
			case ASCENDING:
			case ASYNC:
			case AWAIT:
			case BASE:
			case BOOL:
			case BY:
			case BYTE:
			case CHAR:
			case CHECKED:
			case DECIMAL:
			case DEFAULT:
			case DELEGATE:
			case DESCENDING:
			case DOUBLE:
			case DYNAMIC:
			case EQUALS:
			case FALSE:
			case FLOAT:
			case FROM:
			case GET:
			case GROUP:
			case INT:
			case INTO:
			case JOIN:
			case LET:
			case LONG:
			case NAMEOF:
			case NEW:
			case NULL:
			case OBJECT:
			case ON:
			case ORDERBY:
			case PARTIAL:
			case REMOVE:
			case SBYTE:
			case SELECT:
			case SET:
			case SHORT:
			case SIZEOF:
			case STATIC:
			case STRING:
			case THIS:
			case TRUE:
			case TYPEOF:
			case UINT:
			case ULONG:
			case UNCHECKED:
			case USHORT:
			case VAR:
			case WHEN:
			case WHERE:
			case YIELD:
			case IDENTIFIER:
			case LITERAL_ACCESS:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case REAL_LITERAL:
			case CHARACTER_LITERAL:
			case REGULAR_STRING:
			case VERBATIUM_STRING:
			case INTERPOLATED_REGULAR_STRING_START:
			case INTERPOLATED_VERBATIUM_STRING_START:
			case OPEN_PARENS:
			case PLUS:
			case MINUS:
			case STAR:
			case AMP:
			case BANG:
			case TILDE:
			case OP_INC:
			case OP_DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2216);
				interpolated_string_expression();
				}
				break;
			case DOUBLE_CURLY_INSIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2217);
				match(DOUBLE_CURLY_INSIDE);
				}
				break;
			case VERBATIUM_DOUBLE_QUOTE_INSIDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2218);
				match(VERBATIUM_DOUBLE_QUOTE_INSIDE);
				}
				break;
			case VERBATIUM_INSIDE_STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(2219);
				match(VERBATIUM_INSIDE_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interpolated_string_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSharpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSharpParser.COMMA, i);
		}
		public TerminalNode COLON() { return getToken(CSharpParser.COLON, 0); }
		public List<TerminalNode> FORMAT_STRING() { return getTokens(CSharpParser.FORMAT_STRING); }
		public TerminalNode FORMAT_STRING(int i) {
			return getToken(CSharpParser.FORMAT_STRING, i);
		}
		public Interpolated_string_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolated_string_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterpolated_string_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterpolated_string_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterpolated_string_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interpolated_string_expressionContext interpolated_string_expression() throws RecognitionException {
		Interpolated_string_expressionContext _localctx = new Interpolated_string_expressionContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_interpolated_string_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2222);
			expression();
			setState(2227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2223);
				match(COMMA);
				setState(2224);
				expression();
				}
				}
				setState(2229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2230);
				match(COLON);
				setState(2232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2231);
					match(FORMAT_STRING);
					}
					}
					setState(2234); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==FORMAT_STRING );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(CSharpParser.ABSTRACT, 0); }
		public TerminalNode AS() { return getToken(CSharpParser.AS, 0); }
		public TerminalNode BASE() { return getToken(CSharpParser.BASE, 0); }
		public TerminalNode BOOL() { return getToken(CSharpParser.BOOL, 0); }
		public TerminalNode BREAK() { return getToken(CSharpParser.BREAK, 0); }
		public TerminalNode BYTE() { return getToken(CSharpParser.BYTE, 0); }
		public TerminalNode CASE() { return getToken(CSharpParser.CASE, 0); }
		public TerminalNode CATCH() { return getToken(CSharpParser.CATCH, 0); }
		public TerminalNode CHAR() { return getToken(CSharpParser.CHAR, 0); }
		public TerminalNode CHECKED() { return getToken(CSharpParser.CHECKED, 0); }
		public TerminalNode CLASS() { return getToken(CSharpParser.CLASS, 0); }
		public TerminalNode CONST() { return getToken(CSharpParser.CONST, 0); }
		public TerminalNode CONTINUE() { return getToken(CSharpParser.CONTINUE, 0); }
		public TerminalNode DECIMAL() { return getToken(CSharpParser.DECIMAL, 0); }
		public TerminalNode DEFAULT() { return getToken(CSharpParser.DEFAULT, 0); }
		public TerminalNode DELEGATE() { return getToken(CSharpParser.DELEGATE, 0); }
		public TerminalNode DO() { return getToken(CSharpParser.DO, 0); }
		public TerminalNode DOUBLE() { return getToken(CSharpParser.DOUBLE, 0); }
		public TerminalNode ELSE() { return getToken(CSharpParser.ELSE, 0); }
		public TerminalNode ENUM() { return getToken(CSharpParser.ENUM, 0); }
		public TerminalNode EVENT() { return getToken(CSharpParser.EVENT, 0); }
		public TerminalNode EXPLICIT() { return getToken(CSharpParser.EXPLICIT, 0); }
		public TerminalNode EXTERN() { return getToken(CSharpParser.EXTERN, 0); }
		public TerminalNode FALSE() { return getToken(CSharpParser.FALSE, 0); }
		public TerminalNode FINALLY() { return getToken(CSharpParser.FINALLY, 0); }
		public TerminalNode FIXED() { return getToken(CSharpParser.FIXED, 0); }
		public TerminalNode FLOAT() { return getToken(CSharpParser.FLOAT, 0); }
		public TerminalNode FOR() { return getToken(CSharpParser.FOR, 0); }
		public TerminalNode FOREACH() { return getToken(CSharpParser.FOREACH, 0); }
		public TerminalNode GOTO() { return getToken(CSharpParser.GOTO, 0); }
		public TerminalNode IF() { return getToken(CSharpParser.IF, 0); }
		public TerminalNode IMPLICIT() { return getToken(CSharpParser.IMPLICIT, 0); }
		public TerminalNode IN() { return getToken(CSharpParser.IN, 0); }
		public TerminalNode INT() { return getToken(CSharpParser.INT, 0); }
		public TerminalNode INTERFACE() { return getToken(CSharpParser.INTERFACE, 0); }
		public TerminalNode INTERNAL() { return getToken(CSharpParser.INTERNAL, 0); }
		public TerminalNode IS() { return getToken(CSharpParser.IS, 0); }
		public TerminalNode LOCK() { return getToken(CSharpParser.LOCK, 0); }
		public TerminalNode LONG() { return getToken(CSharpParser.LONG, 0); }
		public TerminalNode NAMESPACE() { return getToken(CSharpParser.NAMESPACE, 0); }
		public TerminalNode NEW() { return getToken(CSharpParser.NEW, 0); }
		public TerminalNode NULL() { return getToken(CSharpParser.NULL, 0); }
		public TerminalNode OBJECT() { return getToken(CSharpParser.OBJECT, 0); }
		public TerminalNode OPERATOR() { return getToken(CSharpParser.OPERATOR, 0); }
		public TerminalNode OUT() { return getToken(CSharpParser.OUT, 0); }
		public TerminalNode OVERRIDE() { return getToken(CSharpParser.OVERRIDE, 0); }
		public TerminalNode PARAMS() { return getToken(CSharpParser.PARAMS, 0); }
		public TerminalNode PRIVATE() { return getToken(CSharpParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(CSharpParser.PROTECTED, 0); }
		public TerminalNode PUBLIC() { return getToken(CSharpParser.PUBLIC, 0); }
		public TerminalNode READONLY() { return getToken(CSharpParser.READONLY, 0); }
		public TerminalNode REF() { return getToken(CSharpParser.REF, 0); }
		public TerminalNode RETURN() { return getToken(CSharpParser.RETURN, 0); }
		public TerminalNode SBYTE() { return getToken(CSharpParser.SBYTE, 0); }
		public TerminalNode SEALED() { return getToken(CSharpParser.SEALED, 0); }
		public TerminalNode SHORT() { return getToken(CSharpParser.SHORT, 0); }
		public TerminalNode SIZEOF() { return getToken(CSharpParser.SIZEOF, 0); }
		public TerminalNode STACKALLOC() { return getToken(CSharpParser.STACKALLOC, 0); }
		public TerminalNode STATIC() { return getToken(CSharpParser.STATIC, 0); }
		public TerminalNode STRING() { return getToken(CSharpParser.STRING, 0); }
		public TerminalNode STRUCT() { return getToken(CSharpParser.STRUCT, 0); }
		public TerminalNode SWITCH() { return getToken(CSharpParser.SWITCH, 0); }
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public TerminalNode THROW() { return getToken(CSharpParser.THROW, 0); }
		public TerminalNode TRUE() { return getToken(CSharpParser.TRUE, 0); }
		public TerminalNode TRY() { return getToken(CSharpParser.TRY, 0); }
		public TerminalNode TYPEOF() { return getToken(CSharpParser.TYPEOF, 0); }
		public TerminalNode UINT() { return getToken(CSharpParser.UINT, 0); }
		public TerminalNode ULONG() { return getToken(CSharpParser.ULONG, 0); }
		public TerminalNode UNCHECKED() { return getToken(CSharpParser.UNCHECKED, 0); }
		public TerminalNode UNSAFE() { return getToken(CSharpParser.UNSAFE, 0); }
		public TerminalNode USHORT() { return getToken(CSharpParser.USHORT, 0); }
		public TerminalNode USING() { return getToken(CSharpParser.USING, 0); }
		public TerminalNode VIRTUAL() { return getToken(CSharpParser.VIRTUAL, 0); }
		public TerminalNode VOID() { return getToken(CSharpParser.VOID, 0); }
		public TerminalNode VOLATILE() { return getToken(CSharpParser.VOLATILE, 0); }
		public TerminalNode WHILE() { return getToken(CSharpParser.WHILE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2238);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << AS) | (1L << BASE) | (1L << BOOL) | (1L << BREAK) | (1L << BYTE) | (1L << CASE) | (1L << CATCH) | (1L << CHAR) | (1L << CHECKED) | (1L << CLASS) | (1L << CONST) | (1L << CONTINUE) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DO) | (1L << DOUBLE) | (1L << ELSE) | (1L << ENUM) | (1L << EVENT) | (1L << EXPLICIT) | (1L << EXTERN) | (1L << FALSE) | (1L << FINALLY) | (1L << FIXED) | (1L << FLOAT) | (1L << FOR) | (1L << FOREACH) | (1L << GOTO) | (1L << IF) | (1L << IMPLICIT) | (1L << IN) | (1L << INT) | (1L << INTERFACE) | (1L << INTERNAL) | (1L << IS) | (1L << LOCK) | (1L << LONG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NAMESPACE - 64)) | (1L << (NEW - 64)) | (1L << (NULL - 64)) | (1L << (OBJECT - 64)) | (1L << (OPERATOR - 64)) | (1L << (OUT - 64)) | (1L << (OVERRIDE - 64)) | (1L << (PARAMS - 64)) | (1L << (PRIVATE - 64)) | (1L << (PROTECTED - 64)) | (1L << (PUBLIC - 64)) | (1L << (READONLY - 64)) | (1L << (REF - 64)) | (1L << (RETURN - 64)) | (1L << (SBYTE - 64)) | (1L << (SEALED - 64)) | (1L << (SHORT - 64)) | (1L << (SIZEOF - 64)) | (1L << (STACKALLOC - 64)) | (1L << (STATIC - 64)) | (1L << (STRING - 64)) | (1L << (STRUCT - 64)) | (1L << (SWITCH - 64)) | (1L << (THIS - 64)) | (1L << (THROW - 64)) | (1L << (TRUE - 64)) | (1L << (TRY - 64)) | (1L << (TYPEOF - 64)) | (1L << (UINT - 64)) | (1L << (ULONG - 64)) | (1L << (UNCHECKED - 64)) | (1L << (UNSAFE - 64)) | (1L << (USHORT - 64)) | (1L << (USING - 64)) | (1L << (VIRTUAL - 64)) | (1L << (VOID - 64)) | (1L << (VOLATILE - 64)) | (1L << (WHILE - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_definitionContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CSharpParser.CLASS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Class_baseContext class_base() {
			return getRuleContext(Class_baseContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Class_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterClass_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitClass_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitClass_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_definitionContext class_definition() throws RecognitionException {
		Class_definitionContext _localctx = new Class_definitionContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_class_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2240);
			match(CLASS);
			setState(2241);
			identifier();
			setState(2243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2242);
				type_parameter_list();
				}
			}

			setState(2246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2245);
				class_base();
				}
			}

			setState(2249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2248);
				type_parameter_constraints_clauses();
				}
			}

			setState(2251);
			class_body();
			setState(2253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2252);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_definitionContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(CSharpParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Struct_interfacesContext struct_interfaces() {
			return getRuleContext(Struct_interfacesContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Struct_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterStruct_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitStruct_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitStruct_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_definitionContext struct_definition() throws RecognitionException {
		Struct_definitionContext _localctx = new Struct_definitionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_struct_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2255);
			match(STRUCT);
			setState(2256);
			identifier();
			setState(2258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2257);
				type_parameter_list();
				}
			}

			setState(2261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2260);
				struct_interfaces();
				}
			}

			setState(2264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2263);
				type_parameter_constraints_clauses();
				}
			}

			setState(2266);
			struct_body();
			setState(2268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2267);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interface_definitionContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(CSharpParser.INTERFACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Interface_bodyContext interface_body() {
			return getRuleContext(Interface_bodyContext.class,0);
		}
		public Variant_type_parameter_listContext variant_type_parameter_list() {
			return getRuleContext(Variant_type_parameter_listContext.class,0);
		}
		public Interface_baseContext interface_base() {
			return getRuleContext(Interface_baseContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Interface_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterInterface_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitInterface_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitInterface_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_definitionContext interface_definition() throws RecognitionException {
		Interface_definitionContext _localctx = new Interface_definitionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_interface_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2270);
			match(INTERFACE);
			setState(2271);
			identifier();
			setState(2273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2272);
				variant_type_parameter_list();
				}
			}

			setState(2276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2275);
				interface_base();
				}
			}

			setState(2279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2278);
				type_parameter_constraints_clauses();
				}
			}

			setState(2281);
			interface_body();
			setState(2283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2282);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_definitionContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(CSharpParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_bodyContext enum_body() {
			return getRuleContext(Enum_bodyContext.class,0);
		}
		public Enum_baseContext enum_base() {
			return getRuleContext(Enum_baseContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Enum_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEnum_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEnum_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitEnum_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_definitionContext enum_definition() throws RecognitionException {
		Enum_definitionContext _localctx = new Enum_definitionContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_enum_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2285);
			match(ENUM);
			setState(2286);
			identifier();
			setState(2288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2287);
				enum_base();
				}
			}

			setState(2290);
			enum_body();
			setState(2292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(2291);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delegate_definitionContext extends ParserRuleContext {
		public TerminalNode DELEGATE() { return getToken(CSharpParser.DELEGATE, 0); }
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Variant_type_parameter_listContext variant_type_parameter_list() {
			return getRuleContext(Variant_type_parameter_listContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Delegate_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delegate_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterDelegate_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitDelegate_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitDelegate_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delegate_definitionContext delegate_definition() throws RecognitionException {
		Delegate_definitionContext _localctx = new Delegate_definitionContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_delegate_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2294);
			match(DELEGATE);
			setState(2295);
			return_type();
			setState(2296);
			identifier();
			setState(2298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2297);
				variant_type_parameter_list();
				}
			}

			setState(2300);
			match(OPEN_PARENS);
			setState(2302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IN) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARAMS - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (THIS - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (OPEN_BRACKET - 67)) | (1L << (OPEN_PARENS - 67)))) != 0)) {
				{
				setState(2301);
				formal_parameter_list();
				}
			}

			setState(2304);
			match(CLOSE_PARENS);
			setState(2306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2305);
				type_parameter_constraints_clauses();
				}
			}

			setState(2308);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Event_declarationContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(CSharpParser.EVENT, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Variable_declaratorsContext variable_declarators() {
			return getRuleContext(Variable_declaratorsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Event_accessor_declarationsContext event_accessor_declarations() {
			return getRuleContext(Event_accessor_declarationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Event_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterEvent_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitEvent_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitEvent_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_declarationContext event_declaration() throws RecognitionException {
		Event_declarationContext _localctx = new Event_declarationContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_event_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2310);
			match(EVENT);
			setState(2311);
			type_();
			setState(2320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				{
				setState(2312);
				variable_declarators();
				setState(2313);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(2315);
				member_name();
				setState(2316);
				match(OPEN_BRACE);
				setState(2317);
				event_accessor_declarations();
				setState(2318);
				match(CLOSE_BRACE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_declarationContext extends ParserRuleContext {
		public Variable_declaratorsContext variable_declarators() {
			return getRuleContext(Variable_declaratorsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Field_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterField_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitField_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitField_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declarationContext field_declaration() throws RecognitionException {
		Field_declarationContext _localctx = new Field_declarationContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_field_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2322);
			variable_declarators();
			setState(2323);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_declarationContext extends ParserRuleContext {
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Accessor_declarationsContext accessor_declarations() {
			return getRuleContext(Accessor_declarationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public Variable_initializerContext variable_initializer() {
			return getRuleContext(Variable_initializerContext.class,0);
		}
		public Property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterProperty_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitProperty_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitProperty_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_declarationContext property_declaration() throws RecognitionException {
		Property_declarationContext _localctx = new Property_declarationContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_property_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2325);
			member_name();
			setState(2339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(2326);
				match(OPEN_BRACE);
				setState(2327);
				accessor_declarations();
				setState(2328);
				match(CLOSE_BRACE);
				setState(2333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGNMENT) {
					{
					setState(2329);
					match(ASSIGNMENT);
					setState(2330);
					variable_initializer();
					setState(2331);
					match(SEMICOLON);
					}
				}

				}
				break;
			case ASSIGNMENT:
				{
				setState(2335);
				right_arrow();
				setState(2336);
				expression();
				setState(2337);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_declarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(CSharpParser.CONST, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Constant_declaratorsContext constant_declarators() {
			return getRuleContext(Constant_declaratorsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConstant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConstant_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConstant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_constant_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2341);
			match(CONST);
			setState(2342);
			type_();
			setState(2343);
			constant_declarators();
			setState(2344);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexer_declarationContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(CSharpParser.THIS, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(CSharpParser.OPEN_BRACKET, 0); }
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(CSharpParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(CSharpParser.OPEN_BRACE, 0); }
		public Accessor_declarationsContext accessor_declarations() {
			return getRuleContext(Accessor_declarationsContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(CSharpParser.CLOSE_BRACE, 0); }
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Indexer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIndexer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIndexer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitIndexer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexer_declarationContext indexer_declaration() throws RecognitionException {
		Indexer_declarationContext _localctx = new Indexer_declarationContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_indexer_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2346);
			match(THIS);
			setState(2347);
			match(OPEN_BRACKET);
			setState(2348);
			formal_parameter_list();
			setState(2349);
			match(CLOSE_BRACKET);
			setState(2358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(2350);
				match(OPEN_BRACE);
				setState(2351);
				accessor_declarations();
				setState(2352);
				match(CLOSE_BRACE);
				}
				break;
			case ASSIGNMENT:
				{
				setState(2354);
				right_arrow();
				setState(2355);
				expression();
				setState(2356);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Destructor_definitionContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(CSharpParser.TILDE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Destructor_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructor_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterDestructor_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitDestructor_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitDestructor_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Destructor_definitionContext destructor_definition() throws RecognitionException {
		Destructor_definitionContext _localctx = new Destructor_definitionContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_destructor_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2360);
			match(TILDE);
			setState(2361);
			identifier();
			setState(2362);
			match(OPEN_PARENS);
			setState(2363);
			match(CLOSE_PARENS);
			setState(2364);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Constructor_initializerContext constructor_initializer() {
			return getRuleContext(Constructor_initializerContext.class,0);
		}
		public Constructor_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterConstructor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitConstructor_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitConstructor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_declarationContext constructor_declaration() throws RecognitionException {
		Constructor_declarationContext _localctx = new Constructor_declarationContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_constructor_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2366);
			identifier();
			setState(2367);
			match(OPEN_PARENS);
			setState(2369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IN) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARAMS - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (THIS - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (OPEN_BRACKET - 67)) | (1L << (OPEN_PARENS - 67)))) != 0)) {
				{
				setState(2368);
				formal_parameter_list();
				}
			}

			setState(2371);
			match(CLOSE_PARENS);
			setState(2373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(2372);
				constructor_initializer();
				}
			}

			setState(2380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
			case SEMICOLON:
				{
				setState(2375);
				body();
				}
				break;
			case ASSIGNMENT:
				{
				setState(2376);
				right_arrow();
				setState(2377);
				expression();
				setState(2378);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declarationContext extends ParserRuleContext {
		public Method_member_nameContext method_member_name() {
			return getRuleContext(Method_member_nameContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public Type_parameter_listContext type_parameter_list() {
			return getRuleContext(Type_parameter_listContext.class,0);
		}
		public Formal_parameter_listContext formal_parameter_list() {
			return getRuleContext(Formal_parameter_listContext.class,0);
		}
		public Type_parameter_constraints_clausesContext type_parameter_constraints_clauses() {
			return getRuleContext(Type_parameter_constraints_clausesContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMethod_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMethod_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2382);
			method_member_name();
			setState(2384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2383);
				type_parameter_list();
				}
			}

			setState(2386);
			match(OPEN_PARENS);
			setState(2388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << DECIMAL) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << IN) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OBJECT - 67)) | (1L << (ON - 67)) | (1L << (ORDERBY - 67)) | (1L << (OUT - 67)) | (1L << (PARAMS - 67)) | (1L << (PARTIAL - 67)) | (1L << (REF - 67)) | (1L << (REMOVE - 67)) | (1L << (SBYTE - 67)) | (1L << (SELECT - 67)) | (1L << (SET - 67)) | (1L << (SHORT - 67)) | (1L << (STRING - 67)) | (1L << (THIS - 67)) | (1L << (UINT - 67)) | (1L << (ULONG - 67)) | (1L << (USHORT - 67)) | (1L << (VAR - 67)) | (1L << (VOID - 67)) | (1L << (WHEN - 67)) | (1L << (WHERE - 67)) | (1L << (YIELD - 67)) | (1L << (IDENTIFIER - 67)) | (1L << (OPEN_BRACKET - 67)) | (1L << (OPEN_PARENS - 67)))) != 0)) {
				{
				setState(2387);
				formal_parameter_list();
				}
			}

			setState(2390);
			match(CLOSE_PARENS);
			setState(2392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2391);
				type_parameter_constraints_clauses();
				}
			}

			setState(2399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
			case SEMICOLON:
				{
				setState(2394);
				method_body();
				}
				break;
			case ASSIGNMENT:
				{
				setState(2395);
				right_arrow();
				setState(2396);
				expression();
				setState(2397);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_member_nameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(CSharpParser.DOUBLE_COLON, 0); }
		public List<TerminalNode> DOT() { return getTokens(CSharpParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CSharpParser.DOT, i);
		}
		public List<Type_argument_listContext> type_argument_list() {
			return getRuleContexts(Type_argument_listContext.class);
		}
		public Type_argument_listContext type_argument_list(int i) {
			return getRuleContext(Type_argument_listContext.class,i);
		}
		public Method_member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_member_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMethod_member_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMethod_member_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMethod_member_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_member_nameContext method_member_name() throws RecognitionException {
		Method_member_nameContext _localctx = new Method_member_nameContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_method_member_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				{
				setState(2401);
				identifier();
				}
				break;
			case 2:
				{
				setState(2402);
				identifier();
				setState(2403);
				match(DOUBLE_COLON);
				setState(2404);
				identifier();
				}
				break;
			}
			setState(2415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2409);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(2408);
						type_argument_list();
						}
					}

					setState(2411);
					match(DOT);
					setState(2412);
					identifier();
					}
					} 
				}
				setState(2417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_declarationContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(CSharpParser.OPERATOR, 0); }
		public Overloadable_operatorContext overloadable_operator() {
			return getRuleContext(Overloadable_operatorContext.class,0);
		}
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public List<Arg_declarationContext> arg_declaration() {
			return getRuleContexts(Arg_declarationContext.class);
		}
		public Arg_declarationContext arg_declaration(int i) {
			return getRuleContext(Arg_declarationContext.class,i);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Right_arrowContext right_arrow() {
			return getRuleContext(Right_arrowContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CSharpParser.SEMICOLON, 0); }
		public TerminalNode COMMA() { return getToken(CSharpParser.COMMA, 0); }
		public Operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterOperator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitOperator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitOperator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_declarationContext operator_declaration() throws RecognitionException {
		Operator_declarationContext _localctx = new Operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_operator_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2418);
			match(OPERATOR);
			setState(2419);
			overloadable_operator();
			setState(2420);
			match(OPEN_PARENS);
			setState(2421);
			arg_declaration();
			setState(2424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2422);
				match(COMMA);
				setState(2423);
				arg_declaration();
				}
			}

			setState(2426);
			match(CLOSE_PARENS);
			setState(2432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
			case SEMICOLON:
				{
				setState(2427);
				body();
				}
				break;
			case ASSIGNMENT:
				{
				setState(2428);
				right_arrow();
				setState(2429);
				expression();
				setState(2430);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_declarationContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(CSharpParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Arg_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterArg_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitArg_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitArg_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_declarationContext arg_declaration() throws RecognitionException {
		Arg_declarationContext _localctx = new Arg_declarationContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_arg_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2434);
			type_();
			setState(2435);
			identifier();
			setState(2438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(2436);
				match(ASSIGNMENT);
				setState(2437);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_invocationContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Method_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterMethod_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitMethod_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitMethod_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_invocationContext method_invocation() throws RecognitionException {
		Method_invocationContext _localctx = new Method_invocationContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_method_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2440);
			match(OPEN_PARENS);
			setState(2442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OUT - 65)) | (1L << (PARTIAL - 65)) | (1L << (REF - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VOID - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
				{
				setState(2441);
				argument_list();
				}
			}

			setState(2444);
			match(CLOSE_PARENS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_creation_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENS() { return getToken(CSharpParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(CSharpParser.CLOSE_PARENS, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public Object_or_collection_initializerContext object_or_collection_initializer() {
			return getRuleContext(Object_or_collection_initializerContext.class,0);
		}
		public Object_creation_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_creation_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterObject_creation_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitObject_creation_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitObject_creation_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_creation_expressionContext object_creation_expression() throws RecognitionException {
		Object_creation_expressionContext _localctx = new Object_creation_expressionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_object_creation_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2446);
			match(OPEN_PARENS);
			setState(2448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BASE) | (1L << BOOL) | (1L << BY) | (1L << BYTE) | (1L << CHAR) | (1L << CHECKED) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DELEGATE) | (1L << DESCENDING) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FALSE) | (1L << FLOAT) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INT) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << LONG) | (1L << NAMEOF))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NEW - 65)) | (1L << (NULL - 65)) | (1L << (OBJECT - 65)) | (1L << (ON - 65)) | (1L << (ORDERBY - 65)) | (1L << (OUT - 65)) | (1L << (PARTIAL - 65)) | (1L << (REF - 65)) | (1L << (REMOVE - 65)) | (1L << (SBYTE - 65)) | (1L << (SELECT - 65)) | (1L << (SET - 65)) | (1L << (SHORT - 65)) | (1L << (SIZEOF - 65)) | (1L << (STATIC - 65)) | (1L << (STRING - 65)) | (1L << (THIS - 65)) | (1L << (TRUE - 65)) | (1L << (TYPEOF - 65)) | (1L << (UINT - 65)) | (1L << (ULONG - 65)) | (1L << (UNCHECKED - 65)) | (1L << (USHORT - 65)) | (1L << (VAR - 65)) | (1L << (VOID - 65)) | (1L << (WHEN - 65)) | (1L << (WHERE - 65)) | (1L << (YIELD - 65)) | (1L << (IDENTIFIER - 65)) | (1L << (LITERAL_ACCESS - 65)) | (1L << (INTEGER_LITERAL - 65)) | (1L << (HEX_INTEGER_LITERAL - 65)) | (1L << (REAL_LITERAL - 65)) | (1L << (CHARACTER_LITERAL - 65)) | (1L << (REGULAR_STRING - 65)) | (1L << (VERBATIUM_STRING - 65)) | (1L << (INTERPOLATED_REGULAR_STRING_START - 65)) | (1L << (INTERPOLATED_VERBATIUM_STRING_START - 65)) | (1L << (OPEN_PARENS - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (PLUS - 132)) | (1L << (MINUS - 132)) | (1L << (STAR - 132)) | (1L << (AMP - 132)) | (1L << (BANG - 132)) | (1L << (TILDE - 132)) | (1L << (OP_INC - 132)) | (1L << (OP_DEC - 132)))) != 0)) {
				{
				setState(2447);
				argument_list();
				}
			}

			setState(2450);
			match(CLOSE_PARENS);
			setState(2452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				setState(2451);
				object_or_collection_initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CSharpParser.IDENTIFIER, 0); }
		public TerminalNode ADD() { return getToken(CSharpParser.ADD, 0); }
		public TerminalNode ALIAS() { return getToken(CSharpParser.ALIAS, 0); }
		public TerminalNode ARGLIST() { return getToken(CSharpParser.ARGLIST, 0); }
		public TerminalNode ASCENDING() { return getToken(CSharpParser.ASCENDING, 0); }
		public TerminalNode ASYNC() { return getToken(CSharpParser.ASYNC, 0); }
		public TerminalNode AWAIT() { return getToken(CSharpParser.AWAIT, 0); }
		public TerminalNode BY() { return getToken(CSharpParser.BY, 0); }
		public TerminalNode DESCENDING() { return getToken(CSharpParser.DESCENDING, 0); }
		public TerminalNode DYNAMIC() { return getToken(CSharpParser.DYNAMIC, 0); }
		public TerminalNode EQUALS() { return getToken(CSharpParser.EQUALS, 0); }
		public TerminalNode FROM() { return getToken(CSharpParser.FROM, 0); }
		public TerminalNode GET() { return getToken(CSharpParser.GET, 0); }
		public TerminalNode GROUP() { return getToken(CSharpParser.GROUP, 0); }
		public TerminalNode INTO() { return getToken(CSharpParser.INTO, 0); }
		public TerminalNode JOIN() { return getToken(CSharpParser.JOIN, 0); }
		public TerminalNode LET() { return getToken(CSharpParser.LET, 0); }
		public TerminalNode NAMEOF() { return getToken(CSharpParser.NAMEOF, 0); }
		public TerminalNode ON() { return getToken(CSharpParser.ON, 0); }
		public TerminalNode ORDERBY() { return getToken(CSharpParser.ORDERBY, 0); }
		public TerminalNode PARTIAL() { return getToken(CSharpParser.PARTIAL, 0); }
		public TerminalNode REMOVE() { return getToken(CSharpParser.REMOVE, 0); }
		public TerminalNode SELECT() { return getToken(CSharpParser.SELECT, 0); }
		public TerminalNode SET() { return getToken(CSharpParser.SET, 0); }
		public TerminalNode VAR() { return getToken(CSharpParser.VAR, 0); }
		public TerminalNode WHEN() { return getToken(CSharpParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(CSharpParser.WHERE, 0); }
		public TerminalNode YIELD() { return getToken(CSharpParser.YIELD, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSharpParserListener ) ((CSharpParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSharpParserVisitor ) return ((CSharpParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2454);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALIAS) | (1L << ARGLIST) | (1L << ASCENDING) | (1L << ASYNC) | (1L << AWAIT) | (1L << BY) | (1L << DESCENDING) | (1L << DYNAMIC) | (1L << EQUALS) | (1L << FROM) | (1L << GET) | (1L << GROUP) | (1L << INTO) | (1L << JOIN) | (1L << LET) | (1L << NAMEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (ON - 68)) | (1L << (ORDERBY - 68)) | (1L << (PARTIAL - 68)) | (1L << (REMOVE - 68)) | (1L << (SELECT - 68)) | (1L << (SET - 68)) | (1L << (VAR - 68)) | (1L << (WHEN - 68)) | (1L << (WHERE - 68)) | (1L << (YIELD - 68)) | (1L << (IDENTIFIER - 68)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 171:
			return right_arrow_sempred((Right_arrowContext)_localctx, predIndex);
		case 172:
			return right_shift_sempred((Right_shiftContext)_localctx, predIndex);
		case 173:
			return right_shift_assignment_sempred((Right_shift_assignmentContext)_localctx, predIndex);
		case 175:
			return tuple_type_element_list_sempred((Tuple_type_element_listContext)_localctx, predIndex);
		case 178:
			return tuple_literal_element_list_sempred((Tuple_literal_element_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean right_arrow_sempred(Right_arrowContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return (((Right_arrowContext)_localctx).first!=null?((Right_arrowContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_arrowContext)_localctx).second!=null?((Right_arrowContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}
	private boolean right_shift_sempred(Right_shiftContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return (((Right_shiftContext)_localctx).first!=null?((Right_shiftContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shiftContext)_localctx).second!=null?((Right_shiftContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}
	private boolean right_shift_assignment_sempred(Right_shift_assignmentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return (((Right_shift_assignmentContext)_localctx).first!=null?((Right_shift_assignmentContext)_localctx).first.getTokenIndex():0) + 1 == (((Right_shift_assignmentContext)_localctx).second!=null?((Right_shift_assignmentContext)_localctx).second.getTokenIndex():0);
		}
		return true;
	}
	private boolean tuple_type_element_list_sempred(Tuple_type_element_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean tuple_literal_element_list_sempred(Tuple_literal_element_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c2\u099b\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\3\2\5\2\u01a4\n\2\3\2\5\2\u01a7\n\2\3\2\5\2\u01aa\n\2\3\2\7\2\u01ad\n"+
		"\2\f\2\16\2\u01b0\13\2\3\2\5\2\u01b3\n\2\3\2\3\2\3\3\3\3\5\3\u01b9\n\3"+
		"\3\3\5\3\u01bc\n\3\3\3\3\3\3\3\5\3\u01c1\n\3\7\3\u01c3\n\3\f\3\16\3\u01c6"+
		"\13\3\3\4\3\4\3\4\3\4\7\4\u01cc\n\4\f\4\16\4\u01cf\13\4\3\4\5\4\u01d2"+
		"\n\4\3\5\3\5\3\5\3\5\5\5\u01d8\n\5\3\6\3\6\5\6\u01dc\n\6\3\7\3\7\3\7\5"+
		"\7\u01e1\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u01eb\n\n\3\13\3\13\3"+
		"\13\3\13\7\13\u01f1\n\13\f\13\16\13\u01f4\13\13\3\13\3\13\3\f\3\f\3\f"+
		"\7\f\u01fb\n\f\f\f\16\f\u01fe\13\f\3\r\3\r\3\r\5\r\u0203\n\r\3\r\5\r\u0206"+
		"\n\r\3\r\3\r\5\r\u020a\n\r\3\r\3\r\3\16\3\16\5\16\u0210\n\16\3\17\3\17"+
		"\3\17\5\17\u0215\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0226\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u022e\n\22\3\23\3\23\3\23\5\23\u0233\n\23\3\24\3\24\3\24\7\24\u0238"+
		"\n\24\f\24\16\24\u023b\13\24\3\25\3\25\3\25\7\25\u0240\n\25\f\25\16\25"+
		"\u0243\13\25\3\26\3\26\3\26\7\26\u0248\n\26\f\26\16\26\u024b\13\26\3\27"+
		"\3\27\3\27\7\27\u0250\n\27\f\27\16\27\u0253\13\27\3\30\3\30\3\30\7\30"+
		"\u0258\n\30\f\30\16\30\u025b\13\30\3\31\3\31\3\31\7\31\u0260\n\31\f\31"+
		"\16\31\u0263\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u026c\n\32"+
		"\f\32\16\32\u026f\13\32\3\33\3\33\3\33\5\33\u0274\n\33\3\33\7\33\u0277"+
		"\n\33\f\33\16\33\u027a\13\33\3\34\3\34\3\34\7\34\u027f\n\34\f\34\16\34"+
		"\u0282\13\34\3\35\3\35\3\35\7\35\u0287\n\35\f\35\16\35\u028a\13\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u02a4\n\36\3\37\3\37"+
		"\7\37\u02a8\n\37\f\37\16\37\u02ab\13\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u02b3\n\37\3\37\7\37\u02b6\n\37\f\37\16\37\u02b9\13\37\7\37\u02bb"+
		"\n\37\f\37\16\37\u02be\13\37\3 \3 \3 \5 \u02c3\n \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \5 \u02d1\n \3 \3 \3 \3 \5 \u02d7\n \3 \3 \3 \3 \3 \3"+
		" \3 \3 \7 \u02e1\n \f \16 \u02e4\13 \3 \5 \u02e7\n \3 \6 \u02ea\n \r "+
		"\16 \u02eb\3 \3 \5 \u02f0\n \3 \3 \3 \3 \5 \u02f6\n \3 \3 \3 \3 \3 \5"+
		" \u02fd\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u030f\n"+
		" \3 \5 \u0312\n \3 \3 \3 \5 \u0317\n \3 \5 \u031a\n \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \7 \u0327\n \f \16 \u032a\13 \3 \3 \3 \5 \u032f\n \3!"+
		"\5!\u0332\n!\3!\3!\3!\5!\u0337\n!\3\"\5\"\u033a\n\"\3\"\3\"\3\"\3\"\7"+
		"\"\u0340\n\"\f\"\16\"\u0343\13\"\3\"\3\"\3#\3#\3#\5#\u034a\n#\3#\3#\3"+
		"$\3$\3%\3%\3%\7%\u0353\n%\f%\16%\u0356\13%\3&\3&\5&\u035a\n&\3\'\3\'\3"+
		"\'\5\'\u035f\n\'\5\'\u0361\n\'\3\'\3\'\3(\3(\3(\7(\u0368\n(\f(\16(\u036b"+
		"\13(\3)\3)\3)\3)\3)\5)\u0372\n)\3)\3)\3)\3*\3*\5*\u0379\n*\3+\3+\3+\3"+
		"+\7+\u037f\n+\f+\16+\u0382\13+\3+\5+\u0385\n+\3+\3+\3,\3,\3,\3,\3,\5,"+
		"\u038e\n,\3-\3-\3-\5-\u0393\n-\5-\u0395\n-\3-\3-\3.\3.\3.\7.\u039c\n."+
		"\f.\16.\u039f\13.\3/\3/\3/\3/\3/\5/\u03a6\n/\3\60\3\60\5\60\u03aa\n\60"+
		"\3\60\3\60\3\60\5\60\u03af\n\60\5\60\u03b1\n\60\3\60\3\60\3\60\5\60\u03b6"+
		"\n\60\7\60\u03b8\n\60\f\60\16\60\u03bb\13\60\3\61\3\61\7\61\u03bf\n\61"+
		"\f\61\16\61\u03c2\13\61\3\61\3\61\3\62\3\62\3\62\7\62\u03c9\n\62\f\62"+
		"\16\62\u03cc\13\62\3\62\5\62\u03cf\n\62\3\63\5\63\u03d2\n\63\3\63\5\63"+
		"\u03d5\n\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\5\64\u03e6\n\64\3\65\3\65\3\65\7\65\u03eb\n\65\f\65\16"+
		"\65\u03ee\13\65\3\66\5\66\u03f1\n\66\3\66\3\66\3\66\3\67\3\67\3\67\7\67"+
		"\u03f9\n\67\f\67\16\67\u03fc\13\67\38\38\58\u0400\n8\39\39\39\3:\3:\5"+
		":\u0407\n:\3:\3:\3:\3:\3;\7;\u040e\n;\f;\16;\u0411\13;\3;\3;\5;\u0415"+
		"\n;\3<\3<\3<\3<\3<\5<\u041c\n<\3=\3=\3=\3=\3=\3>\3>\3>\3?\3?\5?\u0428"+
		"\n?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0433\n?\3@\3@\3@\3@\7@\u0439\n@\f@"+
		"\16@\u043c\13@\3A\3A\5A\u0440\nA\3B\3B\3B\3B\3B\3B\3B\5B\u0449\nB\3C\3"+
		"C\3C\3C\3D\3D\3D\5D\u0452\nD\3D\3D\3D\5D\u0457\nD\3E\3E\3E\3E\3F\3F\5"+
		"F\u045f\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u046c\nG\3G\3G\3G\3G\3"+
		"G\3G\7G\u0474\nG\fG\16G\u0477\13G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\5G\u048c\nG\3G\3G\5G\u0490\nG\3G\3G\5G\u0494\nG"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u04aa"+
		"\nG\3G\3G\3G\5G\u04af\nG\3G\3G\3G\5G\u04b4\nG\3G\3G\3G\3G\3G\5G\u04bb"+
		"\nG\3G\5G\u04be\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\5G\u04d4\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u04e0\nG\3H\3H"+
		"\5H\u04e4\nH\3H\3H\3I\3I\3I\3I\7I\u04ec\nI\fI\16I\u04ef\13I\3J\3J\5J\u04f3"+
		"\nJ\3K\3K\3K\5K\u04f8\nK\3L\3L\3L\5L\u04fd\nL\3M\3M\3M\3M\3N\3N\5N\u0505"+
		"\nN\3O\6O\u0508\nO\rO\16O\u0509\3O\3O\3P\3P\3P\3P\3P\3P\5P\u0514\nP\3"+
		"Q\6Q\u0517\nQ\rQ\16Q\u0518\3R\3R\3R\3R\7R\u051f\nR\fR\16R\u0522\13R\5"+
		"R\u0524\nR\3S\3S\3S\7S\u0529\nS\fS\16S\u052c\13S\3T\3T\7T\u0530\nT\fT"+
		"\16T\u0533\13T\3T\5T\u0536\nT\3T\5T\u0539\nT\3U\3U\3U\3U\5U\u053f\nU\3"+
		"U\3U\5U\u0543\nU\3U\3U\3V\3V\5V\u0549\nV\3V\3V\3W\3W\3W\3W\3W\3X\3X\3"+
		"X\3Y\3Y\5Y\u0557\nY\3Z\3Z\3Z\3Z\5Z\u055d\nZ\3[\3[\3[\7[\u0562\n[\f[\16"+
		"[\u0565\13[\3\\\3\\\5\\\u0569\n\\\3\\\5\\\u056c\n\\\3\\\5\\\u056f\n\\"+
		"\3\\\3\\\3]\6]\u0574\n]\r]\16]\u0575\3^\3^\3^\3^\3^\3_\6_\u057e\n_\r_"+
		"\16_\u057f\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u0591\n`\3"+
		"a\6a\u0594\na\ra\16a\u0595\3b\3b\5b\u059a\nb\3c\5c\u059d\nc\3c\5c\u05a0"+
		"\nc\3c\3c\3c\3c\3c\5c\u05a7\nc\3d\3d\3d\3d\5d\u05ad\nd\3e\3e\3e\3e\7e"+
		"\u05b3\ne\fe\16e\u05b6\13e\3e\3e\3f\5f\u05bb\nf\3f\3f\3g\3g\3g\3g\7g\u05c3"+
		"\ng\fg\16g\u05c6\13g\3h\3h\3h\7h\u05cb\nh\fh\16h\u05ce\13h\3i\6i\u05d1"+
		"\ni\ri\16i\u05d2\3j\3j\3j\3j\3j\3k\3k\3k\3k\5k\u05de\nk\3k\3k\5k\u05e2"+
		"\nk\5k\u05e4\nk\3l\3l\3l\5l\u05e9\nl\3m\3m\3m\7m\u05ee\nm\fm\16m\u05f1"+
		"\13m\3n\3n\3n\3n\3o\3o\5o\u05f9\no\3o\3o\3p\6p\u05fe\np\rp\16p\u05ff\3"+
		"q\5q\u0603\nq\3q\5q\u0606\nq\3q\3q\5q\u060a\nq\3r\6r\u060d\nr\rr\16r\u060e"+
		"\3s\3s\3t\3t\3t\3t\3t\3t\3t\3t\3t\5t\u061c\nt\3t\3t\3t\3t\3t\3t\3t\3t"+
		"\5t\u0626\nt\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\5u\u0632\nu\3v\3v\3v\7v\u0637"+
		"\nv\fv\16v\u063a\13v\3w\3w\3w\3w\3x\3x\3x\7x\u0643\nx\fx\16x\u0646\13"+
		"x\3y\3y\3y\5y\u064b\ny\3z\3z\3z\3z\3z\5z\u0652\nz\3z\3z\3z\3z\5z\u0658"+
		"\nz\3{\3{\5{\u065c\n{\3|\3|\3}\3}\5}\u0662\n}\3~\3~\3~\3~\5~\u0668\n~"+
		"\5~\u066a\n~\3\177\3\177\3\177\7\177\u066f\n\177\f\177\16\177\u0672\13"+
		"\177\3\u0080\5\u0080\u0675\n\u0080\3\u0080\5\u0080\u0678\n\u0080\3\u0080"+
		"\3\u0080\5\u0080\u067c\n\u0080\3\u0081\3\u0081\3\u0082\5\u0082\u0681\n"+
		"\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\5\u0083\u0688\n\u0083\3"+
		"\u0083\5\u0083\u068b\n\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0690\n\u0083"+
		"\3\u0083\3\u0083\3\u0083\5\u0083\u0695\n\u0083\5\u0083\u0697\n\u0083\3"+
		"\u0084\5\u0084\u069a\n\u0084\3\u0084\5\u0084\u069d\n\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0085\5\u0085\u06a3\n\u0085\3\u0085\5\u0085\u06a6\n\u0085\3"+
		"\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\5\u0086\u06b2\n\u0086\3\u0087\3\u0087\5\u0087\u06b6\n\u0087\3"+
		"\u0088\5\u0088\u06b9\n\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3"+
		"\u0088\3\u0088\3\u0088\5\u0088\u06c3\n\u0088\3\u0089\5\u0089\u06c6\n\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u008a\5\u008a\u06cc\n\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u06e7\n\u008b\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\5\u008d\u06f4\n\u008d\3\u008d\3\u008d\3\u008e\3\u008e\5\u008e"+
		"\u06fa\n\u008e\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\7\u0090\u0701\n"+
		"\u0090\f\u0090\16\u0090\u0704\13\u0090\3\u0090\3\u0090\3\u0091\5\u0091"+
		"\u0709\n\u0091\3\u0091\5\u0091\u070c\n\u0091\3\u0091\3\u0091\3\u0091\3"+
		"\u0091\6\u0091\u0712\n\u0091\r\u0091\16\u0091\u0713\3\u0091\3\u0091\5"+
		"\u0091\u0718\n\u0091\3\u0092\3\u0092\7\u0092\u071c\n\u0092\f\u0092\16"+
		"\u0092\u071f\13\u0092\3\u0092\6\u0092\u0722\n\u0092\r\u0092\16\u0092\u0723"+
		"\3\u0093\3\u0093\7\u0093\u0728\n\u0093\f\u0093\16\u0093\u072b\13\u0093"+
		"\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094\u0733\n\u0094"+
		"\f\u0094\16\u0094\u0736\13\u0094\3\u0094\5\u0094\u0739\n\u0094\5\u0094"+
		"\u073b\n\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\7\u0095"+
		"\u0743\n\u0095\f\u0095\16\u0095\u0746\13\u0095\3\u0095\3\u0095\3\u0096"+
		"\5\u0096\u074b\n\u0096\3\u0096\5\u0096\u074e\n\u0096\3\u0096\3\u0096\3"+
		"\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\7\u0099\u0759\n"+
		"\u0099\f\u0099\16\u0099\u075c\13\u0099\3\u0099\3\u0099\3\u009a\5\u009a"+
		"\u0761\n\u009a\3\u009a\5\u009a\u0764\n\u009a\3\u009a\5\u009a\u0767\n\u009a"+
		"\3\u009a\3\u009a\3\u009a\5\u009a\u076c\n\u009a\3\u009a\3\u009a\5\u009a"+
		"\u0770\n\u009a\3\u009a\3\u009a\5\u009a\u0774\n\u009a\3\u009a\3\u009a\3"+
		"\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\5\u009a\u078a\n\u009a\3\u009a\5\u009a\u078d\n\u009a\3\u009a\3\u009a\3"+
		"\u009a\5\u009a\u0792\n\u009a\3\u009a\3\u009a\5\u009a\u0796\n\u009a\3\u009a"+
		"\3\u009a\5\u009a\u079a\n\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\5\u009a\u07a3\n\u009a\3\u009b\5\u009b\u07a6\n\u009b\3"+
		"\u009b\3\u009b\3\u009b\5\u009b\u07ab\n\u009b\3\u009b\3\u009b\5\u009b\u07af"+
		"\n\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u07b4\n\u009b\3\u009b\3\u009b"+
		"\5\u009b\u07b8\n\u009b\5\u009b\u07ba\n\u009b\3\u009c\3\u009c\3\u009c\3"+
		"\u009d\3\u009d\3\u009d\3\u009d\7\u009d\u07c3\n\u009d\f\u009d\16\u009d"+
		"\u07c6\13\u009d\3\u009d\5\u009d\u07c9\n\u009d\5\u009d\u07cb\n\u009d\3"+
		"\u009d\3\u009d\3\u009e\5\u009e\u07d0\n\u009e\3\u009e\3\u009e\3\u009e\5"+
		"\u009e\u07d5\n\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u07dc"+
		"\n\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\5\u00a0\u07e2\n\u00a0\3\u00a1"+
		"\6\u00a1\u07e5\n\u00a1\r\u00a1\16\u00a1\u07e6\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\5\u00a2\u07ed\n\u00a2\3\u00a2\3\u00a2\5\u00a2\u07f1\n\u00a2\3"+
		"\u00a2\3\u00a2\3\u00a3\3\u00a3\5\u00a3\u07f7\n\u00a3\3\u00a4\3\u00a4\3"+
		"\u00a4\7\u00a4\u07fc\n\u00a4\f\u00a4\16\u00a4\u07ff\13\u00a4\3\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\3\u00a5\7\u00a5\u0806\n\u00a5\f\u00a5\16\u00a5"+
		"\u0809\13\u00a5\5\u00a5\u080b\n\u00a5\3\u00a5\5\u00a5\u080e\n\u00a5\3"+
		"\u00a6\3\u00a6\3\u00a6\5\u00a6\u0813\n\u00a6\3\u00a6\3\u00a6\3\u00a7\3"+
		"\u00a7\5\u00a7\u0819\n\u00a7\3\u00a7\3\u00a7\7\u00a7\u081d\n\u00a7\f\u00a7"+
		"\16\u00a7\u0820\13\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u0826"+
		"\n\u00a7\3\u00a8\3\u00a8\3\u00a8\7\u00a8\u082b\n\u00a8\f\u00a8\16\u00a8"+
		"\u082e\13\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00aa\5\u00aa\u0835"+
		"\n\u00aa\3\u00aa\3\u00aa\5\u00aa\u0839\n\u00aa\3\u00ab\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af"+
		"\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\7\u00b1\u085e\n\u00b1\f\u00b1"+
		"\16\u00b1\u0861\13\u00b1\3\u00b2\3\u00b2\5\u00b2\u0865\n\u00b2\3\u00b2"+
		"\5\u00b2\u0868\n\u00b2\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\7\u00b4\u0876\n\u00b4"+
		"\f\u00b4\16\u00b4\u0879\13\u00b4\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u087e"+
		"\n\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\5\u00b6\u0889\n\u00b6\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b8\5\u00b8\u0891\n\u00b8\3\u00b9\3\u00b9\7\u00b9\u0895\n\u00b9\f"+
		"\u00b9\16\u00b9\u0898\13\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba\7\u00ba"+
		"\u089e\n\u00ba\f\u00ba\16\u00ba\u08a1\13\u00ba\3\u00ba\3\u00ba\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u08a9\n\u00bb\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\5\u00bc\u08af\n\u00bc\3\u00bd\3\u00bd\3\u00bd\7\u00bd\u08b4\n"+
		"\u00bd\f\u00bd\16\u00bd\u08b7\13\u00bd\3\u00bd\3\u00bd\6\u00bd\u08bb\n"+
		"\u00bd\r\u00bd\16\u00bd\u08bc\5\u00bd\u08bf\n\u00bd\3\u00be\3\u00be\3"+
		"\u00bf\3\u00bf\3\u00bf\5\u00bf\u08c6\n\u00bf\3\u00bf\5\u00bf\u08c9\n\u00bf"+
		"\3\u00bf\5\u00bf\u08cc\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u08d0\n\u00bf\3"+
		"\u00c0\3\u00c0\3\u00c0\5\u00c0\u08d5\n\u00c0\3\u00c0\5\u00c0\u08d8\n\u00c0"+
		"\3\u00c0\5\u00c0\u08db\n\u00c0\3\u00c0\3\u00c0\5\u00c0\u08df\n\u00c0\3"+
		"\u00c1\3\u00c1\3\u00c1\5\u00c1\u08e4\n\u00c1\3\u00c1\5\u00c1\u08e7\n\u00c1"+
		"\3\u00c1\5\u00c1\u08ea\n\u00c1\3\u00c1\3\u00c1\5\u00c1\u08ee\n\u00c1\3"+
		"\u00c2\3\u00c2\3\u00c2\5\u00c2\u08f3\n\u00c2\3\u00c2\3\u00c2\5\u00c2\u08f7"+
		"\n\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u08fd\n\u00c3\3\u00c3"+
		"\3\u00c3\5\u00c3\u0901\n\u00c3\3\u00c3\3\u00c3\5\u00c3\u0905\n\u00c3\3"+
		"\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u0913\n\u00c4\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6"+
		"\u0920\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0926\n\u00c6\3"+
		"\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8"+
		"\u0939\n\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00ca"+
		"\3\u00ca\3\u00ca\5\u00ca\u0944\n\u00ca\3\u00ca\3\u00ca\5\u00ca\u0948\n"+
		"\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u094f\n\u00ca\3"+
		"\u00cb\3\u00cb\5\u00cb\u0953\n\u00cb\3\u00cb\3\u00cb\5\u00cb\u0957\n\u00cb"+
		"\3\u00cb\3\u00cb\5\u00cb\u095b\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\5\u00cb\u0962\n\u00cb\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\5\u00cc\u0969\n\u00cc\3\u00cc\5\u00cc\u096c\n\u00cc\3\u00cc\3\u00cc\7"+
		"\u00cc\u0970\n\u00cc\f\u00cc\16\u00cc\u0973\13\u00cc\3\u00cd\3\u00cd\3"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u097b\n\u00cd\3\u00cd\3\u00cd\3"+
		"\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0983\n\u00cd\3\u00ce\3\u00ce\3"+
		"\u00ce\3\u00ce\5\u00ce\u0989\n\u00ce\3\u00cf\3\u00cf\5\u00cf\u098d\n\u00cf"+
		"\3\u00cf\3\u00cf\3\u00d0\3\u00d0\5\u00d0\u0993\n\u00d0\3\u00d0\3\u00d0"+
		"\5\u00d0\u0997\n\u00d0\3\u00d1\3\u00d1\3\u00d1\2\4\u0160\u0166\u00d2\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e"+
		"\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166"+
		"\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e"+
		"\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196"+
		"\u0198\u019a\u019c\u019e\u01a0\2\24\n\2\26\26\31\3188@@TTXXdehh\4\2##"+
		"..\4\2IIQQ\3\2\u009b\u009c\4\2\u0091\u0092\u009d\u009e\3\2\u0086\u0087"+
		"\3\2\u0088\u008a\20\2\23\23\26\26\31\31\36\36##..88@@EETTXX\\\\dehh\4"+
		"\2\17\17!!\16\2\n\n\20\20**::CCJJLPUU[[ggkkmm\6\2\67\67IIQQ__\4\2))\66"+
		"\66\4\2\22\22__\4\2\u0088\u0088\u0093\u0093\4\2\67\67II\4\2++aa\25\2\n"+
		"\n\16\16\22\24\26 \"#%&(\60\63\63\65:<<?@BEGGIKMQSUXikmpp\25\2\13\r\17"+
		"\21\25\25!!$$\'\'\61\62\64\64;;=>AAFFHHLLRRVWjjnoqr\2\u0a81\2\u01a3\3"+
		"\2\2\2\4\u01bb\3\2\2\2\6\u01d1\3\2\2\2\b\u01d7\3\2\2\2\n\u01db\3\2\2\2"+
		"\f\u01e0\3\2\2\2\16\u01e2\3\2\2\2\20\u01e4\3\2\2\2\22\u01ea\3\2\2\2\24"+
		"\u01ec\3\2\2\2\26\u01f7\3\2\2\2\30\u0202\3\2\2\2\32\u020f\3\2\2\2\34\u0214"+
		"\3\2\2\2\36\u0216\3\2\2\2 \u0225\3\2\2\2\"\u0227\3\2\2\2$\u022f\3\2\2"+
		"\2&\u0234\3\2\2\2(\u023c\3\2\2\2*\u0244\3\2\2\2,\u024c\3\2\2\2.\u0254"+
		"\3\2\2\2\60\u025c\3\2\2\2\62\u0264\3\2\2\2\64\u0270\3\2\2\2\66\u027b\3"+
		"\2\2\28\u0283\3\2\2\2:\u02a3\3\2\2\2<\u02a5\3\2\2\2>\u032e\3\2\2\2@\u0331"+
		"\3\2\2\2B\u0339\3\2\2\2D\u0349\3\2\2\2F\u034d\3\2\2\2H\u034f\3\2\2\2J"+
		"\u0359\3\2\2\2L\u035b\3\2\2\2N\u0364\3\2\2\2P\u0371\3\2\2\2R\u0378\3\2"+
		"\2\2T\u037a\3\2\2\2V\u038d\3\2\2\2X\u038f\3\2\2\2Z\u0398\3\2\2\2\\\u03a5"+
		"\3\2\2\2^\u03a7\3\2\2\2`\u03bc\3\2\2\2b\u03c5\3\2\2\2d\u03d1\3\2\2\2f"+
		"\u03e5\3\2\2\2h\u03e7\3\2\2\2j\u03f0\3\2\2\2l\u03f5\3\2\2\2n\u03ff\3\2"+
		"\2\2p\u0401\3\2\2\2r\u0404\3\2\2\2t\u040f\3\2\2\2v\u041b\3\2\2\2x\u041d"+
		"\3\2\2\2z\u0422\3\2\2\2|\u0425\3\2\2\2~\u0434\3\2\2\2\u0080\u043d\3\2"+
		"\2\2\u0082\u0448\3\2\2\2\u0084\u044a\3\2\2\2\u0086\u0456\3\2\2\2\u0088"+
		"\u0458\3\2\2\2\u008a\u045e\3\2\2\2\u008c\u04df\3\2\2\2\u008e\u04e1\3\2"+
		"\2\2\u0090\u04e7\3\2\2\2\u0092\u04f2\3\2\2\2\u0094\u04f4\3\2\2\2\u0096"+
		"\u04fc\3\2\2\2\u0098\u04fe\3\2\2\2\u009a\u0504\3\2\2\2\u009c\u0507\3\2"+
		"\2\2\u009e\u0513\3\2\2\2\u00a0\u0516\3\2\2\2\u00a2\u0523\3\2\2\2\u00a4"+
		"\u0525\3\2\2\2\u00a6\u0538\3\2\2\2\u00a8\u053a\3\2\2\2\u00aa\u0546\3\2"+
		"\2\2\u00ac\u054c\3\2\2\2\u00ae\u0551\3\2\2\2\u00b0\u0556\3\2\2\2\u00b2"+
		"\u0558\3\2\2\2\u00b4\u055e\3\2\2\2\u00b6\u0566\3\2\2\2\u00b8\u0573\3\2"+
		"\2\2\u00ba\u0577\3\2\2\2\u00bc\u057d\3\2\2\2\u00be\u0590\3\2\2\2\u00c0"+
		"\u0593\3\2\2\2\u00c2\u0599\3\2\2\2\u00c4\u059c\3\2\2\2\u00c6\u05a8\3\2"+
		"\2\2\u00c8\u05ae\3\2\2\2\u00ca\u05ba\3\2\2\2\u00cc\u05be\3\2\2\2\u00ce"+
		"\u05c7\3\2\2\2\u00d0\u05d0\3\2\2\2\u00d2\u05d4\3\2\2\2\u00d4\u05e3\3\2"+
		"\2\2\u00d6\u05e8\3\2\2\2\u00d8\u05ea\3\2\2\2\u00da\u05f2\3\2\2\2\u00dc"+
		"\u05f6\3\2\2\2\u00de\u05fd\3\2\2\2\u00e0\u0602\3\2\2\2\u00e2\u060c\3\2"+
		"\2\2\u00e4\u0610\3\2\2\2\u00e6\u0625\3\2\2\2\u00e8\u0627\3\2\2\2\u00ea"+
		"\u0633\3\2\2\2\u00ec\u063b\3\2\2\2\u00ee\u063f\3\2\2\2\u00f0\u0647\3\2"+
		"\2\2\u00f2\u0657\3\2\2\2\u00f4\u065b\3\2\2\2\u00f6\u065d\3\2\2\2\u00f8"+
		"\u0661\3\2\2\2\u00fa\u0669\3\2\2\2\u00fc\u066b\3\2\2\2\u00fe\u067b\3\2"+
		"\2\2\u0100\u067d\3\2\2\2\u0102\u0680\3\2\2\2\u0104\u0687\3\2\2\2\u0106"+
		"\u0699\3\2\2\2\u0108\u06a2\3\2\2\2\u010a\u06b1\3\2\2\2\u010c\u06b5\3\2"+
		"\2\2\u010e\u06b8\3\2\2\2\u0110\u06c5\3\2\2\2\u0112\u06cb\3\2\2\2\u0114"+
		"\u06e6\3\2\2\2\u0116\u06e8\3\2\2\2\u0118\u06ef\3\2\2\2\u011a\u06f9\3\2"+
		"\2\2\u011c\u06fb\3\2\2\2\u011e\u06fe\3\2\2\2\u0120\u0708\3\2\2\2\u0122"+
		"\u0719\3\2\2\2\u0124\u0725\3\2\2\2\u0126\u072e\3\2\2\2\u0128\u073e\3\2"+
		"\2\2\u012a\u074a\3\2\2\2\u012c\u0751\3\2\2\2\u012e\u0753\3\2\2\2\u0130"+
		"\u0756\3\2\2\2\u0132\u0760\3\2\2\2\u0134\u07a5\3\2\2\2\u0136\u07bb\3\2"+
		"\2\2\u0138\u07be\3\2\2\2\u013a\u07cf\3\2\2\2\u013c\u07d6\3\2\2\2\u013e"+
		"\u07e1\3\2\2\2\u0140\u07e4\3\2\2\2\u0142\u07e8\3\2\2\2\u0144\u07f6\3\2"+
		"\2\2\u0146\u07f8\3\2\2\2\u0148\u0800\3\2\2\2\u014a\u0812\3\2\2\2\u014c"+
		"\u0825\3\2\2\2\u014e\u0827\3\2\2\2\u0150\u082f\3\2\2\2\u0152\u0838\3\2"+
		"\2\2\u0154\u083a\3\2\2\2\u0156\u083f\3\2\2\2\u0158\u0845\3\2\2\2\u015a"+
		"\u0849\3\2\2\2\u015c\u084d\3\2\2\2\u015e\u0851\3\2\2\2\u0160\u0855\3\2"+
		"\2\2\u0162\u0864\3\2\2\2\u0164\u0869\3\2\2\2\u0166\u086d\3\2\2\2\u0168"+
		"\u087d\3\2\2\2\u016a\u0888\3\2\2\2\u016c\u088a\3\2\2\2\u016e\u0890\3\2"+
		"\2\2\u0170\u0892\3\2\2\2\u0172\u089b\3\2\2\2\u0174\u08a8\3\2\2\2\u0176"+
		"\u08ae\3\2\2\2\u0178\u08b0\3\2\2\2\u017a\u08c0\3\2\2\2\u017c\u08c2\3\2"+
		"\2\2\u017e\u08d1\3\2\2\2\u0180\u08e0\3\2\2\2\u0182\u08ef\3\2\2\2\u0184"+
		"\u08f8\3\2\2\2\u0186\u0908\3\2\2\2\u0188\u0914\3\2\2\2\u018a\u0917\3\2"+
		"\2\2\u018c\u0927\3\2\2\2\u018e\u092c\3\2\2\2\u0190\u093a\3\2\2\2\u0192"+
		"\u0940\3\2\2\2\u0194\u0950\3\2\2\2\u0196\u0968\3\2\2\2\u0198\u0974\3\2"+
		"\2\2\u019a\u0984\3\2\2\2\u019c\u098a\3\2\2\2\u019e\u0990\3\2\2\2\u01a0"+
		"\u0998\3\2\2\2\u01a2\u01a4\7\3\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a7\5\u00b8]\2\u01a6\u01a5\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01aa\5\u00bc_\2\u01a9\u01a8"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ae\3\2\2\2\u01ab\u01ad\5\u013c\u009f"+
		"\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af"+
		"\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b3\5\u00c0a"+
		"\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5"+
		"\7\2\2\3\u01b5\3\3\2\2\2\u01b6\u01b8\5\u01a0\u00d1\2\u01b7\u01b9\5\24"+
		"\13\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01bc\5\u00c6d\2\u01bb\u01b6\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01c4"+
		"\3\2\2\2\u01bd\u01be\7\u0082\2\2\u01be\u01c0\5\u01a0\u00d1\2\u01bf\u01c1"+
		"\5\24\13\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2"+
		"\u01c2\u01bd\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5"+
		"\3\2\2\2\u01c5\5\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01cd\5\b\5\2\u01c8"+
		"\u01cc\7\u0093\2\2\u01c9\u01cc\5\u0124\u0093\2\u01ca\u01cc\7\u0088\2\2"+
		"\u01cb\u01c8\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf"+
		"\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d2\3\2\2\2\u01cf"+
		"\u01cd\3\2\2\2\u01d0\u01d2\5\u015e\u00b0\2\u01d1\u01c7\3\2\2\2\u01d1\u01d0"+
		"\3\2\2\2\u01d2\7\3\2\2\2\u01d3\u01d8\5\n\6\2\u01d4\u01d8\5\22\n\2\u01d5"+
		"\u01d6\7l\2\2\u01d6\u01d8\7\u0088\2\2\u01d7\u01d3\3\2\2\2\u01d7\u01d4"+
		"\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\t\3\2\2\2\u01d9\u01dc\5\f\7\2\u01da"+
		"\u01dc\7\23\2\2\u01db\u01d9\3\2\2\2\u01db\u01da\3\2\2\2\u01dc\13\3\2\2"+
		"\2\u01dd\u01e1\5\16\b\2\u01de\u01e1\5\20\t\2\u01df\u01e1\7\36\2\2\u01e0"+
		"\u01dd\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1\r\3\2\2\2"+
		"\u01e2\u01e3\t\2\2\2\u01e3\17\3\2\2\2\u01e4\u01e5\t\3\2\2\u01e5\21\3\2"+
		"\2\2\u01e6\u01eb\5\4\3\2\u01e7\u01eb\7E\2\2\u01e8\u01eb\7$\2\2\u01e9\u01eb"+
		"\7\\\2\2\u01ea\u01e6\3\2\2\2\u01ea\u01e7\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea"+
		"\u01e9\3\2\2\2\u01eb\23\3\2\2\2\u01ec\u01ed\7\u0091\2\2\u01ed\u01f2\5"+
		"\6\4\2\u01ee\u01ef\7\u0083\2\2\u01ef\u01f1\5\6\4\2\u01f0\u01ee\3\2\2\2"+
		"\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5"+
		"\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\7\u0092\2\2\u01f6\25\3\2\2\2"+
		"\u01f7\u01fc\5\30\r\2\u01f8\u01f9\7\u0083\2\2\u01f9\u01fb\5\30\r\2\u01fa"+
		"\u01f8\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2"+
		"\2\2\u01fd\27\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\5\u01a0\u00d1\2"+
		"\u0200\u0201\7\u0084\2\2\u0201\u0203\3\2\2\2\u0202\u01ff\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0206\t\4\2\2\u0205\u0204\3\2"+
		"\2\2\u0205\u0206\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u020a\7j\2\2\u0208"+
		"\u020a\5\6\4\2\u0209\u0207\3\2\2\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2"+
		"\2\2\u020a\u020b\3\2\2\2\u020b\u020c\5\32\16\2\u020c\31\3\2\2\2\u020d"+
		"\u0210\5\36\20\2\u020e\u0210\5\34\17\2\u020f\u020d\3\2\2\2\u020f\u020e"+
		"\3\2\2\2\u0210\33\3\2\2\2\u0211\u0215\5d\63\2\u0212\u0215\5p9\2\u0213"+
		"\u0215\5\"\22\2\u0214\u0211\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0213\3"+
		"\2\2\2\u0215\35\3\2\2\2\u0216\u0217\5:\36\2\u0217\u0218\5 \21\2\u0218"+
		"\u0219\5\32\16\2\u0219\37\3\2\2\2\u021a\u0226\7\u0090\2\2\u021b\u0226"+
		"\7\u009f\2\2\u021c\u0226\7\u00a0\2\2\u021d\u0226\7\u00a1\2\2\u021e\u0226"+
		"\7\u00a2\2\2\u021f\u0226\7\u00a3\2\2\u0220\u0226\7\u00a4\2\2\u0221\u0226"+
		"\7\u00a5\2\2\u0222\u0226\7\u00a6\2\2\u0223\u0226\7\u00a8\2\2\u0224\u0226"+
		"\5\u015c\u00af\2\u0225\u021a\3\2\2\2\u0225\u021b\3\2\2\2\u0225\u021c\3"+
		"\2\2\2\u0225\u021d\3\2\2\2\u0225\u021e\3\2\2\2\u0225\u021f\3\2\2\2\u0225"+
		"\u0220\3\2\2\2\u0225\u0221\3\2\2\2\u0225\u0222\3\2\2\2\u0225\u0223\3\2"+
		"\2\2\u0225\u0224\3\2\2\2\u0226!\3\2\2\2\u0227\u022d\5$\23\2\u0228\u0229"+
		"\7\u0093\2\2\u0229\u022a\5\32\16\2\u022a\u022b\7\u0084\2\2\u022b\u022c"+
		"\5\32\16\2\u022c\u022e\3\2\2\2\u022d\u0228\3\2\2\2\u022d\u022e\3\2\2\2"+
		"\u022e#\3\2\2\2\u022f\u0232\5&\24\2\u0230\u0231\7\u0095\2\2\u0231\u0233"+
		"\5$\23\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233%\3\2\2\2\u0234"+
		"\u0239\5(\25\2\u0235\u0236\7\u0099\2\2\u0236\u0238\5(\25\2\u0237\u0235"+
		"\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\'\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u0241\5*\26\2\u023d\u023e\7\u0098"+
		"\2\2\u023e\u0240\5*\26\2\u023f\u023d\3\2\2\2\u0240\u0243\3\2\2\2\u0241"+
		"\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242)\3\2\2\2\u0243\u0241\3\2\2\2"+
		"\u0244\u0249\5,\27\2\u0245\u0246\7\u008c\2\2\u0246\u0248\5,\27\2\u0247"+
		"\u0245\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2"+
		"\2\2\u024a+\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u0251\5.\30\2\u024d\u024e"+
		"\7\u008d\2\2\u024e\u0250\5.\30\2\u024f\u024d\3\2\2\2\u0250\u0253\3\2\2"+
		"\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252-\3\2\2\2\u0253\u0251"+
		"\3\2\2\2\u0254\u0259\5\60\31\2\u0255\u0256\7\u008b\2\2\u0256\u0258\5\60"+
		"\31\2\u0257\u0255\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a/\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u0261\5\62\32"+
		"\2\u025d\u025e\t\5\2\2\u025e\u0260\5\62\32\2\u025f\u025d\3\2\2\2\u0260"+
		"\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\61\3\2\2"+
		"\2\u0263\u0261\3\2\2\2\u0264\u026d\5\64\33\2\u0265\u0266\t\6\2\2\u0266"+
		"\u026c\5\64\33\2\u0267\u0268\7<\2\2\u0268\u026c\5b\62\2\u0269\u026a\7"+
		"\16\2\2\u026a\u026c\5\6\4\2\u026b\u0265\3\2\2\2\u026b\u0267\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2"+
		"\2\2\u026e\63\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0278\5\66\34\2\u0271"+
		"\u0274\7\u00a7\2\2\u0272\u0274\5\u015a\u00ae\2\u0273\u0271\3\2\2\2\u0273"+
		"\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0277\5\66\34\2\u0276\u0273\3"+
		"\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\65\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u0280\58\35\2\u027c\u027d\t\7\2"+
		"\2\u027d\u027f\58\35\2\u027e\u027c\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e"+
		"\3\2\2\2\u0280\u0281\3\2\2\2\u0281\67\3\2\2\2\u0282\u0280\3\2\2\2\u0283"+
		"\u0288\5:\36\2\u0284\u0285\t\b\2\2\u0285\u0287\5:\36\2\u0286\u0284\3\2"+
		"\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"9\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u02a4\5<\37\2\u028c\u028d\7\u0086"+
		"\2\2\u028d\u02a4\5:\36\2\u028e\u028f\7\u0087\2\2\u028f\u02a4\5:\36\2\u0290"+
		"\u0291\7\u008e\2\2\u0291\u02a4\5:\36\2\u0292\u0293\7\u008f\2\2\u0293\u02a4"+
		"\5:\36\2\u0294\u0295\7\u0096\2\2\u0295\u02a4\5:\36\2\u0296\u0297\7\u0097"+
		"\2\2\u0297\u02a4\5:\36\2\u0298\u0299\7\u0080\2\2\u0299\u029a\5\6\4\2\u029a"+
		"\u029b\7\u0081\2\2\u029b\u029c\5:\36\2\u029c\u02a4\3\2\2\2\u029d\u029e"+
		"\7\21\2\2\u029e\u02a4\5:\36\2\u029f\u02a0\7\u008b\2\2\u02a0\u02a4\5:\36"+
		"\2\u02a1\u02a2\7\u0088\2\2\u02a2\u02a4\5:\36\2\u02a3\u028b\3\2\2\2\u02a3"+
		"\u028c\3\2\2\2\u02a3\u028e\3\2\2\2\u02a3\u0290\3\2\2\2\u02a3\u0292\3\2"+
		"\2\2\u02a3\u0294\3\2\2\2\u02a3\u0296\3\2\2\2\u02a3\u0298\3\2\2\2\u02a3"+
		"\u029d\3\2\2\2\u02a3\u029f\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4;\3\2\2\2"+
		"\u02a5\u02a9\5> \2\u02a6\u02a8\5B\"\2\u02a7\u02a6\3\2\2\2\u02a8\u02ab"+
		"\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02bc\3\2\2\2\u02ab"+
		"\u02a9\3\2\2\2\u02ac\u02b3\5@!\2\u02ad\u02b3\5\u019c\u00cf\2\u02ae\u02b3"+
		"\7\u0096\2\2\u02af\u02b3\7\u0097\2\2\u02b0\u02b1\7\u009a\2\2\u02b1\u02b3"+
		"\5\u01a0\u00d1\2\u02b2\u02ac\3\2\2\2\u02b2\u02ad\3\2\2\2\u02b2\u02ae\3"+
		"\2\2\2\u02b2\u02af\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b3\u02b7\3\2\2\2\u02b4"+
		"\u02b6\5B\"\2\u02b5\u02b4\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2"+
		"\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba"+
		"\u02b2\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2"+
		"\2\2\u02bd=\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u032f\5\u016a\u00b6\2\u02c0"+
		"\u02c2\5\u01a0\u00d1\2\u02c1\u02c3\5\24\13\2\u02c2\u02c1\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u032f\3\2\2\2\u02c4\u02c5\7\u0080\2\2\u02c5\u02c6"+
		"\5\32\16\2\u02c6\u02c7\7\u0081\2\2\u02c7\u032f\3\2\2\2\u02c8\u032f\5F"+
		"$\2\u02c9\u032f\5\u00c6d\2\u02ca\u032f\7s\2\2\u02cb\u032f\7_\2\2\u02cc"+
		"\u02d6\7\22\2\2\u02cd\u02ce\7\u0082\2\2\u02ce\u02d0\5\u01a0\u00d1\2\u02cf"+
		"\u02d1\5\24\13\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d7\3"+
		"\2\2\2\u02d2\u02d3\7~\2\2\u02d3\u02d4\5H%\2\u02d4\u02d5\7\177\2\2\u02d5"+
		"\u02d7\3\2\2\2\u02d6\u02cd\3\2\2\2\u02d6\u02d2\3\2\2\2\u02d7\u032f\3\2"+
		"\2\2\u02d8\u02f5\7C\2\2\u02d9\u02ef\5\6\4\2\u02da\u02f0\5\u019e\u00d0"+
		"\2\u02db\u02f0\5J&\2\u02dc\u02dd\7~\2\2\u02dd\u02de\5H%\2\u02de\u02e2"+
		"\7\177\2\2\u02df\u02e1\5\u0124\u0093\2\u02e0\u02df\3\2\2\2\u02e1\u02e4"+
		"\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4"+
		"\u02e2\3\2\2\2\u02e5\u02e7\5\u0126\u0094\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7"+
		"\3\2\2\2\u02e7\u02f0\3\2\2\2\u02e8\u02ea\5\u0124\u0093\2\u02e9\u02e8\3"+
		"\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec"+
		"\u02ed\3\2\2\2\u02ed\u02ee\5\u0126\u0094\2\u02ee\u02f0\3\2\2\2\u02ef\u02da"+
		"\3\2\2\2\u02ef\u02db\3\2\2\2\u02ef\u02dc\3\2\2\2\u02ef\u02e9\3\2\2\2\u02f0"+
		"\u02f6\3\2\2\2\u02f1\u02f6\5X-\2\u02f2\u02f3\5\u0124\u0093\2\u02f3\u02f4"+
		"\5\u0126\u0094\2\u02f4\u02f6\3\2\2\2\u02f5\u02d9\3\2\2\2\u02f5\u02f1\3"+
		"\2\2\2\u02f5\u02f2\3\2\2\2\u02f6\u032f\3\2\2\2\u02f7\u02f8\7c\2\2\u02f8"+
		"\u02fc\7\u0080\2\2\u02f9\u02fd\5^\60\2\u02fa\u02fd\5\6\4\2\u02fb\u02fd"+
		"\7l\2\2\u02fc\u02f9\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fb\3\2\2\2\u02fd"+
		"\u02fe\3\2\2\2\u02fe\u032f\7\u0081\2\2\u02ff\u0300\7\32\2\2\u0300\u0301"+
		"\7\u0080\2\2\u0301\u0302\5\32\16\2\u0302\u0303\7\u0081\2\2\u0303\u032f"+
		"\3\2\2\2\u0304\u0305\7f\2\2\u0305\u0306\7\u0080\2\2\u0306\u0307\5\32\16"+
		"\2\u0307\u0308\7\u0081\2\2\u0308\u032f\3\2\2\2\u0309\u030e\7\37\2\2\u030a"+
		"\u030b\7\u0080\2\2\u030b\u030c\5\6\4\2\u030c\u030d\7\u0081\2\2\u030d\u030f"+
		"\3\2\2\2\u030e\u030a\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u032f\3\2\2\2\u0310"+
		"\u0312\7\20\2\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\3"+
		"\2\2\2\u0313\u0319\7 \2\2\u0314\u0316\7\u0080\2\2\u0315\u0317\5h\65\2"+
		"\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031a"+
		"\7\u0081\2\2\u0319\u0314\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2"+
		"\2\u031b\u032f\5\u008eH\2\u031c\u031d\7Y\2\2\u031d\u031e\7\u0080\2\2\u031e"+
		"\u031f\5\6\4\2\u031f\u0320\7\u0081\2\2\u0320\u032f\3\2\2\2\u0321\u0322"+
		"\7A\2\2\u0322\u0328\7\u0080\2\2\u0323\u0324\5\u01a0\u00d1\2\u0324\u0325"+
		"\7\u0082\2\2\u0325\u0327\3\2\2\2\u0326\u0323\3\2\2\2\u0327\u032a\3\2\2"+
		"\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032b\3\2\2\2\u032a\u0328"+
		"\3\2\2\2\u032b\u032c\5\u01a0\u00d1\2\u032c\u032d\7\u0081\2\2\u032d\u032f"+
		"\3\2\2\2\u032e\u02bf\3\2\2\2\u032e\u02c0\3\2\2\2\u032e\u02c4\3\2\2\2\u032e"+
		"\u02c8\3\2\2\2\u032e\u02c9\3\2\2\2\u032e\u02ca\3\2\2\2\u032e\u02cb\3\2"+
		"\2\2\u032e\u02cc\3\2\2\2\u032e\u02d8\3\2\2\2\u032e\u02f7\3\2\2\2\u032e"+
		"\u02ff\3\2\2\2\u032e\u0304\3\2\2\2\u032e\u0309\3\2\2\2\u032e\u0311\3\2"+
		"\2\2\u032e\u031c\3\2\2\2\u032e\u0321\3\2\2\2\u032f?\3\2\2\2\u0330\u0332"+
		"\7\u0093\2\2\u0331\u0330\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0333\3\2\2"+
		"\2\u0333\u0334\7\u0082\2\2\u0334\u0336\5\u01a0\u00d1\2\u0335\u0337\5\24"+
		"\13\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337A\3\2\2\2\u0338\u033a"+
		"\7\u0093\2\2\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2"+
		"\2\u033b\u033c\7~\2\2\u033c\u0341\5D#\2\u033d\u033e\7\u0083\2\2\u033e"+
		"\u0340\5D#\2\u033f\u033d\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u033f\3\2\2"+
		"\2\u0341\u0342\3\2\2\2\u0342\u0344\3\2\2\2\u0343\u0341\3\2\2\2\u0344\u0345"+
		"\7\177\2\2\u0345C\3\2\2\2\u0346\u0347\5\u01a0\u00d1\2\u0347\u0348\7\u0084"+
		"\2\2\u0348\u034a\3\2\2\2\u0349\u0346\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"\u034b\3\2\2\2\u034b\u034c\5\32\16\2\u034cE\3\2\2\2\u034d\u034e\t\t\2"+
		"\2\u034eG\3\2\2\2\u034f\u0354\5\32\16\2\u0350\u0351\7\u0083\2\2\u0351"+
		"\u0353\5\32\16\2\u0352\u0350\3\2\2\2\u0353\u0356\3\2\2\2\u0354\u0352\3"+
		"\2\2\2\u0354\u0355\3\2\2\2\u0355I\3\2\2\2\u0356\u0354\3\2\2\2\u0357\u035a"+
		"\5L\'\2\u0358\u035a\5T+\2\u0359\u0357\3\2\2\2\u0359\u0358\3\2\2\2\u035a"+
		"K\3\2\2\2\u035b\u0360\7|\2\2\u035c\u035e\5N(\2\u035d\u035f\7\u0083\2\2"+
		"\u035e\u035d\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0361\3\2\2\2\u0360\u035c"+
		"\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0363\7}\2\2\u0363"+
		"M\3\2\2\2\u0364\u0369\5P)\2\u0365\u0366\7\u0083\2\2\u0366\u0368\5P)\2"+
		"\u0367\u0365\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a"+
		"\3\2\2\2\u036aO\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u0372\5\u01a0\u00d1"+
		"\2\u036d\u036e\7~\2\2\u036e\u036f\5\32\16\2\u036f\u0370\7\177\2\2\u0370"+
		"\u0372\3\2\2\2\u0371\u036c\3\2\2\2\u0371\u036d\3\2\2\2\u0372\u0373\3\2"+
		"\2\2\u0373\u0374\7\u0090\2\2\u0374\u0375\5R*\2\u0375Q\3\2\2\2\u0376\u0379"+
		"\5\32\16\2\u0377\u0379\5J&\2\u0378\u0376\3\2\2\2\u0378\u0377\3\2\2\2\u0379"+
		"S\3\2\2\2\u037a\u037b\7|\2\2\u037b\u0380\5V,\2\u037c\u037d\7\u0083\2\2"+
		"\u037d\u037f\5V,\2\u037e\u037c\3\2\2\2\u037f\u0382\3\2\2\2\u0380\u037e"+
		"\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0384\3\2\2\2\u0382\u0380\3\2\2\2\u0383"+
		"\u0385\7\u0083\2\2\u0384\u0383\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386"+
		"\3\2\2\2\u0386\u0387\7}\2\2\u0387U\3\2\2\2\u0388\u038e\5\34\17\2\u0389"+
		"\u038a\7|\2\2\u038a\u038b\5H%\2\u038b\u038c\7}\2\2\u038c\u038e\3\2\2\2"+
		"\u038d\u0388\3\2\2\2\u038d\u0389\3\2\2\2\u038eW\3\2\2\2\u038f\u0394\7"+
		"|\2\2\u0390\u0392\5Z.\2\u0391\u0393\7\u0083\2\2\u0392\u0391\3\2\2\2\u0392"+
		"\u0393\3\2\2\2\u0393\u0395\3\2\2\2\u0394\u0390\3\2\2\2\u0394\u0395\3\2"+
		"\2\2\u0395\u0396\3\2\2\2\u0396\u0397\7}\2\2\u0397Y\3\2\2\2\u0398\u039d"+
		"\5\\/\2\u0399\u039a\7\u0083\2\2\u039a\u039c\5\\/\2\u039b\u0399\3\2\2\2"+
		"\u039c\u039f\3\2\2\2\u039d\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e[\3"+
		"\2\2\2\u039f\u039d\3\2\2\2\u03a0\u03a6\5<\37\2\u03a1\u03a2\5\u01a0\u00d1"+
		"\2\u03a2\u03a3\7\u0090\2\2\u03a3\u03a4\5\32\16\2\u03a4\u03a6\3\2\2\2\u03a5"+
		"\u03a0\3\2\2\2\u03a5\u03a1\3\2\2\2\u03a6]\3\2\2\2\u03a7\u03b0\5\u01a0"+
		"\u00d1\2\u03a8\u03aa\5`\61\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa"+
		"\u03b1\3\2\2\2\u03ab\u03ac\7\u0094\2\2\u03ac\u03ae\5\u01a0\u00d1\2\u03ad"+
		"\u03af\5`\61\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b1\3\2"+
		"\2\2\u03b0\u03a9\3\2\2\2\u03b0\u03ab\3\2\2\2\u03b1\u03b9\3\2\2\2\u03b2"+
		"\u03b3\7\u0082\2\2\u03b3\u03b5\5\u01a0\u00d1\2\u03b4\u03b6\5`\61\2\u03b5"+
		"\u03b4\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b8\3\2\2\2\u03b7\u03b2\3\2"+
		"\2\2\u03b8\u03bb\3\2\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba"+
		"_\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc\u03c0\7\u0091\2\2\u03bd\u03bf\7\u0083"+
		"\2\2\u03be\u03bd\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0\u03be\3\2\2\2\u03c0"+
		"\u03c1\3\2\2\2\u03c1\u03c3\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c3\u03c4\7\u0092"+
		"\2\2\u03c4a\3\2\2\2\u03c5\u03ca\5\b\5\2\u03c6\u03c9\5\u0124\u0093\2\u03c7"+
		"\u03c9\7\u0088\2\2\u03c8\u03c6\3\2\2\2\u03c8\u03c7\3\2\2\2\u03c9\u03cc"+
		"\3\2\2\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03ce\3\2\2\2\u03cc"+
		"\u03ca\3\2\2\2\u03cd\u03cf\7\u0093\2\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf"+
		"\3\2\2\2\u03cfc\3\2\2\2\u03d0\u03d2\7[\2\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2"+
		"\3\2\2\2\u03d2\u03d4\3\2\2\2\u03d3\u03d5\7\20\2\2\u03d4\u03d3\3\2\2\2"+
		"\u03d4\u03d5\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d7\5f\64\2\u03d7\u03d8"+
		"\5\u0158\u00ad\2\u03d8\u03d9\5n8\2\u03d9e\3\2\2\2\u03da\u03db\7\u0080"+
		"\2\2\u03db\u03e6\7\u0081\2\2\u03dc\u03dd\7\u0080\2\2\u03dd\u03de\5h\65"+
		"\2\u03de\u03df\7\u0081\2\2\u03df\u03e6\3\2\2\2\u03e0\u03e1\7\u0080\2\2"+
		"\u03e1\u03e2\5l\67\2\u03e2\u03e3\7\u0081\2\2\u03e3\u03e6\3\2\2\2\u03e4"+
		"\u03e6\5\u01a0\u00d1\2\u03e5\u03da\3\2\2\2\u03e5\u03dc\3\2\2\2\u03e5\u03e0"+
		"\3\2\2\2\u03e5\u03e4\3\2\2\2\u03e6g\3\2\2\2\u03e7\u03ec\5j\66\2\u03e8"+
		"\u03e9\7\u0083\2\2\u03e9\u03eb\5j\66\2\u03ea\u03e8\3\2\2\2\u03eb\u03ee"+
		"\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03edi\3\2\2\2\u03ee"+
		"\u03ec\3\2\2\2\u03ef\u03f1\t\4\2\2\u03f0\u03ef\3\2\2\2\u03f0\u03f1\3\2"+
		"\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\5\6\4\2\u03f3\u03f4\5\u01a0\u00d1"+
		"\2\u03f4k\3\2\2\2\u03f5\u03fa\5\u01a0\u00d1\2\u03f6\u03f7\7\u0083\2\2"+
		"\u03f7\u03f9\5\u01a0\u00d1\2\u03f8\u03f6\3\2\2\2\u03f9\u03fc\3\2\2\2\u03fa"+
		"\u03f8\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fbm\3\2\2\2\u03fc\u03fa\3\2\2\2"+
		"\u03fd\u0400\5\32\16\2\u03fe\u0400\5\u008eH\2\u03ff\u03fd\3\2\2\2\u03ff"+
		"\u03fe\3\2\2\2\u0400o\3\2\2\2\u0401\u0402\5r:\2\u0402\u0403\5t;\2\u0403"+
		"q\3\2\2\2\u0404\u0406\7\61\2\2\u0405\u0407\5\6\4\2\u0406\u0405\3\2\2\2"+
		"\u0406\u0407\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\5\u01a0\u00d1\2\u0409"+
		"\u040a\7\67\2\2\u040a\u040b\5\32\16\2\u040bs\3\2\2\2\u040c\u040e\5v<\2"+
		"\u040d\u040c\3\2\2\2\u040e\u0411\3\2\2\2\u040f\u040d\3\2\2\2\u040f\u0410"+
		"\3\2\2\2\u0410\u0412\3\2\2\2\u0411\u040f\3\2\2\2\u0412\u0414\5\u0082B"+
		"\2\u0413\u0415\5\u0084C\2\u0414\u0413\3\2\2\2\u0414\u0415\3\2\2\2\u0415"+
		"u\3\2\2\2\u0416\u041c\5r:\2\u0417\u041c\5x=\2\u0418\u041c\5z>\2\u0419"+
		"\u041c\5|?\2\u041a\u041c\5~@\2\u041b\u0416\3\2\2\2\u041b\u0417\3\2\2\2"+
		"\u041b\u0418\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041a\3\2\2\2\u041cw\3"+
		"\2\2\2\u041d\u041e\7>\2\2\u041e\u041f\5\u01a0\u00d1\2\u041f\u0420\7\u0090"+
		"\2\2\u0420\u0421\5\32\16\2\u0421y\3\2\2\2\u0422\u0423\7o\2\2\u0423\u0424"+
		"\5\32\16\2\u0424{\3\2\2\2\u0425\u0427\7=\2\2\u0426\u0428\5\6\4\2\u0427"+
		"\u0426\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\5\u01a0"+
		"\u00d1\2\u042a\u042b\7\67\2\2\u042b\u042c\5\32\16\2\u042c\u042d\7F\2\2"+
		"\u042d\u042e\5\32\16\2\u042e\u042f\7\'\2\2\u042f\u0432\5\32\16\2\u0430"+
		"\u0431\7;\2\2\u0431\u0433\5\u01a0\u00d1\2\u0432\u0430\3\2\2\2\u0432\u0433"+
		"\3\2\2\2\u0433}\3\2\2\2\u0434\u0435\7H\2\2\u0435\u043a\5\u0080A\2\u0436"+
		"\u0437\7\u0083\2\2\u0437\u0439\5\u0080A\2\u0438\u0436\3\2\2\2\u0439\u043c"+
		"\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b\3\2\2\2\u043b\177\3\2\2\2\u043c"+
		"\u043a\3\2\2\2\u043d\u043f\5\32\16\2\u043e\u0440\t\n\2\2\u043f\u043e\3"+
		"\2\2\2\u043f\u0440\3\2\2\2\u0440\u0081\3\2\2\2\u0441\u0442\7V\2\2\u0442"+
		"\u0449\5\32\16\2\u0443\u0444\7\64\2\2\u0444\u0445\5\32\16\2\u0445\u0446"+
		"\7\25\2\2\u0446\u0447\5\32\16\2\u0447\u0449\3\2\2\2\u0448\u0441\3\2\2"+
		"\2\u0448\u0443\3\2\2\2\u0449\u0083\3\2\2\2\u044a\u044b\7;\2\2\u044b\u044c"+
		"\5\u01a0\u00d1\2\u044c\u044d\5t;\2\u044d\u0085\3\2\2\2\u044e\u0457\5\u0088"+
		"E\2\u044f\u0452\5\u0090I\2\u0450\u0452\5\u0098M\2\u0451\u044f\3\2\2\2"+
		"\u0451\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0454\7\u0085\2\2\u0454"+
		"\u0457\3\2\2\2\u0455\u0457\5\u008aF\2\u0456\u044e\3\2\2\2\u0456\u0451"+
		"\3\2\2\2\u0456\u0455\3\2\2\2\u0457\u0087\3\2\2\2\u0458\u0459\5\u01a0\u00d1"+
		"\2\u0459\u045a\7\u0084\2\2\u045a\u045b\5\u0086D\2\u045b\u0089\3\2\2\2"+
		"\u045c\u045f\5\u008eH\2\u045d\u045f\5\u008cG\2\u045e\u045c\3\2\2\2\u045e"+
		"\u045d\3\2\2\2\u045f\u008b\3\2\2\2\u0460\u04e0\7\u0085\2\2\u0461\u0462"+
		"\5\32\16\2\u0462\u0463\7\u0085\2\2\u0463\u04e0\3\2\2\2\u0464\u0465\7\65"+
		"\2\2\u0465\u0466\7\u0080\2\2\u0466\u0467\5\32\16\2\u0467\u0468\7\u0081"+
		"\2\2\u0468\u046b\5\u009aN\2\u0469\u046a\7%\2\2\u046a\u046c\5\u009aN\2"+
		"\u046b\u0469\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u04e0\3\2\2\2\u046d\u046e"+
		"\7^\2\2\u046e\u046f\7\u0080\2\2\u046f\u0470\5\32\16\2\u0470\u0471\7\u0081"+
		"\2\2\u0471\u0475\7|\2\2\u0472\u0474\5\u009cO\2\u0473\u0472\3\2\2\2\u0474"+
		"\u0477\3\2\2\2\u0475\u0473\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0478\3\2"+
		"\2\2\u0477\u0475\3\2\2\2\u0478\u0479\7}\2\2\u0479\u04e0\3\2\2\2\u047a"+
		"\u047b\7p\2\2\u047b\u047c\7\u0080\2\2\u047c\u047d\5\32\16\2\u047d\u047e"+
		"\7\u0081\2\2\u047e\u047f\5\u008aF\2\u047f\u04e0\3\2\2\2\u0480\u0481\7"+
		"\"\2\2\u0481\u0482\5\u008aF\2\u0482\u0483\7p\2\2\u0483\u0484\7\u0080\2"+
		"\2\u0484\u0485\5\32\16\2\u0485\u0486\7\u0081\2\2\u0486\u0487\7\u0085\2"+
		"\2\u0487\u04e0\3\2\2\2\u0488\u0489\7/\2\2\u0489\u048b\7\u0080\2\2\u048a"+
		"\u048c\5\u00a2R\2\u048b\u048a\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d"+
		"\3\2\2\2\u048d\u048f\7\u0085\2\2\u048e\u0490\5\32\16\2\u048f\u048e\3\2"+
		"\2\2\u048f\u0490\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0493\7\u0085\2\2\u0492"+
		"\u0494\5\u00a4S\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495"+
		"\3\2\2\2\u0495\u0496\7\u0081\2\2\u0496\u04e0\5\u008aF\2\u0497\u0498\7"+
		"\60\2\2\u0498\u0499\7\u0080\2\2\u0499\u049a\5\u0092J\2\u049a\u049b\5\u01a0"+
		"\u00d1\2\u049b\u049c\7\67\2\2\u049c\u049d\5\32\16\2\u049d\u049e\7\u0081"+
		"\2\2\u049e\u049f\5\u008aF\2\u049f\u04e0\3\2\2\2\u04a0\u04a1\7\24\2\2\u04a1"+
		"\u04e0\7\u0085\2\2\u04a2\u04a3\7\35\2\2\u04a3\u04e0\7\u0085\2\2\u04a4"+
		"\u04a9\7\63\2\2\u04a5\u04aa\5\u01a0\u00d1\2\u04a6\u04a7\7\27\2\2\u04a7"+
		"\u04aa\5\32\16\2\u04a8\u04aa\7\37\2\2\u04a9\u04a5\3\2\2\2\u04a9\u04a6"+
		"\3\2\2\2\u04a9\u04a8\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab\u04e0\7\u0085\2"+
		"\2\u04ac\u04ae\7S\2\2\u04ad\u04af\5\32\16\2\u04ae\u04ad\3\2\2\2\u04ae"+
		"\u04af\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04e0\7\u0085\2\2\u04b1\u04b3"+
		"\7`\2\2\u04b2\u04b4\5\32\16\2\u04b3\u04b2\3\2\2\2\u04b3\u04b4\3\2\2\2"+
		"\u04b4\u04b5\3\2\2\2\u04b5\u04e0\7\u0085\2\2\u04b6\u04b7\7b\2\2\u04b7"+
		"\u04bd\5\u008eH\2\u04b8\u04ba\5\u00a6T\2\u04b9\u04bb\5\u00aeX\2\u04ba"+
		"\u04b9\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04be\3\2\2\2\u04bc\u04be\5\u00ae"+
		"X\2\u04bd\u04b8\3\2\2\2\u04bd\u04bc\3\2\2\2\u04be\u04e0\3\2\2\2\u04bf"+
		"\u04c0\7\32\2\2\u04c0\u04e0\5\u008eH\2\u04c1\u04c2\7f\2\2\u04c2\u04e0"+
		"\5\u008eH\2\u04c3\u04c4\7?\2\2\u04c4\u04c5\7\u0080\2\2\u04c5\u04c6\5\32"+
		"\16\2\u04c6\u04c7\7\u0081\2\2\u04c7\u04c8\5\u008aF\2\u04c8\u04e0\3\2\2"+
		"\2\u04c9\u04ca\7i\2\2\u04ca\u04cb\7\u0080\2\2\u04cb\u04cc\5\u00b0Y\2\u04cc"+
		"\u04cd\7\u0081\2\2\u04cd\u04ce\5\u008aF\2\u04ce\u04e0\3\2\2\2\u04cf\u04d3"+
		"\7q\2\2\u04d0\u04d1\7S\2\2\u04d1\u04d4\5\32\16\2\u04d2\u04d4\7\24\2\2"+
		"\u04d3\u04d0\3\2\2\2\u04d3\u04d2\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04e0"+
		"\7\u0085\2\2\u04d6\u04d7\7g\2\2\u04d7\u04e0\5\u008eH\2\u04d8\u04d9\7-"+
		"\2\2\u04d9\u04da\7\u0080\2\2\u04da\u04db\5\u014c\u00a7\2\u04db\u04dc\5"+
		"\u014e\u00a8\2\u04dc\u04dd\7\u0081\2\2\u04dd\u04de\5\u008aF\2\u04de\u04e0"+
		"\3\2\2\2\u04df\u0460\3\2\2\2\u04df\u0461\3\2\2\2\u04df\u0464\3\2\2\2\u04df"+
		"\u046d\3\2\2\2\u04df\u047a\3\2\2\2\u04df\u0480\3\2\2\2\u04df\u0488\3\2"+
		"\2\2\u04df\u0497\3\2\2\2\u04df\u04a0\3\2\2\2\u04df\u04a2\3\2\2\2\u04df"+
		"\u04a4\3\2\2\2\u04df\u04ac\3\2\2\2\u04df\u04b1\3\2\2\2\u04df\u04b6\3\2"+
		"\2\2\u04df\u04bf\3\2\2\2\u04df\u04c1\3\2\2\2\u04df\u04c3\3\2\2\2\u04df"+
		"\u04c9\3\2\2\2\u04df\u04cf\3\2\2\2\u04df\u04d6\3\2\2\2\u04df\u04d8\3\2"+
		"\2\2\u04e0\u008d\3\2\2\2\u04e1\u04e3\7|\2\2\u04e2\u04e4\5\u00a0Q\2\u04e3"+
		"\u04e2\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\7}"+
		"\2\2\u04e6\u008f\3\2\2\2\u04e7\u04e8\5\u0092J\2\u04e8\u04ed\5\u0094K\2"+
		"\u04e9\u04ea\7\u0083\2\2\u04ea\u04ec\5\u0094K\2\u04eb\u04e9\3\2\2\2\u04ec"+
		"\u04ef\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u0091\3\2"+
		"\2\2\u04ef\u04ed\3\2\2\2\u04f0\u04f3\7j\2\2\u04f1\u04f3\5\6\4\2\u04f2"+
		"\u04f0\3\2\2\2\u04f2\u04f1\3\2\2\2\u04f3\u0093\3\2\2\2\u04f4\u04f7\5\u01a0"+
		"\u00d1\2\u04f5\u04f6\7\u0090\2\2\u04f6\u04f8\5\u0096L\2\u04f7\u04f5\3"+
		"\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u0095\3\2\2\2\u04f9\u04fd\5\32\16\2\u04fa"+
		"\u04fd\5\u0126\u0094\2\u04fb\u04fd\5\u0156\u00ac\2\u04fc\u04f9\3\2\2\2"+
		"\u04fc\u04fa\3\2\2\2\u04fc\u04fb\3\2\2\2\u04fd\u0097\3\2\2\2\u04fe\u04ff"+
		"\7\34\2\2\u04ff\u0500\5\6\4\2\u0500\u0501\5\u00eav\2\u0501\u0099\3\2\2"+
		"\2\u0502\u0505\5\u008eH\2\u0503\u0505\5\u008cG\2\u0504\u0502\3\2\2\2\u0504"+
		"\u0503\3\2\2\2\u0505\u009b\3\2\2\2\u0506\u0508\5\u009eP\2\u0507\u0506"+
		"\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a"+
		"\u050b\3\2\2\2\u050b\u050c\5\u00a0Q\2\u050c\u009d\3\2\2\2\u050d\u050e"+
		"\7\27\2\2\u050e\u050f\5\32\16\2\u050f\u0510\7\u0084\2\2\u0510\u0514\3"+
		"\2\2\2\u0511\u0512\7\37\2\2\u0512\u0514\7\u0084\2\2\u0513\u050d\3\2\2"+
		"\2\u0513\u0511\3\2\2\2\u0514\u009f\3\2\2\2\u0515\u0517\5\u0086D\2\u0516"+
		"\u0515\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0516\3\2\2\2\u0518\u0519\3\2"+
		"\2\2\u0519\u00a1\3\2\2\2\u051a\u0524\5\u0090I\2\u051b\u0520\5\32\16\2"+
		"\u051c\u051d\7\u0083\2\2\u051d\u051f\5\32\16\2\u051e\u051c\3\2\2\2\u051f"+
		"\u0522\3\2\2\2\u0520\u051e\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0524\3\2"+
		"\2\2\u0522\u0520\3\2\2\2\u0523\u051a\3\2\2\2\u0523\u051b\3\2\2\2\u0524"+
		"\u00a3\3\2\2\2\u0525\u052a\5\32\16\2\u0526\u0527\7\u0083\2\2\u0527\u0529"+
		"\5\32\16\2\u0528\u0526\3\2\2\2\u0529\u052c\3\2\2\2\u052a\u0528\3\2\2\2"+
		"\u052a\u052b\3\2\2\2\u052b\u00a5\3\2\2\2\u052c\u052a\3\2\2\2\u052d\u0531"+
		"\5\u00a8U\2\u052e\u0530\5\u00a8U\2\u052f\u052e\3\2\2\2\u0530\u0533\3\2"+
		"\2\2\u0531\u052f\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0535\3\2\2\2\u0533"+
		"\u0531\3\2\2\2\u0534\u0536\5\u00aaV\2\u0535\u0534\3\2\2\2\u0535\u0536"+
		"\3\2\2\2\u0536\u0539\3\2\2\2\u0537\u0539\5\u00aaV\2\u0538\u052d\3\2\2"+
		"\2\u0538\u0537\3\2\2\2\u0539\u00a7\3\2\2\2\u053a\u053b\7\30\2\2\u053b"+
		"\u053c\7\u0080\2\2\u053c\u053e\5\22\n\2\u053d\u053f\5\u01a0\u00d1\2\u053e"+
		"\u053d\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0542\7\u0081"+
		"\2\2\u0541\u0543\5\u00acW\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2\2\u0543"+
		"\u0544\3\2\2\2\u0544\u0545\5\u008eH\2\u0545\u00a9\3\2\2\2\u0546\u0548"+
		"\7\30\2\2\u0547\u0549\5\u00acW\2\u0548\u0547\3\2\2\2\u0548\u0549\3\2\2"+
		"\2\u0549\u054a\3\2\2\2\u054a\u054b\5\u008eH\2\u054b\u00ab\3\2\2\2\u054c"+
		"\u054d\7n\2\2\u054d\u054e\7\u0080\2\2\u054e\u054f\5\32\16\2\u054f\u0550"+
		"\7\u0081\2\2\u0550\u00ad\3\2\2\2\u0551\u0552\7,\2\2\u0552\u0553\5\u008e"+
		"H\2\u0553\u00af\3\2\2\2\u0554\u0557\5\u0090I\2\u0555\u0557\5\32\16\2\u0556"+
		"\u0554\3\2\2\2\u0556\u0555\3\2\2\2\u0557\u00b1\3\2\2\2\u0558\u0559\7B"+
		"\2\2\u0559\u055a\5\u00b4[\2\u055a\u055c\5\u00b6\\\2\u055b\u055d\7\u0085"+
		"\2\2\u055c\u055b\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u00b3\3\2\2\2\u055e"+
		"\u0563\5\u01a0\u00d1\2\u055f\u0560\7\u0082\2\2\u0560\u0562\5\u01a0\u00d1"+
		"\2\u0561\u055f\3\2\2\2\u0562\u0565\3\2\2\2\u0563\u0561\3\2\2\2\u0563\u0564"+
		"\3\2\2\2\u0564\u00b5\3\2\2\2\u0565\u0563\3\2\2\2\u0566\u0568\7|\2\2\u0567"+
		"\u0569\5\u00b8]\2\u0568\u0567\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056b"+
		"\3\2\2\2\u056a\u056c\5\u00bc_\2\u056b\u056a\3\2\2\2\u056b\u056c\3\2\2"+
		"\2\u056c\u056e\3\2\2\2\u056d\u056f\5\u00c0a\2\u056e\u056d\3\2\2\2\u056e"+
		"\u056f\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0571\7}\2\2\u0571\u00b7\3\2"+
		"\2\2\u0572\u0574\5\u00ba^\2\u0573\u0572\3\2\2\2\u0574\u0575\3\2\2\2\u0575"+
		"\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u00b9\3\2\2\2\u0577\u0578\7*"+
		"\2\2\u0578\u0579\7\f\2\2\u0579\u057a\5\u01a0\u00d1\2\u057a\u057b\7\u0085"+
		"\2\2\u057b\u00bb\3\2\2\2\u057c\u057e\5\u00be`\2\u057d\u057c\3\2\2\2\u057e"+
		"\u057f\3\2\2\2\u057f\u057d\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u00bd\3\2"+
		"\2\2\u0581\u0582\7i\2\2\u0582\u0583\5\u01a0\u00d1\2\u0583\u0584\7\u0090"+
		"\2\2\u0584\u0585\5\4\3\2\u0585\u0586\7\u0085\2\2\u0586\u0591\3\2\2\2\u0587"+
		"\u0588\7i\2\2\u0588\u0589\5\4\3\2\u0589\u058a\7\u0085\2\2\u058a\u0591"+
		"\3\2\2\2\u058b\u058c\7i\2\2\u058c\u058d\7[\2\2\u058d\u058e\5\4\3\2\u058e"+
		"\u058f\7\u0085\2\2\u058f\u0591\3\2\2\2\u0590\u0581\3\2\2\2\u0590\u0587"+
		"\3\2\2\2\u0590\u058b\3\2\2\2\u0591\u00bf\3\2\2\2\u0592\u0594\5\u00c2b"+
		"\2\u0593\u0592\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0593\3\2\2\2\u0595\u0596"+
		"\3\2\2\2\u0596\u00c1\3\2\2\2\u0597\u059a\5\u00b2Z\2\u0598\u059a\5\u00c4"+
		"c\2\u0599\u0597\3\2\2\2\u0599\u0598\3\2\2\2\u059a\u00c3\3\2\2\2\u059b"+
		"\u059d\5\u0140\u00a1\2\u059c\u059b\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059f"+
		"\3\2\2\2\u059e\u05a0\5\u00e2r\2\u059f\u059e\3\2\2\2\u059f\u05a0\3\2\2"+
		"\2\u05a0\u05a6\3\2\2\2\u05a1\u05a7\5\u017c\u00bf\2\u05a2\u05a7\5\u017e"+
		"\u00c0\2\u05a3\u05a7\5\u0180\u00c1\2\u05a4\u05a7\5\u0182\u00c2\2\u05a5"+
		"\u05a7\5\u0184\u00c3\2\u05a6\u05a1\3\2\2\2\u05a6\u05a2\3\2\2\2\u05a6\u05a3"+
		"\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a6\u05a5\3\2\2\2\u05a7\u00c5\3\2\2\2\u05a8"+
		"\u05a9\5\u01a0\u00d1\2\u05a9\u05aa\7\u0094\2\2\u05aa\u05ac\5\u01a0\u00d1"+
		"\2\u05ab\u05ad\5\24\13\2\u05ac\u05ab\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad"+
		"\u00c7\3\2\2\2\u05ae\u05af\7\u0091\2\2\u05af\u05b4\5\u00caf\2\u05b0\u05b1"+
		"\7\u0083\2\2\u05b1\u05b3\5\u00caf\2\u05b2\u05b0\3\2\2\2\u05b3\u05b6\3"+
		"\2\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\u05b7\3\2\2\2\u05b6"+
		"\u05b4\3\2\2\2\u05b7\u05b8\7\u0092\2\2\u05b8\u00c9\3\2\2\2\u05b9\u05bb"+
		"\5\u0140\u00a1\2\u05ba\u05b9\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc\3"+
		"\2\2\2\u05bc\u05bd\5\u01a0\u00d1\2\u05bd\u00cb\3\2\2\2\u05be\u05bf\7\u0084"+
		"\2\2\u05bf\u05c4\5\22\n\2\u05c0\u05c1\7\u0083\2\2\u05c1\u05c3\5\4\3\2"+
		"\u05c2\u05c0\3\2\2\2\u05c3\u05c6\3\2\2\2\u05c4\u05c2\3\2\2\2\u05c4\u05c5"+
		"\3\2\2\2\u05c5\u00cd\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c7\u05cc\5\4\3\2\u05c8"+
		"\u05c9\7\u0083\2\2\u05c9\u05cb\5\4\3\2\u05ca\u05c8\3\2\2\2\u05cb\u05ce"+
		"\3\2\2\2\u05cc\u05ca\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u00cf\3\2\2\2\u05ce"+
		"\u05cc\3\2\2\2\u05cf\u05d1\5\u00d2j\2\u05d0\u05cf\3\2\2\2\u05d1\u05d2"+
		"\3\2\2\2\u05d2\u05d0\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u00d1\3\2\2\2\u05d4"+
		"\u05d5\7o\2\2\u05d5\u05d6\5\u01a0\u00d1\2\u05d6\u05d7\7\u0084\2\2\u05d7"+
		"\u05d8\5\u00d4k\2\u05d8\u00d3\3\2\2\2\u05d9\u05e4\5\u00dan\2\u05da\u05dd"+
		"\5\u00d6l\2\u05db\u05dc\7\u0083\2\2\u05dc\u05de\5\u00d8m\2\u05dd\u05db"+
		"\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05e1\3\2\2\2\u05df\u05e0\7\u0083\2"+
		"\2\u05e0\u05e2\5\u00dan\2\u05e1\u05df\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2"+
		"\u05e4\3\2\2\2\u05e3\u05d9\3\2\2\2\u05e3\u05da\3\2\2\2\u05e4\u00d5\3\2"+
		"\2\2\u05e5\u05e9\5\22\n\2\u05e6\u05e9\7\33\2\2\u05e7\u05e9\7]\2\2\u05e8"+
		"\u05e5\3\2\2\2\u05e8\u05e6\3\2\2\2\u05e8\u05e7\3\2\2\2\u05e9\u00d7\3\2"+
		"\2\2\u05ea\u05ef\5\4\3\2\u05eb\u05ec\7\u0083\2\2\u05ec\u05ee\5\4\3\2\u05ed"+
		"\u05eb\3\2\2\2\u05ee\u05f1\3\2\2\2\u05ef\u05ed\3\2\2\2\u05ef\u05f0\3\2"+
		"\2\2\u05f0\u00d9\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f2\u05f3\7C\2\2\u05f3"+
		"\u05f4\7\u0080\2\2\u05f4\u05f5\7\u0081\2\2\u05f5\u00db\3\2\2\2\u05f6\u05f8"+
		"\7|\2\2\u05f7\u05f9\5\u00dep\2\u05f8\u05f7\3\2\2\2\u05f8\u05f9\3\2\2\2"+
		"\u05f9\u05fa\3\2\2\2\u05fa\u05fb\7}\2\2\u05fb\u00dd\3\2\2\2\u05fc\u05fe"+
		"\5\u00e0q\2\u05fd\u05fc\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u05fd\3\2\2"+
		"\2\u05ff\u0600\3\2\2\2\u0600\u00df\3\2\2\2\u0601\u0603\5\u0140\u00a1\2"+
		"\u0602\u0601\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0605\3\2\2\2\u0604\u0606"+
		"\5\u00e2r\2\u0605\u0604\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0609\3\2\2"+
		"\2\u0607\u060a\5\u00e6t\2\u0608\u060a\5\u0190\u00c9\2\u0609\u0607\3\2"+
		"\2\2\u0609\u0608\3\2\2\2\u060a\u00e1\3\2\2\2\u060b\u060d\5\u00e4s\2\u060c"+
		"\u060b\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u060c\3\2\2\2\u060e\u060f\3\2"+
		"\2\2\u060f\u00e3\3\2\2\2\u0610\u0611\t\13\2\2\u0611\u00e5\3\2\2\2\u0612"+
		"\u0626\5\u018c\u00c7\2\u0613\u0626\5\u00e8u\2\u0614\u0626\5\u0186\u00c4"+
		"\2\u0615\u061b\5\u0116\u008c\2\u0616\u061c\5\u011a\u008e\2\u0617\u0618"+
		"\5\u0158\u00ad\2\u0618\u0619\5\32\16\2\u0619\u061a\7\u0085\2\2\u061a\u061c"+
		"\3\2\2\2\u061b\u0616\3\2\2\2\u061b\u0617\3\2\2\2\u061c\u0626\3\2\2\2\u061d"+
		"\u0626\5\u0192\u00ca\2\u061e\u061f\7l\2\2\u061f\u0626\5\u0194\u00cb\2"+
		"\u0620\u0626\5\u017c\u00bf\2\u0621\u0626\5\u017e\u00c0\2\u0622\u0626\5"+
		"\u0180\u00c1\2\u0623\u0626\5\u0182\u00c2\2\u0624\u0626\5\u0184\u00c3\2"+
		"\u0625\u0612\3\2\2\2\u0625\u0613\3\2\2\2\u0625\u0614\3\2\2\2\u0625\u0615"+
		"\3\2\2\2\u0625\u061d\3\2\2\2\u0625\u061e\3\2\2\2\u0625\u0620\3\2\2\2\u0625"+
		"\u0621\3\2\2\2\u0625\u0622\3\2\2\2\u0625\u0623\3\2\2\2\u0625\u0624\3\2"+
		"\2\2\u0626\u00e7\3\2\2\2\u0627\u0631\5\6\4\2\u0628\u0629\5\4\3\2\u0629"+
		"\u062a\7\u0082\2\2\u062a\u062b\5\u018e\u00c8\2\u062b\u0632\3\2\2\2\u062c"+
		"\u0632\5\u0194\u00cb\2\u062d\u0632\5\u018a\u00c6\2\u062e\u0632\5\u018e"+
		"\u00c8\2\u062f\u0632\5\u0198\u00cd\2\u0630\u0632\5\u0188\u00c5\2\u0631"+
		"\u0628\3\2\2\2\u0631\u062c\3\2\2\2\u0631\u062d\3\2\2\2\u0631\u062e\3\2"+
		"\2\2\u0631\u062f\3\2\2\2\u0631\u0630\3\2\2\2\u0632\u00e9\3\2\2\2\u0633"+
		"\u0638\5\u00ecw\2\u0634\u0635\7\u0083\2\2\u0635\u0637\5\u00ecw\2\u0636"+
		"\u0634\3\2\2\2\u0637\u063a\3\2\2\2\u0638\u0636\3\2\2\2\u0638\u0639\3\2"+
		"\2\2\u0639\u00eb\3\2\2\2\u063a\u0638\3\2\2\2\u063b\u063c\5\u01a0\u00d1"+
		"\2\u063c\u063d\7\u0090\2\2\u063d\u063e\5\32\16\2\u063e\u00ed\3\2\2\2\u063f"+
		"\u0644\5\u00f0y\2\u0640\u0641\7\u0083\2\2\u0641\u0643\5\u00f0y\2\u0642"+
		"\u0640\3\2\2\2\u0643\u0646\3\2\2\2\u0644\u0642\3\2\2\2\u0644\u0645\3\2"+
		"\2\2\u0645\u00ef\3\2\2\2\u0646\u0644\3\2\2\2\u0647\u064a\5\u01a0\u00d1"+
		"\2\u0648\u0649\7\u0090\2\2\u0649\u064b\5\u00f2z\2\u064a\u0648\3\2\2\2"+
		"\u064a\u064b\3\2\2\2\u064b\u00f1\3\2\2\2\u064c\u0658\5\32\16\2\u064d\u0658"+
		"\5\u0126\u0094\2\u064e\u064f\7C\2\2\u064f\u0651\7\u0080\2\2\u0650\u0652"+
		"\5\26\f\2\u0651\u0650\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0653\3\2\2\2"+
		"\u0653\u0658\7\u0081\2\2\u0654\u0655\7C\2\2\u0655\u0656\7\u0080\2\2\u0656"+
		"\u0658\7\u0081\2\2\u0657\u064c\3\2\2\2\u0657\u064d\3\2\2\2\u0657\u064e"+
		"\3\2\2\2\u0657\u0654\3\2\2\2\u0658\u00f3\3\2\2\2\u0659\u065c\5\6\4\2\u065a"+
		"\u065c\7l\2\2\u065b\u0659\3\2\2\2\u065b\u065a\3\2\2\2\u065c\u00f5\3\2"+
		"\2\2\u065d\u065e\5\4\3\2\u065e\u00f7\3\2\2\2\u065f\u0662\5\u008eH\2\u0660"+
		"\u0662\7\u0085\2\2\u0661\u065f\3\2\2\2\u0661\u0660\3\2\2\2\u0662\u00f9"+
		"\3\2\2\2\u0663\u066a\5\u0102\u0082\2\u0664\u0667\5\u00fc\177\2\u0665\u0666"+
		"\7\u0083\2\2\u0666\u0668\5\u0102\u0082\2\u0667\u0665\3\2\2\2\u0667\u0668"+
		"\3\2\2\2\u0668\u066a\3\2\2\2\u0669\u0663\3\2\2\2\u0669\u0664\3\2\2\2\u066a"+
		"\u00fb\3\2\2\2\u066b\u0670\5\u00fe\u0080\2\u066c\u066d\7\u0083\2\2\u066d"+
		"\u066f\5\u00fe\u0080\2\u066e\u066c\3\2\2\2\u066f\u0672\3\2\2\2\u0670\u066e"+
		"\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u00fd\3\2\2\2\u0672\u0670\3\2\2\2\u0673"+
		"\u0675\5\u0140\u00a1\2\u0674\u0673\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0677"+
		"\3\2\2\2\u0676\u0678\5\u0100\u0081\2\u0677\u0676\3\2\2\2\u0677\u0678\3"+
		"\2\2\2\u0678\u0679\3\2\2\2\u0679\u067c\5\u019a\u00ce\2\u067a\u067c\7\r"+
		"\2\2\u067b\u0674\3\2\2\2\u067b\u067a\3\2\2\2\u067c\u00ff\3\2\2\2\u067d"+
		"\u067e\t\f\2\2\u067e\u0101\3\2\2\2\u067f\u0681\5\u0140\u00a1\2\u0680\u067f"+
		"\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0683\7K\2\2\u0683"+
		"\u0684\5\u0122\u0092\2\u0684\u0685\5\u01a0\u00d1\2\u0685\u0103\3\2\2\2"+
		"\u0686\u0688\5\u0140\u00a1\2\u0687\u0686\3\2\2\2\u0687\u0688\3\2\2\2\u0688"+
		"\u068a\3\2\2\2\u0689\u068b\5\u010a\u0086\2\u068a\u0689\3\2\2\2\u068a\u068b"+
		"\3\2\2\2\u068b\u0696\3\2\2\2\u068c\u068d\7\62\2\2\u068d\u068f\5\u010c"+
		"\u0087\2\u068e\u0690\5\u0108\u0085\2\u068f\u068e\3\2\2\2\u068f\u0690\3"+
		"\2\2\2\u0690\u0697\3\2\2\2\u0691\u0692\7W\2\2\u0692\u0694\5\u010c\u0087"+
		"\2\u0693\u0695\5\u0106\u0084\2\u0694\u0693\3\2\2\2\u0694\u0695\3\2\2\2"+
		"\u0695\u0697\3\2\2\2\u0696\u068c\3\2\2\2\u0696\u0691\3\2\2\2\u0697\u0105"+
		"\3\2\2\2\u0698\u069a\5\u0140\u00a1\2\u0699\u0698\3\2\2\2\u0699\u069a\3"+
		"\2\2\2\u069a\u069c\3\2\2\2\u069b\u069d\5\u010a\u0086\2\u069c\u069b\3\2"+
		"\2\2\u069c\u069d\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u069f\7\62\2\2\u069f"+
		"\u06a0\5\u010c\u0087\2\u06a0\u0107\3\2\2\2\u06a1\u06a3\5\u0140\u00a1\2"+
		"\u06a2\u06a1\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a5\3\2\2\2\u06a4\u06a6"+
		"\5\u010a\u0086\2\u06a5\u06a4\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a7\3"+
		"\2\2\2\u06a7\u06a8\7W\2\2\u06a8\u06a9\5\u010c\u0087\2\u06a9\u0109\3\2"+
		"\2\2\u06aa\u06b2\7N\2\2\u06ab\u06b2\7:\2\2\u06ac\u06b2\7M\2\2\u06ad\u06ae"+
		"\7N\2\2\u06ae\u06b2\7:\2\2\u06af\u06b0\7:\2\2\u06b0\u06b2\7N\2\2\u06b1"+
		"\u06aa\3\2\2\2\u06b1\u06ab\3\2\2\2\u06b1\u06ac\3\2\2\2\u06b1\u06ad\3\2"+
		"\2\2\u06b1\u06af\3\2\2\2\u06b2\u010b\3\2\2\2\u06b3\u06b6\5\u008eH\2\u06b4"+
		"\u06b6\7\u0085\2\2\u06b5\u06b3\3\2\2\2\u06b5\u06b4\3\2\2\2\u06b6\u010d"+
		"\3\2\2\2\u06b7\u06b9\5\u0140\u00a1\2\u06b8\u06b7\3\2\2\2\u06b8\u06b9\3"+
		"\2\2\2\u06b9\u06c2\3\2\2\2\u06ba\u06bb\7\13\2\2\u06bb\u06bc\5\u008eH\2"+
		"\u06bc\u06bd\5\u0112\u008a\2\u06bd\u06c3\3\2\2\2\u06be\u06bf\7R\2\2\u06bf"+
		"\u06c0\5\u008eH\2\u06c0\u06c1\5\u0110\u0089\2\u06c1\u06c3\3\2\2\2\u06c2"+
		"\u06ba\3\2\2\2\u06c2\u06be\3\2\2\2\u06c3\u010f\3\2\2\2\u06c4\u06c6\5\u0140"+
		"\u00a1\2\u06c5\u06c4\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7"+
		"\u06c8\7\13\2\2\u06c8\u06c9\5\u008eH\2\u06c9\u0111\3\2\2\2\u06ca\u06cc"+
		"\5\u0140\u00a1\2\u06cb\u06ca\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u06cd\3"+
		"\2\2\2\u06cd\u06ce\7R\2\2\u06ce\u06cf\5\u008eH\2\u06cf\u0113\3\2\2\2\u06d0"+
		"\u06e7\7\u0086\2\2\u06d1\u06e7\7\u0087\2\2\u06d2\u06e7\7\u008e\2\2\u06d3"+
		"\u06e7\7\u008f\2\2\u06d4\u06e7\7\u0096\2\2\u06d5\u06e7\7\u0097\2\2\u06d6"+
		"\u06e7\7a\2\2\u06d7\u06e7\7+\2\2\u06d8\u06e7\7\u0088\2\2\u06d9\u06e7\7"+
		"\u0089\2\2\u06da\u06e7\7\u008a\2\2\u06db\u06e7\7\u008b\2\2\u06dc\u06e7"+
		"\7\u008c\2\2\u06dd\u06e7\7\u008d\2\2\u06de\u06e7\7\u00a7\2\2\u06df\u06e7"+
		"\5\u015a\u00ae\2\u06e0\u06e7\7\u009b\2\2\u06e1\u06e7\7\u009c\2\2\u06e2"+
		"\u06e7\7\u0092\2\2\u06e3\u06e7\7\u0091\2\2\u06e4\u06e7\7\u009e\2\2\u06e5"+
		"\u06e7\7\u009d\2\2\u06e6\u06d0\3\2\2\2\u06e6\u06d1\3\2\2\2\u06e6\u06d2"+
		"\3\2\2\2\u06e6\u06d3\3\2\2\2\u06e6\u06d4\3\2\2\2\u06e6\u06d5\3\2\2\2\u06e6"+
		"\u06d6\3\2\2\2\u06e6\u06d7\3\2\2\2\u06e6\u06d8\3\2\2\2\u06e6\u06d9\3\2"+
		"\2\2\u06e6\u06da\3\2\2\2\u06e6\u06db\3\2\2\2\u06e6\u06dc\3\2\2\2\u06e6"+
		"\u06dd\3\2\2\2\u06e6\u06de\3\2\2\2\u06e6\u06df\3\2\2\2\u06e6\u06e0\3\2"+
		"\2\2\u06e6\u06e1\3\2\2\2\u06e6\u06e2\3\2\2\2\u06e6\u06e3\3\2\2\2\u06e6"+
		"\u06e4\3\2\2\2\u06e6\u06e5\3\2\2\2\u06e7\u0115\3\2\2\2\u06e8\u06e9\t\r"+
		"\2\2\u06e9\u06ea\7G\2\2\u06ea\u06eb\5\6\4\2\u06eb\u06ec\7\u0080\2\2\u06ec"+
		"\u06ed\5\u019a\u00ce\2\u06ed\u06ee\7\u0081\2\2\u06ee\u0117\3\2\2\2\u06ef"+
		"\u06f0\7\u0084\2\2\u06f0\u06f1\t\16\2\2\u06f1\u06f3\7\u0080\2\2\u06f2"+
		"\u06f4\5\26\f\2\u06f3\u06f2\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f5\3"+
		"\2\2\2\u06f5\u06f6\7\u0081\2\2\u06f6\u0119\3\2\2\2\u06f7\u06fa\5\u008e"+
		"H\2\u06f8\u06fa\7\u0085\2\2\u06f9\u06f7\3\2\2\2\u06f9\u06f8\3\2\2\2\u06fa"+
		"\u011b\3\2\2\2\u06fb\u06fc\7\u0084\2\2\u06fc\u06fd\5\u00ceh\2\u06fd\u011d"+
		"\3\2\2\2\u06fe\u0702\7|\2\2\u06ff\u0701\5\u0120\u0091\2\u0700\u06ff\3"+
		"\2\2\2\u0701\u0704\3\2\2\2\u0702\u0700\3\2\2\2\u0702\u0703\3\2\2\2\u0703"+
		"\u0705\3\2\2\2\u0704\u0702\3\2\2\2\u0705\u0706\7}\2\2\u0706\u011f\3\2"+
		"\2\2\u0707\u0709\5\u0140\u00a1\2\u0708\u0707\3\2\2\2\u0708\u0709\3\2\2"+
		"\2\u0709\u070b\3\2\2\2\u070a\u070c\5\u00e2r\2\u070b\u070a\3\2\2\2\u070b"+
		"\u070c\3\2\2\2\u070c\u0717\3\2\2\2\u070d\u0718\5\u00e6t\2\u070e\u070f"+
		"\7-\2\2\u070f\u0711\5\6\4\2\u0710\u0712\5\u0154\u00ab\2\u0711\u0710\3"+
		"\2\2\2\u0712\u0713\3\2\2\2\u0713\u0711\3\2\2\2\u0713\u0714\3\2\2\2\u0714"+
		"\u0715\3\2\2\2\u0715\u0716\7\u0085\2\2\u0716\u0718\3\2\2\2\u0717\u070d"+
		"\3\2\2\2\u0717\u070e\3\2\2\2\u0718\u0121\3\2\2\2\u0719\u0721\5\b\5\2\u071a"+
		"\u071c\t\17\2\2\u071b\u071a\3\2\2\2\u071c\u071f\3\2\2\2\u071d\u071b\3"+
		"\2\2\2\u071d\u071e\3\2\2\2\u071e\u0720\3\2\2\2\u071f\u071d\3\2\2\2\u0720"+
		"\u0722\5\u0124\u0093\2\u0721\u071d\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u0721"+
		"\3\2\2\2\u0723\u0724\3\2\2\2\u0724\u0123\3\2\2\2\u0725\u0729\7~\2\2\u0726"+
		"\u0728\7\u0083\2\2\u0727\u0726\3\2\2\2\u0728\u072b\3\2\2\2\u0729\u0727"+
		"\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u072c\3\2\2\2\u072b\u0729\3\2\2\2\u072c"+
		"\u072d\7\177\2\2\u072d\u0125\3\2\2\2\u072e\u073a\7|\2\2\u072f\u0734\5"+
		"\u00f2z\2\u0730\u0731\7\u0083\2\2\u0731\u0733\5\u00f2z\2\u0732\u0730\3"+
		"\2\2\2\u0733\u0736\3\2\2\2\u0734\u0732\3\2\2\2\u0734\u0735\3\2\2\2\u0735"+
		"\u0738\3\2\2\2\u0736\u0734\3\2\2\2\u0737\u0739\7\u0083\2\2\u0738\u0737"+
		"\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073b\3\2\2\2\u073a\u072f\3\2\2\2\u073a"+
		"\u073b\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u073d\7}\2\2\u073d\u0127\3\2"+
		"\2\2\u073e\u073f\7\u0091\2\2\u073f\u0744\5\u012a\u0096\2\u0740\u0741\7"+
		"\u0083\2\2\u0741\u0743\5\u012a\u0096\2\u0742\u0740\3\2\2\2\u0743\u0746"+
		"\3\2\2\2\u0744\u0742\3\2\2\2\u0744\u0745\3\2\2\2\u0745\u0747\3\2\2\2\u0746"+
		"\u0744\3\2\2\2\u0747\u0748\7\u0092\2\2\u0748\u0129\3\2\2\2\u0749\u074b"+
		"\5\u0140\u00a1\2\u074a\u0749\3\2\2\2\u074a\u074b\3\2\2\2\u074b\u074d\3"+
		"\2\2\2\u074c\u074e\5\u012c\u0097\2\u074d\u074c\3\2\2\2\u074d\u074e\3\2"+
		"\2\2\u074e\u074f\3\2\2\2\u074f\u0750\5\u01a0\u00d1\2\u0750\u012b\3\2\2"+
		"\2\u0751\u0752\t\20\2\2\u0752\u012d\3\2\2\2\u0753\u0754\7\u0084\2\2\u0754"+
		"\u0755\5\u00ceh\2\u0755\u012f\3\2\2\2\u0756\u075a\7|\2\2\u0757\u0759\5"+
		"\u0132\u009a\2\u0758\u0757\3\2\2\2\u0759\u075c\3\2\2\2\u075a\u0758\3\2"+
		"\2\2\u075a\u075b\3\2\2\2\u075b\u075d\3\2\2\2\u075c\u075a\3\2\2\2\u075d"+
		"\u075e\7}\2\2\u075e\u0131\3\2\2\2\u075f\u0761\5\u0140\u00a1\2\u0760\u075f"+
		"\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u0763\3\2\2\2\u0762\u0764\7C\2\2\u0763"+
		"\u0762\3\2\2\2\u0763\u0764\3\2\2\2\u0764\u07a2\3\2\2\2\u0765\u0767\7g"+
		"\2\2\u0766\u0765\3\2\2\2\u0766\u0767\3\2\2\2\u0767\u0768\3\2\2\2\u0768"+
		"\u0789\5\6\4\2\u0769\u076b\5\u01a0\u00d1\2\u076a\u076c\5\u00c8e\2\u076b"+
		"\u076a\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u076f\7\u0080"+
		"\2\2\u076e\u0770\5\u00fa~\2\u076f\u076e\3\2\2\2\u076f\u0770\3\2\2\2\u0770"+
		"\u0771\3\2\2\2\u0771\u0773\7\u0081\2\2\u0772\u0774\5\u00d0i\2\u0773\u0772"+
		"\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u0776\7\u0085\2"+
		"\2\u0776\u078a\3\2\2\2\u0777\u0778\5\u01a0\u00d1\2\u0778\u0779\7|\2\2"+
		"\u0779\u077a\5\u0134\u009b\2\u077a\u077b\7}\2\2\u077b\u078a\3\2\2\2\u077c"+
		"\u077d\5\u01a0\u00d1\2\u077d\u077e\5\u0158\u00ad\2\u077e\u077f\5\32\16"+
		"\2\u077f\u0780\7\u0085\2\2\u0780\u078a\3\2\2\2\u0781\u0782\7_\2\2\u0782"+
		"\u0783\7~\2\2\u0783\u0784\5\u00fa~\2\u0784\u0785\7\177\2\2\u0785\u0786"+
		"\7|\2\2\u0786\u0787\5\u0134\u009b\2\u0787\u0788\7}\2\2\u0788\u078a\3\2"+
		"\2\2\u0789\u0769\3\2\2\2\u0789\u0777\3\2\2\2\u0789\u077c\3\2\2\2\u0789"+
		"\u0781\3\2\2\2\u078a\u07a3\3\2\2\2\u078b\u078d\7g\2\2\u078c\u078b\3\2"+
		"\2\2\u078c\u078d\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u078f\7l\2\2\u078f"+
		"\u0791\5\u01a0\u00d1\2\u0790\u0792\5\u00c8e\2\u0791\u0790\3\2\2\2\u0791"+
		"\u0792\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u0795\7\u0080\2\2\u0794\u0796"+
		"\5\u00fa~\2\u0795\u0794\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u0797\3\2\2"+
		"\2\u0797\u0799\7\u0081\2\2\u0798\u079a\5\u00d0i\2\u0799\u0798\3\2\2\2"+
		"\u0799\u079a\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u079c\7\u0085\2\2\u079c"+
		"\u07a3\3\2\2\2\u079d\u079e\7(\2\2\u079e\u079f\5\6\4\2\u079f\u07a0\5\u01a0"+
		"\u00d1\2\u07a0\u07a1\7\u0085\2\2\u07a1\u07a3\3\2\2\2\u07a2\u0766\3\2\2"+
		"\2\u07a2\u078c\3\2\2\2\u07a2\u079d\3\2\2\2\u07a3\u0133\3\2\2\2\u07a4\u07a6"+
		"\5\u0140\u00a1\2\u07a5\u07a4\3\2\2\2\u07a5\u07a6\3\2\2\2\u07a6\u07b9\3"+
		"\2\2\2\u07a7\u07a8\7\62\2\2\u07a8\u07ae\7\u0085\2\2\u07a9\u07ab\5\u0140"+
		"\u00a1\2\u07aa\u07a9\3\2\2\2\u07aa\u07ab\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac"+
		"\u07ad\7W\2\2\u07ad\u07af\7\u0085\2\2\u07ae\u07aa\3\2\2\2\u07ae\u07af"+
		"\3\2\2\2\u07af\u07ba\3\2\2\2\u07b0\u07b1\7W\2\2\u07b1\u07b7\7\u0085\2"+
		"\2\u07b2\u07b4\5\u0140\u00a1\2\u07b3\u07b2\3\2\2\2\u07b3\u07b4\3\2\2\2"+
		"\u07b4\u07b5\3\2\2\2\u07b5\u07b6\7\62\2\2\u07b6\u07b8\7\u0085\2\2\u07b7"+
		"\u07b3\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07ba\3\2\2\2\u07b9\u07a7\3\2"+
		"\2\2\u07b9\u07b0\3\2\2\2\u07ba\u0135\3\2\2\2\u07bb\u07bc\7\u0084\2\2\u07bc"+
		"\u07bd\5\6\4\2\u07bd\u0137\3\2\2\2\u07be\u07ca\7|\2\2\u07bf\u07c4\5\u013a"+
		"\u009e\2\u07c0\u07c1\7\u0083\2\2\u07c1\u07c3\5\u013a\u009e\2\u07c2\u07c0"+
		"\3\2\2\2\u07c3\u07c6\3\2\2\2\u07c4\u07c2\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5"+
		"\u07c8\3\2\2\2\u07c6\u07c4\3\2\2\2\u07c7\u07c9\7\u0083\2\2\u07c8\u07c7"+
		"\3\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07cb\3\2\2\2\u07ca\u07bf\3\2\2\2\u07ca"+
		"\u07cb\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u07cd\7}\2\2\u07cd\u0139\3\2"+
		"\2\2\u07ce\u07d0\5\u0140\u00a1\2\u07cf\u07ce\3\2\2\2\u07cf\u07d0\3\2\2"+
		"\2\u07d0\u07d1\3\2\2\2\u07d1\u07d4\5\u01a0\u00d1\2\u07d2\u07d3\7\u0090"+
		"\2\2\u07d3\u07d5\5\32\16\2\u07d4\u07d2\3\2\2\2\u07d4\u07d5\3\2\2\2\u07d5"+
		"\u013b\3\2\2\2\u07d6\u07d7\7~\2\2\u07d7\u07d8\5\u013e\u00a0\2\u07d8\u07d9"+
		"\7\u0084\2\2\u07d9\u07db\5\u0146\u00a4\2\u07da\u07dc\7\u0083\2\2\u07db"+
		"\u07da\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07dd\3\2\2\2\u07dd\u07de\7\177"+
		"\2\2\u07de\u013d\3\2\2\2\u07df\u07e2\5\u017a\u00be\2\u07e0\u07e2\5\u01a0"+
		"\u00d1\2\u07e1\u07df\3\2\2\2\u07e1\u07e0\3\2\2\2\u07e2\u013f\3\2\2\2\u07e3"+
		"\u07e5\5\u0142\u00a2\2\u07e4\u07e3\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e4"+
		"\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u0141\3\2\2\2\u07e8\u07ec\7~\2\2\u07e9"+
		"\u07ea\5\u0144\u00a3\2\u07ea\u07eb\7\u0084\2\2\u07eb\u07ed\3\2\2\2\u07ec"+
		"\u07e9\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee\u07f0\5\u0146"+
		"\u00a4\2\u07ef\u07f1\7\u0083\2\2\u07f0\u07ef\3\2\2\2\u07f0\u07f1\3\2\2"+
		"\2\u07f1\u07f2\3\2\2\2\u07f2\u07f3\7\177\2\2\u07f3\u0143\3\2\2\2\u07f4"+
		"\u07f7\5\u017a\u00be\2\u07f5\u07f7\5\u01a0\u00d1\2\u07f6\u07f4\3\2\2\2"+
		"\u07f6\u07f5\3\2\2\2\u07f7\u0145\3\2\2\2\u07f8\u07fd\5\u0148\u00a5\2\u07f9"+
		"\u07fa\7\u0083\2\2\u07fa\u07fc\5\u0148\u00a5\2\u07fb\u07f9\3\2\2\2\u07fc"+
		"\u07ff\3\2\2\2\u07fd\u07fb\3\2\2\2\u07fd\u07fe\3\2\2\2\u07fe\u0147\3\2"+
		"\2\2\u07ff\u07fd\3\2\2\2\u0800\u080d\5\4\3\2\u0801\u080a\7\u0080\2\2\u0802"+
		"\u0807\5\u014a\u00a6\2\u0803\u0804\7\u0083\2\2\u0804\u0806\5\u014a\u00a6"+
		"\2\u0805\u0803\3\2\2\2\u0806\u0809\3\2\2\2\u0807\u0805\3\2\2\2\u0807\u0808"+
		"\3\2\2\2\u0808\u080b\3\2\2\2\u0809\u0807\3\2\2\2\u080a\u0802\3\2\2\2\u080a"+
		"\u080b\3\2\2\2\u080b\u080c\3\2\2\2\u080c\u080e\7\u0081\2\2\u080d\u0801"+
		"\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u0149\3\2\2\2\u080f\u0810\5\u01a0\u00d1"+
		"\2\u0810\u0811\7\u0084\2\2\u0811\u0813\3\2\2\2\u0812\u080f\3\2\2\2\u0812"+
		"\u0813\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0815\5\32\16\2\u0815\u014b\3"+
		"\2\2\2\u0816\u0819\5\n\6\2\u0817\u0819\5\22\n\2\u0818\u0816\3\2\2\2\u0818"+
		"\u0817\3\2\2\2\u0819\u081e\3\2\2\2\u081a\u081d\5\u0124\u0093\2\u081b\u081d"+
		"\7\u0093\2\2\u081c\u081a\3\2\2\2\u081c\u081b\3\2\2\2\u081d\u0820\3\2\2"+
		"\2\u081e\u081c\3\2\2\2\u081e\u081f\3\2\2\2\u081f\u0821\3\2\2\2\u0820\u081e"+
		"\3\2\2\2\u0821\u0822\7\u0088\2\2\u0822\u0826\3\2\2\2\u0823\u0824\7l\2"+
		"\2\u0824\u0826\7\u0088\2\2\u0825\u0818\3\2\2\2\u0825\u0823\3\2\2\2\u0826"+
		"\u014d\3\2\2\2\u0827\u082c\5\u0150\u00a9\2\u0828\u0829\7\u0083\2\2\u0829"+
		"\u082b\5\u0150\u00a9\2\u082a\u0828\3\2\2\2\u082b\u082e\3\2\2\2\u082c\u082a"+
		"\3\2\2\2\u082c\u082d\3\2\2\2\u082d\u014f\3\2\2\2\u082e\u082c\3\2\2\2\u082f"+
		"\u0830\5\u01a0\u00d1\2\u0830\u0831\7\u0090\2\2\u0831\u0832\5\u0152\u00aa"+
		"\2\u0832\u0151\3\2\2\2\u0833\u0835\7\u008b\2\2\u0834\u0833\3\2\2\2\u0834"+
		"\u0835\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0839\5\32\16\2\u0837\u0839\5"+
		"\u0156\u00ac\2\u0838\u0834\3\2\2\2\u0838\u0837\3\2\2\2\u0839\u0153\3\2"+
		"\2\2\u083a\u083b\5\u01a0\u00d1\2\u083b\u083c\7~\2\2\u083c\u083d\5\32\16"+
		"\2\u083d\u083e\7\177\2\2\u083e\u0155\3\2\2\2\u083f\u0840\7Z\2\2\u0840"+
		"\u0841\5\6\4\2\u0841\u0842\7~\2\2\u0842\u0843\5\32\16\2\u0843\u0844\7"+
		"\177\2\2\u0844\u0157\3\2\2\2\u0845\u0846\7\u0090\2\2\u0846\u0847\7\u0092"+
		"\2\2\u0847\u0848\6\u00ad\2\3\u0848\u0159\3\2\2\2\u0849\u084a\7\u0092\2"+
		"\2\u084a\u084b\7\u0092\2\2\u084b\u084c\6\u00ae\3\3\u084c\u015b\3\2\2\2"+
		"\u084d\u084e\7\u0092\2\2\u084e\u084f\7\u009e\2\2\u084f\u0850\6\u00af\4"+
		"\3\u0850\u015d\3\2\2\2\u0851\u0852\7\u0080\2\2\u0852\u0853\5\u0160\u00b1"+
		"\2\u0853\u0854\7\u0081\2\2\u0854\u015f\3\2\2\2\u0855\u0856\b\u00b1\1\2"+
		"\u0856\u0857\5\u0162\u00b2\2\u0857\u0858\7\u0083\2\2\u0858\u0859\5\u0162"+
		"\u00b2\2\u0859\u085f\3\2\2\2\u085a\u085b\f\3\2\2\u085b\u085c\7\u0083\2"+
		"\2\u085c\u085e\5\u0162\u00b2\2\u085d\u085a\3\2\2\2\u085e\u0861\3\2\2\2"+
		"\u085f\u085d\3\2\2\2\u085f\u0860\3\2\2\2\u0860\u0161\3\2\2\2\u0861\u085f"+
		"\3\2\2\2\u0862\u0865\5\n\6\2\u0863\u0865\5\22\n\2\u0864\u0862\3\2\2\2"+
		"\u0864\u0863\3\2\2\2\u0865\u0867\3\2\2\2\u0866\u0868\5\u01a0\u00d1\2\u0867"+
		"\u0866\3\2\2\2\u0867\u0868\3\2\2\2\u0868\u0163\3\2\2\2\u0869\u086a\7\u0080"+
		"\2\2\u086a\u086b\5\u0166\u00b4\2\u086b\u086c\7\u0081\2\2\u086c\u0165\3"+
		"\2\2\2\u086d\u086e\b\u00b4\1\2\u086e\u086f\5\u0168\u00b5\2\u086f\u0870"+
		"\7\u0083\2\2\u0870\u0871\5\u0168\u00b5\2\u0871\u0877\3\2\2\2\u0872\u0873"+
		"\f\3\2\2\u0873\u0874\7\u0083\2\2\u0874\u0876\5\u0168\u00b5\2\u0875\u0872"+
		"\3\2\2\2\u0876\u0879\3\2\2\2\u0877\u0875\3\2\2\2\u0877\u0878\3\2\2\2\u0878"+
		"\u0167\3\2\2\2\u0879\u0877\3\2\2\2\u087a\u087b\5\u01a0\u00d1\2\u087b\u087c"+
		"\7\u0084\2\2\u087c\u087e\3\2\2\2\u087d\u087a\3\2\2\2\u087d\u087e\3\2\2"+
		"\2\u087e\u087f\3\2\2\2\u087f\u0880\5\32\16\2\u0880\u0169\3\2\2\2\u0881"+
		"\u0889\5\u016c\u00b7\2\u0882\u0889\5\u016e\u00b8\2\u0883\u0889\7t\2\2"+
		"\u0884\u0889\7u\2\2\u0885\u0889\7v\2\2\u0886\u0889\7w\2\2\u0887\u0889"+
		"\7D\2\2\u0888\u0881\3\2\2\2\u0888\u0882\3\2\2\2\u0888\u0883\3\2\2\2\u0888"+
		"\u0884\3\2\2\2\u0888\u0885\3\2\2\2\u0888\u0886\3\2\2\2\u0888\u0887\3\2"+
		"\2\2\u0889\u016b\3\2\2\2\u088a\u088b\t\21\2\2\u088b\u016d\3\2\2\2\u088c"+
		"\u0891\5\u0170\u00b9\2\u088d\u0891\5\u0172\u00ba\2\u088e\u0891\7x\2\2"+
		"\u088f\u0891\7y\2\2\u0890\u088c\3\2\2\2\u0890\u088d\3\2\2\2\u0890\u088e"+
		"\3\2\2\2\u0890\u088f\3\2\2\2\u0891\u016f\3\2\2\2\u0892\u0896\7z\2\2\u0893"+
		"\u0895\5\u0174\u00bb\2\u0894\u0893\3\2\2\2\u0895\u0898\3\2\2\2\u0896\u0894"+
		"\3\2\2\2\u0896\u0897\3\2\2\2\u0897\u0899\3\2\2\2\u0898\u0896\3\2\2\2\u0899"+
		"\u089a\7\u00ad\2\2\u089a\u0171\3\2\2\2\u089b\u089f\7{\2\2\u089c\u089e"+
		"\5\u0176\u00bc\2\u089d\u089c\3\2\2\2\u089e\u08a1\3\2\2\2\u089f\u089d\3"+
		"\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u08a2\3\2\2\2\u08a1\u089f\3\2\2\2\u08a2"+
		"\u08a3\7\u00ad\2\2\u08a3\u0173\3\2\2\2\u08a4\u08a9\5\u0178\u00bd\2\u08a5"+
		"\u08a9\7\u00a9\2\2\u08a6\u08a9\7\u00ab\2\2\u08a7\u08a9\7\u00ae\2\2\u08a8"+
		"\u08a4\3\2\2\2\u08a8\u08a5\3\2\2\2\u08a8\u08a6\3\2\2\2\u08a8\u08a7\3\2"+
		"\2\2\u08a9\u0175\3\2\2\2\u08aa\u08af\5\u0178\u00bd\2\u08ab\u08af\7\u00a9"+
		"\2\2\u08ac\u08af\7\u00ac\2\2\u08ad\u08af\7\u00af\2\2\u08ae\u08aa\3\2\2"+
		"\2\u08ae\u08ab\3\2\2\2\u08ae\u08ac\3\2\2\2\u08ae\u08ad\3\2\2\2\u08af\u0177"+
		"\3\2\2\2\u08b0\u08b5\5\32\16\2\u08b1\u08b2\7\u0083\2\2\u08b2\u08b4\5\32"+
		"\16\2\u08b3\u08b1\3\2\2\2\u08b4\u08b7\3\2\2\2\u08b5\u08b3\3\2\2\2\u08b5"+
		"\u08b6\3\2\2\2\u08b6\u08be\3\2\2\2\u08b7\u08b5\3\2\2\2\u08b8\u08ba\7\u0084"+
		"\2\2\u08b9\u08bb\7\u00b1\2\2\u08ba\u08b9\3\2\2\2\u08bb\u08bc\3\2\2\2\u08bc"+
		"\u08ba\3\2\2\2\u08bc\u08bd\3\2\2\2\u08bd\u08bf\3\2\2\2\u08be\u08b8\3\2"+
		"\2\2\u08be\u08bf\3\2\2\2\u08bf\u0179\3\2\2\2\u08c0\u08c1\t\22\2\2\u08c1"+
		"\u017b\3\2\2\2\u08c2\u08c3\7\33\2\2\u08c3\u08c5\5\u01a0\u00d1\2\u08c4"+
		"\u08c6\5\u00c8e\2\u08c5\u08c4\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6\u08c8"+
		"\3\2\2\2\u08c7\u08c9\5\u00ccg\2\u08c8\u08c7\3\2\2\2\u08c8\u08c9\3\2\2"+
		"\2\u08c9\u08cb\3\2\2\2\u08ca\u08cc\5\u00d0i\2\u08cb\u08ca\3\2\2\2\u08cb"+
		"\u08cc\3\2\2\2\u08cc\u08cd\3\2\2\2\u08cd\u08cf\5\u00dco\2\u08ce\u08d0"+
		"\7\u0085\2\2\u08cf\u08ce\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0\u017d\3\2\2"+
		"\2\u08d1\u08d2\7]\2\2\u08d2\u08d4\5\u01a0\u00d1\2\u08d3\u08d5\5\u00c8"+
		"e\2\u08d4\u08d3\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5\u08d7\3\2\2\2\u08d6"+
		"\u08d8\5\u011c\u008f\2\u08d7\u08d6\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08da"+
		"\3\2\2\2\u08d9\u08db\5\u00d0i\2\u08da\u08d9\3\2\2\2\u08da\u08db\3\2\2"+
		"\2\u08db\u08dc\3\2\2\2\u08dc\u08de\5\u011e\u0090\2\u08dd\u08df\7\u0085"+
		"\2\2\u08de\u08dd\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u017f\3\2\2\2\u08e0"+
		"\u08e1\79\2\2\u08e1\u08e3\5\u01a0\u00d1\2\u08e2\u08e4\5\u0128\u0095\2"+
		"\u08e3\u08e2\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4\u08e6\3\2\2\2\u08e5\u08e7"+
		"\5\u012e\u0098\2\u08e6\u08e5\3\2\2\2\u08e6\u08e7\3\2\2\2\u08e7\u08e9\3"+
		"\2\2\2\u08e8\u08ea\5\u00d0i\2\u08e9\u08e8\3\2\2\2\u08e9\u08ea\3\2\2\2"+
		"\u08ea\u08eb\3\2\2\2\u08eb\u08ed\5\u0130\u0099\2\u08ec\u08ee\7\u0085\2"+
		"\2\u08ed\u08ec\3\2\2\2\u08ed\u08ee\3\2\2\2\u08ee\u0181\3\2\2\2\u08ef\u08f0"+
		"\7&\2\2\u08f0\u08f2\5\u01a0\u00d1\2\u08f1\u08f3\5\u0136\u009c\2\u08f2"+
		"\u08f1\3\2\2\2\u08f2\u08f3\3\2\2\2\u08f3\u08f4\3\2\2\2\u08f4\u08f6\5\u0138"+
		"\u009d\2\u08f5\u08f7\7\u0085\2\2\u08f6\u08f5\3\2\2\2\u08f6\u08f7\3\2\2"+
		"\2\u08f7\u0183\3\2\2\2\u08f8\u08f9\7 \2\2\u08f9\u08fa\5\u00f4{\2\u08fa"+
		"\u08fc\5\u01a0\u00d1\2\u08fb\u08fd\5\u0128\u0095\2\u08fc\u08fb\3\2\2\2"+
		"\u08fc\u08fd\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u0900\7\u0080\2\2\u08ff"+
		"\u0901\5\u00fa~\2\u0900\u08ff\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0902"+
		"\3\2\2\2\u0902\u0904\7\u0081\2\2\u0903\u0905\5\u00d0i\2\u0904\u0903\3"+
		"\2\2\2\u0904\u0905\3\2\2\2\u0905\u0906\3\2\2\2\u0906\u0907\7\u0085\2\2"+
		"\u0907\u0185\3\2\2\2\u0908\u0909\7(\2\2\u0909\u0912\5\6\4\2\u090a\u090b"+
		"\5\u00eex\2\u090b\u090c\7\u0085\2\2\u090c\u0913\3\2\2\2\u090d\u090e\5"+
		"\u00f6|\2\u090e\u090f\7|\2\2\u090f\u0910\5\u010e\u0088\2\u0910\u0911\7"+
		"}\2\2\u0911\u0913\3\2\2\2\u0912\u090a\3\2\2\2\u0912\u090d\3\2\2\2\u0913"+
		"\u0187\3\2\2\2\u0914\u0915\5\u00eex\2\u0915\u0916\7\u0085\2\2\u0916\u0189"+
		"\3\2\2\2\u0917\u0925\5\u00f6|\2\u0918\u0919\7|\2\2\u0919\u091a\5\u0104"+
		"\u0083\2\u091a\u091f\7}\2\2\u091b\u091c\7\u0090\2\2\u091c\u091d\5\u00f2"+
		"z\2\u091d\u091e\7\u0085\2\2\u091e\u0920\3\2\2\2\u091f\u091b\3\2\2\2\u091f"+
		"\u0920\3\2\2\2\u0920\u0926\3\2\2\2\u0921\u0922\5\u0158\u00ad\2\u0922\u0923"+
		"\5\32\16\2\u0923\u0924\7\u0085\2\2\u0924\u0926\3\2\2\2\u0925\u0918\3\2"+
		"\2\2\u0925\u0921\3\2\2\2\u0926\u018b\3\2\2\2\u0927\u0928\7\34\2\2\u0928"+
		"\u0929\5\6\4\2\u0929\u092a\5\u00eav\2\u092a\u092b\7\u0085\2\2\u092b\u018d"+
		"\3\2\2\2\u092c\u092d\7_\2\2\u092d\u092e\7~\2\2\u092e\u092f\5\u00fa~\2"+
		"\u092f\u0938\7\177\2\2\u0930\u0931\7|\2\2\u0931\u0932\5\u0104\u0083\2"+
		"\u0932\u0933\7}\2\2\u0933\u0939\3\2\2\2\u0934\u0935\5\u0158\u00ad\2\u0935"+
		"\u0936\5\32\16\2\u0936\u0937\7\u0085\2\2\u0937\u0939\3\2\2\2\u0938\u0930"+
		"\3\2\2\2\u0938\u0934\3\2\2\2\u0939\u018f\3\2\2\2\u093a\u093b\7\u008f\2"+
		"\2\u093b\u093c\5\u01a0\u00d1\2\u093c\u093d\7\u0080\2\2\u093d\u093e\7\u0081"+
		"\2\2\u093e\u093f\5\u011a\u008e\2\u093f\u0191\3\2\2\2\u0940\u0941\5\u01a0"+
		"\u00d1\2\u0941\u0943\7\u0080\2\2\u0942\u0944\5\u00fa~\2\u0943\u0942\3"+
		"\2\2\2\u0943\u0944\3\2\2\2\u0944\u0945\3\2\2\2\u0945\u0947\7\u0081\2\2"+
		"\u0946\u0948\5\u0118\u008d\2\u0947\u0946\3\2\2\2\u0947\u0948\3\2\2\2\u0948"+
		"\u094e\3\2\2\2\u0949\u094f\5\u011a\u008e\2\u094a\u094b\5\u0158\u00ad\2"+
		"\u094b\u094c\5\32\16\2\u094c\u094d\7\u0085\2\2\u094d\u094f\3\2\2\2\u094e"+
		"\u0949\3\2\2\2\u094e\u094a\3\2\2\2\u094f\u0193\3\2\2\2\u0950\u0952\5\u0196"+
		"\u00cc\2\u0951\u0953\5\u00c8e\2\u0952\u0951\3\2\2\2\u0952\u0953\3\2\2"+
		"\2\u0953\u0954\3\2\2\2\u0954\u0956\7\u0080\2\2\u0955\u0957\5\u00fa~\2"+
		"\u0956\u0955\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u0958\3\2\2\2\u0958\u095a"+
		"\7\u0081\2\2\u0959\u095b\5\u00d0i\2\u095a\u0959\3\2\2\2\u095a\u095b\3"+
		"\2\2\2\u095b\u0961\3\2\2\2\u095c\u0962\5\u00f8}\2\u095d\u095e\5\u0158"+
		"\u00ad\2\u095e\u095f\5\32\16\2\u095f\u0960\7\u0085\2\2\u0960\u0962\3\2"+
		"\2\2\u0961\u095c\3\2\2\2\u0961\u095d\3\2\2\2\u0962\u0195\3\2\2\2\u0963"+
		"\u0969\5\u01a0\u00d1\2\u0964\u0965\5\u01a0\u00d1\2\u0965\u0966\7\u0094"+
		"\2\2\u0966\u0967\5\u01a0\u00d1\2\u0967\u0969\3\2\2\2\u0968\u0963\3\2\2"+
		"\2\u0968\u0964\3\2\2\2\u0969\u0971\3\2\2\2\u096a\u096c\5\24\13\2\u096b"+
		"\u096a\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u096d\3\2\2\2\u096d\u096e\7\u0082"+
		"\2\2\u096e\u0970\5\u01a0\u00d1\2\u096f\u096b\3\2\2\2\u0970\u0973\3\2\2"+
		"\2\u0971\u096f\3\2\2\2\u0971\u0972\3\2\2\2\u0972\u0197\3\2\2\2\u0973\u0971"+
		"\3\2\2\2\u0974\u0975\7G\2\2\u0975\u0976\5\u0114\u008b\2\u0976\u0977\7"+
		"\u0080\2\2\u0977\u097a\5\u019a\u00ce\2\u0978\u0979\7\u0083\2\2\u0979\u097b"+
		"\5\u019a\u00ce\2\u097a\u0978\3\2\2\2\u097a\u097b\3\2\2\2\u097b\u097c\3"+
		"\2\2\2\u097c\u0982\7\u0081\2\2\u097d\u0983\5\u011a\u008e\2\u097e\u097f"+
		"\5\u0158\u00ad\2\u097f\u0980\5\32\16\2\u0980\u0981\7\u0085\2\2\u0981\u0983"+
		"\3\2\2\2\u0982\u097d\3\2\2\2\u0982\u097e\3\2\2\2\u0983\u0199\3\2\2\2\u0984"+
		"\u0985\5\6\4\2\u0985\u0988\5\u01a0\u00d1\2\u0986\u0987\7\u0090\2\2\u0987"+
		"\u0989\5\32\16\2\u0988\u0986\3\2\2\2\u0988\u0989\3\2\2\2\u0989\u019b\3"+
		"\2\2\2\u098a\u098c\7\u0080\2\2\u098b\u098d\5\26\f\2\u098c\u098b\3\2\2"+
		"\2\u098c\u098d\3\2\2\2\u098d\u098e\3\2\2\2\u098e\u098f\7\u0081\2\2\u098f"+
		"\u019d\3\2\2\2\u0990\u0992\7\u0080\2\2\u0991\u0993\5\26\f\2\u0992\u0991"+
		"\3\2\2\2\u0992\u0993\3\2\2\2\u0993\u0994\3\2\2\2\u0994\u0996\7\u0081\2"+
		"\2\u0995\u0997\5J&\2\u0996";
	private static final String _serializedATNSegment1 =
		"\u0995\3\2\2\2\u0996\u0997\3\2\2\2\u0997\u019f\3\2\2\2\u0998\u0999\t\23"+
		"\2\2\u0999\u01a1\3\2\2\2\u0136\u01a3\u01a6\u01a9\u01ae\u01b2\u01b8\u01bb"+
		"\u01c0\u01c4\u01cb\u01cd\u01d1\u01d7\u01db\u01e0\u01ea\u01f2\u01fc\u0202"+
		"\u0205\u0209\u020f\u0214\u0225\u022d\u0232\u0239\u0241\u0249\u0251\u0259"+
		"\u0261\u026b\u026d\u0273\u0278\u0280\u0288\u02a3\u02a9\u02b2\u02b7\u02bc"+
		"\u02c2\u02d0\u02d6\u02e2\u02e6\u02eb\u02ef\u02f5\u02fc\u030e\u0311\u0316"+
		"\u0319\u0328\u032e\u0331\u0336\u0339\u0341\u0349\u0354\u0359\u035e\u0360"+
		"\u0369\u0371\u0378\u0380\u0384\u038d\u0392\u0394\u039d\u03a5\u03a9\u03ae"+
		"\u03b0\u03b5\u03b9\u03c0\u03c8\u03ca\u03ce\u03d1\u03d4\u03e5\u03ec\u03f0"+
		"\u03fa\u03ff\u0406\u040f\u0414\u041b\u0427\u0432\u043a\u043f\u0448\u0451"+
		"\u0456\u045e\u046b\u0475\u048b\u048f\u0493\u04a9\u04ae\u04b3\u04ba\u04bd"+
		"\u04d3\u04df\u04e3\u04ed\u04f2\u04f7\u04fc\u0504\u0509\u0513\u0518\u0520"+
		"\u0523\u052a\u0531\u0535\u0538\u053e\u0542\u0548\u0556\u055c\u0563\u0568"+
		"\u056b\u056e\u0575\u057f\u0590\u0595\u0599\u059c\u059f\u05a6\u05ac\u05b4"+
		"\u05ba\u05c4\u05cc\u05d2\u05dd\u05e1\u05e3\u05e8\u05ef\u05f8\u05ff\u0602"+
		"\u0605\u0609\u060e\u061b\u0625\u0631\u0638\u0644\u064a\u0651\u0657\u065b"+
		"\u0661\u0667\u0669\u0670\u0674\u0677\u067b\u0680\u0687\u068a\u068f\u0694"+
		"\u0696\u0699\u069c\u06a2\u06a5\u06b1\u06b5\u06b8\u06c2\u06c5\u06cb\u06e6"+
		"\u06f3\u06f9\u0702\u0708\u070b\u0713\u0717\u071d\u0723\u0729\u0734\u0738"+
		"\u073a\u0744\u074a\u074d\u075a\u0760\u0763\u0766\u076b\u076f\u0773\u0789"+
		"\u078c\u0791\u0795\u0799\u07a2\u07a5\u07aa\u07ae\u07b3\u07b7\u07b9\u07c4"+
		"\u07c8\u07ca\u07cf\u07d4\u07db\u07e1\u07e6\u07ec\u07f0\u07f6\u07fd\u0807"+
		"\u080a\u080d\u0812\u0818\u081c\u081e\u0825\u082c\u0834\u0838\u085f\u0864"+
		"\u0867\u0877\u087d\u0888\u0890\u0896\u089f\u08a8\u08ae\u08b5\u08bc\u08be"+
		"\u08c5\u08c8\u08cb\u08cf\u08d4\u08d7\u08da\u08de\u08e3\u08e6\u08e9\u08ed"+
		"\u08f2\u08f6\u08fc\u0900\u0904\u0912\u091f\u0925\u0938\u0943\u0947\u094e"+
		"\u0952\u0956\u095a\u0961\u0968\u096b\u0971\u097a\u0982\u0988\u098c\u0992"+
		"\u0996";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}