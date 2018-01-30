package solutions;

import java.math.BigInteger;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int t = in.nextInt();
        String max = "";
        for (int i = 0; i < n; ++i)  max += "9";
        BigInteger nb = new BigInteger(max);

        while (nb.toString().length() == max.length() && nb.compareTo(BigInteger.ZERO) != 0) {
            if (nb.mod(BigInteger.valueOf(t)) == BigInteger.ZERO) {
                out.print(nb.toString());
                return;
            }
            nb = nb.subtract(BigInteger.ONE);
        }

        out.print("-1");
    }
}
