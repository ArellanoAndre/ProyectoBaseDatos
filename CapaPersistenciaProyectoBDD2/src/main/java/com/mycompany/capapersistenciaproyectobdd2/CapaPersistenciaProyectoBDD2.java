/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.capapersistenciaproyectobdd2;

import DAO.ClienteDAO;
import DAO.Conexion;
import DAO.Interface.IConexion;
import JPA.ClienteEntidad;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 */
public class CapaPersistenciaProyectoBDD2 {
 //Atributo de clase Tipo Iconexion 
      private IConexion conexion = new Conexion();
     EntityManager entityManager = conexion.EstablecerConexion();

    public static void main(String[] args) {

try {
    ClienteDAO dao = new ClienteDAO();
    dao.poblarClientes();

        } catch (Exception e) {
        }
    }
        
    }

