package JPA;

import JPA.TramiteEntidad;
import JPA.VehiculoEntidad;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-04-11T18:37:51", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(ClienteEntidad.class)
public class ClienteEntidad_ { 

    public static volatile SingularAttribute<ClienteEntidad, String> apellidoPaterno;
    public static volatile SingularAttribute<ClienteEntidad, Integer> fechaNacimiento;
    public static volatile ListAttribute<ClienteEntidad, TramiteEntidad> tramites;
    public static volatile SingularAttribute<ClienteEntidad, Boolean> isDiscapacitado;
    public static volatile SingularAttribute<ClienteEntidad, Long> id;
    public static volatile SingularAttribute<ClienteEntidad, String> telefono;
    public static volatile SingularAttribute<ClienteEntidad, String> rfc;
    public static volatile ListAttribute<ClienteEntidad, VehiculoEntidad> vehiculos;
    public static volatile SingularAttribute<ClienteEntidad, String> nombres;
    public static volatile SingularAttribute<ClienteEntidad, String> apellidoMaterno;

}