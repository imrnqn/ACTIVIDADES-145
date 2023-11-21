/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg3;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author IvanMR
 */
public class Transformador implements Cadena {
    @Override
    @SuppressWarnings("empty-statement")
        public ArrayList<String> operacion(ArrayList<String> cadena) {
        ArrayList<String> cadenaM = new ArrayList<> (cadena.stream().map((str) -> str.toUpperCase()).collect(Collectors.toList()));
        return cadenaM;
    }
}


//SOLUCION ORIGINAL PROPUESTA
//      
//        ArrayList<String> cadenaM = new ArrayList<>();
//        for (String expresion : cadena){
//            cadenaM.add(expresion.toUpperCase());
//        };

//SOLUCION DE OTRO COMPAÑERO
//import java.util.Arrays;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//
//
//        List<String> listado = Arrays.asList("que", "tal","te","fue");
//        listado.replaceAll(str -> str.toUpperCase());
//        System.out.print (listado);
//
//    }
//}

