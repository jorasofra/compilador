/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.compiladores.analizador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jorasofra
 */
public class LecturaArchivo {
    
    public void leerArchivo() {
        try (FileReader fr = new FileReader("/Users/jorasofra/Downloads/prueba.txt")) {
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch(IOException e) {
            System.out.println(e);
        }
    }
    
    /*
    TODO: Traslado hacia Analizador Lexico
    */
}
