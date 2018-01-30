package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int t = in.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }

        int res = 0;
        int i = 0;
        int sum = 0;
        int j = 0;
        while (true) {
            if (i >= n) break;
            while (i < n && sum < t) sum += a[i++];
            if (sum > t) sum -= a[--i];
            if (i > n) break;
            res = Math.max(res, i - j);
            sum -= a[j++];
        }

        out.print(res);
    }
}
