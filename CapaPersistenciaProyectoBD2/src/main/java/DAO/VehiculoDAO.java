/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAO.Interface.IConexion;
import DAO.Interface.IVehiculo;
import Excepciones.PersistenciaException;
import JPA.PlacaEntidad;
import JPA.VehiculoEntidad;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Arell
 */
public class VehiculoDAO implements IVehiculo {
    //Atributo de clase Tipo Iconexion 

    private IConexion conexion;
    EntityManager entityManager = conexion.EstablecerConexion();

    @Override
    public VehiculoEntidad BuscarNumeroSerie(String numeroSerie) throws PersistenciaException {
        try {
            TypedQuery<VehiculoEntidad> query = entityManager.createQuery(
                    "SELECT v FROM VehiculoEntidad v WHERE v.numeroSerie = :numeroSerie", VehiculoEntidad.class);
            query.setParameter("numeroSerie", numeroSerie);
            List<VehiculoEntidad> resultados = query.getResultList();
            return resultados.isEmpty() ? null : resultados.get(0);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    @Override
    public void RegistrarAutos(List<VehiculoEntidad> vehiculos) throws PersistenciaException {
        try {
            entityManager.getTransaction().begin();

            for (VehiculoEntidad vehiculo : vehiculos) {
                entityManager.persist(vehiculo);
            }

            entityManager.getTransaction().commit();
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }
}
