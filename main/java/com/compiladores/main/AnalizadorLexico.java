/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.compiladores.main;

import com.compiladores.layout.MainWindow;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;





/**
 *
 * @author jorasofra
 */
public class AnalizadorLexico {

    public static void main(String[] args) throws Exception {
        ventana();
        //compilar();
    }
    
    private static void ventana() {
        MainWindow window = new MainWindow();
        window.setTitle("Analizador Lexico");
        window.setVisible(true);
    }
    
    private static void compilar() throws Exception {
        String ruta = "/Users/jorasofra/NetBeansProjects/AnalizadorLexico/src/main/java/com/compiladores/analizador/LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", "/Users/jorasofra/NetBeansProjects/AnalizadorLexico/src/main/java/com/compiladores/analizador/parser.cup"};
        generarLex(ruta, rutaS);
    }
    
    
    public static void generarLex(String ruta, String[] rutaS) throws IOException, Exception {
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
        
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get("/Users/jorasofra/NetBeansProjects/AnalizadorLexico/src/main/java/com/compiladores/analizador/sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        
        Files.move(
                Paths.get("/Users/jorasofra/NetBeansProjects/AnalizadorLexico/sym.java"), 
                Paths.get("/Users/jorasofra/NetBeansProjects/AnalizadorLexico/src/main/java/com/compiladores/analizador/sym.java")
        );
        
        Path rutaSin = Paths.get("/Users/jorasofra/NetBeansProjects/AnalizadorLexico/src/main/java/com/compiladores/analizador/Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("/Users/jorasofra/NetBeansProjects/AnalizadorLexico/Sintax.java"), 
                Paths.get("/Users/jorasofra/NetBeansProjects/AnalizadorLexico/src/main/java/com/compiladores/analizador/Sintax.java")
        );
    }
}
