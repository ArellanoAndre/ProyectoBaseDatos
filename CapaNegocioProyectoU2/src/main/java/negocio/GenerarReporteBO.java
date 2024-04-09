/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAO.Interface.IReporte;
import excepciones.NegocioException;
import interfaces.IGenerarReporteBO;

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
        reporteDAO.GenerarReportePDF();
    }

}
