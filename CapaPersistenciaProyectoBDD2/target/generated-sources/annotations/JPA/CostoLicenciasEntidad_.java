package JPA;

import JPA.LicenciaEntidad;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-11T18:37:51", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(CostoLicenciasEntidad.class)
public class CostoLicenciasEntidad_ { 

    public static volatile SingularAttribute<CostoLicenciasEntidad, String> vigencia;
    public static volatile SingularAttribute<CostoLicenciasEntidad, Double> costoDiscapacitado;
    public static volatile ListAttribute<CostoLicenciasEntidad, LicenciaEntidad> licencia;
    public static volatile SingularAttribute<CostoLicenciasEntidad, Double> costoNormal;
    public static volatile SingularAttribute<CostoLicenciasEntidad, Long> id;

}