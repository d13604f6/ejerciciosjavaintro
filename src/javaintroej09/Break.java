/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej09;


import java.util.Scanner;
/**
 *
 * @author d1360
 */
public class Break {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Enter a number");
            number = scanner.nextInt();
            
            if (number ==0) {
                    System.out.println("Number 0 is captured");
                    break;
            } else if (number >0){
                    sum += number;
            } else {
                    System.out.println("Negative number not added");
            
            }
                   
            }
        
            System.out.println("The sum of the numbers read is:" + sum);
            
        }
        
    }
    

