/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.Interface;

import Excepciones.PersistenciaException;
import JPA.PlacaEntidad;
import JPA.VehiculoEntidad;
import java.util.List;

/**
 *
 * @author Arell
 */
public interface IVehiculo {
    

public void RegistrarAutos(List<VehiculoEntidad> vehiculos);
    
 public PlacaEntidad BuscarPlacas(String numero);

public VehiculoEntidad BuscarNumeroSerie(Long id);



}
