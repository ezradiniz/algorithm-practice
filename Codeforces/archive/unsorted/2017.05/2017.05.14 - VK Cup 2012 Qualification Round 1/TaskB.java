package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] g = new int[n];
        for (int i = 0; i < n; ++i) g[i] = in.nextInt();
        Arrays.sort(g);
        int res = 0;
        int threshold = 0;
        for (int i = n-1; i >= threshold; --i) {
            int p = g[i];
            while (threshold < n && p + g[threshold] <= 4) {
                p += g[threshold++];
            }
            res++;
        }
        out.println(res);
    }
}
