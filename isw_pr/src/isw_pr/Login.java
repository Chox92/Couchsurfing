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
    private String user;        //nome da verificare
    private String pass;        //password da verificare
    private AccountInfo dati;   //dati account recuperati da database
    
    public Login(String usr, String psw, AccountInfo match){    //alla creazione
        user = usr;     //verrà inizializzata da chi avrà recuperato i dati dal database
        pass = psw;     //o accede questa stessa al database?
        dati = match;   //io pensavo di mettere tutti gli accessi al DB nel controller e far partire le cose da li
    }
    
    public void securityMatch(){ //verifica fasulla dell'account per il login
        if(dati.getUsername().equals(user) && dati.getPsw().equals(pass) ){
            login(); //effettua il login e ridirige alla dashboard
            
        }else{
            System.out.println("Nome utente o Password errati");
        }
    }
    
    private void login(){
        //lancia la dashboard nn
        System.out.println("******************* dati verificati ******************");
    }
}
