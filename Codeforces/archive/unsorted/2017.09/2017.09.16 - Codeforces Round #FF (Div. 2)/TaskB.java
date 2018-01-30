package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        char[] s = in.next().toCharArray();
        int k = in.nextInt();
        int[] a = new int[26];
        int max = 0;
        for (int i = 0; i < 26; ++i) {
            a[i] = in.nextInt();
            max = Math.max(max, a[i]);
        }
        long res = 0;
        for (int i = 0; i < s.length; ++i) {
            res += a[s[i] - 'a'] * (i + 1);
        }

        for (int i = s.length; i < s.length + k; ++i) {
            res += max * (i + 1);
        }

        out.print(res);
    }
}
