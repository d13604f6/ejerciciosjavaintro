/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej13;

/**
 *
 * @author d1360
 */

import java.util.Scanner;
public class Equipo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of teammates:");
        int teammates = scanner.nextInt();
        
        Object[] team = new Object[teammates];
        
                for (int i = 0; i < teammates; i++) {

                System.out.println("Enter the partner's name " + (i + 1) + ":");
                String partnersname = scanner.next();
                team[1] = partnersname; 
    }
        System.out.println("\nTeam  " + teammates + " partners:");
        for (int i = 0 ; i < teammates; i ++){
            System.out.println((i + 1) + ". " + team[1]);
            
        }
    }
}
