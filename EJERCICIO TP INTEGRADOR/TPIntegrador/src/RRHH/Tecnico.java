/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RRHH;

/**
 *
 * @author IvanMR
 */
public class Tecnico {
    int idTecnico;
    String nombre;
    String mail;
    String numTel;

    public Tecnico() {
    }

    public Tecnico(int idTecnico, String nombre, String mail, String numTel) {
        this.idTecnico = idTecnico;
        this.nombre = nombre;
        this.mail = mail;
        this.numTel = numTel;
    }

    public int getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(int idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }
    
    
    
}
