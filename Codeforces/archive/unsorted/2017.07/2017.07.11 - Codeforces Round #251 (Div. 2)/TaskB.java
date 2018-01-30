package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int x = in.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; ++i) {
            c[i] = in.nextInt();
        }

        Arrays.sort(c);

        long res = 0;

        for (int i = 0; i < n; ++i) {
            res += x * c[i];
            x = Math.max(1, --x);
        }

        out.print(res);
    }
}
