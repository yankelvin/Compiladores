grammar Sintatico;

import Lexico;

program:       statement | statement WS;


statement:     IF parentheses statement |
               IF parentheses statement ELSE statement |
               WHILE parentheses statement |
               DO parentheses statement |
               ABCHAV parentheses FECHAV |
               exp PTVIG;
           
parentheses:   ABPAR expression FEPAR;



expression:    operation |
               ID ATRIB expression;


operation:     sum | 
               sum OPREL sum;


sum            term |
               sum OPARI sum


term:          ID |
               interger |
               parentheses;


interger: AN_UNSIGNED_INTEGER;


        
