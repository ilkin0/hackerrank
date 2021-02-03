
/**
 * ArraysClass
 */
import java.util.Scanner;

public class ArraysClass {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        int[] arrInts = new int[n];

        for (int i = 0; i < n; i++) {
            arrInts[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < arrInts.length; ++i) {
            System.out.print(arrInts[(n - 1) - i] + " ");
        }
    }
}