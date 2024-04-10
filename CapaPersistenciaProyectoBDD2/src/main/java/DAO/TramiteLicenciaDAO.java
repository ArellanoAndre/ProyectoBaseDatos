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
    public double CalcularCosto(String Vigencia, boolean isDiscapacitado) throws PersistenciaException {
        double costo;
        try{
        if (!isDiscapacitado) {
            costo = this.CalcularCostoNormal(Vigencia);
            return costo;
        }
        costo = this.CalcularCostoDiscapacitado(Vigencia);
        return costo;
        } catch (Exception e) {
            throw new PersistenciaException("Error al obtener el precio");
        }
    }

    private double CalcularCostoNormal(String vigencia) throws PersistenciaException {
        try {
            TypedQuery<Double> query = entityManager.createQuery(
                    "SELECT c.Costo_Normal FROM costoLicencias c WHERE c.Vigencia = :vigencia ", Double.class);
            query.setParameter("vigencia", vigencia);
            Double costo = query.getSingleResult();
            if (costo != null) {
                return costo;
            } else {
                throw new PersistenciaException("No se encontró el costo para la vigencia y condición especificadas.");
            }
        } catch (Exception e) {
            throw new PersistenciaException("Error al consultar la base de datos.");
        }
    }

    private double CalcularCostoDiscapacitado(String vigencia) throws PersistenciaException {
        try {
            TypedQuery<Double> query = entityManager.createQuery(
                    "SELECT c.Costo_Discapacitado FROM costoLicencias c WHERE c.Vigencia = :vigencia ", Double.class);
            query.setParameter("vigencia", vigencia);
            Double costo = query.getSingleResult();
            if (costo != null) {
                return costo;
            } else {
                throw new PersistenciaException("No se encontró el costo para la vigencia y condición especificadas.");
            }
        } catch (Exception e) {
            throw new PersistenciaException("Error al consultar la base de datos.");
        }
    }

    @Override
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
        }
    }
}
