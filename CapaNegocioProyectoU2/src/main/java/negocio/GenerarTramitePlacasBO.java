/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAO.Interface.ITramitePlaca;
import Excepciones.PersistenciaException;
import JPA.Enum.EstadosJPA;
import JPA.PlacaEntidad;
import JPA.TramiteEntidad;
import excepciones.NegocioException;
import interfaces.IGenerarTramitePlacasBO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class GenerarTramitePlacasBO implements IGenerarTramitePlacasBO {

    private ITramitePlaca tramitePlaca;

    public GenerarTramitePlacasBO(ITramitePlaca tramitePlaca) {
        this.tramitePlaca = tramitePlaca;
    }

    
    @Override
    public void CalcularCosto() throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TramiteEntidad Validar(String identificador) throws NegocioException {
        try {
            TramiteEntidad tramite = tramitePlaca.Validar(identificador);
            if (tramite == null) {
                throw new NegocioException("no se encontro el numero");
            }
            return tramite;
        } catch (Exception e) {

            throw new NegocioException("Error al iniciar sesión", e);
        }

    }

    @Override
    public void CambiarEstado(Long id, EstadosJPA nuevoEstado) throws NegocioException {
        try {
            tramitePlaca.CambiarEstado(id, nuevoEstado);
        } catch (PersistenciaException ex) {
            Logger.getLogger(GenerarTramitePlacasBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public PlacaEntidad BuscarPlacas(String numero) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
