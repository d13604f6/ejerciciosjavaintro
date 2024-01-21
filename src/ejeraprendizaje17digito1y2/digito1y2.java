/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje17digito1y2;
import java.util.Scanner;

/**
 *
 * @author d1360
 */
public class digito1y2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de elementos en el vector
        System.out.print("Ingrese la cantidad de elementos en el vector: ");
        int n = scanner.nextInt();

        // Crear el vector de enteros
        int[] vector = new int[n];

        // Solicitar al usuario ingresar los elementos del vector
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        // Inicializar un array para contar los números de 1 a 5 dígitos
        int[] conteoDigitos = new int[5];

        // Contar los números de 1 a 5 dígitos
        for (int num : vector) {
            int digitos = contarDigitos(num);

            // Incrementar el contador correspondiente
            if (digitos >= 1 && digitos <= 5) {
                conteoDigitos[digitos - 1]++;
            }
        }

        // Mostrar los resultados
        for (int i = 0; i < 5; i++) {
            System.out.println("Números de " + (i + 1) + " dígito(s): " + conteoDigitos[i]);
        }
    }

    // Método para contar los dígitos de un número
    private static int contarDigitos(int numero) {
        return Integer.toString(Math.abs(numero)).length();
    }
}

    

