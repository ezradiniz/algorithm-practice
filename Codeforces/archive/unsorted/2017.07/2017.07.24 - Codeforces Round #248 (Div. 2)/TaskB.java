package solutions;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        long[] v1 = new long[n];
        long[] v2 = new long[n];
        for (int i = 0; i < n; ++i) {
            long v = in.nextLong();
            v1[i] = v;
            v2[i] = v;
        }

        // shuffle
        Random rd = new Random();
        for (int i = 0; i < n; ++i) {
            int j = rd.nextInt(n);
            long tmp = v2[i];
            v2[i] = v2[j];
            v2[j] = tmp;
        }

        Arrays.sort(v2);
        for (int i = 1; i < n; ++i) {
            v2[i] += v2[i - 1];
            v1[i] += v1[i - 1];
        }

        int m = in.nextInt();
        for (int i = 0; i < m; ++i) {
            int t = in.nextInt();
            int l = in.nextInt() - 1;
            int r = in.nextInt() - 1;
            if (t == 1) {
                long sub = (l - 1 >= 0) ? v1[l - 1] : 0;
                out.println(v1[r] - sub);

            } else {
                long sub = (l - 1 >= 0) ? v2[l - 1] : 0;
                out.println(v2[r] - sub);
            }
        }

    }
}
