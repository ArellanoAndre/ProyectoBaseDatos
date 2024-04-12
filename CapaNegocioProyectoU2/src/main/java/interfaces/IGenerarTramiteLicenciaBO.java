/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import JPA.Enum.EstadosJPA;
import dto.LicenciasDTO;
import excepciones.NegocioException;

/**
 *
 * @author Usuario
 */
public interface IGenerarTramiteLicenciaBO {

     public double CalcularCosto(String Vigencia, boolean isDiscapacitado) throws NegocioException;

    public LicenciasDTO Validar(String identificador) throws NegocioException;

    public void CambiarEstado(Long Id, EstadosJPA nuevoEstado) throws NegocioException;

}
