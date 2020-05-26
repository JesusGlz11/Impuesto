
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */
public class Impuesto {
    public static void main (String []args) { 
     Scanner sc = new Scanner (System.in) ; 
    int edad ;
    float ingresos ;
    
    System.out.println ( "Ingrese tu Edad:" ) ; 
    edad = sc.nextInt() ; 
    
    System.out.println ( "Cuales son tus ingresos mensuales:" ) ; 
    ingresos = sc.nextInt() ; 
    if (edad > 16)
    System.out.println("tu edad esta ok");
    if  (ingresos >= 1000)
    System.out.println("Tienes que cotizar");
    else 
     System.out.println("No Tienes que cotizar"); 
    
    
    }
}
