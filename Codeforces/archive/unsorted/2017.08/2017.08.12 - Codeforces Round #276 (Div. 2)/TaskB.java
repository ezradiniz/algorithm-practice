package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class TaskB {

    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        long maxL = 0;
        long maxR = 0;
        long maxT = 0;
        long maxD = 0;
        for (int i = 0; i < n; ++i) {
            long x = in.nextLong();
            long y = in.nextLong();
            if (i == 0) {
                maxL = x;
                maxR = x;
                maxD = y;
                maxT = y;
            }

            maxL = Math.min(maxL, x);
            maxR = Math.max(maxR, x);
            maxT = Math.max(maxT, y);
            maxD = Math.min(maxD, y);
        }
        long l = Math.abs(maxR - maxL);
        long r = Math.abs(maxT - maxD);
        out.print(Math.max(l, r) * Math.max(l, r));
    }
}
