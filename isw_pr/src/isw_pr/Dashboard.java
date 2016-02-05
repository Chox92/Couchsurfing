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
    
    public GestioneLetto openGestioneLetto(){
        return new GestioneLetto();
    }
    
    public RicercaLetto openRicercaLetto(){
        return new RicercaLetto();
    }
    public void logout(){
        //dovrà chiudere tutto
    }
    
}
