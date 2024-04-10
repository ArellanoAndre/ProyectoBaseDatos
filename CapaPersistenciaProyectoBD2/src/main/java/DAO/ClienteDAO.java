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
import JPA.TramiteEntidad;
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
    public ClienteEntidad BuscarPorRFC(String rfc) {
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
    public List<ClienteEntidad> BuscarPorNombre(String nombre) {
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
    public List<ClienteEntidad> BuscarPorAñoNacimiento(int año) {
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
    public List<TramiteEntidad> VerHistorial(ClienteEntidad cliente) {
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
    public ClienteEntidad AgregarPersona(ClienteEntidad cliente) {
        entityManager.getTransaction().begin();
        entityManager.persist(cliente);

        entityManager.getTransaction().commit();
        entityManager.close();
        return cliente;
    }

    @Override
    public List<ClienteEntidad> BuscarTodos() {
        entityManager.getTransaction().begin();
        TypedQuery<ClienteEntidad> query = entityManager.createQuery(
                "SELECT c FROM ClienteEntidad c", ClienteEntidad.class);
        List<ClienteEntidad> clientes = query.getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return clientes;
    }

    private DefaultTableModel construirModeloTabla(List<TramiteEntidad> tramites) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Fecha de Creación");
        model.addColumn("Fecha de Actualización");
        model.addColumn("Costo");
        // Agrega más columnas según los atributos que desees mostrar

        for (TramiteEntidad tramite : tramites) {
            Object[] row = {
                tramite.getId(),
                tramite.getFechaCreacion(),
                tramite.getFechaActualizacion(),
                tramite.getCostoNormal()
            // Agrega más atributos según los que desees mostrar en la tabla
            };
            model.addRow(row);
        }

        return model;
    }

}
