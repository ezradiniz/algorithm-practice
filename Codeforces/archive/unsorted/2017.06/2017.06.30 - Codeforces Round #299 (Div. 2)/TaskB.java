package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        char[] n = in.next().toCharArray();

        long off = 0;
        for (int i = 0; i < n.length; ++i) {
            int x = n[i] - '0';
            if (x == '4') x = 0;
            else x = 1;

            off = (2 * off) + x;
        }

        off += (long)Math.pow(2, n.length) - 1L;

        out.print(off);
    }
}
