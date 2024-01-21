/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej14;

/**
 *
 * @author d1360
 */

import java.util.Scanner;

public class BucleFor {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de compañeros de equipo:");
        int cantidadDeCompañeros = scanner.nextInt();

        Object[] equipo = new Object[cantidadDeCompañeros];

        for (int i = 0; i < cantidadDeCompañeros; i++) {
            System.out.println("Ingrese el nombre del compañero " + (i + 1) + ":");
            String nombreCompañero = scanner.next();
            equipo[i] = nombreCompañero;
        }

        System.out.println("\nEquipo de " + cantidadDeCompañeros + " compañeros:");
        for (int i = 0; i < cantidadDeCompañeros; i++) {
            System.out.println((i + 1) + ". " + equipo[i]);
        }
    }
}

    

