package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        //naive solution
        int[][] t = new int[n][n];
        Arrays.fill(t[0], 1);
        for (int i = 1; i < n; ++i) {
            t[i][0] = 1;
            for (int j = 0; j < n-1; ++j) {
                t[i][j + 1] = t[i][j] + t[i-1][j + 1];
            }
        }
        out.print(t[n-1][n-1]);
    }
}
