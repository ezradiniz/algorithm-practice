package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        boolean[] res = findPrimes(n);

        if (n > 2) {
            out.println(2);
        } else {
            out.println(1);
        }
        for (int i = 2; i < res.length; ++i) {
            if (res[i]) {
                out.print(1 + " ");
            } else {
                out.print(2 + " ");
            }
        }
    }

    private boolean[] findPrimes(int n) {
        int m = n + 1;
        boolean[] prime = new boolean[m + 1];
        Arrays.fill(prime, true);
        for (int i = 2; i <= m; ++i) {
            if (prime[i]) {
                for (int j = 2 * i; j <= m; j += i) {
                    prime[j] = false;
                }
            }
        }
        return prime;
    }
}
