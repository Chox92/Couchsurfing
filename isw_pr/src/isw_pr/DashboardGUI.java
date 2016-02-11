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
   
    public int gestLettoGui()
    {
        
        int var_tmp_read;
        
        System.out.println("**SEI IN GESTIONE LETTO**\n");
        
        System.out.println("1)Crea letto;\n2)Mostra la lista dei letti;\n"
                + "3)Rimuovi letto;\n4) Indietro .\nScegli!");
        Scanner leggi = new Scanner( System.in );
        var_tmp_read = leggi.nextInt();
        
        return var_tmp_read;
   }
    public String[] creaLettoGui()
    {
        
        String[] var_tmp_read = new String[2];
        
        System.out.println("**SEI IN GESTIONE LETTO**\n");
        
        System.out.println("Inserisci il nome del letto: \n");
        Scanner leggi = new Scanner( System.in );
        var_tmp_read[0] = leggi.nextLine();
        System.out.println("Inserisci la regione del letto: \n");
        var_tmp_read[1] = leggi.nextLine();
        return var_tmp_read;
   }
    public int rimuoviLettoGui()
    {
        
        int var_tmp_read;
        
        System.out.println("**SEI IN GESTIONE LETTO**\n");
        
        System.out.println("Inserisci il numero del letto che vuoi rimuovere, 0(zero) per tornare indietro: \n");
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
