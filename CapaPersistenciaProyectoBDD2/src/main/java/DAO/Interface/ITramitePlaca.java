/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.Interface;

import Excepciones.PersistenciaException;
import JPA.Enum.EstadosJPA;
import JPA.LicenciaEntidad;
import JPA.PlacaEntidad;
import JPA.TramiteEntidad;

/**
 *
 * @author Arell
 */
public interface ITramitePlaca {

     public double CalcularCosto(EstadosJPA estado) throws PersistenciaException;

    public TramiteEntidad Validar(String numero) throws PersistenciaException;

    public PlacaEntidad BuscarPlacas(String numero) throws PersistenciaException;

    public void CambiarEstado(Long Id, EstadosJPA nuevoEstado) throws PersistenciaException;

}
