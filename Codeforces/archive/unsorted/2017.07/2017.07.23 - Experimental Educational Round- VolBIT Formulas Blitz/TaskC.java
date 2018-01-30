package solutions;

import java.math.BigInteger;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        BigInteger res = BigInteger.ZERO;

        for (int i = 1; i <= n; ++i) {
            res = res.add(BigInteger.valueOf(2).pow(i));
        }

        out.print(res.toString());
    }
}
