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
        int res = 0;
        for (int i = 1; i < n; ++i) {
           if (a[i - 1] >= a[i]) {
                int diff = a[i - 1] - a[i] + 1;
                a[i] += diff;
                res += diff;
            }
        }
        out.print(res);
    }
}
