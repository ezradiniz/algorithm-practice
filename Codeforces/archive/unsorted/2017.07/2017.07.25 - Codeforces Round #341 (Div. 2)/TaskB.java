package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        boolean[][] grid = new boolean[1000][1000];
        for (int i = 0; i < n; ++i) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            grid[x][y] = true;
        }
        int res = 0;

        int N = grid.length;

        // diagonal
        int d1 = 0, d2 = 0;
        for (int i = 0; i < N; ++i) {
            if (grid[i][i]) ++d1;
            if (grid[i][N - i - 1]) ++d2;
        }
        res += d1 * (d1 - 1) / 2;
        res += d2 * (d2 - 1) / 2;

        // half 1
        for (int j = 1; j < N - 1; ++j) {
            int da = 0;
            int db = 0;
            for (int i = 0, colA = j, colB = N - j - 1; i < N - 1 && colA >= 0; ++i, --colA, ++colB) {
                if (grid[i][colA]) ++da;
                if (grid[i][colB]) ++db;
            }
            res += da * (da - 1) / 2;
            res += db * (db - 1) / 2;
        }

        // half 2
        for (int j = 1; j < N - 1; ++j) {
            int da = 0;
            int db = 0;
            for (int i = N - 1, colA = j, colB = N - j - 1; i > 0 && colA >= 0; --i, --colA, ++colB) {
                if (grid[i][colA]) ++da;
                if (grid[i][colB]) ++db;
            }
            res += da * (da - 1) / 2;
            res += db * (db - 1) / 2;
        }

        out.print(res);

    }
}
