/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAO.TramitePlacasDAO;
import JPA.Enum.EstadosJPA;
import JPA.LicenciaEntidad;
import JPA.TramiteEntidad;
import excepciones.NegocioException;
import interfaces.IAdministrarTramiteBO;
import DAO.Interface.ITramitePlaca;

/**
 *
 * @author Usuario
 */
public class AdministrarTramiteBO implements IAdministrarTramiteBO {
    
    private ITramitePlaca tramiteDAO = new TramitePlacasDAO() ;
    
    public AdministrarTramiteBO(ITramitePlaca tramite) {
        this.tramiteDAO = tramite;
    }
    
    @Override
    public void CalcularCosto() throws NegocioException {
        tramiteDAO.;
    }
    
    @Override
    public TramiteEntidad Validar(String identificador) throws NegocioException {
        try {
            TramiteEntidad tramite = tramiteDAO.Validar(identificador);
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
    tramiteDAO.CambiarEstado(id, nuevoEstado);
}
    
}
