/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import JPA.ClienteEntidad;
import JPA.TramiteEntidad;
import excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IVerHistorialBO {

     public  List<TramiteEntidad> VerHistorial(ClienteEntidad cliente)throws NegocioException;

}
