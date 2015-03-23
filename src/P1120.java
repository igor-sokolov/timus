import java.util.Scanner;

/**
 * Created by Igor_Sokolov on 3/23/2015.
 */
public class P1120 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int N2 = N * 2;
        int NSQRT = (int) Math.ceil(Math.sqrt(N2));

        for (int p = NSQRT; p >= 1; p--) {
            if (N2 % p == 0) {
                int b = (N2 / p) - p + 1;
                if (b > 0 && b % 2 == 0) {
                    int a = b / 2;
                    System.out.printf("%d %d%n", a, p);
                    return;
                }
            }
        }
    }
}
