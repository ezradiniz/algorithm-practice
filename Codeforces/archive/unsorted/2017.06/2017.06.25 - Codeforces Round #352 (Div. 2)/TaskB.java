package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String s = in.next();
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            letters[s.charAt(i) - 'a']++;
        }
        int left = 0;
        for (int i = 0; i < 26; ++i) if (letters[i] == 0) {
            ++left;
        }
        int res = 0;
        for (int i = 0; i < 26; ++i) {
            if (letters[i] <= 1) continue;
            int diff = letters[i] - 1;
            left -= diff;
            if (left < 0) {
                out.print(-1);
                return;
            }
            res += diff;
        }
        out.print(res);
    }
}
