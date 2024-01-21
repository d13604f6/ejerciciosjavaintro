/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje1suma;
import java.util.Scanner;
/**
 *
 * @author d1360
 */
public class suma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Por favor, ingrese el segundo número:");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("La suma de los dos números es: " + sum);
    }
}
    

