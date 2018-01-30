package solutions;

import java.math.BigInteger;
import java.util.Scanner;
import java.io.PrintWriter;

public class RecursiveDigitSum {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String n = in.next();
        int k = in.nextInt();

        BigInteger sum = new BigInteger("0");
        for (int i = 0; i<n.length(); ++i) sum = sum.add(new BigInteger(n.charAt(i) + ""));

        BigInteger num = new BigInteger("0");
        for (int i = 0; i<k; ++i) num = num.add(sum);

        while (num.toString().length() != 1) num = sumDigits(num);

        out.print(num.toString());
    }

    public static BigInteger sumDigits(BigInteger n) {
        BigInteger sum = new BigInteger("0");
        while (n.compareTo(new BigInteger("0")) > 0) {
            sum = sum.add(new BigInteger(n.mod(new BigInteger("10")) + ""));
            n = n.divide(new BigInteger("10"));
        }
        return sum;
    }
}
