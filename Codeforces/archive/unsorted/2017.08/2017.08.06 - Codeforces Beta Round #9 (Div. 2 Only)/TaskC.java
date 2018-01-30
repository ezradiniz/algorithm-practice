package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        long n = in.nextInt();
        for (int i = 1; i < (1 << 10); ++i) {
            String s = Long.toBinaryString(i);
            if (Long.parseLong(s) > n) {
                out.print(i - 1);
                return;
            }
        }
    }
}
