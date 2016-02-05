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
    private String userId;
    private String psw;
    
    
    public AccountInfo(String usrID,String passw){
        userId = usrID;
        psw = passw;
    }
    
    
    
    public String getUsername(){
        return userId;
    }
    
    public String getPsw(){
        return userId;
    }
    public void setUsername(String usr){
        userId = usr;
    }
    
    public void setPsw(String passw){
        psw = passw;
    }
}
