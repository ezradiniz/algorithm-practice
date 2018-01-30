package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String aa = in.next();
        String bb = in.next();

        int n = aa.length();

        int a = 0;
        int b = 0;
        for (int i = 0; i < n; ++i) {
            int d1 = aa.charAt(i) - '0';
            int d2 = bb.charAt(i) - '0';
            if (d1 == 4 && d2 == 7) ++a;
            if (d1 == 7 && d2 == 4) ++b;
        }

        out.print(Math.max(a, b));
    }
}
