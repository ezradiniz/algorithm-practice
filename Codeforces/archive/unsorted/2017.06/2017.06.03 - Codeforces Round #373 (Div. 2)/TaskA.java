package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String next = "-1";
        int prev = in.nextInt();
        if (prev == 0) next = "UP";
        else if (prev == 15) next = "DOWN";
        for (int i = 1; i < n; ++i) {
           int cur = in.nextInt();
           if (cur == 0) next = "UP";
           else if (cur == 15) next = "DOWN";
           else if (cur > prev) next = "UP";
           else next = "DOWN";
           prev = cur;
        }
        out.print(next);
    }
}
