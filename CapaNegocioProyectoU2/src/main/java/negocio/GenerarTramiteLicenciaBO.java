/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import JPA.Enum.EstadosJPA;
import JPA.TramiteEntidad;
import excepciones.NegocioException;
import interfaces.IGenerarTramiteLicenciaBO;

/**
 *
 * @author Usuario
 */
public class GenerarTramiteLicenciaBO implements IGenerarTramiteLicenciaBO{

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
    
}
