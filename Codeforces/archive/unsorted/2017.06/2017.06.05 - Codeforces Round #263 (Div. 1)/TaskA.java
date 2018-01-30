package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        long sum = 0;
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        long res = 0;
        for (int i = 0; i < n; ++i) {
            res += sum + a[i];
            sum -= a[i];
        }

        out.print(res - a[n - 1]);
    }
}
