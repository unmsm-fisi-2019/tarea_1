/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationholamundo1;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class NewClass {
    public static void main(String[]srgs){
        
        
  double tiempo_total ;
double velocidad_promedio;
  double velocidad;
  
  tiempo_total = ((45*60)+30);
  velocidad = ((14*3600)/tiempo_total);
  velocidad_promedio = (velocidad/1.6);
  
  
       
        System.out.println("el tiempo total es : "+tiempo_total);
        System.out.println("la velocidad   es : "+velocidad);
        System.out.println("la velocidad promedio es : "+velocidad_promedio);

    }
    
}
