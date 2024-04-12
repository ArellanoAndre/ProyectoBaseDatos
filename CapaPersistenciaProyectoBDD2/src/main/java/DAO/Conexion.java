/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAO.Interface.IConexion;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Arell
 */
public class Conexion implements IConexion{

    
    /**
     * Obtiene una conexión a la base de datos utilizando JPA (Java Persistence
     * API).
     *
     * @return Una instancia de EntityManager que representa la conexión a la
     * base de datos.
     */
    @Override
    public EntityManager EstablecerConexion() {
        //obtenemos acceso a la fabrica de entitymanagers
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("ProyectoBD2");
        //solicitamos una entity manager (acceso a la bd)
        EntityManager entityManager = emFactory.createEntityManager();

        return entityManager;
    }

}
