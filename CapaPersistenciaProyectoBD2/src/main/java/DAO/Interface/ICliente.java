/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO.Interface;

import Excepciones.PersistenciaException;
import JPA.ClienteEntidad;
import JPA.TramiteEntidad;
import java.util.List;

/**
 *
 * @author Arell
 */
public interface ICliente {
    
   public List<ClienteEntidad> BuscarTodos() throws PersistenciaException;
    
   public ClienteEntidad BuscarPorRFC(String rfc) throws PersistenciaException;
   
   public List<ClienteEntidad> BuscarPorNombre(String nombre) throws PersistenciaException;
   
   public List<ClienteEntidad> BuscarPorApellido(String apellido) throws PersistenciaException;
   
   public List<ClienteEntidad> BuscarPorAñoNacimiento(int año) throws PersistenciaException;
   
    public  List<TramiteEntidad> VerHistorial(ClienteEntidad cliente) throws PersistenciaException;
   
   public ClienteEntidad AgregarPersona(ClienteEntidad cliente) throws PersistenciaException;
   
    
}
