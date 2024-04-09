/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import JPA.PlacaEntidad;
import JPA.VehiculoEntidad;
import excepciones.NegocioException;

/**
 *
 * @author Usuario
 */
public interface IBuscarVehiculoBO {

    public PlacaEntidad BuscarPlacas(String numero) throws NegocioException;

    public VehiculoEntidad BuscarNumeroSerie(String numeroSerie) throws NegocioException;
}
