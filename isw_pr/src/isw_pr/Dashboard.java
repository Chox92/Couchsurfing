/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isw_pr;

/**
 *
 * @author Giovanni
 */
public class Dashboard {
    
    public GestioneLetto openGestioneLetto(){   //istanzia la classe Gestione letto
        return new GestioneLetto();             //stavo seguendo la struttura del diagramma delle classi
    }
    
    public RicercaLetto openRicercaLetto(String luogo, String disp, Controller c){
        return new RicercaLetto(luogo, disp, c);
    }
    public void logout(){
        //dovrà chiudere tutto
    }
    
}
