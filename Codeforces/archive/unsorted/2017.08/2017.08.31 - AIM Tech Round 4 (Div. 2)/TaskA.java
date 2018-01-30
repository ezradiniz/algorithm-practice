package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        char[] s = in.next().toCharArray();
        int k = in.nextInt();
        if (s.length < k) {
            out.print("impossible");
            return;
        }
        boolean[] lettes = new boolean[26];
        int res = 0;
        for (char c : s) {
            if (!lettes[c - 'a']) {
                ++res;
                lettes[c - 'a'] = true;
            }
        }

        out.print(Math.max(0, k - res));
    }
}
