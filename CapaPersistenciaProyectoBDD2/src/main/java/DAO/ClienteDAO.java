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
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arell
 */
public class ClienteDAO implements ICliente {
    //Atributo de clase Tipo Iconexion 

    private IConexion conexion;
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

    public void poblarClientes() throws PersistenciaException {
        if (this.BuscarTodos().isEmpty()) {
            this.AgregarPersona(new ClienteEntidad("Juan", "Pérez", "Gómez", "GHI123456KL21", "5551234567", false, this.crearFecha(2000, 12, 11)));
            this.AgregarPersona(new ClienteEntidad("María", "López", "Martínez", "ABC987654ZYX32", "5559876543", true, this.crearFecha(2002, 5, 20)));
            this.AgregarPersona(new ClienteEntidad("Carlos", "González", "Hernández", "DEF654321MN98", "5558765432", false, this.crearFecha(1998, 8, 15)));
            this.AgregarPersona(new ClienteEntidad("Ana", "Martínez", "Rodríguez", "JKL456789PO54", "5557654321", true, this.crearFecha(1995, 4, 3)));
            this.AgregarPersona(new ClienteEntidad("Pedro", "Sánchez", "García", "MNO987654QP32", "5556543210", false, this.crearFecha(2003, 10, 25)));
            this.AgregarPersona(new ClienteEntidad("Laura", "Ramírez", "Díaz", "RST321098ML76", "5555432109", true, this.crearFecha(1990, 7, 18)));
            this.AgregarPersona(new ClienteEntidad("Sofía", "Hernández", "Gutiérrez", "UVW789012AB43", "5554321098", false, this.crearFecha(1999, 9, 7)));
            this.AgregarPersona(new ClienteEntidad("Javier", "Torres", "Núñez", "YZA210987CD65", "5553210987", true, this.crearFecha(2001, 3, 30)));
            this.AgregarPersona(new ClienteEntidad("Elena", "Díaz", "Sánchez", "PQR543210JK87", "5552109876", false, this.crearFecha(1997, 6, 12)));
            this.AgregarPersona(new ClienteEntidad("Diego", "García", "Martínez", "CDE876543XY21", "5551098765", true, this.crearFecha(1994, 2, 27)));
            this.AgregarPersona(new ClienteEntidad("Paula", "Pérez", "López", "FGH234567IJ98", "5550987654", false, this.crearFecha(2004, 11, 8)));
            this.AgregarPersona(new ClienteEntidad("Luis", "Martínez", "Gómez", "XYZ432109OP87", "5559876543", true, this.crearFecha(1993, 1, 1)));
            this.AgregarPersona(new ClienteEntidad("Adriana", "Gómez", "Rodríguez", "HIJ765432KL09", "5558765432", false, this.crearFecha(2005, 6, 9)));
            this.AgregarPersona(new ClienteEntidad("Miguel", "Hernández", "Sánchez", "NOP987654QR32", "5557654321", true, this.crearFecha(1996, 9, 14)));
            this.AgregarPersona(new ClienteEntidad("Fernanda", "Sánchez", "Martínez", "STU654321VW87", "5556543210", false, this.crearFecha(2000, 4, 23)));
            this.AgregarPersona(new ClienteEntidad("Roberto", "Díaz", "Pérez", "ABC123456ZY98", "5555432109", true, this.crearFecha(1991, 8, 5)));
            this.AgregarPersona(new ClienteEntidad("Lucía", "Martínez", "González", "GHI987654JK32", "5554321098", false, this.crearFecha(1998, 3, 17)));
            this.AgregarPersona(new ClienteEntidad("Ricardo", "González", "Hernández", "UVW234567AB43", "5553210987", true, this.crearFecha(2002, 7, 19)));
            this.AgregarPersona(new ClienteEntidad("Carmen", "Hernández", "López", "XYZ789012CD65", "5552109876", false, this.crearFecha(1992, 10, 2)));
            this.AgregarPersona(new ClienteEntidad("Gabriel", "López", "Sánchez", "PQR456789IJ09", "5551098765", true, this.crearFecha(1999, 12, 28)));
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
