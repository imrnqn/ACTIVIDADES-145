/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg3;

import java.util.ArrayList;

/**
 *
 * @author IvanMR
 */
public class Actividad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Transformador trafo = new Transformador();
        ArrayList<String> cadena = new ArrayList();
        
        cadena.add("hola");
        cadena.add("que");
        cadena.add("tal");
        cadena.add("estas");
        cadena.add("hoy");
        
        System.out.println(" ");
        System.out.println("En mayusculas: "+ trafo.operacion(cadena));
        System.out.println(" ");
    }
    
}
