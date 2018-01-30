package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int vb = in.nextInt();
        int vs = in.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; ++i) {
            x[i] = in.nextInt();
        }
        int u = in.nextInt();
        int v = in.nextInt();

        int res = -1;
        double min = Double.MAX_VALUE;
        double close = Double.MAX_VALUE;
        for (int i = 1; i < n; ++i) {
            double t1 = distance(x[i], 0, 0, 0);
            double t2 = distance(x[i], 0, u, v);
            double t3 = t1 / vb + t2 / vs;
            if (t3 <= min && t2 < close) {
                res = i + 1;
                min = t3;
                close = t2;
            }
        }
        if (res == -1) throw new RuntimeException();

        out.print(res);
    }

    private double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
