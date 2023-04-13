// Generated from apoc/custom/Signature.g4 by ANTLR 4.7.2
package apoc.custom;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SignatureLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, NEWLINE=45, 
		QUOTED_IDENTIFIER=46, IDENTIFIER=47, WS=48, INT_VALUE=49, FLOAT_VALUE=50, 
		QUOTED_STRING_VALUE=51, PLAIN_STRING_VALUE=52;
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
			"T__41", "T__42", "T__43", "NEWLINE", "QUOTED_IDENTIFIER", "IDENTIFIER", 
			"WS", "INT_VALUE", "FLOAT_VALUE", "QUOTED_STRING_VALUE", "PLAIN_STRING_VALUE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'::'", "'='", "'.'", "'VOID'", "'LIST'", 
			"'?'", "' OF '", "'MAP'", "'ANY'", "'NODE'", "'REL'", "'RELATIONSHIP'", 
			"'EDGE'", "'PATH'", "'NUMBER'", "'LONG'", "'INT'", "'INTEGER'", "'FLOAT'", 
			"'DOUBLE'", "'BOOL'", "'BOOLEAN'", "'DATE'", "'TIME'", "'LOCALTIME'", 
			"'DATETIME'", "'LOCALDATETIME'", "'DURATION'", "'POINT'", "'GEO'", "'GEOMETRY'", 
			"'STRING'", "'TEXT'", "'true'", "'false'", "'null'", "'['", "']'", "'{'", 
			"':'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "NEWLINE", "QUOTED_IDENTIFIER", 
			"IDENTIFIER", "WS", "INT_VALUE", "FLOAT_VALUE", "QUOTED_STRING_VALUE", 
			"PLAIN_STRING_VALUE"
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


	public SignatureLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Signature.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u018c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\6.\u0152\n.\r.\16.\u0153\3/\3/\6/\u0158"+
		"\n/\r/\16/\u0159\3/\3/\3\60\3\60\6\60\u0160\n\60\r\60\16\60\u0161\3\61"+
		"\6\61\u0165\n\61\r\61\16\61\u0166\3\61\3\61\3\62\6\62\u016c\n\62\r\62"+
		"\16\62\u016d\3\63\6\63\u0171\n\63\r\63\16\63\u0172\3\63\3\63\6\63\u0177"+
		"\n\63\r\63\16\63\u0178\3\63\3\63\3\63\5\63\u017e\n\63\3\64\3\64\6\64\u0182"+
		"\n\64\r\64\16\64\u0183\3\64\3\64\3\65\6\65\u0189\n\65\r\65\16\65\u018a"+
		"\5\u0159\u0183\u018a\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66\3\2\t\4\2\f\f\17\17\4\2``bb\5\2C\\aac|\6\2\62;C\\"+
		"aac|\5\2\13\f\17\17\"\"\3\2\62;\4\2$$``\2\u0195\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7o\3\2\2\2\tq\3\2\2"+
		"\2\13t\3\2\2\2\rv\3\2\2\2\17x\3\2\2\2\21}\3\2\2\2\23\u0082\3\2\2\2\25"+
		"\u0084\3\2\2\2\27\u0089\3\2\2\2\31\u008d\3\2\2\2\33\u0091\3\2\2\2\35\u0096"+
		"\3\2\2\2\37\u009a\3\2\2\2!\u00a7\3\2\2\2#\u00ac\3\2\2\2%\u00b1\3\2\2\2"+
		"\'\u00b8\3\2\2\2)\u00bd\3\2\2\2+\u00c1\3\2\2\2-\u00c9\3\2\2\2/\u00cf\3"+
		"\2\2\2\61\u00d6\3\2\2\2\63\u00db\3\2\2\2\65\u00e3\3\2\2\2\67\u00e8\3\2"+
		"\2\29\u00ed\3\2\2\2;\u00f7\3\2\2\2=\u0100\3\2\2\2?\u010e\3\2\2\2A\u0117"+
		"\3\2\2\2C\u011d\3\2\2\2E\u0121\3\2\2\2G\u012a\3\2\2\2I\u0131\3\2\2\2K"+
		"\u0136\3\2\2\2M\u013b\3\2\2\2O\u0141\3\2\2\2Q\u0146\3\2\2\2S\u0148\3\2"+
		"\2\2U\u014a\3\2\2\2W\u014c\3\2\2\2Y\u014e\3\2\2\2[\u0151\3\2\2\2]\u0155"+
		"\3\2\2\2_\u015d\3\2\2\2a\u0164\3\2\2\2c\u016b\3\2\2\2e\u017d\3\2\2\2g"+
		"\u017f\3\2\2\2i\u0188\3\2\2\2kl\7*\2\2l\4\3\2\2\2mn\7.\2\2n\6\3\2\2\2"+
		"op\7+\2\2p\b\3\2\2\2qr\7<\2\2rs\7<\2\2s\n\3\2\2\2tu\7?\2\2u\f\3\2\2\2"+
		"vw\7\60\2\2w\16\3\2\2\2xy\7X\2\2yz\7Q\2\2z{\7K\2\2{|\7F\2\2|\20\3\2\2"+
		"\2}~\7N\2\2~\177\7K\2\2\177\u0080\7U\2\2\u0080\u0081\7V\2\2\u0081\22\3"+
		"\2\2\2\u0082\u0083\7A\2\2\u0083\24\3\2\2\2\u0084\u0085\7\"\2\2\u0085\u0086"+
		"\7Q\2\2\u0086\u0087\7H\2\2\u0087\u0088\7\"\2\2\u0088\26\3\2\2\2\u0089"+
		"\u008a\7O\2\2\u008a\u008b\7C\2\2\u008b\u008c\7R\2\2\u008c\30\3\2\2\2\u008d"+
		"\u008e\7C\2\2\u008e\u008f\7P\2\2\u008f\u0090\7[\2\2\u0090\32\3\2\2\2\u0091"+
		"\u0092\7P\2\2\u0092\u0093\7Q\2\2\u0093\u0094\7F\2\2\u0094\u0095\7G\2\2"+
		"\u0095\34\3\2\2\2\u0096\u0097\7T\2\2\u0097\u0098\7G\2\2\u0098\u0099\7"+
		"N\2\2\u0099\36\3\2\2\2\u009a\u009b\7T\2\2\u009b\u009c\7G\2\2\u009c\u009d"+
		"\7N\2\2\u009d\u009e\7C\2\2\u009e\u009f\7V\2\2\u009f\u00a0\7K\2\2\u00a0"+
		"\u00a1\7Q\2\2\u00a1\u00a2\7P\2\2\u00a2\u00a3\7U\2\2\u00a3\u00a4\7J\2\2"+
		"\u00a4\u00a5\7K\2\2\u00a5\u00a6\7R\2\2\u00a6 \3\2\2\2\u00a7\u00a8\7G\2"+
		"\2\u00a8\u00a9\7F\2\2\u00a9\u00aa\7I\2\2\u00aa\u00ab\7G\2\2\u00ab\"\3"+
		"\2\2\2\u00ac\u00ad\7R\2\2\u00ad\u00ae\7C\2\2\u00ae\u00af\7V\2\2\u00af"+
		"\u00b0\7J\2\2\u00b0$\3\2\2\2\u00b1\u00b2\7P\2\2\u00b2\u00b3\7W\2\2\u00b3"+
		"\u00b4\7O\2\2\u00b4\u00b5\7D\2\2\u00b5\u00b6\7G\2\2\u00b6\u00b7\7T\2\2"+
		"\u00b7&\3\2\2\2\u00b8\u00b9\7N\2\2\u00b9\u00ba\7Q\2\2\u00ba\u00bb\7P\2"+
		"\2\u00bb\u00bc\7I\2\2\u00bc(\3\2\2\2\u00bd\u00be\7K\2\2\u00be\u00bf\7"+
		"P\2\2\u00bf\u00c0\7V\2\2\u00c0*\3\2\2\2\u00c1\u00c2\7K\2\2\u00c2\u00c3"+
		"\7P\2\2\u00c3\u00c4\7V\2\2\u00c4\u00c5\7G\2\2\u00c5\u00c6\7I\2\2\u00c6"+
		"\u00c7\7G\2\2\u00c7\u00c8\7T\2\2\u00c8,\3\2\2\2\u00c9\u00ca\7H\2\2\u00ca"+
		"\u00cb\7N\2\2\u00cb\u00cc\7Q\2\2\u00cc\u00cd\7C\2\2\u00cd\u00ce\7V\2\2"+
		"\u00ce.\3\2\2\2\u00cf\u00d0\7F\2\2\u00d0\u00d1\7Q\2\2\u00d1\u00d2\7W\2"+
		"\2\u00d2\u00d3\7D\2\2\u00d3\u00d4\7N\2\2\u00d4\u00d5\7G\2\2\u00d5\60\3"+
		"\2\2\2\u00d6\u00d7\7D\2\2\u00d7\u00d8\7Q\2\2\u00d8\u00d9\7Q\2\2\u00d9"+
		"\u00da\7N\2\2\u00da\62\3\2\2\2\u00db\u00dc\7D\2\2\u00dc\u00dd\7Q\2\2\u00dd"+
		"\u00de\7Q\2\2\u00de\u00df\7N\2\2\u00df\u00e0\7G\2\2\u00e0\u00e1\7C\2\2"+
		"\u00e1\u00e2\7P\2\2\u00e2\64\3\2\2\2\u00e3\u00e4\7F\2\2\u00e4\u00e5\7"+
		"C\2\2\u00e5\u00e6\7V\2\2\u00e6\u00e7\7G\2\2\u00e7\66\3\2\2\2\u00e8\u00e9"+
		"\7V\2\2\u00e9\u00ea\7K\2\2\u00ea\u00eb\7O\2\2\u00eb\u00ec\7G\2\2\u00ec"+
		"8\3\2\2\2\u00ed\u00ee\7N\2\2\u00ee\u00ef\7Q\2\2\u00ef\u00f0\7E\2\2\u00f0"+
		"\u00f1\7C\2\2\u00f1\u00f2\7N\2\2\u00f2\u00f3\7V\2\2\u00f3\u00f4\7K\2\2"+
		"\u00f4\u00f5\7O\2\2\u00f5\u00f6\7G\2\2\u00f6:\3\2\2\2\u00f7\u00f8\7F\2"+
		"\2\u00f8\u00f9\7C\2\2\u00f9\u00fa\7V\2\2\u00fa\u00fb\7G\2\2\u00fb\u00fc"+
		"\7V\2\2\u00fc\u00fd\7K\2\2\u00fd\u00fe\7O\2\2\u00fe\u00ff\7G\2\2\u00ff"+
		"<\3\2\2\2\u0100\u0101\7N\2\2\u0101\u0102\7Q\2\2\u0102\u0103\7E\2\2\u0103"+
		"\u0104\7C\2\2\u0104\u0105\7N\2\2\u0105\u0106\7F\2\2\u0106\u0107\7C\2\2"+
		"\u0107\u0108\7V\2\2\u0108\u0109\7G\2\2\u0109\u010a\7V\2\2\u010a\u010b"+
		"\7K\2\2\u010b\u010c\7O\2\2\u010c\u010d\7G\2\2\u010d>\3\2\2\2\u010e\u010f"+
		"\7F\2\2\u010f\u0110\7W\2\2\u0110\u0111\7T\2\2\u0111\u0112\7C\2\2\u0112"+
		"\u0113\7V\2\2\u0113\u0114\7K\2\2\u0114\u0115\7Q\2\2\u0115\u0116\7P\2\2"+
		"\u0116@\3\2\2\2\u0117\u0118\7R\2\2\u0118\u0119\7Q\2\2\u0119\u011a\7K\2"+
		"\2\u011a\u011b\7P\2\2\u011b\u011c\7V\2\2\u011cB\3\2\2\2\u011d\u011e\7"+
		"I\2\2\u011e\u011f\7G\2\2\u011f\u0120\7Q\2\2\u0120D\3\2\2\2\u0121\u0122"+
		"\7I\2\2\u0122\u0123\7G\2\2\u0123\u0124\7Q\2\2\u0124\u0125\7O\2\2\u0125"+
		"\u0126\7G\2\2\u0126\u0127\7V\2\2\u0127\u0128\7T\2\2\u0128\u0129\7[\2\2"+
		"\u0129F\3\2\2\2\u012a\u012b\7U\2\2\u012b\u012c\7V\2\2\u012c\u012d\7T\2"+
		"\2\u012d\u012e\7K\2\2\u012e\u012f\7P\2\2\u012f\u0130\7I\2\2\u0130H\3\2"+
		"\2\2\u0131\u0132\7V\2\2\u0132\u0133\7G\2\2\u0133\u0134\7Z\2\2\u0134\u0135"+
		"\7V\2\2\u0135J\3\2\2\2\u0136\u0137\7v\2\2\u0137\u0138\7t\2\2\u0138\u0139"+
		"\7w\2\2\u0139\u013a\7g\2\2\u013aL\3\2\2\2\u013b\u013c\7h\2\2\u013c\u013d"+
		"\7c\2\2\u013d\u013e\7n\2\2\u013e\u013f\7u\2\2\u013f\u0140\7g\2\2\u0140"+
		"N\3\2\2\2\u0141\u0142\7p\2\2\u0142\u0143\7w\2\2\u0143\u0144\7n\2\2\u0144"+
		"\u0145\7n\2\2\u0145P\3\2\2\2\u0146\u0147\7]\2\2\u0147R\3\2\2\2\u0148\u0149"+
		"\7_\2\2\u0149T\3\2\2\2\u014a\u014b\7}\2\2\u014bV\3\2\2\2\u014c\u014d\7"+
		"<\2\2\u014dX\3\2\2\2\u014e\u014f\7\177\2\2\u014fZ\3\2\2\2\u0150\u0152"+
		"\t\2\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\\\3\2\2\2\u0155\u0157\7b\2\2\u0156\u0158\t\3\2\2"+
		"\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7b\2\2\u015c^\3\2\2\2\u015d\u015f"+
		"\t\4\2\2\u015e\u0160\t\5\2\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162`\3\2\2\2\u0163\u0165\t\6\2\2"+
		"\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\b\61\2\2\u0169b\3\2\2\2\u016a"+
		"\u016c\t\7\2\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016ed\3\2\2\2\u016f\u0171\t\7\2\2\u0170\u016f"+
		"\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0176\7\60\2\2\u0175\u0177\t\7\2\2\u0176\u0175\3"+
		"\2\2\2\u0177\u0178\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017e\3\2\2\2\u017a\u017b\7P\2\2\u017b\u017c\7c\2\2\u017c\u017e\7P\2"+
		"\2\u017d\u0170\3\2\2\2\u017d\u017a\3\2\2\2\u017ef\3\2\2\2\u017f\u0181"+
		"\7$\2\2\u0180\u0182\t\b\2\2\u0181\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\7$"+
		"\2\2\u0186h\3\2\2\2\u0187\u0189\13\2\2\2\u0188\u0187\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018bj\3\2\2\2\r\2\u0153"+
		"\u0159\u0161\u0166\u016d\u0172\u0178\u017d\u0183\u018a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}