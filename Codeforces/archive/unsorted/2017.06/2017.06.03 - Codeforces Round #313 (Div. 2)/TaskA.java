package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int res = 1;
        for (int i = 0; i < n; ++i) {
            int a = in.nextInt();
            if (a == res) res = -1;
        }
        out.print(res);
    }
}
