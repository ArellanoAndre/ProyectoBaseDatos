package JPA;

import JPA.ClienteEntidad;
import JPA.PlacaEntidad;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-11T18:37:51", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(VehiculoEntidad.class)
public class VehiculoEntidad_ { 

    public static volatile SingularAttribute<VehiculoEntidad, String> numeroSerie;
    public static volatile SingularAttribute<VehiculoEntidad, String> marca;
    public static volatile SingularAttribute<VehiculoEntidad, ClienteEntidad> cliente;
    public static volatile SingularAttribute<VehiculoEntidad, String> color;
    public static volatile SingularAttribute<VehiculoEntidad, Long> id;
    public static volatile SingularAttribute<VehiculoEntidad, String> modelo;
    public static volatile SingularAttribute<VehiculoEntidad, String> linea;
    public static volatile SingularAttribute<VehiculoEntidad, Integer> año;
    public static volatile ListAttribute<VehiculoEntidad, PlacaEntidad> placas;

}