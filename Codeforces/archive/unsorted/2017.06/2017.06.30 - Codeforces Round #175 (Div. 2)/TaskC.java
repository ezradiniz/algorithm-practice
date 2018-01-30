package solutions;

import java.util.*;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        long[] a = new long[n];
        Random r = new Random();
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextLong();
        }

        for (int i = 0; i < n; ++i) {
            int j = r.nextInt(n);
            long tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
        Arrays.sort(a);
        long res = 0;
        int goal = n;
        for (int i = n - 1; i >= 0; --i) {
            if (a[i] != goal) {
                res += Math.abs(a[i] - goal);
            }
            --goal;
        }
        out.print(res);
    }
}
