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
    public PlacaEntidad BuscarPlacas(String numero) throws NegocioException {
        if (numero==null|| numero.trim().isBlank()) {
            throw new NegocioException("Ingrese un numero de placas correcto");
        }
        validarFormatoPlaca(numero);
        PlacaEntidad placa = buscarVehiculoDAO.BuscarPlacas(numero);
        return placa;
    }

    @Override
    public VehiculoEntidad BuscarNumeroSerie(String numeroSerie) throws NegocioException {
        VehiculoEntidad vehiculo = buscarVehiculoDAO.BuscarNumeroSerie(numeroSerie);
        return vehiculo;
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
