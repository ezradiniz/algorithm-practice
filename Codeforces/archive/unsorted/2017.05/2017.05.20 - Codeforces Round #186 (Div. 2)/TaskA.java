package solutions;

import java.math.BigInteger;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String n = in.next();
        if (new BigInteger(n).compareTo(BigInteger.ZERO) >= 0) {
            out.print(n);
        } else if (new BigInteger(n).compareTo(new BigInteger("-1")) == 0) {
            out.print(0);
        } else {
            BigInteger a = new BigInteger(n.substring(0, n.length()-1));
            BigInteger b;
            if (n.length() - 2 >= 1) {
                b = new BigInteger("-" + n.substring(1, n.length()-2) + n.substring(n.length() -1));
            } else {
                b = BigInteger.valueOf(Long.MIN_VALUE);
            }
            out.print(a.max(b));
        }
    }
}
