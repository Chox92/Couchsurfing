/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isw_pr;

import java.util.Scanner;

/**
 *
 * @author Giovanni
 */
public class DashboardGUI {
    
    public int dashGui()
    {
        
        int var_tmp_read;
        
        System.out.println("**SEI IN DASHBOARD**\n");
        
        System.out.println("1) Gestione letto;\n2) Ricerca letto \n3) Non ricordo");
        
        Scanner leggi = new Scanner( System.in );
        var_tmp_read = leggi.nextInt();
        
        return var_tmp_read;
   }
            
   public String search(){
       String var;
       System.out.println("Inserisci la regione di ricerca: ");
       Scanner leggi= new Scanner( System.in );
       return var= leggi.nextLine();
   }         
            
}
