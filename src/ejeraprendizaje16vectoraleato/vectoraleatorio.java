/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje16vectoraleato;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author d1360
 */
public class vectoraleatorio {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the size of the vector: ");
        int n = scanner.nextInt();
        int[] vector = new int[n];

        System.out.println("Filling the vector with random values...");
        for (int i = 0; i < n; i++) {
            vector[i] = random.nextInt(100); // generates random numbers between 0 and 99
        }

        System.out.print("Enter a number to search for in the vector: ");
        int num = scanner.nextInt();

        int count = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                count++;
                index = i;
            }
        }

        if (count > 0) {
            System.out.println("The number " + num + " was found in the vector at index " + index);
            if (count > 1) {
                System.out.println("The number " + num + " is repeated " + count + " times in the vector");
            } else {
                System.out.println("The number " + num + " is not repeated in the vector");
            }
        } else {
            System.out.println("The number " + num + " was not found in the vector");
        }
    }
}
    

