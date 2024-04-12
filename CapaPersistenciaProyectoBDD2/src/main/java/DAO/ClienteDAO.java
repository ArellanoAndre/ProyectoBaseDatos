/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAO.Interface.IConexion;
import JPA.ClienteEntidad;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import DAO.Interface.ICliente;
import Excepciones.PersistenciaException;
import JPA.TramiteEntidad;
import java.util.ArrayList;
import java.util.Calendar;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arell
 */
public class ClienteDAO implements ICliente {
    //Atributo de clase Tipo Iconexion 

    private IConexion conexion = new Conexion();
    EntityManager entityManager = conexion.EstablecerConexion();
    

    @Override
    public ClienteEntidad BuscarPorRFC(String rfc) throws PersistenciaException {
        Query query = entityManager.createNativeQuery("SELECT * FROM Clientes where rfc = ?", ClienteEntidad.class);
        query.setParameter(1, rfc);

        ClienteEntidad cliente = null;
        try {
            cliente = (ClienteEntidad) query.getSingleResult();
        } catch (Exception e) {
            cliente = null;
        }
        return cliente;
    }    

    public Boolean isDiscapacitado(String rfc) throws PersistenciaException {
        try {
            Query query = entityManager.createQuery("SELECT c.discapacidad FROM Clientes c WHERE c.rfc = :rfc", Boolean.class);
            query.setParameter("rfc", rfc);
            Boolean isDiscapacitado = (Boolean) query.getSingleResult();
            return isDiscapacitado;
        } catch (NoResultException e) {
            // Maneja el caso en el que no se encuentra ningún resultado
            return null;
        } catch (Exception e) {
            // Maneja cualquier otra excepción
            throw new PersistenciaException("Error al verificar si el cliente es discapacitado");
        }
    }

    @Override
    public List<ClienteEntidad> BuscarPorNombre(String nombre) throws PersistenciaException {
        entityManager.getTransaction().begin();

        StringBuilder jpqlBuilder = new StringBuilder("SELECT c FROM Cliente c WHERE c.nombre LIKE :nombre");
        TypedQuery<ClienteEntidad> query = entityManager.createQuery(jpqlBuilder.toString(), ClienteEntidad.class);
        query.setParameter("nombre", "%" + nombre + "%");

        List<ClienteEntidad> clientes = query.getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();

        return clientes;
    }

    @Override
    public List<ClienteEntidad> BuscarPorApellido(String apellido) {
        entityManager.getTransaction().begin();

        StringBuilder jpqlBuilder = new StringBuilder("SELECT c FROM Cliente c WHERE c.apellido LIKE :apellido");
        TypedQuery<ClienteEntidad> query = entityManager.createQuery(jpqlBuilder.toString(), ClienteEntidad.class);
        query.setParameter("apellido", "%" + apellido + "%");

        List<ClienteEntidad> clientes = query.getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();

        return clientes;
    }

    @Override
    public List<ClienteEntidad> BuscarPorAñoNacimiento(int año) throws PersistenciaException {
        entityManager.getTransaction().begin();

        StringBuilder jpqlBuilder = new StringBuilder("SELECT c FROM Cliente c WHERE YEAR(c.fecha_nacimiento) = :año");
        TypedQuery<ClienteEntidad> query = entityManager.createQuery(jpqlBuilder.toString(), ClienteEntidad.class);
        query.setParameter("año", año);

        List<ClienteEntidad> clientes = query.getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();

        return clientes;
    }

    @Override
    public List<TramiteEntidad> VerHistorial(ClienteEntidad cliente) throws PersistenciaException {
        try {
            TypedQuery<TramiteEntidad> query = entityManager.createQuery(
                    "SELECT t FROM TramiteEntidad t WHERE t.cliente = :cliente", TramiteEntidad.class);
            query.setParameter("cliente", cliente);
            return query.getResultList();
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    @Override
    public ClienteEntidad AgregarPersona(ClienteEntidad cliente) throws PersistenciaException {
        entityManager.getTransaction().begin();
        entityManager.persist(cliente);

        entityManager.getTransaction().commit();
        entityManager.close();
        return cliente;
    }
    
    @Override
    public void poblarClientes() throws PersistenciaException {
        if (this.BuscarTodos().isEmpty()) {
  EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("ProyectoBD2");
EntityManager entityManager = managerFactory.createEntityManager();
entityManager.getTransaction().begin();

try {
    List<ClienteEntidad> clientes = new ArrayList<>();
    clientes.add(new ClienteEntidad("Juan", "Pérez", "Gómez", "GHI", false, 2000));
    clientes.add(new ClienteEntidad("María", "López", "Martínez", "ABC", true, 2002));
    clientes.add(new ClienteEntidad("Carlos", "González", "Hernández", "DEF", false, 1998));
    clientes.add(new ClienteEntidad("Ana", "Martínez", "Rodríguez", "JKL", true, 1995));
    clientes.add(new ClienteEntidad("Pedro", "Sánchez", "García", "MNO", false, 2003));
    clientes.add(new ClienteEntidad("Laura", "Ramírez", "Díaz", "RST", true, 1990));
    clientes.add(new ClienteEntidad("Sofía", "Hernández", "Gutiérrez", "UVW", false, 1999));
    clientes.add(new ClienteEntidad("Javier", "Torres", "Núñez", "YZA", true, 2001));
    clientes.add(new ClienteEntidad("Elena", "Díaz", "Sánchez", "PQR", false, 1997));
    clientes.add(new ClienteEntidad("Diego", "García", "Martínez", "CDE", true, 1994));
    clientes.add(new ClienteEntidad("Paula", "Pérez", "López", "FGH", false, 2004));
    clientes.add(new ClienteEntidad("Luis", "Martínez", "Gómez", "XYZ", true, 1993));
    clientes.add(new ClienteEntidad("Adriana", "Gómez", "Rodríguez", "HIJ", false, 2005));
    clientes.add(new ClienteEntidad("Miguel", "Hernández", "Sánchez", "NOP", true, 1996));
    clientes.add(new ClienteEntidad("Fernanda", "Sánchez", "Martínez", "STU", false, 2000));
    clientes.add(new ClienteEntidad("Roberto", "Díaz", "Pérez", "ABC", true, 1991));
    clientes.add(new ClienteEntidad("Lucía", "Martínez", "González", "GHI", false, 1998));
    clientes.add(new ClienteEntidad("Ricardo", "González", "Hernández", "UVW", true, 2002));
    clientes.add(new ClienteEntidad("Carmen", "Hernández", "López", "XYZ", false, 1992));
    clientes.add(new ClienteEntidad("Gabriel", "López", "Sánchez", "PQR", true, 1999));
    
    for (ClienteEntidad cliente : clientes) {
        entityManager.persist(cliente); // Insertar el objeto ClienteEntidad en la base de datos
    }

    entityManager.getTransaction().commit();
    System.out.println("Se insertaron correctamente los registros.");
} catch (Exception e) {
    entityManager.getTransaction().rollback();
    System.out.println("Error al insertar los registros: " + e.getMessage());
} finally {
    entityManager.close();
    managerFactory.close();
}

        }
        
    }

    @Override
    public List<ClienteEntidad> BuscarTodos() throws PersistenciaException {
        entityManager.getTransaction().begin();
        TypedQuery<ClienteEntidad> query = entityManager.createQuery(
                "SELECT c FROM ClienteEntidad c", ClienteEntidad.class);
        List<ClienteEntidad> clientes = query.getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return clientes;
    }

    private DefaultTableModel construirModeloTabla(List<TramiteEntidad> tramites) throws PersistenciaException {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Fecha de Creación");
        model.addColumn("Fecha de Vencimiento");
        model.addColumn("Costo");
        // Agrega más columnas según los atributos que desees mostrar

        for (TramiteEntidad tramite : tramites) {
            Object[] row = {
                tramite.getId(),
                tramite.getFechaCreacion(),
                tramite.getFechaVencimiento(),
                tramite.getCostoNormal()
            // Agrega más atributos según los que desees mostrar en la tabla
            };
            model.addRow(row);
        }

        return model;
    }

    private Calendar crearFecha(int anio, int mes, int dia) {
        Calendar fecha = Calendar.getInstance();
        fecha.set(anio, mes - 1, dia);
        return fecha;
    }

}
