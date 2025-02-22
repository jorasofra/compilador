/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.compiladores.main;

import com.compiladores.layout.MainWindow;
import java.io.File;





/**
 *
 * @author jorasofra
 */
public class AnalizadorLexico {

    public static void main(String[] args) {
        MainWindow window = new MainWindow();
        window.setTitle("Analizador Lexico");
        window.setVisible(true);
        //String ruta = "/Users/jorasofra/NetBeansProjects/AnalizadorLexico/src/main/java/com/compiladores/analizadorLexico/Lexer.flex";
        //generarLex(ruta);
    }
    
    
    /*public static void generarLex(String ruta) {
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }*/
}
