package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Stack;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] f = new int[n];
        for (int i = 0; i < n; ++i) {
            f[i] = in.nextInt();
        }
        Arrays.sort(f);
        int res = 0;
        for (int i = n - 1; i >= 0; i -= k) {
            res += 2 * (f[i] - 1);
        }

        out.print(res);
    }
}
