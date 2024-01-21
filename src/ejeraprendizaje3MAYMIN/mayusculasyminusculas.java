/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje3MAYMIN;
import java.util.Scanner;
/**
 *
 * @author d1360
 */
public class mayusculasyminusculas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese una frase:");
        String frase = scanner.nextLine();

        System.out.println("Frase en mayúsculas: " + frase.toUpperCase());
        System.out.println("Frase en minúsculas: " + frase.toLowerCase());
    }
}
    

