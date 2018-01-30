package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int a = in.nextInt() - 1;
        int[] t = new int[n];
        for (int i = 0; i < n; ++i) {
            t[i] = in.nextInt();
        }

        int left = a - 1;
        int right = a + 1;

        int res = 0;

        if (t[a] == 1) ++res;

        while (left >= 0 || right <= n -1) {
            if (left >= 0 && right <= n - 1) {
                if (t[left] == 1 && t[right] == 1) res += 2;
            } else {
                if (left >= 0 && t[left] == 1) ++res;
                if (right <= n - 1 && t[right] == 1) ++res;
            }

            --left;
            ++right;
        }

        out.print(res);
    }
}
