/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.distri.servicio;

import ec.edu.distri.dao.ClienteDAO;
import ec.edu.distri.exepcion.ValidacionException;
import ec.edu.distri.modelo.Cliente;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Dalia
 */
@LocalBean
@Stateless 
public class ClienteServicio {
    @EJB
    private ClienteDAO clienteDAO;
    
    public List<Cliente> obtenerTodas(){
        return this.clienteDAO.findAll();
    }
    public Cliente obtenerPorID(Integer codigoCliente){
        return this.clienteDAO.findById(codigoCliente, false);
    }
    public void crearCliente(Cliente cliente) throws ValidacionException {
        Cliente clienteTmp=this.obtenerPorID(cliente.getCodigo());
        if(clienteTmp==null){
            this.clienteDAO.insert(cliente);
        }
        else{
            throw new ValidacionException("El codigo "+cliente.getCodigo()+" ya existe"); 
        }
    }
    public void actualizarCliente(Cliente cliente){
        this.clienteDAO.update(cliente);
    }
    
    public void eliminarCliente(Integer codigoCliente){
        try{
            Cliente clienteTmp=this.obtenerPorID(codigoCliente);
            this.clienteDAO.remove(clienteTmp);
        }catch(Exception e)
        {
            throw new ValidacionException("El cliente "+codigoCliente+" esta asociada a uuna Factura");
        }
     }
}
