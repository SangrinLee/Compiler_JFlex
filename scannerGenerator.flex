import java_cup.runtime.*;
%%

%class MyScanner
%line
%column
%cup
%{
	StringBuffer string = new StringBuffer();
	private Symbol symbol(int type) {
		return new MySymbol(type, yyline+1, yycolumn+1);
	}
	private Symbol symbol(int type, Object value) {
		return new MySymbol(type, yyline+1, yycolumn+1, value);
	}
%}
delim = \r|\n|\r\n|[ \t\f] 
ws = {delim}+
number = {digit}+(\.{digit}+)?(E[+-]?{digit }+)?
doubleq = \"
 
/* c번 문제 */
letter = [A-Za-z]
digit = [0-9]
id = {letter}({letter}|{digit}|_)*

 /* d번 문제 */
%state STRING

%%

<YYINITIAL> {
	{ws} { }
	"if" { return symbol(sym.IF, "IF"); }
	"then" { return symbol(sym.THEN, "THEN"); }
	"else" { return symbol(sym.ELSE, "ELSE"); }
	{number} { return symbol(sym.NUMBER, "(NUMBER)" + yytext()); }
	"<" { return symbol(sym.LT, "LT"); }
	"<=" { return symbol(sym.LE, "LE"); }
	">" { return symbol(sym.GT, "GT"); }
	">=" { return symbol(sym.GE, "GE"); }
	
	/* a번 문제 */
	"while" { return symbol(sym.WHILE, "WHILE"); }

	/* b번 문제 */
	"==" { return symbol(sym.EQ, "EQ"); } 
	"!=" { return symbol(sym.NE, "NE"); } 
	
	/* c번 문제 */
	{id} { return symbol(sym.IDENTIFIER, "(IDENTIFIER)" + yytext()); } 

	/* d번 문제 */
	{doubleq} { string.delete(0, string.length()); yybegin(STRING); } 
}

/* d번 문제 */
<STRING> {
	{doubleq}{ws} { yybegin(YYINITIAL); return symbol(sym.STRING, "(STRING)" + string.toString()); }
	{doubleq} { string.append("\""); }
	"\\" { string.append("\\"); }
	[^\n\r\"\\]+ { string.append(yytext()); }
}
	