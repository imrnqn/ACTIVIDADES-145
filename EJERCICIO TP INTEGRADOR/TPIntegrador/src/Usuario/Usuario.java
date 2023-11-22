/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

/**
 *
 * @author IvanMR
 */
public class Usuario {
    int idUsuario;
    String nombre;
    String pass;
    int rolId;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String pass, int rolId) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.pass = pass;
        this.rolId = rolId;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getRolId() {
        return rolId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }
    
    
}
