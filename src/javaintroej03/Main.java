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

public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Operadores obj = new Operadores(); // crear una instancia de la clase
        obj.suma(10, 5); // realizar la suma
        obj.resta(10, 5); // realizar la resta
        obj.multiplicacion(10, 5); // realizar la multiplicación
        obj.division(10, 5); // realizar la división
        obj.mostrarResultados(); // mostrar los resultados
    }
}

