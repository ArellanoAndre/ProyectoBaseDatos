/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAO.Interface.IConexion;
import JPA.Enum.EstadosJPA;
import JPA.PlacaEntidad;
import JPA.TramiteEntidad;
import java.util.List;
import java.util.Random;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import DAO.Interface.ITramitePlaca;
import Excepciones.PersistenciaException;

/**
 *
 * @author Arell
 */
public class TramitePlacasDAO implements ITramitePlaca {
//Atributo de clase Tipo Iconexion 

    private IConexion conexion;
    EntityManager entityManager = conexion.EstablecerConexion();
//Atributos de clase 
    private static final Random RANDOM = new Random();
    private static final String LETRAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITOS = "0123456789";

    @Override
    public double CalcularCosto(EstadosJPA estado) throws PersistenciaException {
          try {
            TypedQuery<Double> query = entityManager.createQuery(
                "SELECT c.Costo_Normal FROM costoPlacas c WHERE c.estado = :estado", Double.class);
            query.setParameter("estado", estado);
            Double costoPlacas = query.getSingleResult();
            if (costoPlacas != null) {
                return costoPlacas;
            } else {
                throw new PersistenciaException("No se encontró el costo de placas para el estado de auto especificado.");
            }
        } catch (Exception e) {
            throw new PersistenciaException("Error al consultar la base de datos.");
        }
    }
    

    public PlacaEntidad agregar(PlacaEntidad placas) throws PersistenciaException {
        entityManager.getTransaction().begin();
        entityManager.persist(placas);
        entityManager.getTransaction().commit();
        entityManager.refresh(placas);
        entityManager.close();
        return placas;
    }

    @Override
    public void CambiarEstado(Long Id, EstadosJPA nuevoEstado) throws PersistenciaException {
        try {
            entityManager.getTransaction().begin();

            PlacaEntidad placa = entityManager.find(PlacaEntidad.class, Id);
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

    @Override
    public PlacaEntidad BuscarPlacas(String numero)throws PersistenciaException {
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
    public TramiteEntidad Validar(String numero) throws PersistenciaException {
        try {
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

    public static String generarCadenaAleatoria() throws PersistenciaException {
        StringBuilder sb = new StringBuilder();
        // Generar 3 letras aleatorias
        for (int i = 0; i < 3; i++) {
            sb.append(LETRAS.charAt(RANDOM.nextInt(LETRAS.length())));
        }
        // Insertar guion
        sb.append("-");

        // Generar 3 números aleatorios
        for (int i = 0; i < 3; i++) {
            sb.append(DIGITOS.charAt(RANDOM.nextInt(DIGITOS.length())));
        }
        return sb.toString();
    }

}
