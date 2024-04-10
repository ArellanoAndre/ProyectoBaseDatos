/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAO.Interface.ITramiteLicencia;
import Excepciones.PersistenciaException;
import JPA.Enum.EstadosJPA;
import JPA.TramiteEntidad;
import excepciones.NegocioException;
import interfaces.IGenerarTramiteLicenciaBO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class GenerarTramiteLicenciaBO implements IGenerarTramiteLicenciaBO {

    private ITramiteLicencia tramiteLicencia;

    public GenerarTramiteLicenciaBO(ITramiteLicencia tramiteLicencia) {
        this.tramiteLicencia = tramiteLicencia;
    }

    @Override
    public void CalcularCosto() throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TramiteEntidad Validar(String identificador) throws NegocioException {
        try {
            TramiteEntidad tramite = tramiteLicencia.Validar(identificador);
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
            tramiteLicencia.CambiarEstado(id, nuevoEstado);
        } catch (PersistenciaException ex) {
            Logger.getLogger(GenerarTramiteLicenciaBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
