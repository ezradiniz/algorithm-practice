package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int res = 0;
        int[] nb = new int[1001];
        for (int i = 0; i < n; ++i) {
            int x = in.nextInt();
            if (res < ++nb[x]) res = nb[x];
        }
        out.print(n - res);
    }
}
