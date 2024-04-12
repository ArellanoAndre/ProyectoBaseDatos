package JPA;

import JPA.Enum.EstadosJPA;
import JPA.PlacaEntidad;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-11T18:37:51", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(CostoPlacasEntidad.class)
public class CostoPlacasEntidad_ { 

    public static volatile SingularAttribute<CostoPlacasEntidad, EstadosJPA> estado;
    public static volatile SingularAttribute<CostoPlacasEntidad, Double> costoNormal;
    public static volatile SingularAttribute<CostoPlacasEntidad, Long> id;
    public static volatile ListAttribute<CostoPlacasEntidad, PlacaEntidad> placa;

}