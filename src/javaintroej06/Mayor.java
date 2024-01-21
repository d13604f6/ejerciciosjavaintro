/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej06;


import java.util.Scanner;

public class Mayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second integer: ");
        int num2 = scanner.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Both numbers are greater than 25.");
        } else if (num1 > 25) {
            System.out.println("Only the first number is greater than 25.");
        } else if (num2 > 25) {
            System.out.println("Only the second number is greater than 25.");
        } else {
            System.out.println("Neither number is greater than 25.");
        }
    }
}