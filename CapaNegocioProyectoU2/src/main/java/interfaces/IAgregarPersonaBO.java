/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import JPA.ClienteEntidad;
import excepciones.NegocioException;

/**
 *
 * @author Usuario
 */
public interface IAgregarPersonaBO {

    public ClienteEntidad AgregarPersona(ClienteEntidad cliente) throws NegocioException;
    public void PoblarPersonas() throws NegocioException;

}
