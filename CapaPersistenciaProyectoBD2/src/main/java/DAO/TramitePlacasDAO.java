/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAO.Interface.IConexion;
import DAO.Interface.ITramite;
import JPA.Enum.EstadosJPA;
import JPA.PlacaEntidad;
import JPA.TramiteEntidad;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Arell
 */
public class TramitePlacasDAO implements ITramite{
//Atributo de clase Tipo Iconexion 
private IConexion conexion;
EntityManager entityManager = conexion.EstablecerConexion();
    @Override
    public void CalcularCosto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public PlacaEntidad agregar(PlacaEntidad placas) {
        entityManager.getTransaction().begin();
        entityManager.persist(placas);
        entityManager.getTransaction().commit();
        entityManager.refresh(placas);
        entityManager.close();
        return placas;
    }

    @Override
    public void CambiarEstado(Long Id, EstadosJPA nuevoEstado) {
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
    public TramiteEntidad Validar(String numero) {
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
    
    public String GenerarCodigoPlaca(){
    return null;
    }

  
    
}
