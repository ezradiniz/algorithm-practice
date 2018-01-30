package solutions;

import java.math.BigInteger;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();
        int res = (pow(1, s, 5) + pow(2, s, 5)  + pow(3, s, 5) + pow(4, s, 5)) % 5;
        out.print(res);
    }

    private int thePow(int a, int b, int mod) {
        a %= mod;
        int res = 1 % mod;
        while (b != 0) {
            if ((b & 1) == 1) {
                res = (res * a) % mod;
                --b;
            } else {
                a = (a * a) % mod;
                b >>= 1;
            }
        }
        return res;
    }

    private int pow(int k, String n, int mod) {
        k %= mod;
        int res = 1 % mod;
        int cur = k;
        for (int i = n.length() - 1; i >= 0; --i) {
            res = (res * thePow(cur, n.charAt(i) - '0', mod)) % mod;
            cur = thePow(cur, 10, mod);
        }

        return res;
    }
}
