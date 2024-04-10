/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JPA;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "costoLicencias")
public class CostoLicenciasEntidad implements Serializable {

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

    @OneToMany(mappedBy = "costoLicencia", cascade = {CascadeType.PERSIST})
    private List<LicenciaEntidad> licencia;

    public CostoLicenciasEntidad() {
    }

    public CostoLicenciasEntidad(String vigencia, double costoNormal, double costoDiscapacitado, List<LicenciaEntidad> licencia) {
        this.vigencia = vigencia;
        this.costoNormal = costoNormal;
        this.costoDiscapacitado = costoDiscapacitado;
        this.licencia = licencia;
    }


    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public List<LicenciaEntidad> getLicencia() {
        return licencia;
    }

    public void setLicencia(List<LicenciaEntidad> licencia) {
        this.licencia = licencia;
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
        if (!(object instanceof CostoLicenciasEntidad)) {
            return false;
        }
        CostoLicenciasEntidad other = (CostoLicenciasEntidad) object;
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
