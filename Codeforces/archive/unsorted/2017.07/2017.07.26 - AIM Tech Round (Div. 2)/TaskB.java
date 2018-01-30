package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int cur = a[n - 1];
        long res = cur;
        for (int i = n - 2; i >= 0 && cur > 0; --i) {
            if (a[i] >= cur)
                a[i] = cur - 1;
            cur = a[i];
            res += cur;
        }

        out.print(res);
    }
}
