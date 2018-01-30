package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class SummingPieces {
    private final static int MOD = (int)(1e9 + 7);

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        long[] a = new long[n];
        long res = 0;
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextLong();
        }

        res = sumPieces(a, 0);
        out.println(res);
    }

    private long sumPieces(long[] a, int l) {

        long res = 0;
        long sum = 0;
        int offset = 1;
        for (int j = l; j < a.length; ++j) {
            sum += a[j];
            res += sum * offset++;

            res += sumPieces(a, j + 1);
        }
        return res;
    }
}
