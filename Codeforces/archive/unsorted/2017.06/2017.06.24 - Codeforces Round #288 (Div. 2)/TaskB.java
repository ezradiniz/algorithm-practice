package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        char[] n = in.next().toCharArray();
        int j = -1;
        for (int i = 0; i < n.length; ++i) {
            if (n[i] % 2 == 0) {
                j = i;
                if (n[i] < n[n.length - 1]) break;
            }
        }

        if (j == -1) {
            out.print(j);
        } else {
            char tmp = n[j];
            n[j] = n[n.length -1];
            n[n.length - 1] = tmp;
            for (Character c : n) out.print(c);
        }
    }
}
