package JPA;

import JPA.ClienteEntidad;
import JPA.Enum.TipoTramite;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-10T14:36:58", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(TramiteEntidad.class)
public class TramiteEntidad_ { 

    public static volatile SingularAttribute<TramiteEntidad, Integer> vigencia;
    public static volatile SingularAttribute<TramiteEntidad, ClienteEntidad> cliente;
    public static volatile SingularAttribute<TramiteEntidad, TipoTramite> tipo;
    public static volatile SingularAttribute<TramiteEntidad, Double> costo;
    public static volatile SingularAttribute<TramiteEntidad, Calendar> fechaVencimiento;
    public static volatile SingularAttribute<TramiteEntidad, Calendar> fechaCreacion;
    public static volatile SingularAttribute<TramiteEntidad, Long> id;

}