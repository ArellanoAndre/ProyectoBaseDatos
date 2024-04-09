/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAO.Interface.ICliente;
import JPA.ClienteEntidad;
import excepciones.NegocioException;
import interfaces.IBuscarClienteBO;
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
        List<ClienteEntidad> clientes = clienteDAO.BuscarTodos();
        return clientes;
    }

    @Override
    public ClienteEntidad BuscarPorRFC(String rfc) throws NegocioException {
        ClienteEntidad cliente = clienteDAO.BuscarPorRFC(rfc);
        return cliente;
    }

    @Override
    public List<ClienteEntidad> BuscarPorNombre(String nombre) throws NegocioException {
        List<ClienteEntidad> clientes = clienteDAO.BuscarPorNombre(nombre);
        return clientes;
    }

    @Override
    public List<ClienteEntidad> BuscarPorApellido(String apellido) throws NegocioException {
        List<ClienteEntidad> clientes = clienteDAO.BuscarPorApellido(apellido);
        return clientes;
    }

    @Override
    public List<ClienteEntidad> BuscarPorAñoNacimiento(int año) throws NegocioException {
        List<ClienteEntidad> clientes = clienteDAO.BuscarPorAñoNacimiento(año);
        return clientes;
    }

}
