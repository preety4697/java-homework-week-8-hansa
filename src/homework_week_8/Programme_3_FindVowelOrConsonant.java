package homework_week_8;

import java.util.Scanner;

/**
 * write a java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme_3_FindVowelOrConsonant {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);

        System.out.println("Input an alphabet: ");
        String input = b.next();

        if (input.length() == 1 && Character.isLetter(input.charAt(0))){
            char letter = Character.toLowerCase(input.charAt(0));
            if (letter == 'a' || letter == 'e'|| letter == 'i' || letter =='o' || letter == 'u'){
                System.out.println("Input letter is Vowel");
            }else{
                System.out.println("Input letter is Consonant");
            }
        }else {
            System.out.println("Error: Please enter a single alphabet character. ");
        }
        b.close();
    }
}
