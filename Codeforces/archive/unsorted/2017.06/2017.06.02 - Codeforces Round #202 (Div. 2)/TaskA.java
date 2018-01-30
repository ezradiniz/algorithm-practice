package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int r25 = 0;
        int r50 = 0;
        for (int i = 0; i < n; ++i) {
            int m = in.nextInt();

            if (m == 50) {
                r25 -= 25;
            } else if (m == 75) {
                if (r50 > 0) {
                    r50 -= 50;
                } else {
                    r25 -= 50;
                }
            } else if (m == 100) {
                if (r50 > 0) {
                    r50 -= 50;
                    r25 -= 25;
                } else {
                    r25 -= 75;
                }
            }

            if (r25 < 0|| r50 < 0) {
                out.print("NO");
                return;
            }

            if (m == 25) r25 += 25;
            if (m == 50) r50 += 50;
        }

        out.print("YES");
    }
}
