package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();
        int x = in.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; ++i) {
            c[i] = in.nextInt();
        }

        boolean[] mark = new boolean[n];
        int res = 0;
        for (int i = 0; i < n; ++i) {
            mark[i] = true;
            res += rec(c, i, mark, l, r, x, c[i], c[i], c[i]);
        }

        out.print(res);
    }

    private int rec(int[] c, int at, boolean[] mark, int l, int r, int x, int max, int min, int sum) {

        if (sum > r) return 0;

        int res = 0;
        if (max - min >= x && sum >= l && sum <= r) ++res;

        for (int i = at; i < c.length; ++i) {
            if (mark[i]) continue;
            res += rec(c, i + 1, mark, l, r, x, Math.max(max, c[i]), Math.min(min, c[i]), sum + c[i]);
        }

        return res;
    }
}
