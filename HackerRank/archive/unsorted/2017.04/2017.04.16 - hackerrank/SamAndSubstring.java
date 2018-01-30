package solutions;

import java.math.BigInteger;
import java.util.Scanner;
import java.io.PrintWriter;

public class SamAndSubstring {
    private static final long MOD7 = 1000000007;
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();

        long outp = s.charAt(0) - '0';
        long temp = s.charAt(0) - '0';

        for (int i=1; i<s.length(); i++) {
            temp = temp*10 + (i+1)*(s.charAt(i)-'0');
            temp = temp % MOD7;
            outp = (outp + temp) % MOD7;
        }

        out.print(outp);

    }
}
