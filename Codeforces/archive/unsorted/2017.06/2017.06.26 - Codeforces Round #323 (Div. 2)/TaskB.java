package solutions;


import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[]a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        int res = 0;
        int count = 0;

        while (true) {
            for (int i = 0; i < n; ++i) if (a[i] <= count) {
                a[i] = n + 1;
                ++count;
            }
            if (count == n) break;
            ++res;
            for (int i = n - 1; i >= 0; --i) if (a[i] <= count) {
                a[i] = n + 1;
                ++count;
            }
            if (count == n) break;
            ++res;
        }

        out.print(res);
    }
}
