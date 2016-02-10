/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isw_pr;
import java.util.*;
/**
 *
 * @author Giovanni
 */

public class LoginGUI  {

  
    
    
    public String[]  loginGUI (String usr,String psw )
    {
        
    
    
        String[] var_tmp_read = new String[2];
 
        int var_int=0;
        
        System.out.println("**LoginGUI**io"
                + "\n");
        
        System.out.println("Imputtami la tua usr \n");
        
        Scanner leggi= new Scanner( System.in );
        var_tmp_read[0]= leggi.nextLine();
        
       
        System.out.println("imputtami la tua  psw \n");
        var_tmp_read[1]= leggi.nextLine();
        
        return var_tmp_read;//ritorna il vettore
   
         }
    


    
 
    
}