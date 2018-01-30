package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String s = in.next();
        boolean[] ignore = new boolean[n];
        StringBuilder res = new StringBuilder();

        for (int i = n - 2; i >= 0; --i) {
            res.append(s.charAt(i));
            ignore[i] = true;
            if (i > 1) {
                --i;
            }
        }

        for (int i = 0; i < n; ++i) {
            if (ignore[i]) continue;
            res.append(s.charAt(i));
        }


        /*

            abcd[e]fghi
            abc[d]fghi
            abc[f]ghi
            ab[c]ghi
            ab[g]hi
            a[b]hi
            a[h]i
            [a]i
            [i]

            [e]
            [ed]
            [edf]
            [edfc]
            [edfcg]
            [edfcgb]
            [edfcgbh]
            [edfcgbha]
            [edfcgbhai]
         */

        out.print(res.toString());
    }
}
