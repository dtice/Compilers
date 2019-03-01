lexer grammar littleLexer;

INTLITERAL
    : ('0'..'9')+
    ;

FLOATLITERAL
    : '.'('0'..'9')+
    | ('0'..'9')+'.'('0'..'9')+
    ;

STRINGLITERAL
    : '"'(.)*?'"'
    ;

COMMENT
    :  '--' ~[\r\n]*
    ;

KEYWORD
  : 'PROGRAM'
  | 'BEGIN'
  | 'END'
  | 'FUNCTION'
  | 'READ'
  | 'WRITE'
  | 'IF'
  | 'ELSE'
  | 'ENDIF'
  | 'WHILE'
  | 'ENDWHILE'
  | 'CONTINUE'
  | 'BREAK'
  | 'RETURN'
  | 'INT'
  | 'VOID'
  | 'STRING'
  | 'FLOAT'
  ;

OPERATOR
    : ':='
    | '+'
    | '-'
    | '*'
    | '/'
    | '='
    | '!='
    | '<'
    | '>'
    | '('
    | ')'
    | ';'
    | ','
    | '<='
    | '>='
    ;

IDENTIFIER
    : ('a' .. 'z' | 'A' .. 'Z')('a' .. 'z' | 'A'..'Z' | '0' .. '9')*
    ;

WS: [ \t\n\r]+ -> skip;
