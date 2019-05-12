/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationholamundo1;

/**
 *
 * @author Usuario
 */
public class NewClass {
    public static void main(String[]srgs){
     int segundo;
        int  nacio ;
        int muerte ; 
        int inmigrante;
        int poblacion = 312032486 ;
        int poblacion_actual ;
        int i = 1;
        int poblacion_neta;
  segundo = (3600*24*365);
  nacio = (segundo/7);
  muerte = (segundo/13);
  inmigrante = (segundo/45);
  poblacion_neta =  nacio + inmigrante - muerte;
  
  for( i = 1; i<=5;i++){
      poblacion = poblacion + poblacion_neta;
      System.out.println( i+" el año las personas son "+poblacion);
      
      
  }
  
  
    }
    
}
