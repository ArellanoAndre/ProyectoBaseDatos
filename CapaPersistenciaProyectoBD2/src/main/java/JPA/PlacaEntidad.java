package JPA;

import JPA.Enum.EstadoPlaca;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "placas_tramite")
public class PlacaEntidad extends TramiteEntidad implements Serializable {

    @Column(name = "numero", unique = true, nullable = false)
    private String numero;

    @Column(name = "estado", nullable = false)
    private EstadoPlaca estado;

    @ManyToOne(targetEntity = CostoPlacasEntidad.class)
    @JoinColumn(name = "id_costo", nullable = false)
    protected CostoPlacasEntidad costoPlaca;

    @ManyToOne(targetEntity = VehiculoEntidad.class)
    @JoinColumn(name = "id_vehiculo", nullable = false)
    private VehiculoEntidad vehiculo;

    public PlacaEntidad() {
    }

    public PlacaEntidad(String numero, EstadoPlaca estado, ClienteEntidad cliente, VehiculoEntidad vehiculo) {
        super();
        this.cliente = cliente;
        this.numero = numero;
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public EstadoPlaca getEstado() {
        return estado;
    }

    public void setEstado(EstadoPlaca estado) {
        this.estado = estado;
    }

    public VehiculoEntidad getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoEntidad vehiculo) {
        this.vehiculo = vehiculo;
    }

}
