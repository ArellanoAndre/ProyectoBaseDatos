/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Usuario
 */
public class LicenciasDTO {
    private String folio;

      private int vigencia;

    public LicenciasDTO(String folio) {
        this.folio = folio;
    }

   public LicenciasDTO(String folio, int vigencia) {
        this.folio = folio;
        this.vigencia = vigencia;
    }

    public LicenciasDTO() {

    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }
    

}
