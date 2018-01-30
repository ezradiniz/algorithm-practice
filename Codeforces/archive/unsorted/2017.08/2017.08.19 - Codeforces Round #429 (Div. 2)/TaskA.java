package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        char[] s = in.next().toCharArray();
        int[] letters = new int[26];
        for (int i = 0; i < n; ++i) {
            letters[s[i] - 'a']++;
        }

        for (int i = 0; i < 26; ++i) {
            if (letters[i] > k) {
                out.print("NO");
                return;
            }
        }
        out.print("YES");
    }
}
