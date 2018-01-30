package solutions;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.PrintWriter;

public class MinimumLost {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        BigInteger[][] a = new BigInteger[n][2];

        for (int i = 0; i < n; ++i) {
            a[i][0] = new BigInteger(in.next());
            a[i][1] = BigInteger.valueOf(i);
        }

        Arrays.sort(a, new Comparator<BigInteger[]>() {
            @Override
            public int compare(BigInteger[] bigIntegers, BigInteger[] t1) {
                return bigIntegers[0].compareTo(t1[0]);
            }
        });

        BigInteger res = new BigInteger("10000000000000000");

        for (int i = 1; i < n; ++i) {
            if (a[i][0].subtract(a[i-1][0]).compareTo(res) < 0 && a[i][1].compareTo(a[i-1][1]) < 0) {
                res = a[i][0].subtract(a[i-1][0]);
            }
        }

        out.println(res.toString());
    }

}
