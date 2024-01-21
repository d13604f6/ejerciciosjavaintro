/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje11menu;
    import java.util.Scanner;

/**
 *
 * @author d1360
 */
public class menu {
    



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");

            int option = scanner.nextInt();

            if (option == 5) {
                System.out.println("\n¿Está seguro que desea salir del programa (S/N)?");
                String answer = scanner.next();
                if (answer.equalsIgnoreCase("S")) {
                    break;
                }
            } else {
                System.out.println("Por favor, ingrese dos números enteros positivos:");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();

                int result = 0;

                switch (option) {
                    case 1:
                        result = num1 + num2;
                        break;
                    case 2:
                        result = num1 - num2;
                        break;
                    case 3:
                        result = num1 * num2;
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error: No se puede dividir por cero.");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        continue;
                }

                System.out.println("El resultado de la operación es: " + result);
            }
        }

        System.out.println("\nGracias por usar el programa. Hasta luego.");
    }
}
    

