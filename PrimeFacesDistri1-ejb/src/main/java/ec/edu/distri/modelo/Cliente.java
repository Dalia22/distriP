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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author RAUL
 */
@Entity
@Table(name = "pecli_cliente")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pecli_numcli", nullable = false)
    private Integer codigo;
    
    @Column(name = "pecli_nomcli", nullable = false)
    private String nombre;
    
    @Column(name = "pecli_citcli", nullable = false)
    private String ciudad;
    
    @Column(name = "pecli_descli", nullable = true)
    private BigDecimal descuento;
    
    @Column(name = "pecli_indtyp", nullable = true)
    private Integer tipoInd;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public Integer getTipoInd() {
        return tipoInd;
    }

    public void setTipoInd(Integer tipoInd) {
        this.tipoInd = tipoInd;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.codigo);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cliente{" + "codigo=" + codigo + ", nombre=" + nombre + ", ciudad=" + ciudad + ", descuento=" + descuento + ", tipoInd=" + tipoInd + '}';
    }
    
    
}
