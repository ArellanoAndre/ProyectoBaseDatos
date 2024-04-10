/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAO.Interface.ICliente;
import JPA.ClienteEntidad;
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
        if (clienteDAO.BuscarTodos().isEmpty()) {
            throw new NegocioException("No hay ningun cliente registrado");
        }
        List<ClienteEntidad> clientes = clienteDAO.BuscarTodos();
        return clientes;
    }

    @Override
    public ClienteEntidad BuscarPorRFC(String rfc) throws NegocioException {
        if (rfc == null || rfc.trim().isBlank()) {
            throw new NegocioException("La busqueda debe contener informacion sobre el rfc");

        }
        ClienteEntidad cliente = clienteDAO.BuscarPorRFC(rfc);
        return cliente;
    }

    @Override
    public List<ClienteEntidad> BuscarPorNombre(String nombre) throws NegocioException {
        if (nombre == null || nombre.trim().isBlank()) {
            throw new NegocioException("Ingrese un nombre valido");
        }
        List<ClienteEntidad> clientes = clienteDAO.BuscarPorNombre(nombre);
        return clientes;
    }

    @Override
    public List<ClienteEntidad> BuscarPorApellido(String apellido) throws NegocioException {
        if (apellido == null || apellido.trim().isBlank()) {
            throw new NegocioException("Ingrese un apellido valido");
        }
        List<ClienteEntidad> clientes = clienteDAO.BuscarPorApellido(apellido);
        return clientes;
    }

    @Override
    public List<ClienteEntidad> BuscarPorAñoNacimiento(int año) throws NegocioException {
        VerificarFechaAñoMenorHoy(año);
        VerificarclienteMayorEdad(año);
        if (año < 1900) {
            throw new NegocioException("Ingrese un año valido");
        }

        List<ClienteEntidad> clientes = clienteDAO.BuscarPorAñoNacimiento(año);
        return clientes;
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
}
