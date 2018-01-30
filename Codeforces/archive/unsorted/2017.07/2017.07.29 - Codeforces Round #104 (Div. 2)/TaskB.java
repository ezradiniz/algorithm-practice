package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        if (a < b) {
            out.print(b);
        } else {
            String bb = String.valueOf(b);
            int res = a + 1;
            while (!compareMask(res, bb)) {
                res++;
            }
            out.print(res);
        }
    }

    private boolean compareMask(int res, String b) {
        int n = b.length() - 1;
        while (res > 0) {
            int d = res % 10;

            if (n >= 0) {
                int dd = b.charAt(n) - '0';
                if (dd == 4 && d == 7) return false;
                if (dd == 7 && d == 4) return false;
                if (d == dd) --n;
            } else {
                if (d == 7 || d == 4) return false;
            }

            res /= 10;
        }

        if (n == -1)
            return true;

        return false;
    }
}
