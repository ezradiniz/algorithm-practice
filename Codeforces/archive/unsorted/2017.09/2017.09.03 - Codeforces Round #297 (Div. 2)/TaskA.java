package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        char[] s = in.next().toCharArray();
        int[] keys = new int[26];
        int res = 0;
        for (int i = 0; i < 2 * n - 2; ++i) {
            if (i % 2 == 0) {
                keys[s[i] - 'a']++;
            } else {
                if (keys[Character.toLowerCase(s[i]) - 'a'] == 0) ++res;
                else keys[Character.toLowerCase(s[i]) - 'a'] = Math.max(0, keys[Character.toLowerCase(s[i]) - 'a'] - 1);
            }
        }
        out.print(res);
    }
}
