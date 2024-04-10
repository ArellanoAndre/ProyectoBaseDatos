/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.Interface;

import Excepciones.PersistenciaException;
import JPA.Enum.EstadosJPA;
import JPA.LicenciaEntidad;
import JPA.TramiteEntidad;

/**
 *
 * @author Usuario
 */
public interface ITramiteLicencia {

    public double CalcularCosto(String Vigencia, boolean isDiscapacitado) throws PersistenciaException;

    public TramiteEntidad Validar(String numero) throws PersistenciaException;

    public void CambiarEstado(Long Id, EstadosJPA nuevoEstado) throws PersistenciaException;

    public LicenciaEntidad agregar(LicenciaEntidad licencia) throws PersistenciaException;

}
