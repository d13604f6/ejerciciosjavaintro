/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje12cuadron;

/**
 *
 * @author d1360
 */
public class cuadroenn {
    

    public static void main(String[] args) {
        // Define the size of the square's side
        int n = 7;

        // Draw the square with asterisks
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
    
