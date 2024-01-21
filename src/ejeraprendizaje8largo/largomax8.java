/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje8largo;

    
    import java.util.Scanner;

/**
 *
 * @author d1360
 */
public class largomax8 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese una frase o palabra de 8 caracteres:");
        String input = scanner.nextLine();

        if (input.length() == 8) {
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto.");
        }
    }
}
    
