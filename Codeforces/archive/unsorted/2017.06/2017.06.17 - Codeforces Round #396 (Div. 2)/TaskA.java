package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String a = in.next();
        String b = in.next();

        if (a.length() > b.length()) {
            out.print(a.length());
            return;
        }

        if (b.length() > a.length()) {
            out.print(b.length());
            return;
        }

        for (int i = 0; i < a.length(); ++i) {
            char ch1 = a.charAt(i);
            char ch2 = b.charAt(i);
            if (ch1 != ch2) {
                out.print(a.length());
                return;
            }
        }

        out.print(-1);
    }
}
