package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        long ax = in.nextLong();
        long ay = in.nextLong();
        long bx = in.nextLong();
        long by = in.nextLong();
        long cx = in.nextLong();
        long cy = in.nextLong();

        long dis1 = dis(ax, ay, bx, by);
        long dis2 = dis(bx, by, cx, cy);

        long k1 = (ax - bx) * (by - cy);
        long k2 = (bx - cx) * (ay - by);

        if (dis1 == dis2 && k1 != k2) {
            out.print("Yes");
        } else {
            out.print("No");
        }
    }

    private long dis(long ax, long ay, long bx, long by) {
        return (ax - bx) * (ax - bx) + (ay - by) * (ay - by);
    }
}
