package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; ++i) {
            grid[i] = in.next().toCharArray();
        }
        int res = 0;

        for (int i = 0; i < n; ++i) {
            res = Math.max(res, getCountOfRowIsEquals(grid, grid[i], i, n));
        }

        out.print(res);
    }

    private int getCountOfRowIsEquals(char[][] grid, char[] row, int start, int n) {
        int res = 0;
        for (int i = start; i < n; ++i) {
            boolean isValid = true;
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] != row[j]) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) ++res;
        }
        return res;
    }
}
