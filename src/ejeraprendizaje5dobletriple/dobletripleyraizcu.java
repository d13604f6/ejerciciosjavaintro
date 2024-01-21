/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje5dobletriple;
import java.util.Scanner;
/**
 *
 * @author d1360
 */
public class dobletripleyraizcu {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese un número entero:");
        int numero = scanner.nextInt();

        int doble = numero * 2;
        int triple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);

        System.out.println("El doble del número es: " + doble);
        System.out.println("El triple del número es: " + triple);
        System.out.println("La raíz cuadrada del número es: " + raizCuadrada);
    }
}
    
