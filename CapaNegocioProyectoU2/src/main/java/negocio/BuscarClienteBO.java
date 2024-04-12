/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAO.Interface.ICliente;
import Excepciones.PersistenciaException;
import JPA.ClienteEntidad;
import dto.ClientesDTO;
import excepciones.NegocioException;
import interfaces.IBuscarClienteBO;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class BuscarClienteBO implements IBuscarClienteBO {

    private ICliente clienteDAO;

    public BuscarClienteBO(ICliente cliente) {
        this.clienteDAO = cliente;
    }

    @Override
    public List<ClienteEntidad> BuscarTodos() throws NegocioException {
        try {
            if (clienteDAO.BuscarTodos().isEmpty()) {
                throw new NegocioException("No hay ningun cliente registrado");
            }

            List<ClienteEntidad> clientes = clienteDAO.BuscarTodos();
            return clientes;
        } catch (PersistenciaException ex) {
            throw new NegocioException("No se pudo buscar");
        }
    }

    @Override
    public ClientesDTO BuscarPorRFC(String rfc) throws NegocioException {
        if (rfc == null || rfc.trim().isBlank()) {
            throw new NegocioException("La busqueda debe contener informacion sobre el rfc");

        }
        ClienteEntidad cliente;
        try {
            cliente = clienteDAO.BuscarPorRFC(rfc);
            ClientesDTO dto = new ClientesDTO(cliente.getRfc(),cliente.isIsDiscapacitado());
            return dto;
        } catch (PersistenciaException ex) {
            throw new NegocioException("No se pudo buscar por RFC");
        }

    }

    @Override
    public List<ClienteEntidad> BuscarPorNombre(String nombre) throws NegocioException {
        if (nombre == null || nombre.trim().isBlank()) {
            throw new NegocioException("Ingrese un nombre valido");
        }
        List<ClienteEntidad> clientes;
        try {
            clientes = clienteDAO.BuscarPorNombre(nombre);
            return clientes;
        } catch (PersistenciaException ex) {
            throw new NegocioException("No se pudo buscar por Nombre");
        }

    }

    @Override
    public List<ClienteEntidad> BuscarPorApellido(String apellido) throws NegocioException {
        if (apellido == null || apellido.trim().isBlank()) {
            throw new NegocioException("Ingrese un apellido valido");
        }
        List<ClienteEntidad> clientes;
        try {
            clientes = clienteDAO.BuscarPorApellido(apellido);
            return clientes;
        } catch (PersistenciaException ex) {
            throw new NegocioException("No se pudo buscar por apellidos");
        }
    }

    @Override
    public List<ClienteEntidad> BuscarPorAñoNacimiento(int año) throws NegocioException {
        VerificarFechaAñoMenorHoy(año);
        VerificarclienteMayorEdad(año);
        if (año < 1900) {
            throw new NegocioException("Ingrese un año valido");
        }

        List<ClienteEntidad> clientes;
        try {
            clientes = clienteDAO.BuscarPorAñoNacimiento(año);
            return clientes;
        } catch (PersistenciaException ex) {
            throw new NegocioException("No se pudo buscar por apellido");
        }

    }

    private void VerificarFechaAñoMenorHoy(int año) throws NegocioException {
        // VerificarFechaAñoMenorHoy el año actual
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);

        if (año < añoActual) {
            throw new NegocioException("Se debe elegir una fecha correcta");
        }
    }

    private void VerificarclienteMayorEdad(int año) throws NegocioException {
        // Obtener el año actual
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);

        // Calcular la edad sumando 18 años al año de nacimiento
        int añoMayorEdad = año + 18;

        // Verificar si el año en el que el cliente cumpliría 18 años es menor o igual al año actual
        if (añoMayorEdad <= añoActual) {
            throw new NegocioException("El cliente debe ser mayor de edad");

        }
    }

    @Override
    public Boolean isDiscapacitado(String rfc) throws NegocioException {
        boolean discapacitado;
        try {
            discapacitado = clienteDAO.isDiscapacitado(rfc);
            return discapacitado;
        } catch (PersistenciaException ex) {
            throw new NegocioException("No se pudo encontrar el estado del cliente");

        }

    }
}
