import java.util.Scanner;

/**
 * Created by Igor_Sokolov on 3/23/2015.
 */
public class P1617 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] wheels = new int[101];
        final int MIN_WHEEL = 600;
        for (int i = 0; i < n; i++) {
            wheels[in.nextInt() - MIN_WHEEL]++;
        }

        int result = 0;
        for (int i = 0; i < wheels.length; i++) {
            result += wheels[i] / 4;
        }

        System.out.println(result);
    }
}
