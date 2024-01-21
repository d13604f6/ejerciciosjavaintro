/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje6imparopar;
    import java.util.Scanner;
/**
 *
 * @author d1360
 */
public class imparopar {
   

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese un número entero:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }
}
    

