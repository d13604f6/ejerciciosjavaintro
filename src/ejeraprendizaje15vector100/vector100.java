/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje15vector100;

    import java.util.Arrays;

/**
 *
 * @author d1360
 */
public class vector100 {
    


    public static void main(String[] args) {
        // Crear un vector para almacenar los 100 primeros números enteros
        int[] numeros = new int[100];

        // Rellenar el vector con los 100 primeros números enteros
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        // Ordenar el vector en orden descendente utilizando el método sort() de la clase Arrays
        Arrays.sort(numeros);
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
    
    
