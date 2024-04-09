/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import JPA.TramiteEntidad;
import excepciones.NegocioException;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IBuscarPeriodoReporteBO {

     public List<TramiteEntidad> BuscarPeriodo(Calendar fechaDesde, Calendar fechaHasta)  throws NegocioException;

}
