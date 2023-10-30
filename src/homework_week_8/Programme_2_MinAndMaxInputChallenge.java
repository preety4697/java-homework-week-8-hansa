package homework_week_8;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * Before the user enters the number, print the message Enter number:
 * If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * Use an endless while loop.
 * Create a class with the name MinAndMaxInputChallenge.
 */
public class Programme_2_MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number: ");
            if (sc.hasNextInt()){
               int number = sc.nextInt();
               if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            }else {
                break;
            }
            sc.nextLine();//Consume the newline character
        }
        if (min==Integer.MAX_VALUE && max == Integer.MIN_VALUE){
            System.out.println("No valid number entered.");
        }else {
            System.out.println("Minimum number : " + min);
            System.out.println("Maximum number : " + max);
        }
        sc.close();
    }
}
