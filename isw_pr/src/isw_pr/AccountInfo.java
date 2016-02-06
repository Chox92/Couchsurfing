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
public class AccountInfo {
    private String userId; //variabile che conterrà il nome utente
    private String psw;    //variabile che conterrà la password
    
    
    public AccountInfo(String usrID,String passw){  //alla creazione vengono passati dal controller user 
        userId = usrID;                             //password recuperati dal database, oppure mettiamo 
        psw = passw;                                // il recupero dal database qui dentro?
    }
    
    
    
    public String getUsername(){ //rende username
        return userId;
    }
    
    public String getPsw(){      //rende password
        return userId;
    }
    public void setUsername(String usr){    //imposta username
        userId = usr;
    }
    
    public void setPsw(String passw){       //imposta password
        psw = passw;
    }
}
