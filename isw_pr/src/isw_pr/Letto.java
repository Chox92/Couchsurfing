/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isw_pr;

/**
 *
 * @author gimir_000
 */
public class Letto {
   private String letto;        //nome del letto
   private String disp_letto;   //disponibilità, 1 default
   private String location;     //regione del letto
   
   public String getLetto() {   //rende il nome del letto
      return letto;
   }
   
   public void setLetto(String letto) { //imposta il nome del letto 
      this.letto = letto;
   }
   
   public String getDisp_letto() {      //rende la disponibilità del letto
      return disp_letto;
   }
   
   public void setDisp_letto(String disp_letto) {   //imposta la disponibilità del letto
      this.disp_letto = disp_letto;
   }
   
   public String getLocation() {        //rende la posizione del letto
      return location;
   }
   
   public void setLocation(String location) {   //imposta la posizione del letto
      this.location = location;
      
   }
   
   /*LETTO FA RIMA CON TETTO*/
}