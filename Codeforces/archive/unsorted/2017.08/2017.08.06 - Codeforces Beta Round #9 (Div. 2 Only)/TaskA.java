package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int y = in.nextInt();
        int w = in.nextInt();
        int max = Math.max(y, w) - 1;
        if (6 - max <= 0) {
            out.print("0/1");
            return;
        }
        int div = gcd(6 - max, 6);
        out.print(((6 - max) / div) + "/" + (6 / div));
    }

    private int gcd(int a, int b) {
        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
