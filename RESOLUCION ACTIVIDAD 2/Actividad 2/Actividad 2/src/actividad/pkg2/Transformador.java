/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author IvanMR
 */
public class Transformador implements Cadena {
    public ArrayList<String> operacion(ArrayList<String> cadena) {
        for (int i = 0; i < cadena.size(); i++) {
            String expresion;
            expresion = cadena.get(i);
            cadena.set(i, expresion.toUpperCase());
        }      
        return cadena;
    }
}
