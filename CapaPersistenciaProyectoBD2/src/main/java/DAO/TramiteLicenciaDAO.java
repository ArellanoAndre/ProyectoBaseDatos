/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAO.Interface.IConexion;
import DAO.Interface.ITramite;
import JPA.Enum.EstadoLicencia;
import JPA.LicenciaEntidad;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Arell
 */
public class TramiteLicenciaDAO implements ITramite {
//Atributo de clase Tipo Iconexion 
private IConexion conexion;

    @Override
    public void CalcularCosto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//    @Override
//    public LicenciaEntidad Validar() {
//EntityManager entityManager = conexion.EstablecerConexion();
//        LicenciaEntidad licencia = entityManager.find(LicenciaEntidad.class, id);
//        entityManager.getTransaction().begin();
//        entityManager.close();
//        return licencia;   
//    }
//
//    @Override
//    public void CambiarEstado(LicenciaEntidad licencia, EstadoLicencia nuevoEstado) {}
//    
//    
    public LicenciaEntidad agregar(LicenciaEntidad licencia) {
        EntityManager entityManager = conexion.EstablecerConexion();
        entityManager.getTransaction().begin();
        entityManager.persist(licencia);
        entityManager.getTransaction().commit();
        entityManager.refresh(licencia);
        entityManager.close();
        return licencia;
    }
    

    

    @Override
    public LicenciaEntidad Validar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void CambiarEstado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
