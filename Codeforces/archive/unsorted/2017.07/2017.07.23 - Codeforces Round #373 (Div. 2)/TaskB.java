package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String s = in.next();
        int r = 0;
        int b = 0;

        for (int i = 0; i < s.length(); ++i) {
            char chr = s.charAt(i);
            if (i % 2 == 1) {
                if (chr != 'r') ++b;
            } else {
                if (chr != 'b') ++r;
            }
        }

        int res = Math.abs(r - b) + Math.min(r, b);

        r = 0;
        b = 0;

        for (int i = 0; i < n; ++i) {
            char chr = s.charAt(i);
            if (i % 2 == 1) {
                if (chr != 'b') ++r;
            } else {
                if (chr != 'r') ++b;
            }
        }

        res = Math.min(res, Math.abs(r - b) + Math.min(r, b));
        out.print(res);

    }
}
