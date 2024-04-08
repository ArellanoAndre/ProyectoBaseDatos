/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAO.Interface.IConexion;
import DAO.Interface.IPersona;
import JPA.ClienteEntidad;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Arell
 */
public class ClienteDAO implements IPersona {
    //Atributo de clase Tipo Iconexion 
private IConexion conexion;

    @Override
    public ClienteEntidad BuscarPorRFC(String rfc) {
          EntityManager entityManager = conexion.EstablecerConexion();

        Query query = entityManager.createNativeQuery("SELECT * FROM Clientes where rfc = ?", ClienteEntidad.class);
        query.setParameter(1, rfc);

        ClienteEntidad cliente = null;
        try {
            cliente = (ClienteEntidad) query.getSingleResult();
        } catch (Exception e) {
            cliente = null;
        }
        return cliente;}

    @Override
    public List<ClienteEntidad> BuscarPorNombre(String nombre) {
          EntityManager entityManager = conexion.EstablecerConexion();
    entityManager.getTransaction().begin();

    StringBuilder jpqlBuilder = new StringBuilder("SELECT c FROM Cliente c WHERE c.nombre LIKE :nombre");
    TypedQuery<ClienteEntidad> query = entityManager.createQuery(jpqlBuilder.toString(), ClienteEntidad.class);
    query.setParameter("nombre", "%" + nombre + "%");

    List<ClienteEntidad> clientes = query.getResultList();

    entityManager.getTransaction().commit();
    entityManager.close();

    return clientes; }

    @Override
    public List<ClienteEntidad> BuscarPorApellido(String apellido) {
       EntityManager entityManager = conexion.EstablecerConexion();
    entityManager.getTransaction().begin();

    StringBuilder jpqlBuilder = new StringBuilder("SELECT c FROM Cliente c WHERE c.apellido LIKE :apellido");
    TypedQuery<ClienteEntidad> query = entityManager.createQuery(jpqlBuilder.toString(), ClienteEntidad.class);
    query.setParameter("apellido", "%" + apellido + "%");

    List<ClienteEntidad> clientes = query.getResultList();

    entityManager.getTransaction().commit();
    entityManager.close();

    return clientes; }

    @Override
    public List<ClienteEntidad> BuscarPorAñoNacimiento(int año) {
        EntityManager entityManager = conexion.EstablecerConexion();
    entityManager.getTransaction().begin();

    StringBuilder jpqlBuilder = new StringBuilder("SELECT c FROM Cliente c WHERE YEAR(c.fecha_nacimiento) = :año");
    TypedQuery<ClienteEntidad> query = entityManager.createQuery(jpqlBuilder.toString(), ClienteEntidad.class);
    query.setParameter("año", año);

    List<ClienteEntidad> clientes = query.getResultList();

    entityManager.getTransaction().commit();
    entityManager.close();

    return clientes; }

    @Override
    public void VerHistorial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public ClienteEntidad AgregarPersona(ClienteEntidad cliente) {
    EntityManager entityManager = conexion.EstablecerConexion();

        entityManager.getTransaction().begin();
        entityManager.persist(cliente);

        entityManager.getTransaction().commit();
        entityManager.close();
        return cliente;    }

    @Override
    public List<ClienteEntidad> BuscarTodos() {
        EntityManager entityManager = conexion.EstablecerConexion();
        entityManager.getTransaction().begin();
        TypedQuery<ClienteEntidad> query = entityManager.createQuery(
                "", ClienteEntidad.class);
        List<ClienteEntidad> clientes = query.getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return clientes;}

    
   
    
}