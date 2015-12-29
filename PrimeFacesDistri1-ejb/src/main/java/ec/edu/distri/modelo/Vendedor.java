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
 * @author Dalia
 */
@Entity
@Table(name = "pevnd_vended")
public class Vendedor implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//sólo si es autoincremental
    @Column(name = "pevnd_numven", nullable = false)
    private Integer codigo;
    
    @Column(name = "pevnd_nomven", nullable = false)
    private String nombre;
    
    @Column(name = "pevnd_edaven", nullable = false)
    private Integer edad; 
    
    @Column(name = "pevnd_salven", nullable = false)
    private BigDecimal salario;
    
    @Column(name = "pevnd_comven", nullable = false)
    private BigDecimal comision;
    
     @Column(name="pevnd_ofiven", nullable = false)
     private String oficina;
     
     @Column(name="pevnd_telven", nullable = false)
     private String telefono;
     
     @Column(name="pevnd_celven", nullable = false)
     private String celular;
     
    @Column(name="pevnd_emaven", nullable = false)
     private String mail;
    
    @Column(name = "pevnd_indtyp", nullable = false)
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public BigDecimal getComision() {
        return comision;
    }

    public void setComision(BigDecimal comision) {
        this.comision = comision;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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
        hash = 53 * hash + Objects.hashCode(this.codigo);
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
        final Vendedor other = (Vendedor) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", comision=" + comision + ", oficina=" + oficina + ", telefono=" + telefono + ", celular=" + celular + ", mail=" + mail + ", tipoInd=" + tipoInd + '}';
    }
   
    
}
