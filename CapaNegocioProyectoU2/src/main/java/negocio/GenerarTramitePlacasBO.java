/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import JPA.Enum.EstadosJPA;
import JPA.PlacaEntidad;
import JPA.TramiteEntidad;
import excepciones.NegocioException;
import interfaces.IGenerarTramitePlacasBO;

/**
 *
 * @author Usuario
 */
public class GenerarTramitePlacasBO implements IGenerarTramitePlacasBO {

    @Override
    public void CalcularCosto() throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TramiteEntidad Validar(String identificador) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void CambiarEstado(Long Id, EstadosJPA nuevoEstado) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PlacaEntidad BuscarPlacas(String numero) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
