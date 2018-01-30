package solutions;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Set;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        char[] a = in.next().toCharArray();

        String res = null;
        for (int t = 0; t < 10; ++t) {

            for (int i = 0; i < n; ++i) {
                a[i] = (char) ((((a[i] - '0') + 1) % 10) + '0');
            }

            ArrayList<Integer> zeros = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                if (a[i] == '0') {
                    zeros.add(i);
                }
            }

            if (zeros.size() == 0) continue;

            for (Integer start : zeros) {
                StringBuilder sb = new StringBuilder();
                for (int i = start; i < start + n; ++i) {
                    sb.append(a[i % n]);
                }

                if (res == null) res = sb.toString();
                else {
                    for (int i = 0; i < n; ++i) {
                        if (sb.charAt(i) == res.charAt(i)) continue;
                        if (sb.charAt(i) < res.charAt(i)) {
                            res = sb.toString();
                        }
                        break;
                    }
                }
            }
        }

        out.print(res);
    }
}
