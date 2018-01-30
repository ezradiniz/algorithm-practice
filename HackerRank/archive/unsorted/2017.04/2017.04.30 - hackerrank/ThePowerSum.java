package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class ThePowerSum {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int x = in.nextInt();
        int n = in.nextInt();

        int res = powerSum(x, n, 0, 1);

        out.print(res);
    }


    private int powerSum(int m, int p, int carry, int j) {
        if (carry == m) return 1;
        if (carry > m) return 0;
        int res = 0;
        for (int i = j; i <= Math.sqrt(m); ++i) {
            res += powerSum(m, p, (int)Math.pow(i, p) + carry, i+1);
        }
        return res;
    }
}
