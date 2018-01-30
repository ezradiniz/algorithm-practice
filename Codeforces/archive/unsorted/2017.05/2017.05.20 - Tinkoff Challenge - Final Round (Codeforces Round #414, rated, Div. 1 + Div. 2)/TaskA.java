package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long n = in.nextLong();
        long[] x = new long[(int)n];
        for (int i = 0; i < n; ++i) x[i] = in.nextLong();
        long count = 0;
        for (int i = 0; i < x.length; ++i) {
            if (x[i] > b && x[i] < c) {
                count++;
            }
        }
        out.print(count);
    }
}
