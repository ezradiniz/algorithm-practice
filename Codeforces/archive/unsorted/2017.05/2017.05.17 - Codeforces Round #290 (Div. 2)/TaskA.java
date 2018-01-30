package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        int change = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (i % 2 == 0) {
                    out.print("#");
                } else {
                    if (change == 0) {
                        if (j == m-1) out.print("#");
                        else out.print(".");
                    } else {
                        if (j == 0) out.print("#");
                        else out.print(".");
                    }
                    if (j == m-1) change ^= 1;
                }
            }
            out.println();
        }
    }
}
