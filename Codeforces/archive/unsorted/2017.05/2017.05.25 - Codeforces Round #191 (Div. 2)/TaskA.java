package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        int ones = 0;
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
            if (a[i] == 1) ones++;
        }

        int max = 0;
        int cur_max = 0;
        for (int i = 0; i < n; ++i) {
            cur_max += (a[i] == 0) ? 1 : -1;
            if (cur_max > max) {
                max = cur_max;
            }
            if (cur_max < 0) {
                cur_max = 0;
            }
        }

        out.print((max == 0 && ones >= 1) ? max + ones - 1 : max + ones);
    }
}
