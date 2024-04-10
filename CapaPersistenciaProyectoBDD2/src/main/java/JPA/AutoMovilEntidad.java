package JPA;

import JPA.Enum.EstadosJPA;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "automoviles")
public class AutoMovilEntidad extends VehiculoEntidad implements Serializable {

    public AutoMovilEntidad() {
    }

    public AutoMovilEntidad(String numeroSerie, String marca, String linea, String color, String modelo) {
        super(numeroSerie, marca, linea, color, modelo);
    }

    public AutoMovilEntidad(String numeroSerie, String marca, String linea, String color, String modelo, int año, List<PlacaEntidad> placas, ClienteEntidad cliente) {
        super(numeroSerie, marca, linea, color, modelo, año, placas, cliente);
    }

}
