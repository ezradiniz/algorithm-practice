package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class MandragoraForest {

    private static int[][] memo;

    public void solve(int testNumber, Scanner in, PrintWriter out) {

        int t = in.nextInt();
        for (int a0 = 0; a0 < t; ++a0) {
            int n = in.nextInt();

            int[][] m = new int[n][2];

            for (int i=0; i<n; ++i) {
                m[i][0] = in.nextInt();
                m[i][1] = 1;

            }

            long res = mandragoraExp(m, 0, 1, 0);
            out.print(res);
        }
    }


    private static long mandragoraExp(int[][] m, int i, int s, long p) {
        if (i == m.length) return p;

        long max = 0;
        for (int j =0; j< m.length; j++) {
            if (m[j][1] == 1) {
                m[j][1] = 0;
                long e = mandragoraExp(m, j+1, s+1, p);
                long b = mandragoraExp(m, j+1, s, p + s*m[j][0]);
                max = Math.max(max, Math.max(e, b));
                m[j][1] = 1;
            }
        }

        return max;
    }
}
