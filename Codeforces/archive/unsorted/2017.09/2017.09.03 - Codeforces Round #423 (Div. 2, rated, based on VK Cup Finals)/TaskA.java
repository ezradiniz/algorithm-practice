package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int res = 0;
        int c = 0;

        for (int i = 0; i < n; ++i) {
            int t = in.nextInt();
            if (t == 2) {
                if (b > 0) --b;
                else res += 2;
            } else {
                if (a > 0) {
                    --a;
                } else if (b > 0) {
                    --b;
                    ++c;
                } else if (c > 0) {
                    --c;
                } else {
                    ++res;
                }
            }
        }

        out.print(res);
    }
}
