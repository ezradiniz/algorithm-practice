package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String lucky = in.next();
        int left = 0;
        int right = 0;

        for (int i = 0; i < n / 2; ++i) {
            int l = lucky.charAt(i) - '0';
            int r = lucky.charAt(n - i - 1) - '0';
            if ((l == 4 || l == 7) && (r == 4 || r == 7)) {
                left += l;
                right += r;
            } else {
                out.print("NO");
                return;
            }
        }

        if (left == right) {
            out.print("YES");
        } else {
            out.print("NO");
        }
    }
}
