package solutions;

import java.util.*;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        int k1 = in.nextInt();
        List<Integer> d1 = new LinkedList<>();
        for (int i = 0; i < k1; ++i) {
            d1.add(in.nextInt());
        }

        int k2 = in.nextInt();
        List<Integer> d2 = new LinkedList<>();
        for (int i = 0; i < k2; ++i) {
            d2.add(in.nextInt());
        }

        int res = 0;

        for (int i = 0; i < 1000; ++i) {
            if (d1.size() == 0 || d2.size() == 0) break;

            int a = d1.remove(0);
            int b = d2.remove(0);

            if (a > b) {
                d1.add(b);
                d1.add(a);
            } else {
                d2.add(a);
                d2.add(b);
            }

            ++res;
        }

        if (d1.size() == 0) {
            out.print(res + " " + 2);
        } else if (d2.size() == 0) {
            out.print(res + " " + 1);
        } else {
            out.print(-1);
        }
    }
}
