/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import JPA.ClienteEntidad;
import dto.ClientesDTO;
import excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IBuscarClienteBO {

    public List<ClienteEntidad> BuscarTodos() throws NegocioException;

    public ClientesDTO BuscarPorRFC(String rfc) throws NegocioException;

    public List<ClienteEntidad> BuscarPorNombre(String nombre) throws NegocioException;

    public List<ClienteEntidad> BuscarPorApellido(String apellido) throws NegocioException;

    public List<ClienteEntidad> BuscarPorAñoNacimiento(int año) throws NegocioException;
    
    public Boolean isDiscapacitado(String rfc) throws NegocioException;
}
