/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.distri.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Dalia
 */

@Entity
@Table(name = "pedet")
public class Detalle implements Serializable {
    @EmbeddedId
    private DetallePK detallePK;
    
    @JoinColumn(name = "PEVNT_NUMORD", referencedColumnName = "PEVNT_NUMORD", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Ventas ventas;
    
    @JoinColumn(name = "PEART_NUMART", referencedColumnName = "PEART_NUMART", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Articulo articulo;
    
    @Column(name = "PEDET_CANT", nullable = false)
    private Integer cantidad;
    
    @Column(name = "PEDET_TOTITE", nullable = false)
    private BigDecimal total;

    public Detalle() {
    }

    public Detalle(DetallePK detallePK) {
        this.detallePK = detallePK;
    }

    public DetallePK getDetallePK() {
        return detallePK;
    }

    public void setDetallePK(DetallePK detallePK) {
        this.detallePK = detallePK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Ventas getVentas() {
        return ventas;
    }

    public void setVentas(Ventas ventas) {
        this.ventas = ventas;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.detallePK);
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
        final Detalle other = (Detalle) obj;
        if (!Objects.equals(this.detallePK, other.detallePK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Detalle{" + "detallePK=" + detallePK + ", cantidad=" + cantidad + ", total=" + total + '}';
    }
    
    
    
}
