/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.pkg2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author IvanMR
 */
public class Encontrar implements Cadena  {
    static String concatenarLista (ArrayList<String> cadena, int n){
        String str = String.join(", ", cadena.stream().filter(s -> s.length()>n).collect(Collectors.toList()));
        str = str.toUpperCase();
        String[] ls = str.split(", ");
        
//     MOSTRAR ls
//        
//      for (String l : ls) {
//          System.out.println(l);
//      }
//      System.out.println(Arrays.asList(ls));
//        
        return str;
    }

    @Override
    public ArrayList<String> operacion(ArrayList<String> cadena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}   
    
    
    
    
//    SOLUCION ORIGINAL PROPUESTA
//
//    public ArrayList<String> operacion(ArrayList<String> cadena, int n) {
//        ArrayList<String> cadenaM = new ArrayList<>();
//                for (String expresion : cadena){
//                    if (expresion.length()> n) {
//                        cadenaM.add(expresion.toUpperCase());
//                    }
//                };
//        return cadenaM;
//    }
//
//    @Override
//    public ArrayList<String> operacion(ArrayList<String> cadena) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
//}   
