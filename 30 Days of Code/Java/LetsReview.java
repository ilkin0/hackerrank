import java.util.Scanner;

public class LetsReview {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                if (j % 2 == 0) {
                    even.append(word.charAt(j));
                } else {
                    odd.append(word.charAt(j));
                }
            }
            System.out.println(even + " " + odd);
        }
        scanner.close();
    }
}
