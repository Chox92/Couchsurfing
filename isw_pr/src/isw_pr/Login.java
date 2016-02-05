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
public class Login {
    private String user;
    private String pass;
    private AccountInfo dati;
    
    public Login(String usr, String psw, AccountInfo match){
        user = usr;
        pass = psw;
        dati = match;
    }
    
    private void securityMatch(){
        if(true)/*(dati.getUsername() == user && dati.getPsw() == pass)*/{
            login();
        }else{
            System.out.println("Nome utente o Password errati");
        }
    }
    
    private void login(){
        //lancia la dashboard
    }
}
