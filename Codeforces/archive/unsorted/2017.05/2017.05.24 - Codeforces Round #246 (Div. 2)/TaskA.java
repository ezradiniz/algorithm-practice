package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int res = 0;
        int count = 0;
        for (int i = 0; i < n; ++i) {
            int times = in.nextInt();
            if (times + k <= 5) {
                count++;
            }

            if (count == 3) {
                res++;
                count = 0;
            }
        }
        out.print(res);
    }
}
