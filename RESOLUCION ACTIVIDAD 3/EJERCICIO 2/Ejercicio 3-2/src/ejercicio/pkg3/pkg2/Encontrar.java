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
public class Encontrar implements Cadena  {
    public ArrayList<String> operacion(ArrayList<String> cadena, int n) {
        ArrayList<String> cadenaM = new ArrayList<>();
                for (String expresion : cadena){
                    if (expresion.length()== n) {
                        cadenaM.add(expresion.toUpperCase());
                    }
                };
        return cadenaM;
    }

    @Override
    public ArrayList<String> operacion(ArrayList<String> cadena) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}   
