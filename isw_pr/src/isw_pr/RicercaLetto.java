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
public class RicercaLetto {
    private Letto[] lista;
    private Controller controller;
    
    public RicercaLetto(String luogo, String disp, Controller c){
        controller = c;
        lista = controller.findLettoDB(luogo, disp);
    };
    
    
}
