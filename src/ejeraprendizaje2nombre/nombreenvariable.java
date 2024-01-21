/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje2nombre;
import java.util.Scanner;
/**
 *
 * @author d1360
 */
public class nombreenvariable {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Hola, " + nombre + "!");
    }
}
    
