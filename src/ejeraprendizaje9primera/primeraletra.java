/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje9primera;
    import java.util.Scanner;

/**
 *
 * @author d1360
 */
public class primeraletra {
    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese una frase o palabra:");
        String input = scanner.nextLine();

        if (input.length() > 0 && input.substring(0, 1).equals("A")) {
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto.");
        }
    }
}
    
