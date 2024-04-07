/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JPA;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "costos")
public class CostoEntidad implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Vigencia")
    private String vigencia;

    @Column(name = "Costo_Normal")
    private double costoNormal;

    @Column(name = "Costo_Discapacitado")
    private double costoDiscapacitado;

    public CostoEntidad() {
    }

    public CostoEntidad(Long id, String vigencia, double costoNormal, double costoDiscapacitado) {
        this.id = id;
        this.vigencia = vigencia;
        this.costoNormal = costoNormal;
        this.costoDiscapacitado = costoDiscapacitado;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public double getCostoNormal() {
        return costoNormal;
    }

    public void setCostoNormal(double costoNormal) {
        this.costoNormal = costoNormal;
    }

    public double getCostoDiscapacitado() {
        return costoDiscapacitado;
    }

    public void setCostoDiscapacitado(double costoDiscapacitado) {
        this.costoDiscapacitado = costoDiscapacitado;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CostoEntidad)) {
            return false;
        }
        CostoEntidad other = (CostoEntidad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.personal.entidades.CostoEntidad[ id=" + id + " ]";
    }

}
