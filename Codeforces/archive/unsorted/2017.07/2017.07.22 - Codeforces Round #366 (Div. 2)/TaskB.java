package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        int res = 0;
        for (int i = 0; i < n; ++i) {
            res += in.nextInt() - 1;
            if (res % 2 != 0) out.println(1);
            else out.println(2);
        }
    }
}
