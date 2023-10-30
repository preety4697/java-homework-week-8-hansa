package homework_week_8;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * so:
 * 1+125+27 = 153
 */
public class Programme_10_ArmstrongNumber {
    public static void main(String[] args) {
        int number;
        Scanner s = new Scanner(java.lang.System.in);
        java.lang.System.out.println("Enter number: ");
        number = s.nextInt();

        if (isArmstrong(number)) {
            java.lang.System.out.println(number + " is an armstrong number.");
        } else {
            java.lang.System.out.println(number + " is not an armstrong number.");
        }
    }
        //Function to check if a number is an Armstrong number
     public static boolean isArmstrong(int num) {
        int originalNumber, remainder,result = 0;
        originalNumber = num;

       while (originalNumber != 0){
           remainder = originalNumber % 10;
           result +=(remainder * remainder * remainder);
           originalNumber /= 10;
       }
        //Check if the result is the same as the original number
         return result == num;
    }

}