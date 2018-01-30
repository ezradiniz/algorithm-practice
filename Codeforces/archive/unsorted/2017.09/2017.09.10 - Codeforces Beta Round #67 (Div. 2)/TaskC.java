package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TaskC {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        List<Integer> pre = new ArrayList<>();
        for (int i = a; i < b + 1; ++i) {
            for (int j = i; j < b + 1; ++j) {
                pre.add(gcd(i, b));
            }
        }

        Collections.sort(pre);

        for (int it = 0; it < n; ++it) {
            int low = in.nextInt();
            int high = in.nextInt();
            int res = bSearch(pre, low, high);
            if (res == -1) out.println(res);
            else out.println(pre.get(res));
        }
    }

    private int bSearch(List<Integer> pre, int low, int high) {
        int max = -1;
        int l = 0;
        int r = pre.size() - 1;
//        while (l <= r) {
//            int m =  (l + r) / 2;
//            if (pre.get(m) >= pre.get(low) && m <= pre.get(high)) {
//                max = Math.max(max, pre.get(m));
//            }
//        }
        return -1;
    }

    private int gcd(int a, int b) {
        while (b > 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
