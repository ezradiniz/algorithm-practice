package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class CounterGame {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        String[] names = {"Richard", "Louise"};

        for (int i=0; i<t; i++) {
            long n = in.nextLong();
            int count = 0;

            while (n != 1) {
                if ((n & (n-1)) != 0) {
                    n -= Long.highestOneBit(n);
                } else{
                    n >>= 1;
                }
                count ^= 1;
            }
            out.println(names[count]);
        }

    }

}
