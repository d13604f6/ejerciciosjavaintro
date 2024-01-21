/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej03;

/**
 *
 * @author d1360
 */
public class Operadores {
    
    
        // variables donde almacenaremos los resultados
    int sumaEnteros;
    int restaEnteros;
    int multiplicacionEnteros;
    int divisionEnteros;

    public void suma(int a, int b) {
        sumaEnteros = a + b;
    }

    public void resta(int a, int b) {
        restaEnteros = a - b;
    }

    public void multiplicacion(int a, int b) {
        multiplicacionEnteros = a * b;
    }

    public void division(int a, int b) {
        divisionEnteros = a / b;
    }

    public void mostrarResultados() {
        System.out.println("Suma: " + sumaEnteros);
        System.out.println("Resta: " + restaEnteros);
        System.out.println("Multiplicación: " + multiplicacionEnteros);
        System.out.println("División: " + divisionEnteros);
    
}
}
