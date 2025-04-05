package com.compiladores.analizador;
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

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexema=yytext(); return Comillas;}

/* Tipos de datos */
( byte | int | char | long | float | double ) {lexema=yytext(); return T_dato;}

/* Tipo de dato String */
( String ) {lexema=yytext(); return Cadena;}

/* Palabra reservada return */
( return ) {lexema=yytext(); return Return; }

/* Palabra reservada If */
( if ) {lexema=yytext(); return If;}

/* Palabra reservada Else */
( else ) {lexema=yytext(); return Else;}

/* Palabra reservada Do */
( do ) {lexema=yytext(); return Do;}

/* Palabra reservada While */
( while ) {lexema=yytext(); return While;}

/* Palabra reservada For */
( for ) {lexema=yytext(); return For;}

/* Operador Igual */
( "=" ) {lexema=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexema=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexema=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {lexema=yytext(); return Multiplicacion;}

/* Operador Division */
( "/" ) {lexema=yytext(); return Division;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexema=yytext(); return Op_logico;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexema = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexema = yytext(); return Op_atribucion;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {lexema = yytext(); return Op_incremento;}

/*Operadores Booleanos*/
(true | false)      {lexema = yytext(); return Op_booleano;}

/* Parentesis de apertura */
( "(" ) {lexema=yytext(); return Parentesis_a;}

/* Parentesis de cierre */
( ")" ) {lexema=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {lexema=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexema=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexema = yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexema = yytext(); return Corchete_c;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexema=yytext(); return Main;}

/* Punto y coma */
( ";" ) {lexema=yytext(); return P_coma;}

/* Identificador */
{L}({L}|{D})* {lexema=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexema=yytext(); return Numero;}

 . {return ERROR;}
