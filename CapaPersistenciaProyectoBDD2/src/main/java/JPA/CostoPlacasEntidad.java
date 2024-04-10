/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JPA;

import JPA.Enum.EstadosJPA;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "costoPlacas")
public class CostoPlacasEntidad implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "estado", nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadosJPA estado;

    @Column(name = "Costo_Normal")
    private double costoNormal;

    @OneToMany(mappedBy = "costoPlaca", cascade = {CascadeType.PERSIST})
    private List<PlacaEntidad> placa;

    public CostoPlacasEntidad() {
    }

    public CostoPlacasEntidad(EstadosJPA estado, double costoNormal, List<PlacaEntidad> placa) {
        this.estado = estado;
        this.costoNormal = costoNormal;
        this.placa = placa;
    }

 

}
