package org.personal.entidades;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "clientes_persona")
public class ClienteEntidad implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidoPaterno")
    private String apellidoPaterno;

    @Column(name = "apellidoMaterno")
    private String apellidoMaterno;

    @Column(name = "rfc")
    private String rfc;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "discapacidad", nullable = false)
    private boolean isDiscapacitado;

    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Calendar fechaNacimiento;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Calendar fechaCreacion;

    @Column(name = "fecha_actualizacion")
    @Temporal(TemporalType.DATE)
    private Calendar fechaActualizacion;

    @OneToMany(mappedBy = "cliente", cascade = {CascadeType.PERSIST})
    private List<TramiteEntidad> tramites;

    @OneToMany(mappedBy = "cliente", cascade = {CascadeType.PERSIST})
    private List<VehiculoEntidad> vehiculos;

    public ClienteEntidad() {
    }

    public ClienteEntidad(String nombres, String apellidoPaterno, String apellidoMaterno, String rfc, String telefono, boolean isDiscapacitado, Calendar fechaNacimiento) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.rfc = rfc;
        this.telefono = telefono;
        this.isDiscapacitado=isDiscapacitado;
        this.fechaNacimiento = fechaNacimiento;
    }

    @PrePersist
    public void prePersist() {
        this.fechaCreacion = Calendar.getInstance();
        this.fechaActualizacion = Calendar.getInstance();
    }

    @PreUpdate
    public void preUpdate() {
        this.fechaActualizacion = Calendar.getInstance();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isIsDiscapacitado() {
        return isDiscapacitado;
    }

    public void setIsDiscapacitado(boolean isDiscapacitado) {
        this.isDiscapacitado = isDiscapacitado;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Calendar getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Calendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Calendar getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Calendar fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public List<TramiteEntidad> getTramites() {
        return tramites;
    }

    public void setTramites(List<TramiteEntidad> tramites) {
        this.tramites = tramites;
    }

    public List<VehiculoEntidad> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<VehiculoEntidad> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
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
        final ClienteEntidad other = (ClienteEntidad) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + '}';
    }

}
