package JPA;

import JPA.Enum.EstadosJPA;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "automoviles")
public class AutoMovilEntidad extends VehiculoEntidad implements Serializable {

    public AutoMovilEntidad() {
    }

    public AutoMovilEntidad(EstadosJPA estado, String numeroSerie, String marca, String linea, String color, String modelo) {
        super(estado, numeroSerie, marca, linea, color, modelo);
    }
}

   