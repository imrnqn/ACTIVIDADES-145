/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3ej1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author IvanMR
 */
public class Clase3ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> cadena = new ArrayList();
//        ArrayList<String> cadenaM = new ArrayList();
        
        cadena.add("hola, lindo dia");
        cadena.add("que");
        cadena.add("tal");
        cadena.add("estas");
        cadena.add("hoy");
        
        ArrayList<String> cadenaM = new ArrayList<> (cadena.stream().map((str) -> str.toUpperCase()).collect(Collectors.toList()));
//        cadena.forEach((str) -> cadenaM.add(str.toUpperCase()));
        System.out.println(cadenaM);
        cadena = new ArrayList<> (cadena.stream().map((str) -> str.toUpperCase()).collect(Collectors.toList()));
        //cadena.forEach((str) -> str = (str.toUpperCase()));
        System.out.println(" ");
        System.out.println(cadena);
        System.out.println(" ");
        System.out.println(concatenarLista(cadena, 3));
        
          
    }
    
    private static String concatenarLista (ArrayList<String> cadena, int n){
        
        String str = String.join(", ", cadena.stream().filter(s -> s.length()>n).collect(Collectors.toList()));
        
        String[] ls = str.split(", ");
        
        for (String l : ls) {
        
    
            System.out.println(l);
        }
        
        System.out.println(Arrays.asList(ls));
        
        return str;
    }
    
//    lo resolvi de manera similar usando una función estatica en otra clase:
//    public static String palabras (List<String> strings, int n){
//        
//    //lo resolvi con flatMap separo por palabras, luego filtro por mayor a n caracteres y luego el joining
//    return strings.stream().flatMap(s -> Arrays.stream(s.split(" "))).filter(s->s.length()>n).collect(Collectors.joining(", "));
//    }
    
}
