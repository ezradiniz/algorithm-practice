package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        long n = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();

        if (n % 4 == 0) {
            out.print("0");
            return;
        }

        long k = 4 - (n % 4);

        if (k == 1) {
            long t1 = b + c;
            t1 = Math.min(t1, 3*c);
            if (a < t1) out.print(a);
            else out.print(t1);
        } else if (k == 2) {
            long t1 = 0;
            if (c > 3*a) t1 = a*6;
            else t1 = c*2;
            t1 = Math.min(t1, a*2);
            if (t1 < b) out.print(t1);
            else out.print(b);
        } else {
            long t1 = b + a;
            t1 = Math.min(t1, a*3);
            if (t1 < c) out.print(t1);
            else out.print(c);
        }
    }
}
