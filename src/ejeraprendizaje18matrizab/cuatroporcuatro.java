/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje18matrizab;
  import java.util.Random;
/**
 *
 * @author d1360
 */
public class cuatroporcuatro {
  


    public static void main(String[] args) {
        // Crear una matriz de 4x4
        int[][] matriz = new int[4][4];

        // Rellenar la matriz con valores aleatorios
        llenarMatriz(matriz);

        // Mostrar la matriz original
        System.out.println("Matriz Original:");
        mostrarMatriz(matriz);

        // Obtener la traspuesta de la matriz
        int[][] traspuesta = obtenerTraspuesta(matriz);

        // Mostrar la matriz traspuesta
        System.out.println("\nMatriz Traspuesta:");
        mostrarMatriz(traspuesta);
    }

    // Método para llenar la matriz con valores aleatorios
    private static void llenarMatriz(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100); // Valores aleatorios entre 0 y 99
            }
        }
    }

    // Método para mostrar la matriz
    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Método para obtener la traspuesta de la matriz
    private static int[][] obtenerTraspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] traspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }

        return traspuesta;
    }
}


