package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        int s = in.nextInt();
        int x = in.nextInt();

        if (t == x) {
            out.print("YES");
            return;
        }

        while (true) {
            t += s;
            if (t == x || t + 1 == x) {
                out.print("YES");
                return;
            }
            if (t > x) {
                out.print("NO");
                return;
            }
        }
    }
}
