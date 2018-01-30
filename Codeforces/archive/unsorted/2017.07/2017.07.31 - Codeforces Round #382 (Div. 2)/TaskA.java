package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        boolean[] path = new boolean[n];
        int g = -1;
        int t = -1;
        for (int i = 0; i < n; ++i) {
            char ch = s.charAt(i);
            if (ch != '#') path[i] = true;
            if (ch == 'G') g = i;
            if (ch == 'T') t = i;
        }
        int start = Math.min(g, t);
        int target = Math.max(g, t);
        for (int i = start; i <= target; ++i) {
            if (i == target) {
                out.print("YES");
                return;
            }
            if (!path[i]) break;
            if (i + k > target) break;
            i += k - 1;
        }

        out.print("NO");
    }
}
