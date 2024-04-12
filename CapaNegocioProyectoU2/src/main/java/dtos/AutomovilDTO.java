/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Arell
 */
public class AutomovilDTO {
    
    private String serie;

    private String marca;

    private String color;

    private String linea;

    private String modelo;
    
    private int año;

    /**
     * Crea un nuevo objeto AutomovilDTO con el número de serie especificado.
     *
     * @param serie El número de serie del automóvil.
     */
    public AutomovilDTO(String serie) {
        this.serie = serie;
    }

    /**
     * Crea un nuevo objeto AutomovilDTO con los atributos especificados.
     *
     * @param serie El número de serie del automóvil.
     * @param marca La marca del automóvil.
     * @param color El color del automóvil.
     * @param linea La línea del automóvil.
     * @param modelo El modelo del automóvil.
     * @param año el año del carro
     */
    public AutomovilDTO(String serie, String marca, String color, String linea, String modelo,int año) {
        this.serie = serie;
        this.marca = marca;
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
        this.año = año;
    }

    /**
     * Obtiene el número de serie del automóvil.
     *
     * @return El número de serie del automóvil.
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Establece el número de serie del automóvil.
     *
     * @param serie El número de serie del automóvil.
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * Obtiene la marca del automóvil.
     *
     * @return La marca del automóvil.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del automóvil.
     *
     * @param marca La marca del automóvil.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el color del automóvil.
     *
     * @return El color del automóvil.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del automóvil.
     *
     * @param color El color del automóvil.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene la línea del automóvil.
     *
     * @return La línea del automóvil.
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Establece la línea del automóvil.
     *
     * @param linea La línea del automóvil.
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }

    /**
     * Obtiene el modelo del automóvil.
     *
     * @return El modelo del automóvil.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del automóvil.
     *
     * @param modelo El modelo del automóvil.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
}
