/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.EEEEEEE
 */
package isw_pr;
import java.util.*;

/**
 *
 * @author gimir_000
 */
public  class Controller  {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
        String[] tmp_di_passaggio = new String[2]; //un po' molto brutto
        AccountInfo account1 = new AccountInfo("", "");
        
        View view = new View();
        if (view.homePage() == 1){
            
            CreateNewAccount nuovo = new CreateNewAccount();
            
            
        
            CreateAccountGUI ui_account_create = new CreateAccountGUI();

            tmp_di_passaggio = ui_account_create.accountgui("","");

            nuovo.createAccount(tmp_di_passaggio[0], tmp_di_passaggio[1]);

            account1 = nuovo.getAccount();
        };
        
        
        /*
        String var_tmp_read,var_tmp_read2; ///meglio un vettore
        int var_int=0;
        System.out.println("ciao we benvenuto \n imputtami l'user \n");
        System.out.println("-1 per fare login \n -2 per creare un nuovo account");
        
        Scanner leggi= new Scanner( System.in );
        var_tmp_read= leggi.nextLine();
        System.out.println("imputtami la psw \n");
        var_tmp_read2= leggi.nextLine();
        
         System.out.println("Le Tue Credenziali Di Accesso Sono:\n user:"+var_tmp_read+"\n"+"psw:"+var_tmp_read2);
         
         System.out.println("premi uno per confermare e loggarti");//da cambiare in un controllo della stringa
         var_int= leggi.nextInt();
         System.out.println("hai pigiato:"+var_int);
         */
       
       
        /*AccountInfo account1 = new AccountInfo();   //così salti passaggi
        account1.createAccount("Ingegneria", "Software");*/
        
        
        //System.out.println("user ritorno:"+tmp_di_passaggio[0]+"psw user ritorno:"+tmp_di_passaggio[1]);

        
        
        LoginGUI lgin_vista =new LoginGUI();
         
        tmp_di_passaggio=lgin_vista.loginGUI("","");
        
                
       // System.out.println("*****DATI DA ACCOUNT USR :"+account1.getUsername().toString()+"*****DATI DA ACCOUNT PSW"+account1.getPsw().toString());
        
        
       
        //ora ci andrebbe   h
        Login login = new Login(tmp_di_passaggio[0],tmp_di_passaggio[1] , account1);
        login.securityMatch();
        
        
        
        //e in teoria così dovrebbe lanciare la dashboard
        
        //fetch student record based on his roll no from the database
        Letto model  = prendi_dati_Letto_Dal_Database_finto();/*emula il db*/

        //Create a view : to write student details on console
      

        GestioneLetto controller = new GestioneLetto();
        controller.creaLetto("letto1","colombia");
        controller.creaLetto("letto2","colombia");
        controller.creaLetto("letto3","colombia");

        controller.printListaLetti();

        controller.rimuoviLetto(1);

        controller.printListaLetti();
        /*controller.updateView();

        //update model data
        controller.setDisp_letto("ALTRO LETTO uououou");

        controller.updateView();*/
   }

   private static Letto prendi_dati_Letto_Dal_Database_finto(){
        Letto student = new Letto();
        student.setLetto("un letto");
        student.setDisp_letto("0");
        return student;
    }
   
   public final Letto[] findLettoDB(String luogo, String disp){
        //simula la ricerca di letto in del database
        return null;
        
    }
   
    private String getFromDB(String key, int val){
        //simula il recupero dal database
        return "";
    }
    
    private String newDBEntry(){
        //simula la creazione di un nuovo utente e psw vuoti nel database
        //e restituisce l'userid temporaneo
        String nome = "";
        return nome;
    }    
}
