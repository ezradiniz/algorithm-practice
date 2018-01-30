package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        char[] n = in.next().toCharArray();
        for (int i = 0; i < n.length; ++i) {
            int t = n[i] - '0';
            if (t >= 5) {
                char c = (char) ((9 - t) + '0');
                if (i == 0 && c != '0' || i > 0) {
                    n[i] = c;
                }
            }
        }
        out.print(new String(n));
    }
}
