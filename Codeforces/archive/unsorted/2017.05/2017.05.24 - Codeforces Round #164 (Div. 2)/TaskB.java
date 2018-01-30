package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        long res = n - 1;
        for (int i = 1; i < n; ++i) {
            res += (n - i) * i;
        }
        out.print(res + 1);
    }
}
