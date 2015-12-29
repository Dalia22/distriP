/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.distri.web;

import ec.edu.distri.modelo.Cliente;
import ec.edu.distri.servicio.ClienteServicio;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Dalia
 */
@ViewScoped
@ManagedBean
public class ClienteBean implements Serializable{
   @EJB
   private ClienteServicio clienteServicio;
   private List<Cliente> clientes;

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
   
    @PostConstruct
   public void inicializar()
   {
       this.clientes = clienteServicio.obtenerTodas();
   }
   
}
