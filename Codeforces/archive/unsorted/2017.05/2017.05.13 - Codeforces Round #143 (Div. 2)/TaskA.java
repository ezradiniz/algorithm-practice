package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int res = 0;
        for (int i = 0; i < n; ++i) {
            int count = 0;
            for (int j = 0; j < 3; ++j) {
                int c = in.nextInt();
                if (c == 1) count++;
            }
            if (count >= 2) res++;
        }
        out.println(res);
    }
}
