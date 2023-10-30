package homework_week_8;

import java.util.Scanner;

/**
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
 * 11212.
 * Tip: What is a Palindrome number? A palindrome number is a number which when reversed is equal
 * to the original number. For example: 121, 12321, and 1001 etc.
 * Tip: Logic to check a palindrome number
 * Find the reverse of the given number. Store it in some variable, say reverse. Compare the number with
 * the reverse.
 */
public class Programme_5_PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            boolean isPalindrome = isPalindrome(number);

            if (isPalindrome) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else{
            System.out.println("Invalid input : Not an integer");
        }
        sc.close();
    }
       // method with an int parameter
    public static boolean isPalindrome(int number) {
        int originalNumber = number;// Store the original number for comparison
        int reverse = 0;

        while (number != 0) {
            int lastdigit = number % 10;//To remove the last digit divide number by 10
            // To ivcreseplace value multiply the reverse variable by 10
            reverse = reverse * 10 + lastdigit;
            number /= 10;

        }
        return originalNumber == reverse;
    }
}



