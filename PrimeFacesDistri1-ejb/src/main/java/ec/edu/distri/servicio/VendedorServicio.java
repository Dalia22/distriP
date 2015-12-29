/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.distri.servicio;

import ec.edu.distri.dao.VendedorDAO;
import ec.edu.distri.exepcion.ValidacionException;
import ec.edu.distri.modelo.Vendedor;
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
public class VendedorServicio {
    @EJB
    private VendedorDAO vendedorDAO;
    
     public List<Vendedor> obtenerTodas(){
        return this.vendedorDAO.findAll();
    }
    public Vendedor obtenerPorID(Integer vendedorCodigo){
        return this.vendedorDAO.findById(vendedorCodigo, false);
    }
    public void crearVendedor(Vendedor vendedor) throws ValidacionException {
        Vendedor vendedorTmp=this.obtenerPorID(vendedor.getCodigo());
        if(vendedorTmp==null){
            this.vendedorDAO.insert(vendedor);
        }
        else{
            throw new ValidacionException("El codigo "+vendedor.getCodigo()+" ya existe"); 
        }
    }
    public void actualizarVendedor(Vendedor vendedor){
        this.vendedorDAO.update(vendedor);
    }
    
    public void eliminarVendedor(Integer codigoVendedor){
        try{
           Vendedor vendedorTmp=this.obtenerPorID(codigoVendedor);
            this.vendedorDAO.remove(vendedorTmp);
        }catch(Exception e)
        {
            throw new ValidacionException("El vendedor "+codigoVendedor+" esta asociado a una Factura");
        }
     }
    
}
