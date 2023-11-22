/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relacion;

import AreaComercial.Cliente;
import Servicio.Servicio;

/**
 *
 * @author IvanMR
 */
public class ClienteServicio {
    int idClienteServicio;
    Cliente cliente;
    Servicio servicio;

    public ClienteServicio() {
    }

    public ClienteServicio(int idClienteServicio, Cliente cliente, Servicio servicio) {
        this.idClienteServicio = idClienteServicio;
        this.cliente = cliente;
        this.servicio = servicio;
    }

    public int getIdClienteServicio() {
        return idClienteServicio;
    }

    public void setIdClienteServicio(int idClienteServicio) {
        this.idClienteServicio = idClienteServicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    
    
}
