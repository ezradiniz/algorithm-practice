package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long b = in.nextLong();
        long d = in.nextLong();
        long s = in.nextLong();

        long sum = 0;

        long max = Math.max(b, Math.max(d, s));

        if (b != max && (max - 1 - b) > 0) sum += max - 1 - b;
        if (d != max && (max - 1 - d) > 0) sum += max - 1 - d;
        if (s != max && (max - 1 - s) > 0) sum += max - 1 - s;

        out.print(sum);
    }
}
