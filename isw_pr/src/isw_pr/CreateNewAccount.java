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
public class CreateNewAccount {
    
    
    public void createAccount(String userID, String password){
        AccountInfo nuovo = new AccountInfo("","");
        nuovo.setUsername(userID);
        nuovo.setPsw(password);
        
    }
    
    
}
