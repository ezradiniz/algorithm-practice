package solutions;

import java.util.*;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        long a = 0;
        long b = 0;
        long c = 0;

        for (int i = 0; i < n; ++i) {
            int nb = in.nextInt();
            a += nb;
        }

        for (int i = 0; i < n-1; ++i) {
            int nb = in.nextInt();
            b += nb;
        }

        for (int i = 0; i < n-2; ++i) {
            int nb = in.nextInt();
            c += nb;
        }

        out.println(a-b);
        out.println(b-c);
    }
}
