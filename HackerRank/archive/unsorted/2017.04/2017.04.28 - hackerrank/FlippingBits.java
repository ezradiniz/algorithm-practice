package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class FlippingBits {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        for (int x  = 0; x < t; ++x) {
            long n = in.nextLong();
            out.println(n ^ ((1L << 32)-1));
        }
    }
}
