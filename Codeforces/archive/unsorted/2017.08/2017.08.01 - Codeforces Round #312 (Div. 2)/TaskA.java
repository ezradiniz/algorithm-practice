package solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[][] t = new int[n + 1][2];
        t[0][0] = 0;
        t[0][1] = 0;
        for (int i = 1; i <= n; ++i) {
            t[i][0] = in.nextInt(); // position
            t[i][1] = in.nextInt(); // number
        }
        Arrays.sort(t, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                int diff = ints[0] - t1[0];
                if (diff == 0) {
                    return ints[1] - t1[1];
                }
                return diff;
            }
        });

        for (int i = 0; i < n + 1; ++i) {
            int p = t[i][0];
            if (p == 0) {

                int res = 0;
                if (i > n / 2){
                    for (int j = 2 * i - n - 1; j <= n; ++j) res += t[j][1];
                } else {
                    for (int j = 0; j <= Math.min(2 * i + 1, n); ++j) res += t[j][1];
                }

                out.print(res);
            }
        }
    }
}
