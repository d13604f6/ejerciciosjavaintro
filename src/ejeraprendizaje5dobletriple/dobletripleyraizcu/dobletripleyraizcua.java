/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje5dobletriple.dobletripleyraizcu;
    import java.util.Scanner;
/**
 *
 * @author d1360
 */
public class dobletripleyraizcua {
    



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar un número entero
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Calcular el doble, el triple y la raíz cuadrada del número
        int doble = numero * 2;
        int triple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);

        // Mostrar los resultados
        System.out.println("El doble de " + numero + " es: " + doble);
        System.out.println("El triple de " + numero + " es: " + triple);
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
    }
}

    
    

