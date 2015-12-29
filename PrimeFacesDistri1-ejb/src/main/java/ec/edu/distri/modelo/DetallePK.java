/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.distri.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author RAUL
 */
@Embeddable
public class DetallePK implements Serializable {
    
    @Column(name = "PEART_NUMART", nullable = false)
    private Integer codigoArticulo;
    
    @Column(name = "PEVNT_NUMORD", nullable = false)
    private Integer codigoOrden;

    public DetallePK() {
    }

    public Integer getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(Integer codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public Integer getCodigoOrden() {
        return codigoOrden;
    }

    public void setCodigoOrden(Integer codigoOrden) {
        this.codigoOrden = codigoOrden;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.codigoArticulo);
        hash = 89 * hash + Objects.hashCode(this.codigoOrden);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DetallePK other = (DetallePK) obj;
        if (!Objects.equals(this.codigoArticulo, other.codigoArticulo)) {
            return false;
        }
        if (!Objects.equals(this.codigoOrden, other.codigoOrden)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetallePK{" + "codigoArticulo=" + codigoArticulo + ", codigoOrden=" + codigoOrden + '}';
    }
    
    
    
}
