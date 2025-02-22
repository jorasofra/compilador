/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compiladores.bean;

/**
 *
 * @author jorasofra
 */
public class Token {
    private TipoTokens tipo;
    private String lexema;

    public Token() {
    }

    public Token(TipoTokens tipo, String lexema) {
        this.tipo = tipo;
        this.lexema = lexema;
    }

    public TipoTokens getTipo() {
        return tipo;
    }

    public void setTipo(TipoTokens tipo) {
        this.tipo = tipo;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }
    
}
