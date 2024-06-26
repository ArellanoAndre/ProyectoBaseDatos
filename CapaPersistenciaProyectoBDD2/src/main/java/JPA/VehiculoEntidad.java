package JPA;

import JPA.Enum.EstadosJPA;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "vehiculos")
public class VehiculoEntidad implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = 1000L;

    @Column(name = "numeroSerie", nullable = false)
    private String numeroSerie;

    @Column(name = "marca", nullable = false)
    private String marca;

    @Column(name = "linea", nullable = false)
    private String linea;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "modelo", nullable = false)
    private String modelo;

    @Column(name = "año", nullable = false)
    private int año;

    @OneToMany(mappedBy = "vehiculo", cascade = {CascadeType.PERSIST})
    private List<PlacaEntidad> placas;

    @ManyToOne(targetEntity = ClienteEntidad.class)
    @JoinColumn(name = "id_cliente", nullable = false)
    protected ClienteEntidad cliente;

    public VehiculoEntidad() {
    }

    public VehiculoEntidad(String numeroSerie, String marca, String linea, String color, String modelo) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
    }

    public VehiculoEntidad(String numeroSerie, String marca, String linea, String color, String modelo, int año, List<PlacaEntidad> placas, ClienteEntidad cliente) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
        this.año = año;
        this.placas = placas;
        this.cliente = cliente;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public List<PlacaEntidad> getPlacas() {
        return placas;
    }

    public void setPlacas(List<PlacaEntidad> placas) {
        this.placas = placas;
    }

    public ClienteEntidad getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntidad cliente) {
        this.cliente = cliente;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void agregarPlaca(PlacaEntidad placa) {
        if (this.placas == null) {
            this.placas.add(placa);
        }
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
        if (!(object instanceof VehiculoEntidad)) {
            return false;
        }
        VehiculoEntidad other = (VehiculoEntidad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.personal.entidades.Vehiculo[ id=" + id + " ]";
    }

}
