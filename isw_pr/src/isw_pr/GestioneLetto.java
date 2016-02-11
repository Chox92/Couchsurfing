/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isw_pr;

import java.util.Scanner;

/**
 *
 * @author gimir_000
 */
public class GestioneLetto {
    private int n = 0;                      //indice dell'array, tiene il conto di quanti letti un utente usa
   private Letto[] model = new Letto[10];   //array dei letti di un utente
   

   public GestioneLetto(){
       new GestioneLettoGUI();  //Questo costruttore richiama la GUI di scelta opzioni
   }      //costruttore superfluo
   
   public int sceltaGestioneLetto(){
        Scanner scelta = new Scanner(System.in);
        return scelta.nextInt();
    }
   
   public void creaLetto(String nomeLetto, String loc){     //funzione che istanzia e inizializza un letto, 
       if (n < 9){                                  //verifica che ci sia spazio nell'array
        model[n] = new Letto();                     //crea un letto
        model[n].setLetto(nomeLetto);               //imposta il nome
        model[n].setLocation(loc);                  //imposta la regione
        model[n].setDisp_letto("1");                //imposta 1 default
        n++;                                        //aggiorna il contatore
       }else{
       System.out.println("troppi letti già usati");// altrimenti comunica che l'array è pieno
       }
   }

   public void printListaLetti(){                      //stampa a video la lista letti
       for( int i=0; i<n;i++){                                          //per i da 0 a n
           System.out.println( i+1 + "--> Nome: " + model[i].getLetto() 
                   + "; Disponibilita': " + model[i].getDisp_letto()  
                   + "; Localita': " + model[i].getLocation() + ";");
           System.out.println();
       }
   }
   
   public void rimuoviLetto(int i){         //rimuove un letto, necessita dell'indice secondo l'ordine della funzione print
       i--;                         //riporta i in una scala da 0 a n-1
       for (;i<n;i++){              //da i a n-1
           if(i+1<n){               //se l'elemento successivo è utilizzato (in soldoni)
               model[i]=model[i+1]; //fa scalare tutto l'array verso l'elemento eliminato
           }
       }
       model[i]=null;               //l'ultimo elemento prende null
       n--;                         //rimuovi un elemento dal contatore dell'array
   }
   
   public void setLetto(String name, int i){ //imposta il nome del letto, richiede il nuovo nome e l'indice del letto
       i--;
      model[i].setLetto(name);		
   }
   
   public void setDisp_letto(String voto, int i){ //imposta la disponibilità del letto, una stringa e l'indice del letto
       i--;
      model[i].setLetto(voto);		
   }
/*
   public String getLetto(){
      return model.getLetto();		
   }


   public String getDisp_letto(){
      return model.getDisp_letto();		
   }

   public void updateView(){				
      view.printStudentDetails(model.getLetto(), model.getDisp_letto());
   }	*/
}