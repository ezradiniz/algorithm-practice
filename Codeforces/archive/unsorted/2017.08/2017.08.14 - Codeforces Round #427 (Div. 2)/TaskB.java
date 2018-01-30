package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int k = in.nextInt();
        char[] n = in.next().toCharArray();
        long sum = 0;
        for (int i = 0; i < n.length; ++i) sum += n[i] - '0';
        if (sum >= k) {
            out.print("0");
            return;
        }
        int res = 0;
        Arrays.sort(n);
        for (int i = 0; i < n.length; ++i) {
            int d = n[i] - '0';
            if (d < 9) {
                if (sum >= k) {
                    out.print(res);
                    return;
                }
                sum += 9 - d;
                ++res;
            }
        }

        out.print(res);
    }
}
