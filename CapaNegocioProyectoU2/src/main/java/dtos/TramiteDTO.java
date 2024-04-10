/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Calendar;

/**
 *
 * @author Arell
 */
public class TramiteDTO {
    
    private String nombre;
    private String tipo;
    private Calendar fecha_creacion;
    private Calendar fecha_vencimiento;
    private Float costo;

    public TramiteDTO(String nombre, String tipo, Calendar fecha_creacion, Calendar fecha_vencimiento, Float costo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha_creacion = fecha_creacion;
        this.fecha_vencimiento = fecha_vencimiento;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Calendar getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Calendar fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Calendar getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Calendar fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }
    
    
    

}
