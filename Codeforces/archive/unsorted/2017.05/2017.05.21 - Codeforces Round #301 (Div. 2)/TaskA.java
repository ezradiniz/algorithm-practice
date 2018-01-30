package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        char[] original = in.next().toCharArray();
        char[] combination = in.next().toCharArray();
        int res = 0;
        for (int i = 0; i < n; ++i) {
            int d1 = original[i] - 48;
            int d2 = combination[i] - 48;

            int max = Math.max(d1, d2);
            int min = Math.min(d1, d2);

            if (max - min > 5) res += (10 - max) + min;
            else res += max - min;
        }
        out.print(res);
    }
}
