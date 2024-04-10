/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAO.Interface.IConexion;
import DAO.Interface.ITramiteLicencia;
import JPA.Enum.EstadosJPA;
import JPA.LicenciaEntidad;
import JPA.TramiteEntidad;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import DAO.Interface.ITramitePlaca;
import Excepciones.PersistenciaException;

/**
 *
 * @author Arell
 */
public class TramiteLicenciaDAO implements ITramiteLicencia {
//Atributo de clase Tipo Iconexion 
private IConexion conexion;
EntityManager entityManager = conexion.EstablecerConexion();

    @Override
    public void CalcularCosto() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet.") ; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    public LicenciaEntidad agregar(LicenciaEntidad licencia) throws PersistenciaException {
        entityManager.getTransaction().begin();
        entityManager.persist(licencia);
        entityManager.getTransaction().commit();
        entityManager.refresh(licencia);
        entityManager.close();
        return licencia;
    }
  
    @Override
    public TramiteEntidad Validar(String folio) throws PersistenciaException {
       EntityManager entityManager = null;
        try {
            entityManager = conexion.EstablecerConexion();
            TypedQuery<LicenciaEntidad> query = entityManager.createQuery(
                    "SELECT l FROM LicenciaEntidad l WHERE l.folio = :folio", LicenciaEntidad.class);
            query.setParameter("folio", folio);
            List<LicenciaEntidad> resultados = query.getResultList();
            return resultados.isEmpty() ? null : resultados.get(0);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    } 


    @Override
    public void CambiarEstado(Long Id, EstadosJPA nuevoEstado) throws PersistenciaException {
          try {
            entityManager.getTransaction().begin();

            LicenciaEntidad placa = entityManager.find(LicenciaEntidad.class, Id);
            if (placa != null) {
                placa.setEstado(nuevoEstado);
                entityManager.merge(placa);
                entityManager.getTransaction().commit();
            } else {
                throw new IllegalArgumentException("La placa con ID " + Id + " no existe");
            }
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        } }
}
