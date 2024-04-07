/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.Interface;

import javax.persistence.EntityManager;

/**
 *
 * @author Arell
 */
public interface IConexion {
    
    /**
     * Obtiene una conexión a la base de datos a través de un EntityManager.
     *
     * @return La conexión a la base de datos.
     */


    public EntityManager EstablecerConexion();
    
}
