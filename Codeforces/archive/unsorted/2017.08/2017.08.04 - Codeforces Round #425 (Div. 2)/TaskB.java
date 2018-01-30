package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        char[] s = in.next().toCharArray();
        String p = in.next();
        char[] pattern = new char[p.length() + 5];
        for (int i = 0; i < p.length(); ++i) {
            pattern[i] = p.charAt(i);
        }

        boolean[] letter = new boolean[256];
        for (int i = 0; i < s.length; ++i) letter[s[i] - 'a']  = true;

        int n = in.nextInt();

        for (int it = 0; it < n; ++it) {
            String query = in.next();
            char[] q = new char[query.length() + 5];
            for (int i = 0; i < query.length(); ++i) q[i] = query.charAt(i);

            if (match(pattern, letter, q, p.length(), query.length())) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
    }

    private boolean match(char[] pattern, boolean[] letter, char[] q, int X, int Y) {
        int diff = Y - X;
        if (diff < -1) return false;

        int j = 0;
        int k = 0;
        boolean res = true;
        while (j < X || k < Y) {
            if (pattern[j] != '?' && pattern[j] != '*') {
                if (pattern[j] != q[k]) {
                    res = false;
                    break;
                } else {
                    ++j;
                    ++k;
                    continue;
                }
            } else if (pattern[j] == '?') {
                if (k < Y && letter[q[k] - 'a']) {
                    ++j;
                    ++k;
                    continue;
                } else {
                    res = false;
                    break;
                }
            } else {
                if (diff == -1) {
                    ++j;
                    continue;
                } else {
                    for (int i = k; i <= k + diff; ++i) {
                        if (letter[q[i] - 'a']) res = false;
                    }
                    if (!res) break;
                    ++j;
                    k += diff + 1;
                    continue;
                }
            }
        }

        return res;
    }
}
