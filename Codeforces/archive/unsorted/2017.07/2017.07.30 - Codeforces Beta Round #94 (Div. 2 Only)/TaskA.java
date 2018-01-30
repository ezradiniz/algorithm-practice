package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
            sum += a[i];
        }

        int res = 0;
        for (int i = 0; i < n; ++i) {
            if ((sum - a[i]) % 2 == 0) ++res;
        }

        out.print(res);
    }
}
