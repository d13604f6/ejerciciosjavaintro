/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje4gradosfaren;
import java.util.Scanner;

/**
 *
 * @author d1360
 */
public class gradosfarenheint {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese una temperatura en grados centígrados:");
        double centigrados = scanner.nextDouble();

        double fahrenheit = 32 + (9 * centigrados / 5);

        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
    }
}
    

