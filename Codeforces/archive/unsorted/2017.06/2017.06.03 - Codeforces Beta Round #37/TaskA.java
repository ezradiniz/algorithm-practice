package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] tower = new int[1001];
        for (int i = 0; i < n; ++i) {
            tower[in.nextInt()]++;
        }
        int total = 0;
        int h = 0;
        for (int i = 0; i < 1001; ++i) {
            h = Math.max(h, tower[i]);
            if (tower[i] > 0) ++total;
        }
        out.print(h + " " + total);
    }
}
