/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroej11;

/**
 *
 * @author d1360
 */
  import java.util.Scanner;
public class changeletter {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence terminated by a period:");
        String sentence = scanner.nextLine();
        
        System.out.println("Coded sentence:" + changeletter (sentence));
    }
    private static String changeletter(String sentence) {
            StringBuilder codedSentence = new StringBuilder();
            
            for (char c : sentence.toCharArray()) {
                    if (Character.isLetter(c)) {
                        char lowerCasec = Character.toLowerCase(c);
                        
                        if (lowerCasec == 'a') {
                            codedSentence.append('@');
                        }   else if (lowerCasec == 'e'){
                            codedSentence.append('#');
                        }   else if (lowerCasec == 'i'){
                            codedSentence.append('$');
                        }   else if (lowerCasec == 'o'){
                            codedSentence.append('%');
                        }   else if (lowerCasec == 'u'){
                            codedSentence.append('*');
                        }  else {
                                codedSentence.append(c);
                        }
                    } else {
                        codedSentence.append(c);
                    }
            }
                        
            return codedSentence.toString();
         }
                
}
            
    
    

