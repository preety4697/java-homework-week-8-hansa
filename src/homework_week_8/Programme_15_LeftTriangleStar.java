package homework_week_8;

/**
 * Display left angle triangle of * using nested for loops
 *       *
 *     * *
 *   * * *
 *   * * * *
 *    * * * * *
 */
public class Programme_15_LeftTriangleStar {

   public static void main(String[] args) {
       int n = 5; // Change the value of 'n' to control the number of rows in the triangle
       for (int i = 1; i <= n; i++) {
            // Print leading space
          for (int j = 1; j <= n - i; j++) {
              System.out.print("  ");// Two spaces for each space
          }
              for (int k = 1; k <= i; k++) {
                System.out.print("* ");
           }
          System.out.println();
       }
   }
}









