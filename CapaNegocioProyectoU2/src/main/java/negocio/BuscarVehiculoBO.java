/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAO.Interface.IVehiculo;
import Excepciones.PersistenciaException;
import JPA.PlacaEntidad;
import JPA.VehiculoEntidad;
import excepciones.NegocioException;
import interfaces.IBuscarVehiculoBO;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public VehiculoEntidad BuscarNumeroSerie(String numeroSerie) throws NegocioException {
        VehiculoEntidad vehiculo;
        try {
            vehiculo = buscarVehiculoDAO.BuscarNumeroSerie(numeroSerie);
            return vehiculo;
            
        } catch (PersistenciaException ex) {
            throw new NegocioException("No se encontro el numeroSerie");     
        }
    }
    
    private void validarFormatoPlaca(String numero) throws NegocioException {
        // Patrón para validar el formato del número de placa
        String patron = "[A-Z]{3}-\\d{3}";

        // Compilar el patrón en un objeto Pattern
        Pattern pattern = Pattern.compile(patron);

        // Crear un objeto Matcher para el número de placa
        Matcher matcher = pattern.matcher(numero);

        // Verificar si el número de placa cumple con el formato esperado
        if (!matcher.matches()) {
            throw new NegocioException("El formato del número de placa no es válido. Debe ser 3 letras seguidas de un guión y 3 dígitos (ej. AAA-111)");
        }
    }
}
