package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();

        int i = s.indexOf("AB");
        if (i != -1 && s.substring(i + 2).contains("BA")) {
            out.print("YES");
            return;
        }

        i = s.indexOf("BA");
        if (i != -1 && s.substring(i + 2).contains("AB")) {
            out.print("YES");
            return;
        }

        out.print("NO");
    }
}
