/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAO.Interface.ICliente;
import JPA.ClienteEntidad;
import excepciones.NegocioException;
import interfaces.IAgregarPersonaBO;

/**
 *
 * @author Usuario
 */
public class AgregarPersonaBO implements IAgregarPersonaBO {

    private ICliente clienteDAO;

    public AgregarPersonaBO(ICliente cliente) {
        this.clienteDAO = cliente;
    }
    

    @Override
    public ClienteEntidad AgregarPersona(ClienteEntidad cliente) throws NegocioException {
        ClienteEntidad clienteNuevo= clienteDAO.AgregarPersona(cliente);
        return clienteNuevo;
    }

}
