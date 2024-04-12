package JPA;

import JPA.CostoPlacasEntidad;
import JPA.Enum.EstadosJPA;
import JPA.VehiculoEntidad;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-11T18:37:51", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(PlacaEntidad.class)
public class PlacaEntidad_ extends TramiteEntidad_ {

    public static volatile SingularAttribute<PlacaEntidad, CostoPlacasEntidad> costoPlaca;
    public static volatile SingularAttribute<PlacaEntidad, EstadosJPA> estado;
    public static volatile SingularAttribute<PlacaEntidad, String> numero;
    public static volatile SingularAttribute<PlacaEntidad, VehiculoEntidad> vehiculo;

}