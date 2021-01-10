
/**
 * DataTypes
 */

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {

        // initialize pre-installed variables
        int i1 = 5;
        double d1 = 6.0;
        String s1 = "is the best place to learn and practice coding!";

        /* Declare second integer, double, and String variables. */

        Scanner scanner = new Scanner(System.in);

        /* Read and save an integer, double, and String to your variables. */

        int i2 = scanner.nextInt();
        double d2 = scanner.nextDouble();
        scanner.nextLine();
        String s2 = scanner.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i1 + i2);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d1 + d2);

        /*
         * Concatenate and print the String variables on a new line; the 's' variable
         * above should be printed first.
         */
        System.out.println(s1 + s2);

    }
}