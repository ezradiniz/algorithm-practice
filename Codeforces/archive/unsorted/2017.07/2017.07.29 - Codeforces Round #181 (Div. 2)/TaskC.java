package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {

    static final int MOD = (int)(1e9 + 7);

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        long[] fact = new long[(int)(1e6 + 100)];

        initFact(fact);

        long res = 0;
        for (int i = 0; i <= n; ++i) {
            long expSum = a * i + b * (n - i);
            if (check(expSum, a, b)) {
                res += getC(fact, n, i);
                res %= MOD;
            }
        }

        out.print(res);
    }

    private void initFact(long[] fact) {
        fact[0] = 1L;
        for (int i = 1; i < fact.length; ++i)  {
            fact[i] = fact[i - 1] * i;
            fact[i] %= MOD;
        }
    }

    private boolean check(long value, int a, int b) {
        while (value != 0) {
            if (value % 10 == a || value % 10 == b) value /= 10;
            else return false;
        }
        return true;
    }

    private long binPow(long value, long deg) {
        if (deg == 0) return 1 % MOD;
        if ((deg & 1) == 1) return binPow(value, deg -1) * value % MOD;
        long res = binPow(value, deg >> 1);
        return (res * res) % MOD;
    }

    private long getC(long[] fact, int n, int i) {
        long res = fact[n];
        long div = fact[n - i] * fact[i];
        div %= MOD;
        div = binPow(div,MOD - 2);
        return (res * div) % MOD;
    }
}
