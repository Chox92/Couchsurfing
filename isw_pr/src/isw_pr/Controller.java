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
     * @throws isw_pr.AssertException
     */
    
    public static void main(String[] args) throws AssertException
    {
        String[] usrPassArray = new String[2]; //un po' molto brutto
        AccountInfo account1 = new AccountInfo("","");
        
        View view = new View();
        
        int var_tmp = 0; 
        
        var_tmp = view.homePage();//ripeteva due volte l'input senza 
        
        
      //  assert (var_tmp==1); funge
        
        if  (var_tmp > 2 )
        {
            throw new AssertException();
        }
        else if (var_tmp == 1){
    
            CreateNewAccount accountCreator = new CreateNewAccount();
        
            CreateAccountGUI ui_account_create = new CreateAccountGUI();

            usrPassArray = ui_account_create.accountgui("","");

            accountCreator.createAccount(usrPassArray[0], usrPassArray[1]);

            account1 = accountCreator.getAccount();
        }
        
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
        int var_state_login=0;
        
        do{
         
        usrPassArray=lgin_vista.loginGUI("","");
        
        //System.out.println("*****DATI DA ACCOUNT USR :"+account1.getUsername().toString()+"*****DATI DA ACCOUNT PSW"+account1.getPsw().toString());
        
        //ora ci andrebbe
        Login login = new Login(usrPassArray[0],usrPassArray[1] , account1);
        
        var_state_login = login.securityMatch();
        
        }while (var_state_login<1);
        
        
        DashboardGUI vistadash = new DashboardGUI();
        
        int te;
        
        Dashboard dash = new Dashboard();
        GestioneLetto manager;
        RicercaLetto find;
        //do{
        te = vistadash.dashGui();
        switch (te){
            case 1 : 
                manager = dash.openGestioneLetto();
                int n;
                do{
                //Codice per le funzioni di Gestione letto
                n =vistadash.gestLettoGui();
                    switch (n){
                        case 1:
                            //Non so se vada bene usare sempre "manager", per ora lo uso
                            String[] temp = vistadash.creaLettoGui();
                            manager.creaLetto(temp[0], temp[1]);
                            break;

                        case 2:
                            manager.printListaLetti();
                            break;

                        case 3:
                            int i = vistadash.rimuoviLettoGui();
                            if (i == 0 )
                                break;
                            
                            manager.rimuoviLetto(i);
                            break;
                    }
                }while(n != 4);
                break;
            case 2 :
                find = dash.openRicercaLetto(vistadash.search(), new Controller());
                find.printListaLetti();
                /* ricerca letto può far scegliere un letto da quelli che vengono visualizzati
                e passare a messaggi, in teoria*/
        }
        //}while(te != 3);
        
        //e in teoria così dovrebbe lanciare la dashboard
        
        //fetch student record based on his roll no from the database
        //Letto model  = prendi_dati_Letto_Dal_Database_finto();/*emula il db*/

        //Create a view : to write student details on console
        
        /*GestioneLetto controller = new GestioneLetto();
        controller.creaLetto("letto1","colombia");
        controller.creaLetto("letto2","colombia");
        controller.creaLetto("letto3","colombia");
        
        controller.printListaLetti();
        
        controller.rimuoviLetto(1);
        
        controller.printListaLetti();*/
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
   
    public final Letto[] findLettoDB(String luogo){
        Letto[] arr = new Letto[7];
        String nome;
        
        for(int i = 0; i < 7; i++){
            arr[i]=new Letto();
            arr[i].setLocation(luogo);
            nome = NameGenerator.generateName();
            arr[i].setLetto("Da"+ nome +(i+1));
            arr[i].setDisp_letto("1");
        }
        return arr;
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
