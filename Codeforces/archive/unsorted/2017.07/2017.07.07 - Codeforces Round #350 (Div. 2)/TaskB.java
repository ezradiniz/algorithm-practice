package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; ++i) {
            if (k - i > 0) k -= i;
            else break;
        }
        out.print(a[k - 1]);
    }
}
