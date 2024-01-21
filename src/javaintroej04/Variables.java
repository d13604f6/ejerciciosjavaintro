/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej04;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a boolean value (true or false): ");
        boolean booleanVariable = scanner.nextBoolean();

        System.out.println("Enter a double value: ");
        double doubleVariable = scanner.nextDouble();

        System.out.println("Enter a char value: ");
        char charVariable = scanner.next().charAt(0);

        System.out.println("Boolean Variable: " + booleanVariable);
        System.out.println("Double Variable: " + doubleVariable);
        System.out.println("Char Variable: " + charVariable);
    }
}