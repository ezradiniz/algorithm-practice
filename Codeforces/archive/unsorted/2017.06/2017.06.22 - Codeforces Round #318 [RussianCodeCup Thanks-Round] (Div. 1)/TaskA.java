package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        int max = 0;
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
            while (a[i] % 2 == 0) a[i] /= 2;
            while (a[i] % 3 == 0) a[i] /= 3;
        }

        for (int i = 1; i < n; ++i) {
            if (a[i] != a[0]) {
                out.print("No");
                return;
            }
        }

        out.print("Yes");
    }
}
