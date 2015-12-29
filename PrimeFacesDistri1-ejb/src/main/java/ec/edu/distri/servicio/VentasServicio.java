/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.distri.servicio;

import ec.edu.distri.dao.VentasDAO;
import ec.edu.distri.exepcion.ValidacionException;
import ec.edu.distri.modelo.Ventas;
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
public class VentasServicio {
    
    @EJB
    private VentasDAO ventasDAO;
    
    public List<Ventas> obtenerTodas(){
        return this.ventasDAO.findAll();
    }
    public Ventas obtenerPorID(Integer codigoVentas){
        return this.ventasDAO.findById(codigoVentas, false);
    }
    public void crearVentas(Ventas ventas) throws ValidacionException {
        Ventas ventasTmp=this.obtenerPorID(ventas.getCodigo());
        if(ventasTmp==null){
            this.ventasDAO.insert(ventas);
        }
        else{
            throw new ValidacionException("El codigo "+ventas.getCodigo()+" ya existe"); 
        }
    }
    public void actualizarVentas(Ventas ventas){
        this.ventasDAO.update(ventas);
    }
    
    public void eliminarVentas(Integer codigoVentas){
        try{
            Ventas ventasTmp=this.obtenerPorID(codigoVentas);
            this.ventasDAO.remove(ventasTmp);
        }catch(Exception e)
        {
            throw new ValidacionException("La venta "+codigoVentas+" esta asociada a una Factura");
        }
     }
    
}
