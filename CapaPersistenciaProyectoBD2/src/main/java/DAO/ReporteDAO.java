/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAO.Interface.IConexion;
import JPA.TramiteEntidad;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import DAO.Interface.IReporte;
 
/**
 *
 * @author Arell
 */
public class ReporteDAO implements IReporte {
//Atributo de clase Tipo Iconexion 
private IConexion conexion;
    
    @Override
    public void GenerarReportePDF() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<TramiteEntidad> BuscarPeriodo(Calendar fechaDesde, Calendar fechaHasta) {
         EntityManager entityManager = conexion.EstablecerConexion();
     try {
            entityManager = conexion.EstablecerConexion();

            TypedQuery<TramiteEntidad> query = entityManager.createQuery(
                    "SELECT t FROM TramiteEntidad t WHERE t.fechaCreacion BETWEEN :fechaDesde AND :fechaHasta",
                    TramiteEntidad.class);
            query.setParameter("fechaDesde", fechaDesde);
            query.setParameter("fechaHasta", fechaHasta);

            return query.getResultList();
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }
}

    
    

