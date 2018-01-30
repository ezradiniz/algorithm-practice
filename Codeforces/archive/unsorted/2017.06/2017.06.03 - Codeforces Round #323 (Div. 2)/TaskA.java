package solutions;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        boolean[][] roads = new boolean[n][2];
        for (int i = 0; i < n * n; ++i) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;

            if (!roads[x][0] && !roads[y][1]) {
                roads[x][0] = true;
                roads[y][1] = true;
                out.print(i + 1 + " ");
            }
        }
    }
}
