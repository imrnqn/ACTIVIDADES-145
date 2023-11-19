/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.pkg2;

import java.util.ArrayList;

/**
 *
 * @author IvanMR
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Encontrar encon = new Encontrar();
        ArrayList<String> cadena = new ArrayList();
        
        cadena.add("hola");
        cadena.add("que");
        cadena.add("tal");
        cadena.add("estas");
        cadena.add("hoy");
        
        System.out.println(" ");
        System.out.println("Las Palabras son: "+ encon.operacion(cadena, 5));
        System.out.println(" ");
    }
    }