package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int t = in.nextInt();
        char[] q = in.next().toCharArray();

        //NAIVE SOLUTION
        for (int T = 0; T < t; ++T) {
            char prev = q[0];
            boolean hasChange = false;
            for (int i = 1; i < n; ++i) {
                char cur = q[i];
                if (prev == 'B' && cur == 'G') {
                    char tmp = q[i - 1];
                    q[i - 1] = q[i];
                    q[i] = tmp;
                    hasChange = true;
                }
                prev = cur;
            }
            if (!hasChange) break;
        }

        for (Character c : q) {
            out.print(c);
        }
        out.println();
    }
}
