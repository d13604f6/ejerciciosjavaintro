/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizajeeureka;

    import java.util.Scanner;

/**
 *
 * @author d1360
 */
public class eureka {
    



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese una frase:");
        String frase = scanner.nextLine();

        if (frase.equals("eureka")) {
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto.");
        }
    }
}
    
