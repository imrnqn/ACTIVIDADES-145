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
public class Transformador implements Cadena {
    @Override
    @SuppressWarnings("empty-statement")
    public ArrayList<String> operacion(ArrayList<String> cadena) {
        ArrayList<String> cadenaM = new ArrayList<>();
                for (String expresion : cadena){
                    cadenaM.add(expresion.toUpperCase());
                };
        return cadenaM;
    }
}
