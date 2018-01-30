package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int pass = 0;
        int res = 0;
        for (int i = 0; i < n; ++i) {
            int a = in.nextInt();
            int b = in.nextInt();
            pass += b - a;
            res = Math.max(res, pass);
        }
        out.println(res);
    }
}
