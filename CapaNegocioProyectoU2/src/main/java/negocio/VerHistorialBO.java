/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import DAO.Interface.ICliente;
import Excepciones.PersistenciaException;
import JPA.ClienteEntidad;
import JPA.TramiteEntidad;
import excepciones.NegocioException;
import interfaces.IVerHistorialBO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public List<TramiteEntidad> VerHistorial(ClienteEntidad cliente) throws NegocioException {
        List<TramiteEntidad> historial;
        try {
            historial = historialDAO.VerHistorial(cliente);
            return historial;

        } catch (PersistenciaException ex) {
            throw new NegocioException("Historial no dispobile");
        }
    }

}
