package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        Set<Integer> s = new HashSet<>();

        int x = 0;
        int y = 0;
        for (int i = 0; i < 100; ++i) {
            if (s.contains(b + x)) break;
            s.add(b + x);
            if (s.contains(d + y)) break;
            s.add(d + y);
            x += a;
            y += c;
            if (i == 99) {
                out.print("-1");
                return;
            }

            if (i == 0) {
                x = a;
                y = c;
            }
        }
        out.print(Math.min(d + y, b + x));
    }
}
