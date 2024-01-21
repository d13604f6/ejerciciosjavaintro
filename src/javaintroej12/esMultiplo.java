/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej12;

/**
 *
 * @author d1360
 * 
 */

import java.util.Scanner;

public class esMultiplo {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Insert the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Insert the second number");
        int num2 = scanner.nextInt();
        
        multiploDe(num1,num2);
        }
    public static void multiploDe(int num1, int num2) {
       boolean find = false;
       
          for (int i = 1; i <= num1; i++) {

            if (num1 % num2 ==0) {
                    find = true;
                    break;
            }
       
         }
       
        if (find) {
            System.out.println("The first number is a multiple of the second");
        }
        else {
            System.out.println("The first number is not a multiple of the second");
        }
        }
    }

