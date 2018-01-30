package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        char[] s = in.next().toCharArray();
        int res = 0;
        for (int i = 0; i < n; ++i) {
            if (s[i] == '1') {
                ++res;
            } else {
                out.print(res);
                res = 0;
            }
        }
        out.print(res);
    }
}
