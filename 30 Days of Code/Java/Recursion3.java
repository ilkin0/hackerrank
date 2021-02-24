/**
 * Recursion3
 */
public class Recursion3 {

    public static int nthFactorial(int n) {
        if (n == 0)
            return 1;

        return nthFactorial(n - 1) * n;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(nthFactorial(n));
        // System.out.println(n);
    }
}