package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();

        int x = n;
        int y = 1;
        int count = 1;
        for (int i = 1; i <= n; ++i) {
            if (count <= k && i % 2 == 0) {
                out.print(x + " ");
                --x;
                ++count;
            } else {
                if (count > k && k % 2 == 0) {
                    out.print(x + " ");
                    --x;
                }else {
                    out.print(y + " ");
                    ++y;
                    ++count;
                }
            }
        }
    }
}
