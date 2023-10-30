package homework_week_8;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Programme_12_PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = s.nextInt();
        s.close();

        if (isPrime(number)){
            System.out.println(number + " is a prime number.");
        }else {
            System.out.println(number + " is not a prime number.");
        }
    }
    public static boolean isPrime(int number){
        if(number <= 1){
            return false;//Numbers less than or equal to 1 are not prime.
        }
        if (number<= 3){
            return true ;//2 and 3 are prime.
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false; // Numbers divisible by 2 or 3 are not prime.
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false; // Numbers divisible by (6k +/- 1) are not prime.
            }
        }

        return true;
    }
}
