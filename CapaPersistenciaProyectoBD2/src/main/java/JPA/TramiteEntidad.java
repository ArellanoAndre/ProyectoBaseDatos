package JPA;

import JPA.Enum.TipoTramite;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "tramites")
public class TramiteEntidad implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vigencia", nullable = false)
    private int vigencia;
    
     @Column(name = "tipo", nullable = false)
    private TipoTramite tipo;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Calendar fechaCreacion;

    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Calendar fechaVencimiento;

    @Column(name = "costo")
    private double costo;

    @ManyToOne(targetEntity = ClienteEntidad.class)
    @JoinColumn(name = "id_cliente", nullable = false)
    protected ClienteEntidad cliente;

    public TramiteEntidad() {
    }

    public TramiteEntidad(int vigencia, Calendar fechaCreacion,TipoTramite tipo, double costo, ClienteEntidad cliente) {
        this.vigencia = vigencia;
        this.fechaCreacion = fechaCreacion;
        this.costo = costo;
        this.tipo=tipo;
        this.cliente = cliente;
        this.setFechaVencimiento(fechaCreacion, vigencia);
    }
   

    public TramiteEntidad(double costo) {
        this.costo = costo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Calendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    public Calendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Calendar fechaCreacion, int años) {
        Calendar resultado = (Calendar) fechaCreacion.clone();
        resultado.add(Calendar.YEAR, años);
        this.fechaVencimiento= resultado;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getCostoNormal() {
        return costo;
    }

    public void setCostoNormal(double costoNormal) {
        this.costo = costoNormal;
    }

    public void setTipo(TipoTramite tipo) {
        this.tipo = tipo;
    }

    public ClienteEntidad getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntidad cliente) {
        this.cliente = cliente;
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
        if (!(object instanceof TramiteEntidad)) {
            return false;
        }
        TramiteEntidad other = (TramiteEntidad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.personal.entidades.Tramites[ id=" + id + " ]";
    }

}
