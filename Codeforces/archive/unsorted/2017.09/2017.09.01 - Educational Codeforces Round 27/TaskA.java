package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[2 * n];
        for (int i = 0; i < a.length; ++i) a[i] = in.nextInt();
        Arrays.sort(a);
        for (int i = 0; i < a.length / 2; ++i) {
            if (a[i] >= a[a.length - i - 1]) {
                out.print("NO");
                return;
            }
        }
        out.print("YES");
    }
}
