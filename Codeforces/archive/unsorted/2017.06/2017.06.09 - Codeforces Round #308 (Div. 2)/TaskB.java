package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = n;

        long res = 0;
        int times = 1;
        long offset = 10;

        while (k > 1) {
            k /= 10;
            res += times * (offset - offset / 10);
            offset *= 10;
            ++times;
        }

        offset /= 10;

        if (n < offset) --times;

        res += times * (n - offset + 1);

        out.print(res);
    }
}
