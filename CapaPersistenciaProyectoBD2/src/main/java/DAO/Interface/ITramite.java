/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.Interface;

import JPA.LicenciaEntidad;

/**
 *
 * @author Arell
 */
public interface ITramite {
    
    
public void CalcularCosto();

public LicenciaEntidad Validar();

public void CambiarEstado();

}
