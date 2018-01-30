package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int l = in.nextInt();
        int r = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int k = in.nextInt();

        for (int i = l; i <= r; ++i) {
            if (i % k != 0) continue;
            int j = i / k;
            if (x <= j && j <= y) {
                out.print("YES");
                return;
            }
        }
        out.print("NO");
    }
}
