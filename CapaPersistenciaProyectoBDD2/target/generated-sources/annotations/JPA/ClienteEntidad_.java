package JPA;

import JPA.TramiteEntidad;
import JPA.VehiculoEntidad;
import java.util.Calendar;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-10T05:41:28", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(ClienteEntidad.class)
public class ClienteEntidad_ { 

    public static volatile SingularAttribute<ClienteEntidad, String> apellidoPaterno;
    public static volatile SingularAttribute<ClienteEntidad, Calendar> fechaNacimiento;
    public static volatile ListAttribute<ClienteEntidad, TramiteEntidad> tramites;
    public static volatile SingularAttribute<ClienteEntidad, Boolean> isDiscapacitado;
    public static volatile SingularAttribute<ClienteEntidad, Calendar> fechaCreacion;
    public static volatile SingularAttribute<ClienteEntidad, Calendar> fechaActualizacion;
    public static volatile SingularAttribute<ClienteEntidad, Long> id;
    public static volatile SingularAttribute<ClienteEntidad, String> telefono;
    public static volatile SingularAttribute<ClienteEntidad, String> rfc;
    public static volatile ListAttribute<ClienteEntidad, VehiculoEntidad> vehiculos;
    public static volatile SingularAttribute<ClienteEntidad, String> nombres;
    public static volatile SingularAttribute<ClienteEntidad, String> apellidoMaterno;

}