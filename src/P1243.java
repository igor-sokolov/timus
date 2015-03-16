import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1243 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();

        int[] nums = new int[line.length()];
        for (int i = 0; i < line.length(); i++) {
            nums[i] = Integer.parseInt(String.valueOf(line.charAt(i)));
        }

        int mod = mod(nums, 7);
        System.out.println(mod);
    }

    private static int mod(int[] nums, int delimiter) {
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cur = cur % delimiter;
            cur = cur * 10 + nums[i];
        }

        return cur % delimiter;
    }
}
