package solutions;

import java.util.*;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }

        int[] res = new int[n];
        Set<Integer> set = new HashSet<>();
        for (int i= n - 1; i >= 0; --i) {
            set.add(a[i]);
            res[i] = set.size();
        }

        for (int i = 0; i < m; ++i) {
            int l = in.nextInt();
            out.println(res[l - 1]);
        }
    }
}
