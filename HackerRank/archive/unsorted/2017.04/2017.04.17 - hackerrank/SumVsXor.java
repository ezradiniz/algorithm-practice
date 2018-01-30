package solutions;

import java.math.BigInteger;
import java.util.Scanner;
import java.io.PrintWriter;

public class SumVsXor {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();
        String bin = Long.toBinaryString(n);
        long c0 = 0;
        for (Character c: bin.toCharArray()) if (c == '0') c0++;

        long res = (bin.length() > 1) ? (long)Math.pow(2, c0) : 1;
        out.print(res);
    }

}
