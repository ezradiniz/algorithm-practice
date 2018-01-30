package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int sx = 0,
            sy = 0,
            sz = 0;
        for (int i = 0; i < n; ++i) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            sx += x;
            sy += y;
            sz += z;
        }

        if (sx  == 0 && sy == 0 && sz == 0) {
            out.println("YES");
        } else {
            out.println("NO");
        }
    }
}
