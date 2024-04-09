/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAO.Interface.IVehiculo;
import JPA.PlacaEntidad;
import JPA.VehiculoEntidad;
import excepciones.NegocioException;
import interfaces.IBuscarVehiculoBO;

/**
 *
 * @author Usuario
 */
public class BuscarVehiculoBO implements IBuscarVehiculoBO {

    private IVehiculo buscarVehiculoDAO;

    public BuscarVehiculoBO(IVehiculo buscarVehiculo) {
        this.buscarVehiculoDAO = buscarVehiculo;
    }

    @Override
    public PlacaEntidad BuscarPlacas(String numero) throws NegocioException {
        PlacaEntidad placa= buscarVehiculoDAO.BuscarPlacas(numero);
        return placa;
    }

    @Override
    public VehiculoEntidad BuscarNumeroSerie(String numeroSerie) throws NegocioException {
        VehiculoEntidad vehiculo = buscarVehiculoDAO.BuscarNumeroSerie(numeroSerie);
        return vehiculo;
    }

}
