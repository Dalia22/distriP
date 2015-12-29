/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.distri.servicio;

import ec.edu.distri.dao.ArticuloDAO;
import ec.edu.distri.exepcion.ValidacionException;
import ec.edu.distri.modelo.Articulo;
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
public class ArticuloServicio {
    @EJB
    private ArticuloDAO articuloDAO;
    
     public List<Articulo> obtenerTodas(){
        return this.articuloDAO.findAll();
    }
    public Articulo obtenerPorID(Integer articuloCodigo){
        return this.articuloDAO.findById(articuloCodigo, false);
    }
    public void crearArticulo(Articulo articulo) throws ValidacionException {
        Articulo articuloTmp=this.obtenerPorID(articulo.getCodigo());
        if(articuloTmp==null){
            this.articuloDAO.insert(articulo);
        }
        else{
            throw new ValidacionException("El codigo "+articulo.getCodigo()+" ya existe"); 
        }
    }
    public void actualizarArticulo(Articulo articulo){
        this.articuloDAO.update(articulo);
    }
    
    public void eliminarArticulo(Integer codigoArticulo){
        try{
           Articulo articuloTmp=this.obtenerPorID(codigoArticulo);
            this.articuloDAO.remove(articuloTmp);
        }catch(Exception e)
        {
            throw new ValidacionException("El articulo "+codigoArticulo+" está asociado a una Factura");
        }
     }
    
}

