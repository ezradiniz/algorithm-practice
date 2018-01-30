package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int sum = 0;
        int ih = 0;
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
            if (ih < k) sum += a[ih++];
        }
        int res = 0;
        int min = sum;
        for (int i = 1; i < n - k + 1; ++i) {
            sum -= a[i - 1];
            sum += a[ih + i - 1];
            if (sum < min) {
                min = sum;
                res = i;
            }
        }

        out.print(res + 1);
    }
}
