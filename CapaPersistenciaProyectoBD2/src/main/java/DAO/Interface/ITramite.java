/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.Interface;

import JPA.Enum.EstadosJPA;
import JPA.LicenciaEntidad;
import JPA.TramiteEntidad;

/**
 *
 * @author Arell
 */
public interface ITramite {
    
    
public void CalcularCosto();

public TramiteEntidad Validar(String numero);

public void CambiarEstado(Long Id, EstadosJPA nuevoEstado);




}
