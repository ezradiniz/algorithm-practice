package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();
        int res = 0;

        int cur = 0;
        for (int i = 0; i < s.length(); ++i) {
            int ch = s.charAt(i) - 'a';

            res += Math.min(Math.abs(ch - cur), 26 - Math.abs(ch - cur));

            cur = ch;
        }

        out.print(res);
    }
}
