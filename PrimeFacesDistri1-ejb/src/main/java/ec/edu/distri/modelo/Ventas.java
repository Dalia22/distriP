/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.distri.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Dalia
 */
@Entity
@Table(name = "pevnt_ventas")
public class Ventas implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pevnt_numord", nullable = false)
    private Integer codigo;
    
    @Column(name = "pevnd_numven", nullable = false)
    private Integer vendedor; 
    
    @Column(name = "pecli_numcli", nullable = false)
    private Integer cliente;
   
    @Column(name = "pevnt_totven", nullable = false)
    private BigDecimal totalVenta;
    
    @Column(name = "pevnt_dirent", nullable = false)
    private String direccion;
    
    @Temporal(TemporalType.DATE) //para datos tipo DATE
    @Column(name = "pevnt_fecpag", nullable = false)
    private Date fecha;
    
    @Column(name = "pevnt_tippag", nullable = false)
    private String tipoPago;
     
    @Column(name = "pevnt_tipven", nullable = false)
    private String tipoVenta;   //comisión o encargo

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getVendedor() {
        return vendedor;
    }

    public void setVendedor(Integer vendedor) {
        this.vendedor = vendedor;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(BigDecimal totalVenta) {
        this.totalVenta = totalVenta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ventas other = (Ventas) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ventas{" + "codigo=" + codigo + ", vendedor=" + vendedor + ", cliente=" + cliente + ", totalVenta=" + totalVenta + ", direccion=" + direccion + ", fecha=" + fecha + ", tipoPago=" + tipoPago + ", tipoVenta=" + tipoVenta + '}';
    }         
    
}
