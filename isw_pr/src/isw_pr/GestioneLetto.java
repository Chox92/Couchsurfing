/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isw_pr;

/**
 *
 * @author gimir_000
 */
public class GestioneLetto {
    private int n = 0;
   private Letto[] model = new Letto[10];
   

   public GestioneLetto(){
   }
   
   public void creaLetto(String nomeLetto, String loc){
       if (n < 9){
        model[n] = new Letto();
        model[n].setLetto(nomeLetto);
        model[n].setLocation(loc);
        model[n].setDisp_letto("1");
        n++;
       }else{
       System.out.println("troppi letti già usati");
       }
   }

   public void printListaLetti(){
       for( int i=0; i<n;i++){
           System.out.println( i+1 + "--> Nome: " + model[i].getLetto() + "; Disponibilita': " + model[i].getDisp_letto() + ";" + "; Localita': " + model[i].getLocation() + ";");
           System.out.println();
       }
   }
   
   public void rimuoviLetto(int i){
       i--;
       for (;i<n;i++){
           if(i+1<n){
               model[i]=model[i+1];
           }
       }
       model[i]=null;
   }
   
   public void setLetto(String name, int i){
       i--;
      model[i].setLetto(name);		
   }
   
   public void setDisp_letto(String voto, int i){
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