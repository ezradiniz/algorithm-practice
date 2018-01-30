package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();
        int k = in.nextInt();
        int[] w = new int[26];
        int max = 0;
        for (int i = 0; i < 26; ++i) {
            w[i] = in.nextInt();
            max = Math.max(max, w[i]);
        }
        int res = 0;
        for (int i = 0; i < s.length(); ++i) {
            res += w[s.charAt(i) - 'a'] * (i + 1);
        }
        int time = s.length() + 1;
        for (int i = 0; i < k; ++i) {
            res += max * time++;
        }
        out.print(res);
    }
}
