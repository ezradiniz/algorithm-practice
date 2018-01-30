package solutions;


import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; ++i) d[i] = in.nextInt();
        int u = in.nextInt() - 1;
        int v = in.nextInt() - 1;

        int s1 = 0;
        for (int i = Math.min(u, v); i < Math.max(u, v); ++i) {
            s1 += d[i];
        }
        int s2 = 0;
        for (int i = Math.max(u, v); i < n + Math.min(u, v); ++i) {
            s2 += d[i % n];
        }

        out.print(Math.min(s1, s2));
    }
}
