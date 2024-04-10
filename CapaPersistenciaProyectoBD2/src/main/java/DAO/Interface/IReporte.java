/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.Interface;

import Excepciones.PersistenciaException;
import JPA.TramiteEntidad;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Arell
 */
public interface IReporte {
    
    public void GenerarReportePDF() throws PersistenciaException;
    
    public List<TramiteEntidad> BuscarPeriodo(Calendar fechaDesde, Calendar fechaHasta) throws PersistenciaException;
    
}
