package solutions;

import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Set;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        String[] students = new String[n];
        for (int i = 0; i < n; ++i) {
            students[i] = in.next();
        }

        Set<Integer> success = new HashSet<>();
        for (int j = 0; j < m; ++j) {
            int max = 0;
            for (int i = 0; i < n; ++i) {
                int v = students[i].charAt(j) - '0';
                if (v > max) {
                    max = v;
                }
            }

            for (int i = 0; i < n; ++i) {
                int v = students[i].charAt(j) - '0';
                if (v == max) {
                    success.add(i);
                }
            }
        }
        out.print(success.size());
    }
}
