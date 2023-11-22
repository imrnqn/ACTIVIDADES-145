/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relacion;

import RRHH.Especialidad;
import TipoProblema.TipoProblema;

/**
 *
 * @author IvanMR
 */
public class ProblemaEspecialidad {
    int idProblemaEspecialidad;
    Especialidad especialidad;
    TipoProblema tipoProblema;

    public ProblemaEspecialidad() {
    }

    public ProblemaEspecialidad(int idProblemaEspecialidad, Especialidad especialidad, TipoProblema tipoProblema) {
        this.idProblemaEspecialidad = idProblemaEspecialidad;
        this.especialidad = especialidad;
        this.tipoProblema = tipoProblema;
    }

    public int getIdProblemaEspecialidad() {
        return idProblemaEspecialidad;
    }

    public void setIdProblemaEspecialidad(int idProblemaEspecialidad) {
        this.idProblemaEspecialidad = idProblemaEspecialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public TipoProblema getTipoProblema() {
        return tipoProblema;
    }

    public void setTipoProblema(TipoProblema tipoProblema) {
        this.tipoProblema = tipoProblema;
    }
    
    
}
