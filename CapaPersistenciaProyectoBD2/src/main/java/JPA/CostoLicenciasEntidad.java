/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JPA;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
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
public class CostoLicenciasEntidad extends CostoEntidad implements Serializable {

    @OneToMany(mappedBy = "costoLicencia", cascade = {CascadeType.PERSIST})
    private List<LicenciaEntidad> licencia;

    public CostoLicenciasEntidad() {
    }

    public CostoLicenciasEntidad(List<LicenciaEntidad> licencia, Long id, String vigencia, double costoNormal, double costoDiscapacitado) {
        super(id, vigencia, costoNormal, costoDiscapacitado);
        this.licencia = new ArrayList<>();
    }
    

    public CostoLicenciasEntidad(Long id, String vigencia, double costoNormal, double costoDiscapacitado) {
        super(id, vigencia, costoNormal, costoDiscapacitado);
    }

}
