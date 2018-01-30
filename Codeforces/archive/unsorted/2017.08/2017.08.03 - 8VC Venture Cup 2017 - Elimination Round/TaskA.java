package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        for (int m = 1; ; ++m) {
            if (!isPrime(n * m + 1)) {
                out.print(m);
                return;
            }
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
