package solutions;

import java.util.*;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt(); // j type
        int m = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[m + 1];
        for (int i = 0; i < m + 1; ++i) {
            a[i] = in.nextInt();
        }
        int res = 0;
        for (int i = 0; i < m; ++i) {
            int diff = a[i] ^ a[m];
            int count = 0;
            while (diff != 0)  {
                count += diff & 1;
                diff >>= 1;
            }
            if (count <= k) res++;
        }
        out.print(res);
    }
}
