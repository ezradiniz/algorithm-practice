package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.Arrays;

public class TaskB {


    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        char[] s = in.next().toCharArray();
        boolean[] door = new boolean[26];
        int[] pos = new int[26];
        for (int i = 0, count = 0; i < n; ++i) {
            int p = s[i] - 'A';
            if (count < k && !door[p]) {
                ++count;
                door[p] = true;
            }
            pos[p] = i;
        }
        int count = k;
        for (int i = 0; i < n; ++i) {
            int p = s[i] - 'A';
            if (!door[p]) {
                ++count;
                door[p] = true;
                if (count > k) {
                    out.print("YES");
                    return;
                }
            }
            if (pos[p] == i) {
                count--;
            }
        }
        out.print("NO");
    }
}
