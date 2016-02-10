/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isw_pr;

import java.util.Scanner;

/**
 *
 * @author Giovanni
 */
public class View {
    
    public View(){
        
        System.out.println("Buongiorno!\n");
        System.out.println("Vuoi effettuare la 1)registrazione o il 2)login?\n");
    }
    
    public int homePage(){
        
        Scanner scelta = new Scanner(System.in);
        return scelta.nextInt();
    }
    
    
    
    
    
}
