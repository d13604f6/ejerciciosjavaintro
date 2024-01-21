/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeraprendizaje11rsa232;


import java.util.Scanner;

/**
 *
 * @author d1360
 */
public class rs232 {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;
        int incorrectCount = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("&&&&&")) {
                break;
            }
            if (input.length() == 5 && input.charAt(0) == 'X' && input.charAt(4) == 'O') {
                correctCount++;
            } else {
                incorrectCount++;
            }
        }

        System.out.println("Lecturas correctas: " + correctCount);
        System.out.println("Lecturas incorrectas: " + incorrectCount);
    }
}
    

