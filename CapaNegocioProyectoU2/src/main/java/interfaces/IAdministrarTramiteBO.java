/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import JPA.Enum.EstadosJPA;
import JPA.TramiteEntidad;
import excepciones.NegocioException;

/**
 *
 * @author Usuario
 */
public interface IAdministrarTramiteBO {

    public void CalcularCosto() throws NegocioException;
 
    public TramiteEntidad Validar(String identificador) throws NegocioException;

    public void CambiarEstado(Long Id, EstadosJPA nuevoEstado) throws NegocioException;
}
