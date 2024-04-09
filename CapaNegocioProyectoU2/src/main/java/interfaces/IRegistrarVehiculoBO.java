/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import JPA.VehiculoEntidad;
import excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IRegistrarVehiculoBO {

   public void RegistrarAutos(List<VehiculoEntidad> vehiculos) throws NegocioException;

}
