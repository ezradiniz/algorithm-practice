package solutions;

import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {

    HashSet<Long> prime = new HashSet<>();
    HashSet<Long> noPrime = new HashSet<>();

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        prime.add(2l);
        for (int i = 0; i < n; ++i) {
            long num = in.nextLong();
            long sqrt = (long) Math.sqrt(num);
            if (sqrt * sqrt == num && isPrime(sqrt)) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
    }

    private boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (prime.contains(n)) return true;
        if (noPrime.contains(n)) return false;
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0)  {
                noPrime.add(n);
                return false;
            }
        }
        prime.add(n);
        return true;
    }
}
