package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int l = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int p = in.nextInt();
        int nl = in.nextInt();
        int np = in.nextInt();

        int toasts = k * l / nl;
        int limes = c * d;
        int salt = p / np;
        int res =  Math.min(toasts, Math.min(limes, salt)) / n;
        out.print(res);
    }
}
