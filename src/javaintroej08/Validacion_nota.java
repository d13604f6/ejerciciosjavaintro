/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej08;


import java.util.Scanner;
/**
 *
 * @author d1360
 */
public class Validacion_nota {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
            double num;
            
            do {
                    System.out.println("Enter the number");
                    num = scanner.nextDouble();
                    
                    if ( num < 0 || num > 10 ){
                            System.out.println("Wrong number");        
                    } else {
                            System.out.println("Correct number");
                    }
                }    while ( num < 0 || num > 10 );
            }
           }   
                       
            
                
            
                    
        

