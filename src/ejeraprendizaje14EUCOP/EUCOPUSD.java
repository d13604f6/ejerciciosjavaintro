/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje14EUCOP;
  import java.util.Scanner;
/**
 *
 * @author d1360
 */
public class EUCOPUSD {
    
  


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de euros a convertir: ");
        double euros = scanner.nextDouble();
        System.out.println("Introduzca la moneda a convertir a (euros, dolares, libras, yenes): ");
        String moneda = scanner.next();
        convertirDivisas(euros, moneda);
    }

    public static void convertirDivisas(double euros, String moneda) {
        double resultado = 0;
        if (moneda.equalsIgnoreCase("euros")) {
            resultado = euros;
        } else if (moneda.equalsIgnoreCase("dolares")) {
            resultado = euros * 1.28611;
        } else if (moneda.equalsIgnoreCase("libras")) {
            resultado = euros * 0.86;
        } else if (moneda.equalsIgnoreCase("yenes")) {
            resultado = euros * 129.852;
        } else {
            System.out.println("Moneda no válida");
            return;
        }
        System.out.printf("El cambio a %s es: %.2f%n", moneda, resultado);
    }
}
    
