package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int h = in.nextInt();
        int res = 0;
        for (int i = 0; i < n; ++i) {
            int a = in.nextInt();
            res += Math.ceil((float)a/h);
        }
        out.print(res);
    }
}
