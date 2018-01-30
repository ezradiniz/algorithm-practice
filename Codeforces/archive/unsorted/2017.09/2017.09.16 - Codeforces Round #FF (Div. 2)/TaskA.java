package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int p = in.nextInt();
        int n = in.nextInt();
        boolean[] a = new boolean[300];

        for (int i = 0; i < n; ++i) {
            int x = in.nextInt();
            if (a[x % p ]) {
                out.print(i + 1);
                return;
            }
            a[x % p ] = true;
        }

        out.print("-1");
    }
}
