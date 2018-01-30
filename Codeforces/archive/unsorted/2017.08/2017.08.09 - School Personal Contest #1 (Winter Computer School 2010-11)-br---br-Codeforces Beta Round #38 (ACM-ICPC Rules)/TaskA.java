package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int[] d = new int[n - 1];
        for (int i = 0; i < n - 1; ++i) d[i] = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int res = 0;
        for (int i = a - 1; i < b - 1; ++i) res += d[i];
        out.print(res);
    }
}
