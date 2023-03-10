// Generated from expr.g4 by ANTLR 4.9.2

package parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class exprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		INTEGERCONSTANT=46, STRINGCONSTANT=47, ID=48, BOPERATOR=49, WS=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "INTEGERCONSTANT", "STRINGCONSTANT", 
			"ID", "BOPERATOR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'while'", "'do'", "'for'", "':='", "'to'", "'break'", 
			"'let'", "'in'", "'end'", "'else'", "'|'", "'&'", "'='", "'<>'", "'>'", 
			"'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'nil'", "'('", "')'", 
			"'['", "']'", "'of'", "'{'", "'}'", "'/*'", "'*/'", "';'", "','", "'.'", 
			"'type'", "'array of'", "':'", "'int'", "'string'", "'var'", "'function'", 
			"'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "INTEGERCONSTANT", 
			"STRINGCONSTANT", "ID", "BOPERATOR", "WS"
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


	public exprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u012b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\6/\u0102\n/\r/\16/\u0103"+
		"\3\60\3\60\7\60\u0108\n\60\f\60\16\60\u010b\13\60\3\60\3\60\3\61\3\61"+
		"\7\61\u0111\n\61\f\61\16\61\u0114\13\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u011f\n\62\3\63\3\63\3\63\3\63\3\63\6\63\u0126\n"+
		"\63\r\63\16\63\u0127\3\63\3\63\2\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64\3\2\t\t\2\"#.\60<=AAC\\aac|\4\2C\\c|\6\2\62;C\\"+
		"aac|\6\2,-//\61\61??\4\2>>@@\4\2((~~\4\2\f\f\"\"\2\u0134\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\3g\3\2\2\2\5j\3\2\2\2\7o\3\2\2\2\tu\3\2\2\2\13x\3\2\2\2"+
		"\r|\3\2\2\2\17\177\3\2\2\2\21\u0082\3\2\2\2\23\u0088\3\2\2\2\25\u008c"+
		"\3\2\2\2\27\u008f\3\2\2\2\31\u0093\3\2\2\2\33\u0098\3\2\2\2\35\u009a\3"+
		"\2\2\2\37\u009c\3\2\2\2!\u009e\3\2\2\2#\u00a1\3\2\2\2%\u00a3\3\2\2\2\'"+
		"\u00a5\3\2\2\2)\u00a8\3\2\2\2+\u00ab\3\2\2\2-\u00ad\3\2\2\2/\u00af\3\2"+
		"\2\2\61\u00b1\3\2\2\2\63\u00b3\3\2\2\2\65\u00b7\3\2\2\2\67\u00b9\3\2\2"+
		"\29\u00bb\3\2\2\2;\u00bd\3\2\2\2=\u00bf\3\2\2\2?\u00c2\3\2\2\2A\u00c4"+
		"\3\2\2\2C\u00c6\3\2\2\2E\u00c9\3\2\2\2G\u00cc\3\2\2\2I\u00ce\3\2\2\2K"+
		"\u00d0\3\2\2\2M\u00d2\3\2\2\2O\u00d7\3\2\2\2Q\u00e0\3\2\2\2S\u00e2\3\2"+
		"\2\2U\u00e6\3\2\2\2W\u00ed\3\2\2\2Y\u00f1\3\2\2\2[\u00fa\3\2\2\2]\u0101"+
		"\3\2\2\2_\u0105\3\2\2\2a\u010e\3\2\2\2c\u011e\3\2\2\2e\u0125\3\2\2\2g"+
		"h\7k\2\2hi\7h\2\2i\4\3\2\2\2jk\7v\2\2kl\7j\2\2lm\7g\2\2mn\7p\2\2n\6\3"+
		"\2\2\2op\7y\2\2pq\7j\2\2qr\7k\2\2rs\7n\2\2st\7g\2\2t\b\3\2\2\2uv\7f\2"+
		"\2vw\7q\2\2w\n\3\2\2\2xy\7h\2\2yz\7q\2\2z{\7t\2\2{\f\3\2\2\2|}\7<\2\2"+
		"}~\7?\2\2~\16\3\2\2\2\177\u0080\7v\2\2\u0080\u0081\7q\2\2\u0081\20\3\2"+
		"\2\2\u0082\u0083\7d\2\2\u0083\u0084\7t\2\2\u0084\u0085\7g\2\2\u0085\u0086"+
		"\7c\2\2\u0086\u0087\7m\2\2\u0087\22\3\2\2\2\u0088\u0089\7n\2\2\u0089\u008a"+
		"\7g\2\2\u008a\u008b\7v\2\2\u008b\24\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e"+
		"\7p\2\2\u008e\26\3\2\2\2\u008f\u0090\7g\2\2\u0090\u0091\7p\2\2\u0091\u0092"+
		"\7f\2\2\u0092\30\3\2\2\2\u0093\u0094\7g\2\2\u0094\u0095\7n\2\2\u0095\u0096"+
		"\7u\2\2\u0096\u0097\7g\2\2\u0097\32\3\2\2\2\u0098\u0099\7~\2\2\u0099\34"+
		"\3\2\2\2\u009a\u009b\7(\2\2\u009b\36\3\2\2\2\u009c\u009d\7?\2\2\u009d"+
		" \3\2\2\2\u009e\u009f\7>\2\2\u009f\u00a0\7@\2\2\u00a0\"\3\2\2\2\u00a1"+
		"\u00a2\7@\2\2\u00a2$\3\2\2\2\u00a3\u00a4\7>\2\2\u00a4&\3\2\2\2\u00a5\u00a6"+
		"\7@\2\2\u00a6\u00a7\7?\2\2\u00a7(\3\2\2\2\u00a8\u00a9\7>\2\2\u00a9\u00aa"+
		"\7?\2\2\u00aa*\3\2\2\2\u00ab\u00ac\7-\2\2\u00ac,\3\2\2\2\u00ad\u00ae\7"+
		"/\2\2\u00ae.\3\2\2\2\u00af\u00b0\7,\2\2\u00b0\60\3\2\2\2\u00b1\u00b2\7"+
		"\61\2\2\u00b2\62\3\2\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6"+
		"\7n\2\2\u00b6\64\3\2\2\2\u00b7\u00b8\7*\2\2\u00b8\66\3\2\2\2\u00b9\u00ba"+
		"\7+\2\2\u00ba8\3\2\2\2\u00bb\u00bc\7]\2\2\u00bc:\3\2\2\2\u00bd\u00be\7"+
		"_\2\2\u00be<\3\2\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7h\2\2\u00c1>\3\2"+
		"\2\2\u00c2\u00c3\7}\2\2\u00c3@\3\2\2\2\u00c4\u00c5\7\177\2\2\u00c5B\3"+
		"\2\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00c8\7,\2\2\u00c8D\3\2\2\2\u00c9\u00ca"+
		"\7,\2\2\u00ca\u00cb\7\61\2\2\u00cbF\3\2\2\2\u00cc\u00cd\7=\2\2\u00cdH"+
		"\3\2\2\2\u00ce\u00cf\7.\2\2\u00cfJ\3\2\2\2\u00d0\u00d1\7\60\2\2\u00d1"+
		"L\3\2\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7{\2\2\u00d4\u00d5\7r\2\2\u00d5"+
		"\u00d6\7g\2\2\u00d6N\3\2\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7t\2\2\u00d9"+
		"\u00da\7t\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7{\2\2\u00dc\u00dd\7\"\2"+
		"\2\u00dd\u00de\7q\2\2\u00de\u00df\7h\2\2\u00dfP\3\2\2\2\u00e0\u00e1\7"+
		"<\2\2\u00e1R\3\2\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5"+
		"\7v\2\2\u00e5T\3\2\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9"+
		"\7t\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7i\2\2\u00ec"+
		"V\3\2\2\2\u00ed\u00ee\7x\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7t\2\2\u00f0"+
		"X\3\2\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7p\2\2\u00f4"+
		"\u00f5\7e\2\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7q\2\2"+
		"\u00f8\u00f9\7p\2\2\u00f9Z\3\2\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc\7t\2"+
		"\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7v\2\2\u00ff\\\3"+
		"\2\2\2\u0100\u0102\4\62;\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104^\3\2\2\2\u0105\u0109\7$\2\2\u0106"+
		"\u0108\t\2\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c"+
		"\u010d\7$\2\2\u010d`\3\2\2\2\u010e\u0112\t\3\2\2\u010f\u0111\t\4\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113b\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u011f\t\5\2\2\u0116\u0117"+
		"\7>\2\2\u0117\u011f\7@\2\2\u0118\u011f\t\6\2\2\u0119\u011a\7@\2\2\u011a"+
		"\u011f\7?\2\2\u011b\u011c\7>\2\2\u011c\u011f\7?\2\2\u011d\u011f\t\7\2"+
		"\2\u011e\u0115\3\2\2\2\u011e\u0116\3\2\2\2\u011e\u0118\3\2\2\2\u011e\u0119"+
		"\3\2\2\2\u011e\u011b\3\2\2\2\u011e\u011d\3\2\2\2\u011fd\3\2\2\2\u0120"+
		"\u0126\t\b\2\2\u0121\u0122\7\"\2\2\u0122\u0123\7\"\2\2\u0123\u0124\7\""+
		"\2\2\u0124\u0126\7\"\2\2\u0125\u0120\3\2\2\2\u0125\u0121\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012a\b\63\2\2\u012af\3\2\2\2\t\2\u0103\u0109\u0112\u011e\u0125"+
		"\u0127\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}