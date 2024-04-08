/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.Interface;

import JPA.ClienteEntidad;
import java.util.List;

/**
 *
 * @author Arell
 */
public interface ICliente {
    
   public List<ClienteEntidad> BuscarTodos();
    
   public ClienteEntidad BuscarPorRFC(String rfc);
   
   public List<ClienteEntidad> BuscarPorNombre(String nombre);
   
   public List<ClienteEntidad> BuscarPorApellido(String apellido);
   
   public List<ClienteEntidad> BuscarPorAñoNacimiento(int año);
   
   public void VerHistorial();
   
   public ClienteEntidad AgregarPersona(ClienteEntidad cliente);
   
    
}
