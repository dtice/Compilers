// Generated from little.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class littleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, WS=30, IDENTIFIER=31, 
		INTLITERAL=32, FLOATLITERAL=33, STRINGLITERAL=34, COMMENT=35, KEYWORD=36, 
		OPERATOR=37;
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
			"T__25", "T__26", "T__27", "T__28", "WS", "IDENTIFIER", "INTLITERAL", 
			"FLOATLITERAL", "STRINGLITERAL", "COMMENT", "KEYWORD", "OPERATOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'BEGIN'", "'END'", "'STRING'", "':='", "'FLOAT'", 
			"'INT'", "'VOID'", "','", "'FUNCTION'", "';'", "'READ'", "'('", "')'", 
			"'WRITE'", "'RETURN'", "'+'", "'-'", "'*'", "'/'", "'IF'", "'ENDIF'", 
			"'ELSE'", "'<'", "'>'", "'='", "'!='", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "WS", "IDENTIFIER", "INTLITERAL", 
			"FLOATLITERAL", "STRINGLITERAL", "COMMENT", "KEYWORD", "OPERATOR"
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


	public littleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "little.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0161\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\6\37\u00c2\n\37\r\37\16\37\u00c3\3\37\3\37\3 \6 \u00c9\n \r \16"+
		" \u00ca\3!\6!\u00ce\n!\r!\16!\u00cf\3\"\3\"\6\"\u00d4\n\"\r\"\16\"\u00d5"+
		"\3\"\6\"\u00d9\n\"\r\"\16\"\u00da\3\"\3\"\6\"\u00df\n\"\r\"\16\"\u00e0"+
		"\5\"\u00e3\n\"\3#\3#\7#\u00e7\n#\f#\16#\u00ea\13#\3#\3#\3$\3$\3$\3$\7"+
		"$\u00f2\n$\f$\16$\u00f5\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0154\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\5&\u0160\n&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\b\4\2\13\13\"\"\4\2C\\c|\4"+
		"\2\62;C|\4\2\f\f\17\17\6\2,-//\61\61??\6\2*+..=>@@\2\u017f\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\3M\3\2\2\2\5U\3\2\2\2\7[\3\2\2\2\t_\3\2\2\2\13f\3\2\2\2\r"+
		"i\3\2\2\2\17o\3\2\2\2\21s\3\2\2\2\23x\3\2\2\2\25z\3\2\2\2\27\u0083\3\2"+
		"\2\2\31\u0085\3\2\2\2\33\u008a\3\2\2\2\35\u008c\3\2\2\2\37\u008e\3\2\2"+
		"\2!\u0094\3\2\2\2#\u009b\3\2\2\2%\u009d\3\2\2\2\'\u009f\3\2\2\2)\u00a1"+
		"\3\2\2\2+\u00a3\3\2\2\2-\u00a6\3\2\2\2/\u00ac\3\2\2\2\61\u00b1\3\2\2\2"+
		"\63\u00b3\3\2\2\2\65\u00b5\3\2\2\2\67\u00b7\3\2\2\29\u00ba\3\2\2\2;\u00bd"+
		"\3\2\2\2=\u00c1\3\2\2\2?\u00c8\3\2\2\2A\u00cd\3\2\2\2C\u00e2\3\2\2\2E"+
		"\u00e4\3\2\2\2G\u00ed\3\2\2\2I\u0153\3\2\2\2K\u015f\3\2\2\2MN\7R\2\2N"+
		"O\7T\2\2OP\7Q\2\2PQ\7I\2\2QR\7T\2\2RS\7C\2\2ST\7O\2\2T\4\3\2\2\2UV\7D"+
		"\2\2VW\7G\2\2WX\7I\2\2XY\7K\2\2YZ\7P\2\2Z\6\3\2\2\2[\\\7G\2\2\\]\7P\2"+
		"\2]^\7F\2\2^\b\3\2\2\2_`\7U\2\2`a\7V\2\2ab\7T\2\2bc\7K\2\2cd\7P\2\2de"+
		"\7I\2\2e\n\3\2\2\2fg\7<\2\2gh\7?\2\2h\f\3\2\2\2ij\7H\2\2jk\7N\2\2kl\7"+
		"Q\2\2lm\7C\2\2mn\7V\2\2n\16\3\2\2\2op\7K\2\2pq\7P\2\2qr\7V\2\2r\20\3\2"+
		"\2\2st\7X\2\2tu\7Q\2\2uv\7K\2\2vw\7F\2\2w\22\3\2\2\2xy\7.\2\2y\24\3\2"+
		"\2\2z{\7H\2\2{|\7W\2\2|}\7P\2\2}~\7E\2\2~\177\7V\2\2\177\u0080\7K\2\2"+
		"\u0080\u0081\7Q\2\2\u0081\u0082\7P\2\2\u0082\26\3\2\2\2\u0083\u0084\7"+
		"=\2\2\u0084\30\3\2\2\2\u0085\u0086\7T\2\2\u0086\u0087\7G\2\2\u0087\u0088"+
		"\7C\2\2\u0088\u0089\7F\2\2\u0089\32\3\2\2\2\u008a\u008b\7*\2\2\u008b\34"+
		"\3\2\2\2\u008c\u008d\7+\2\2\u008d\36\3\2\2\2\u008e\u008f\7Y\2\2\u008f"+
		"\u0090\7T\2\2\u0090\u0091\7K\2\2\u0091\u0092\7V\2\2\u0092\u0093\7G\2\2"+
		"\u0093 \3\2\2\2\u0094\u0095\7T\2\2\u0095\u0096\7G\2\2\u0096\u0097\7V\2"+
		"\2\u0097\u0098\7W\2\2\u0098\u0099\7T\2\2\u0099\u009a\7P\2\2\u009a\"\3"+
		"\2\2\2\u009b\u009c\7-\2\2\u009c$\3\2\2\2\u009d\u009e\7/\2\2\u009e&\3\2"+
		"\2\2\u009f\u00a0\7,\2\2\u00a0(\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2*\3\2"+
		"\2\2\u00a3\u00a4\7K\2\2\u00a4\u00a5\7H\2\2\u00a5,\3\2\2\2\u00a6\u00a7"+
		"\7G\2\2\u00a7\u00a8\7P\2\2\u00a8\u00a9\7F\2\2\u00a9\u00aa\7K\2\2\u00aa"+
		"\u00ab\7H\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7G\2\2\u00ad\u00ae\7N\2\2\u00ae"+
		"\u00af\7U\2\2\u00af\u00b0\7G\2\2\u00b0\60\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2"+
		"\62\3\2\2\2\u00b3\u00b4\7@\2\2\u00b4\64\3\2\2\2\u00b5\u00b6\7?\2\2\u00b6"+
		"\66\3\2\2\2\u00b7\u00b8\7#\2\2\u00b8\u00b9\7?\2\2\u00b98\3\2\2\2\u00ba"+
		"\u00bb\7>\2\2\u00bb\u00bc\7?\2\2\u00bc:\3\2\2\2\u00bd\u00be\7@\2\2\u00be"+
		"\u00bf\7?\2\2\u00bf<\3\2\2\2\u00c0\u00c2\t\2\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\b\37\2\2\u00c6>\3\2\2\2\u00c7\u00c9\t\3\2\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"@\3\2\2\2\u00cc\u00ce\4\62;\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2"+
		"\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0B\3\2\2\2\u00d1\u00d3\7"+
		"\60\2\2\u00d2\u00d4\4\62;\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00e3\3\2\2\2\u00d7\u00d9\4\62"+
		";\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\7\60\2\2\u00dd\u00df\4"+
		"\62;\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00d1\3\2\2\2\u00e2\u00d8\3\2"+
		"\2\2\u00e3D\3\2\2\2\u00e4\u00e8\7$\2\2\u00e5\u00e7\t\4\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7$\2\2\u00ecF\3\2\2\2\u00ed"+
		"\u00ee\7/\2\2\u00ee\u00ef\7/\2\2\u00ef\u00f3\3\2\2\2\u00f0\u00f2\n\5\2"+
		"\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4H\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7R\2\2\u00f7\u00f8"+
		"\7T\2\2\u00f8\u00f9\7Q\2\2\u00f9\u00fa\7I\2\2\u00fa\u00fb\7T\2\2\u00fb"+
		"\u00fc\7C\2\2\u00fc\u0154\7O\2\2\u00fd\u00fe\7D\2\2\u00fe\u00ff\7G\2\2"+
		"\u00ff\u0100\7I\2\2\u0100\u0101\7K\2\2\u0101\u0154\7P\2\2\u0102\u0103"+
		"\7G\2\2\u0103\u0104\7P\2\2\u0104\u0154\7F\2\2\u0105\u0106\7H\2\2\u0106"+
		"\u0107\7W\2\2\u0107\u0108\7P\2\2\u0108\u0109\7E\2\2\u0109\u010a\7V\2\2"+
		"\u010a\u010b\7K\2\2\u010b\u010c\7Q\2\2\u010c\u0154\7P\2\2\u010d\u010e"+
		"\7T\2\2\u010e\u010f\7G\2\2\u010f\u0110\7C\2\2\u0110\u0154\7F\2\2\u0111"+
		"\u0112\7Y\2\2\u0112\u0113\7T\2\2\u0113\u0114\7K\2\2\u0114\u0115\7V\2\2"+
		"\u0115\u0154\7G\2\2\u0116\u0117\7K\2\2\u0117\u0154\7H\2\2\u0118\u0119"+
		"\7G\2\2\u0119\u011a\7N\2\2\u011a\u011b\7U\2\2\u011b\u0154\7G\2\2\u011c"+
		"\u011d\7G\2\2\u011d\u011e\7P\2\2\u011e\u011f\7F\2\2\u011f\u0120\7K\2\2"+
		"\u0120\u0154\7H\2\2\u0121\u0122\7Y\2\2\u0122\u0123\7J\2\2\u0123\u0124"+
		"\7K\2\2\u0124\u0125\7N\2\2\u0125\u0154\7G\2\2\u0126\u0127\7G\2\2\u0127"+
		"\u0128\7P\2\2\u0128\u0129\7F\2\2\u0129\u012a\7Y\2\2\u012a\u012b\7J\2\2"+
		"\u012b\u012c\7K\2\2\u012c\u012d\7N\2\2\u012d\u0154\7G\2\2\u012e\u012f"+
		"\7E\2\2\u012f\u0130\7Q\2\2\u0130\u0131\7P\2\2\u0131\u0132\7V\2\2\u0132"+
		"\u0133\7K\2\2\u0133\u0134\7P\2\2\u0134\u0135\7W\2\2\u0135\u0154\7G\2\2"+
		"\u0136\u0137\7D\2\2\u0137\u0138\7T\2\2\u0138\u0139\7G\2\2\u0139\u013a"+
		"\7C\2\2\u013a\u0154\7M\2\2\u013b\u013c\7T\2\2\u013c\u013d\7G\2\2\u013d"+
		"\u013e\7V\2\2\u013e\u013f\7W\2\2\u013f\u0140\7T\2\2\u0140\u0154\7P\2\2"+
		"\u0141\u0142\7K\2\2\u0142\u0143\7P\2\2\u0143\u0154\7V\2\2\u0144\u0145"+
		"\7X\2\2\u0145\u0146\7Q\2\2\u0146\u0147\7K\2\2\u0147\u0154\7F\2\2\u0148"+
		"\u0149\7U\2\2\u0149\u014a\7V\2\2\u014a\u014b\7T\2\2\u014b\u014c\7K\2\2"+
		"\u014c\u014d\7P\2\2\u014d\u0154\7I\2\2\u014e\u014f\7H\2\2\u014f\u0150"+
		"\7N\2\2\u0150\u0151\7Q\2\2\u0151\u0152\7C\2\2\u0152\u0154\7V\2\2\u0153"+
		"\u00f6\3\2\2\2\u0153\u00fd\3\2\2\2\u0153\u0102\3\2\2\2\u0153\u0105\3\2"+
		"\2\2\u0153\u010d\3\2\2\2\u0153\u0111\3\2\2\2\u0153\u0116\3\2\2\2\u0153"+
		"\u0118\3\2\2\2\u0153\u011c\3\2\2\2\u0153\u0121\3\2\2\2\u0153\u0126\3\2"+
		"\2\2\u0153\u012e\3\2\2\2\u0153\u0136\3\2\2\2\u0153\u013b\3\2\2\2\u0153"+
		"\u0141\3\2\2\2\u0153\u0144\3\2\2\2\u0153\u0148\3\2\2\2\u0153\u014e\3\2"+
		"\2\2\u0154J\3\2\2\2\u0155\u0156\7<\2\2\u0156\u0160\7?\2\2\u0157\u0160"+
		"\t\6\2\2\u0158\u0159\7#\2\2\u0159\u0160\7?\2\2\u015a\u0160\t\7\2\2\u015b"+
		"\u015c\7>\2\2\u015c\u0160\7?\2\2\u015d\u015e\7@\2\2\u015e\u0160\7?\2\2"+
		"\u015f\u0155\3\2\2\2\u015f\u0157\3\2\2\2\u015f\u0158\3\2\2\2\u015f\u015a"+
		"\3\2\2\2\u015f\u015b\3\2\2\2\u015f\u015d\3\2\2\2\u0160L\3\2\2\2\17\2\u00c3"+
		"\u00ca\u00cf\u00d5\u00da\u00e0\u00e2\u00e6\u00e8\u00f3\u0153\u015f\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}