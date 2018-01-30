package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int d2 = in.nextInt();
        int d3 = in.nextInt();
        int d5 = in.nextInt();
        int d6 = in.nextInt();

        if (d2 > 0 && d5 > 0 && d6 > 0) {
            int min = Math.min(d2, Math.min(d5, d6));
            out.print(min * 256 + ((d3 > 0) ? Math.min(d3, d2 - min) * 32 : 0));
        } else if (d2 > 0 && d3 > 0) {
            out.print(Math.min(d2, d3) * 32);
        } else {
            out.print(0);
        }
    }
}
