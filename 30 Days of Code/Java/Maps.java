
/**
 * Maps
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {
    private static final Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scn.next();
            int phone = scn.nextInt();
            phoneBook.put(name, phone);
        }

        while (scn.hasNext()) {
            String nameFind = scn.next();

            if (!phoneBook.containsKey(nameFind)) {
                System.out.println("Not found");
            } else {
                System.out.println(nameFind + "=" + phoneBook.get(nameFind));
            }
        }
        scn.close();
    }
}