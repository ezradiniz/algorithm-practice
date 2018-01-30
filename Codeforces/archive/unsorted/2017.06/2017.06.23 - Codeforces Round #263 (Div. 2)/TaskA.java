package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String s = "";
        for (int i = 0; i < n; ++i) {
            s += in.next();
        }

        for (int i = 0; i < s.length() / 2; ++i) {
            if (s.charAt(i) != s.charAt(s.length() - i -1)) {
                out.print("NO");
                return;
            }
        }
        out.print("YES");
    }
}
