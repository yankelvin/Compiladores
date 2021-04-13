lexer grammar Lexico;

STRING: '"' [a-z][a-z0-9]* '"';

IF: 'if';
ELSE: 'else';
WHILE: 'while';
DO: 'do';
PTVIG: ';';
ABCHAV: '{';
FECHAV: '}';
ABPAR: '(';
FEPAR: ')';
ATRIB: '=';
OPARI: ('+' | '-' | '*' | '/');
OPREL: ('>' | '<' | '>=' | '<=' | '==' | '<>');
COMNTR: '/*' [a-z]* '*/';
ID: [a-z][a-z0-9]*;
NUM: ('+' | '-')* [0-9]+;

WS: [ \t\r\n]+ -> skip;
