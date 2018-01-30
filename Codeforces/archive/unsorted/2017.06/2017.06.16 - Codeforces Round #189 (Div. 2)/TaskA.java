package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String n = in.next();
        char prev = '\0';
        int count = 0;
        for (int i = 0; i < n.length(); ++i) {
            if (i == 0) {
                prev = n.charAt(i);
                if (prev != '1') {
                    out.println("NO");
                    return;
                }
                continue;
            }

            char cur = n.charAt(i);
            if (cur != '1' && cur != '4') {
                out.println("NO");
                return;
            }
            if (cur == '4' && prev == '4') {
                ++count;
            } else {
                count = 0;
            }

            if (count > 1) {
                out.println("NO");
                return;
            }

            prev = cur;
        }

        out.println("YES");
    }
}
