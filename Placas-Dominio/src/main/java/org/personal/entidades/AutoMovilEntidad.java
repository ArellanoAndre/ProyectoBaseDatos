package org.personal.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.personal.enumeradores.EstadoVehiculo;

@Entity
@Table(name = "automoviles")
public class AutoMovilEntidad extends VehiculoEntidad implements Serializable {

    public AutoMovilEntidad() {
    }

    public AutoMovilEntidad(EstadoVehiculo estado, String marca, String linea, String color, String modelo) {
        super(estado, marca, linea, color, modelo);
    }
    
}
