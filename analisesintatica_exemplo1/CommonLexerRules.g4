lexer grammar CommonLexerRules;

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
EQ: '=';
APARE: '(';
FPARE: ')';
ID: [a-zA-Z]+;
INT: [0-9]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
