package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        int L = Integer.MAX_VALUE;
        int R = Integer.MAX_VALUE;
        int maxK = Math.abs(L - R);
        int p = 0;
        int k = 0;
        for (int i = 0; i < n; ++i) {
            int l = in.nextInt();
            int r = in.nextInt();
            k = Math.abs((L - l + r) - (R -r + l));
            if (k > maxK) {
                maxK = k;
                p = i + 1;
            }
        }
        if (k > maxK) out.print(0);
        else out.print(p);
    }
}
