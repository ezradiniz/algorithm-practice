package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        int player = 0;

        while (true) {
            int res;
            if (player == 0) {
                res = gcd(a, n);
            } else {
                res = gcd(b, n);
            }

            if (n < res) break;
            n -= res;

            player ^= 1;
        }

        player ^= 1;

        out.println(player);
    }

    private int gcd(int a, int b) {
       while (b != 0) {
           int r = a % b;
           a = b;
           b = r;
       }
       return a;
    }
}
