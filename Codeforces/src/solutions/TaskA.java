package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int x = in.nextInt();
        boolean[] set = new boolean[101];
        for (int i = 0; i < n; ++i) set[in.nextInt()] = true;
        int res = 0;
        for (int i = 0; i < x; ++i) {
            if (!set[i]) ++res;
        }
        if (set[x]) ++res;

        out.print(res);
    }
}
