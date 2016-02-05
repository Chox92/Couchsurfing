/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.EEEEEEE
 */
package isw_pr;

/**
 *
 * @author gimir_000
 */
public  class Controller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
    //fetch student record based on his roll no from the database
      Letto model  = prendi_dati_Letto_Dal_Database_finto();/*emula il db*/

      //Create a view : to write student details on console
      

      GestioneLetto controller = new GestioneLetto();
      controller.creaLetto("letto1","colombia");
      controller.creaLetto("letto2","colombia");
      
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
        //simula la ricerca di lettin del database
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
