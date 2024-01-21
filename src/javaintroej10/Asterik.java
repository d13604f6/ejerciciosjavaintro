/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej10;

/**
 *
 * @author d1360
 */
import java.util.Scanner;


public class Asterik {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Please enter 4 numbers between 1 and 20:");
        
        for (int i = 0; i < 4; i++) {
            number = scanner.nextInt();
            
            if (number < 1 || number > 20) {
                System.out.println("The number should be between 1 and 20. Please try again.");
                i--;
                continue;
            }
            
            printAsterisks(number);
        }
    }

    private static void printAsterisks(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}