/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAO.Interface.ICliente;
import JPA.ClienteEntidad;
import JPA.TramiteEntidad;
import excepciones.NegocioException;
import interfaces.IVerHistorialBO;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class VerHistorialBO implements IVerHistorialBO {

    private ICliente historialDAO;

    public VerHistorialBO(ICliente historial) {
        this.historialDAO = historial;
    }
    
 
    @Override
    public  List<TramiteEntidad> VerHistorial(ClienteEntidad cliente) throws NegocioException {
        List<TramiteEntidad> historial=historialDAO.VerHistorial(cliente);
        return historial;
    }

}
