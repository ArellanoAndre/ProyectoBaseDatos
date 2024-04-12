/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAO.Interface.ITramiteLicencia;
import Excepciones.PersistenciaException;
import JPA.Enum.EstadosJPA;
import JPA.TramiteEntidad;
import dto.LicenciasDTO;
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
    public double CalcularCosto(String Vigencia, boolean isDiscapacitado) throws NegocioException {
        double costo;
        try {
            costo = tramiteLicencia.CalcularCosto(Vigencia, isDiscapacitado);
            return costo;
        } catch (PersistenciaException ex) {
            throw new NegocioException("no se pudo calcular el precio");
        }
    }

    @Override
    public LicenciasDTO Validar(String identificador) throws NegocioException {
        try {
            TramiteEntidad tramite = tramiteLicencia.Validar(identificador);
            if (tramite == null) {
                throw new NegocioException("no se encontro el numero");
            }
            LicenciasDTO dto = new LicenciasDTO(identificador);
            return dto;
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
