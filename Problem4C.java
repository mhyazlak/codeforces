import java.util.Hashtable;
import java.util.Scanner;

public class Problem4C {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        Hashtable<String, Integer> htable = new Hashtable<String, Integer>();

        int n = ip.nextInt();

        for (int i = 0; i < n; i++) {
            String curr = ip.next();
            if (!htable.containsKey(curr)) {
                htable.put(curr, 1);
                System.out.println("OK");
            } else {
                System.out.println(curr + htable.get(curr));
                htable.put(curr, htable.get(curr) + 1);
            }
        }

    }

}
