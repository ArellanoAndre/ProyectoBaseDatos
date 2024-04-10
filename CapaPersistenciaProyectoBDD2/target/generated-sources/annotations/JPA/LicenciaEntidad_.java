package JPA;

import JPA.CostoLicenciasEntidad;
import JPA.Enum.EstadosJPA;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-10T14:36:59", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(LicenciaEntidad.class)
public class LicenciaEntidad_ extends TramiteEntidad_ {

    public static volatile SingularAttribute<LicenciaEntidad, EstadosJPA> estado;
    public static volatile SingularAttribute<LicenciaEntidad, CostoLicenciasEntidad> costoLicencia;
    public static volatile SingularAttribute<LicenciaEntidad, String> folio;

}