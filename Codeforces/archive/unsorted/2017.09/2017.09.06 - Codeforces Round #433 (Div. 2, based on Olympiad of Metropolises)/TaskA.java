package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();

        int a = n / 2 - 1;
        int b = n - a;

        if (n % 2 != 0) {
            ++a;
            --b;
        }

        if (a + b != n) throw new RuntimeException();

        while (gcd(a, b) != 1) {
            --a;
            ++b;
        }

        out.print(a + " " + b);
    }

    private int gcd(int a, int b) {
        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
