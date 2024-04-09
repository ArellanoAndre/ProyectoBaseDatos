/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAO.Interface.IVehiculo;
import JPA.VehiculoEntidad;
import excepciones.NegocioException;
import interfaces.IRegistrarVehiculoBO;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class RegistrarVehiculoBO implements IRegistrarVehiculoBO {

    private IVehiculo registrarVehiculoDAO;

    public RegistrarVehiculoBO(IVehiculo buscarVehiculo) {
        this.registrarVehiculoDAO = buscarVehiculo;
    }
    
    

    @Override
    public void RegistrarAutos(List<VehiculoEntidad> vehiculos) throws NegocioException {
       registrarVehiculoDAO.RegistrarAutos(vehiculos);
    }

}
