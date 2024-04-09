/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import JPA.ClienteEntidad;
import excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IBuscarClienteBO {

    public List<ClienteEntidad> BuscarTodos() throws NegocioException;

    public ClienteEntidad BuscarPorRFC(String rfc) throws NegocioException;

    public List<ClienteEntidad> BuscarPorNombre(String nombre) throws NegocioException;

    public List<ClienteEntidad> BuscarPorApellido(String apellido) throws NegocioException;

    public List<ClienteEntidad> BuscarPorAñoNacimiento(int año) throws NegocioException;
}
