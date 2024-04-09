/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAO.Interface.ITramite;
import JPA.Enum.EstadosJPA;
import JPA.LicenciaEntidad;
import JPA.TramiteEntidad;
import excepciones.NegocioException;
import interfaces.IAdministrarTramiteBO;

/**
 *
 * @author Usuario
 */
public class AdministrarTramiteBO implements IAdministrarTramiteBO {
    
    private ITramite tramiteDAO;
    
    public AdministrarTramiteBO(ITramite tramite) {
        this.tramiteDAO = tramite;
    }
    
    @Override
    public void CalcularCosto() throws NegocioException {
        tramiteDAO.CalcularCosto();
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
