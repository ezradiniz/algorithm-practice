package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String stones = in.next();
        char prev = stones.charAt(0);
        int count = n;
        for (int i = 1; i < n; ++i) {
            char cur = stones.charAt(i);
            if (prev == cur) count--;
            prev = cur;
        }
        out.println(n-count);
    }
}
