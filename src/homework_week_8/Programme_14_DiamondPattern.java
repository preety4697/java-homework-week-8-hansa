package homework_week_8;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 */
public class Programme_14_DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the diamond (must be an odd number): ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number to create a diamond pattern.");
            return;
        }

        int spaces = n / 2;
        int stars = 1;

        int row = 1;
        while (row <= n) {
            int spaceCount = spaces;
            int starCount = stars;

            while (spaceCount > 0) {
                System.out.print(" ");
                spaceCount--;
            }

            while (starCount > 0) {
                System.out.print("*");
                starCount--;
            }

            System.out.println();

            if (row <= n / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }

            row++;
        }
    }
}
