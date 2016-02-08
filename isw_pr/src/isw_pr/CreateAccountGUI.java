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
public class CreateAccountGUI  {

  
    
    
    public void  accountgui (String usr,String psw )
    {
        
    
     //  var_tmp_read[2]; ///meglio un vettore
        String[] var_tmp_read = new String[2];
 
        int var_int=0;
        
        System.out.println("**CreateAccountGUI** \n");
        
        System.out.println("Imputtami la usr \n");
        
        Scanner leggi= new Scanner( System.in );
        var_tmp_read[0]= leggi.nextLine();
        
       
        System.out.println("imputtami la psw \n");
        var_tmp_read[1]= leggi.nextLine();
        
        
   
         }
    


    
 
    
}
