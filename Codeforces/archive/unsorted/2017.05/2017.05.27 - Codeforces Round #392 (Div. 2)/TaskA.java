package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = in.nextInt();
        Arrays.sort(a);
        int res = 0;
        for (int i = 0; i < n -1; ++i) {
            res += a[n-1] - a[i];
        }
        out.print(res);
    }
}
