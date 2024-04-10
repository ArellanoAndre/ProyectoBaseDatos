/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAO.Interface.IReporte;
import Excepciones.PersistenciaException;
import excepciones.NegocioException;
import interfaces.IGenerarReporteBO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class GenerarReporteBO implements IGenerarReporteBO {

    private IReporte reporteDAO;

    public GenerarReporteBO(IReporte reporte) {
        this.reporteDAO = reporte;
    }

    @Override
    public void GenerarReportePDF() throws NegocioException {
        try {
            reporteDAO.GenerarReportePDF();
        } catch (PersistenciaException ex) {
            Logger.getLogger(GenerarReporteBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
