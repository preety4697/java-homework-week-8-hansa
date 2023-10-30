package homework_week_8;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Programme_6_NumberTriangle {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter numbers of rows:");
         int input = s.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after each row
        }
        s.close();
    }
}



