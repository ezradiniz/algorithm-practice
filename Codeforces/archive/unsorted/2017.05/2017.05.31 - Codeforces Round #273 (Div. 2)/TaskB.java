package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();
        long m = in.nextLong();

        long min;

        if (m == 1) {
            min = n * (n - 1) / 2;
        } else {
            long mod = n % m;
            long diff = m - mod;
            long divided = n / m;
            long over = divided + 1;
            min = mod * (over * (over - 1) / 2) + diff * (divided * (divided - 1) / 2);
        }

        long max = n - m + 1;
        max = max * (max - 1) / 2;

        out.print(min + " " + max);
    }
}
