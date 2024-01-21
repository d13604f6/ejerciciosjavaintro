/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje19antisimetrica;
    import java.util.Scanner;
/**
 *
 * @author d1360
 */
public class antisimetrica {
    



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las dimensiones de la matriz cuadrada
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        int n = scanner.nextInt();

        // Crear la matriz
        int[][] matriz = new int[n][n];

        // Solicitar al usuario ingresar los elementos de la matriz
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento (" + (i + 1) + "," + (j + 1) + "): ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Verificar si la matriz es antisimétrica
        if (esAntiSimetrica(matriz)) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz NO es antisimétrica.");
        }
    }

    // Método para verificar si una matriz es antisimétrica
    private static boolean esAntiSimetrica(int[][] matriz) {
        // Verificar si la matriz es cuadrada
        if (matriz.length != matriz[0].length) {
            return false;
        }

        // Verificar la condición de antisimetría
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Verificar que A[i][j] = -A[j][i]
                if (matriz[i][j] != -matriz[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }
}

    

