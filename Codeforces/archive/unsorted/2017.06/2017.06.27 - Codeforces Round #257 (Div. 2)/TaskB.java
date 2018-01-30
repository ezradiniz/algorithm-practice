package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {

    private final static long MOD = (long)(1e9 + 7);

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long x = in.nextInt();
        long y = in.nextInt();
        long n = in.nextLong();

        long res = sequence(x, y, n);
        out.print(res);
    }

    private long sequence(long x, long y, long n) {

        x = ((x % MOD) + MOD) % MOD;
        y = ((y % MOD) + MOD) % MOD;

        long[] seq = new long[6];
        seq[0] = x;
        seq[1] = y;

        for (int i = 2; i < 6; ++i) {
            seq[i] = (((seq[i - 1] - seq[i - 2]) % MOD) + MOD) % MOD;
        }

        return seq[(int)((n - 1) % 6)];
    }
}
