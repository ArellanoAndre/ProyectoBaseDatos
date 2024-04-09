/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAO.Interface.IReporte;
import JPA.TramiteEntidad;
import excepciones.NegocioException;
import interfaces.IBuscarPeriodoReporteBO;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class BuscarPeriodoReporteBO implements IBuscarPeriodoReporteBO {

    private IReporte reporteDAO;

    public BuscarPeriodoReporteBO(IReporte reporte) {
        this.reporteDAO = reporte;
    }

    @Override
    public List<TramiteEntidad> BuscarPeriodo(Calendar fechaDesde, Calendar fechaHasta) throws NegocioException {
        List<TramiteEntidad> reportes=reporteDAO.BuscarPeriodo(fechaDesde, fechaHasta);
        return reportes;
    }

}
