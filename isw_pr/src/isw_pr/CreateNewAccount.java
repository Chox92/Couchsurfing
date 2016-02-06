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
    private AccountInfo nuovo;
    
    public void createAccount(String userID, String password){  //non serve estendere account info
        nuovo = new AccountInfo("","");             //basta aggiungere una funzione qua
        nuovo.setUsername(userID);
        nuovo.setPsw(password);    
    }
    
    public AccountInfo getAccount(){        //per restituire l'account
        return nuovo;                       //
    }
    
}
