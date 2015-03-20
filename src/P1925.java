import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Igor_Sokolov on 3/18/2015.
 */
public class P1925 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int balance = 0;
        for (int i = 0; i < n; i++) {
            int b = in.nextInt();
            int g = in.nextInt();

            balance += (b - g - 2);
        }

        int answer = k + balance - 2;
        if (answer < 0) {
            System.out.println("Big Bang!");
        } else {
            System.out.println(answer);
        }
    }
}
