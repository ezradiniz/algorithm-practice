package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int odd = 0;
        long res = 0;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            long nb = in.nextLong();
            if (nb % 2 != 0) {
                min = Math.min(min, nb);
                ++odd;
            }
            res += nb;
        }

        out.print((odd % 2 == 0) ? res : res - min);
    }
}
