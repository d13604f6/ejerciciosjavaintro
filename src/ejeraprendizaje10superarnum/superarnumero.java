/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje10superarnum;

    
    import java.util.Scanner;

/**
 *
 * @author d1360
 */
public class superarnumero {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese un límite positivo:");
        int limit = scanner.nextInt();

        int sum = 0;
        int count = 0;

        while (sum <= limit) {
            System.out.println("Por favor, ingrese un número:");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("No se aceptan números negativos.");
                continue;
            }

            sum += number;
            count++;

            if (sum > limit) {
                break;
            }
        }

        System.out.println("La suma de los " + count + " números ingresados supera el límite inicial.");
    }
}
    

