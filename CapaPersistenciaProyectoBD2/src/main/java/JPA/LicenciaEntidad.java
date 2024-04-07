package JPA;

import JPA.Enum.EstadoLicencia;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "licencias_tramite")
public class LicenciaEntidad extends TramiteEntidad implements Serializable {
    
     @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "folio", unique = true, nullable = false)
    private String folio;

    @Column(name = "vigencia", nullable = false)
    private int vigencia;

    @Column(name = "estado", nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadoLicencia estado;

    @ManyToOne(targetEntity = CostoLicenciasEntidad.class)
    @JoinColumn(name = "id_costo", nullable = false)
    protected CostoLicenciasEntidad costoLicencia;

    public LicenciaEntidad() {
    }

    public LicenciaEntidad(String folio, int vigencia, ClienteEntidad cliente) {
        super();
        this.cliente = cliente;
        this.folio = folio;
        this.vigencia = vigencia;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    public EstadoLicencia getEstado() {
        return estado;
    }

    public void setEstado(EstadoLicencia estado) {
        this.estado = estado;
    }

}