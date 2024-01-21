/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje20matrizcontenida;
    import java.util.Scanner;
/**
 *
 * @author d1360
 */
public class diezportres {
    



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir las dimensiones de las matrices
        int filasM = 10, columnasM = 10;
        int filasP = 3, columnasP = 3;

        // Crear las matrices
        int[][] matrizM = new int[filasM][columnasM];
        int[][] matrizP = new int[filasP][columnasP];

        // Solicitar al usuario ingresar los elementos para la matriz M
        System.out.println("Ingrese los elementos para la matriz M:");

        for (int i = 0; i < filasM; i++) {
            for (int j = 0; j < columnasM; j++) {
                System.out.print("Elemento (" + (i + 1) + "," + (j + 1) + "): ");
                matrizM[i][j] = scanner.nextInt();
            }
        }

        // Solicitar al usuario ingresar los elementos para la matriz P
        System.out.println("Ingrese los elementos para la matriz P:");

        for (int i = 0; i < filasP; i++) {
            for (int j = 0; j < columnasP; j++) {
                System.out.print("Elemento (" + (i + 1) + "," + (j + 1) + "): ");
                matrizP[i][j] = scanner.nextInt();
            }
        }

        // Verificar si la matriz P está contenida en la matriz M
        if (contieneMatriz(matrizM, matrizP)) {
            System.out.println("La matriz P está contenida en la matriz M.");
        } else {
            System.out.println("La matriz P NO está contenida en la matriz M.");
        }
    }

    // Método para verificar si la matriz P está contenida en la matriz M
    private static boolean contieneMatriz(int[][] matrizM, int[][] matrizP) {
        int filasM = matrizM.length;
        int columnasM = matrizM[0].length;
        int filasP = matrizP.length;
        int columnasP = matrizP[0].length;

        // Verificar todas las submatrices de 3x3 en la matriz M
        for (int i = 0; i <= filasM - filasP; i++) {
            for (int j = 0; j <= columnasM - columnasP; j++) {
                if (coincideSubmatriz(matrizM, matrizP, i, j)) {
                    return true;
                }
            }
        }

        return false;
    }

    // Método para verificar si una submatriz en la posición (i, j) coincide con la matriz P
    private static boolean coincideSubmatriz(int[][] matrizM, int[][] matrizP, int i, int j) {
        for (int k = 0; k < matrizP.length; k++) {
            for (int l = 0; l < matrizP[0].length; l++) {
                if (matrizM[i + k][j + l] != matrizP[k][l]) {
                    return false;
                }
            }
        }
        return true;
    }
}

    

