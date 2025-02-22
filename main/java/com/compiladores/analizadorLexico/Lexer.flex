package com.compiladores.analizadorLexico;
import static com.compiladores.bean.TipoTokens.*;
%%
%class Lexer
%type TipoTokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t\n\r]+
%{
    public String lexema;
%}
%%
INICIO |
Clase |
entero |
Cadena |
Metodo |
void { lexema=yytext(); return PALABRA_RESERVADA; }
{espacio} {/*Ignore*/}
":" {return DOS_PUNTOS;}
"{" {return LLAVE_ABRE;}
"}" {return LLAVE_CIERRA;}
"(" {return PARENTESIS_ABRE;}
")" {return PARENTESIS_CIERRA;}
"=" {return SIGNO_IGUAL;}
"," {return COMA;}
{L}({L}{D})* { lexema=yytext(); return ID; }
 . {return ERROR;}
