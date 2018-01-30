package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int change = 0;
        for (int i = 0; i < n; ++i) {
            if (change < 2) out.print('a');
            else out.print('b');
            change++;
            if (change == 4) change = 0;
        }
    }
}
