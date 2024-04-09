/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAO.Interface.IConexion;
import DAO.Interface.IVehiculo;
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
    public PlacaEntidad BuscarPlacas(String numero) {
    EntityManager entityManager = null;
        try {
            entityManager = conexion.EstablecerConexion();
            TypedQuery<PlacaEntidad> query = entityManager.createQuery(
                    "SELECT p FROM PlacaEntidad p WHERE p.numero = :numero", PlacaEntidad.class);
            query.setParameter("numero", numero);
            List<PlacaEntidad> resultados = query.getResultList();
            return resultados.isEmpty() ? null : resultados.get(0);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }
@Override
    public VehiculoEntidad BuscarNumeroSerie(Long id) {
        try {
            TypedQuery<VehiculoEntidad> query = entityManager.createQuery(
                    "SELECT v FROM VehiculoEntidad v WHERE v.id = :id", VehiculoEntidad.class);
            query.setParameter("id", id);
            List<VehiculoEntidad> resultados = query.getResultList();
            return resultados.isEmpty() ? null : resultados.get(0);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }
@Override
    public void RegistrarAutos(List<VehiculoEntidad> vehiculos) {
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
