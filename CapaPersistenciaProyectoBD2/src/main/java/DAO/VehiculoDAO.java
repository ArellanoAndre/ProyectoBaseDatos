/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAO.Interface.IVehiculo;

/**
 *
 * @author Arell
 */
public class VehiculoDAO implements IVehiculo {

    @Override
    public void RegistrarAuto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void BuscarPlacas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
//     @Override
//    public Vehiculo consultarPorPlaca(String placaSerie) throws PersistenciaException {
//        EntityManager entityManager = conexion.obtenerConexion();
//
//        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Vehiculo> criteriaQuery = criteriaBuilder.createQuery(Vehiculo.class);
//        Root<Vehiculo> root = criteriaQuery.from(Vehiculo.class);
//
//        criteriaQuery.select(root)
//                .where(criteriaBuilder.equal(root.get("placa").get("serie"), placaSerie));
//        criteriaQuery.orderBy(criteriaBuilder.desc(root.get("placa").get("id")));
//
//        List<Vehiculo> vehiculos = entityManager.createQuery(criteriaQuery)
//                .setMaxResults(1)
//                .getResultList();
//        entityManager.close();
//
//        if (!vehiculos.isEmpty()) {
//            // Vehículo encontrado
//            return vehiculos.get(0);
//        } else {
//            throw new PersistenciaException("No se ha encontrado el vehiculo");
//        }
//    }

    @Override
    public void BuscarNumeroSerie() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
 }
    
//     @Override
//    public Vehiculo consultar(String serie) throws PersistenciaException {
//
//        EntityManager entityManager = conexion.obtenerConexion();
//        // objeto constructor de consultas
//        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//        // Objeto consulta que se esta construyendo
//        CriteriaQuery<Vehiculo> criteria = builder.createQuery(Vehiculo.class);
//        Root<Automovil> root = criteria.from(Automovil.class);
//        criteria.select(root).where(builder.equal(root.get("serie"), serie));
//
//        // consulta construida
//        TypedQuery<Vehiculo> query = entityManager.createQuery(criteria);
//        List<Vehiculo> vehiculos = query.getResultList();
//        entityManager.close();
//
//        if (!vehiculos.isEmpty()) {
//            return vehiculos.get(0);
//        } else {
//            throw new PersistenciaException("No se ha encontrado ningun vehiculo con la serie: " + serie);
//        }
//
//    }
}
