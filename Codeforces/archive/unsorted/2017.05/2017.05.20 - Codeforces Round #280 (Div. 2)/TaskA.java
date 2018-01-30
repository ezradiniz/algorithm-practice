package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int res = 0;

        if (n == 1) {
            out.print(1);
            return;
        }

        int cubes = 0;
        int carry = 0;
        for (int i = 1; cubes < n; ++i) {
            res++;
            carry += i;
            cubes += carry;
        }

        if (cubes >  n) res--;

        out.print(res);
    }
}
