package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int a = in.nextInt();
        int[] d = new int[n];
        int max = 0;
        for (int i = 0; i < n; ++i) {
            d[i] = in.nextInt();
            max += d[i];
        }
        for (int i = 0; i < n; ++i) {
            int l = Math.max(1, a - (max - d[i]));
            int r = Math.min(0 + d[i], a - (n - 1));
            int res = d[i] - (r - l + 1);
            out.print(res + " ");
        }
    }
}
