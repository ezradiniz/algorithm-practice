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

        for (int i = 0; i <= n - 3; ++i) {
            if (isTriangle(a[i], a[i + 1], a[i + 2])) {
                out.print("YES");
                return;
            }
        }

        out.print("NO");
    }

    private boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a) && a > 0 && b > 0 && c > 0;
    }
}
