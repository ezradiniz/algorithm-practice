package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        int res = Math.min(m, Math.min(n, (n + m)/ 3));
        out.print(res);
    }
}
