/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IBuscarClienteBO {

    public List<ClienteEntidad> BuscarTodos();

    public ClienteEntidad BuscarPorRFC(String rfc);

    public List<ClienteEntidad> BuscarPorNombre(String nombre);

    public List<ClienteEntidad> BuscarPorApellido(String apellido);

    public List<ClienteEntidad> BuscarPorAñoNacimiento(int año);
}
