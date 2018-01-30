package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String n = in.next();
        int k = in.nextInt();
        if (n.length() < k + 1) {
            out.print(n.length() - 1);
        } else {
            int count = 0;
            int zero = 0;
            for (int i = n.length() - 1; i > 0; --i) {
                char ch = n.charAt(i);
                if (ch != '0') ++count;
                if (ch == '0') ++zero;
                if (zero >= k) break;
            }
            if (count == 0 || n.length() - count >= k + 1 && zero >= k) {
                out.print(count);
            } else {
                out.print(n.length() - 1);
            }
        }
    }
}
