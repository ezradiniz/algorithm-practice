package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int d1 = in.nextInt();
        int d2 = in.nextInt();
        int d3 = in.nextInt();
        out.print(Math.min(2*d1+2*d2, Math.min(d1+d2+d3, Math.min(2*d1+2*d3, 2*d2+2*d3))));
    }
}
