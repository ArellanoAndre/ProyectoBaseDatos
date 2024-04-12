/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAO.Interface.ICliente;
import Excepciones.PersistenciaException;
import JPA.ClienteEntidad;
import excepciones.NegocioException;
import interfaces.IAgregarPersonaBO;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        ClienteEntidad clienteNuevo;
        try {
            clienteNuevo = clienteDAO.AgregarPersona(cliente);
            return clienteNuevo;

        } catch (PersistenciaException ex) {
            throw new NegocioException("No se pudo agregar a las personas");
        }
    }

    @Override
    public void PoblarPersonas() throws NegocioException {
        try {
           clienteDAO.poblarClientes();
           
        } catch (PersistenciaException ex) {
            throw new NegocioException("No se pudo poblar a las personas");
        }    
    }

}
