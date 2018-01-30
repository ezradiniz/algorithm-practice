package solutions;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;

public class StoneDivisionRevisited {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int q = in.nextInt();
        for (int it = 0; it < q; it++) {
            BigInteger n = new BigInteger(in.next());
            int m = in.nextInt();
            BigInteger[] set = new BigInteger[m];
            for (int i = 0; i < m; ++i) {
                set[i] = new BigInteger(in.next());
            }
            Arrays.sort(set);
            BigInteger res = maxMoves(n, BigInteger.ONE, set, m-1);
            out.println(res.toString());
        }
    }

    private BigInteger maxMoves(BigInteger n, BigInteger p, BigInteger[] set, int next) {

        BigInteger max = BigInteger.ZERO;
        for (int i = next; i >= 0; --i) {
            if (!n.equals(set[i]) && n.mod(set[i]).equals(BigInteger.ZERO)) {
                BigInteger m = maxMoves(set[i], n.divide(set[i]).multiply(p), set, i).add(p);
                if (max.compareTo(m) < 0) {
                    max = m;
                }
            }
        }
        return max;
    }
}
