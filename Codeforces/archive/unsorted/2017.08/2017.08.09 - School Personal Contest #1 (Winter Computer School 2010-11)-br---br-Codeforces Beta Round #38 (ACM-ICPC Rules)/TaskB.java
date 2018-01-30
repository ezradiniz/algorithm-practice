package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        String x = in.next();
        int rx = x.charAt(0) - 'a';
        int ry = x.charAt(1) - '0' - 1;

        String y = in.next();
        int kx = y.charAt(0) - 'a';
        int ky = y.charAt(1) - '0' - 1;

        boolean[][] grid = new boolean[8][8];

        for (int i = 0; i < 8; ++i) {
            grid[rx][i] = true;
            grid[i][ry] = true;
        }

        if (ry + 2 < 8 && rx - 1 >= 0) {
            grid[rx - 1][ry + 2] = true;
        }

        if (ry + 1 < 8 && rx - 2 >= 0) {
            grid[rx - 2][ry + 1] = true;
        }

        if (ry - 1 >= 0 && rx - 2 >= 0) {
            grid[rx - 2][ry - 1] = true;
        }

        if (ry - 2 >= 0 && rx - 1 >= 0) {
            grid[rx - 1][ry - 2] = true;
        }

        if (ry - 2 >= 0 && rx + 1 < 8) {
            grid[rx + 1][ry - 2] = true;
        }

        if (ry - 1 >= 0 && rx + 2 < 8) {
            grid[rx + 2][ry - 1] = true;
        }

        if (ry + 1 < 8 && rx + 2 < 8) {
            grid[rx + 2][ry + 1] = true;
        }

        if (ry + 2 < 8 && rx + 1 < 8) {
            grid[rx + 1][ry + 2] = true;
        }

        grid[kx][ky] = true;
        grid[rx][ry] = true;

        if (ky + 2 < 8 && kx - 1 >= 0) {
            grid[kx - 1][ky + 2] = true;
        }

        if (ky + 1 < 8 && kx - 2 >= 0) {
            grid[kx - 2][ky + 1] = true;
        }

        if (ky - 1 >= 0 && kx - 2 >= 0) {
            grid[kx - 2][ky - 1] = true;
        }

        if (ky - 2 >= 0 && kx - 1 >= 0) {
            grid[kx - 1][ky - 2] = true;
        }

        if (ky - 2 >= 0 && kx + 1 < 8) {
            grid[kx + 1][ky - 2] = true;
        }

        if (ky - 1 >= 0 && kx + 2 < 8) {
            grid[kx + 2][ky - 1] = true;
        }

        if (ky + 1 < 8 && kx + 2 < 8) {
            grid[kx + 2][ky + 1] = true;
        }

        if (ky + 2 < 8 && kx + 1 < 8) {
            grid[kx + 1][ky + 2] = true;
        }



        int res = 0;
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                if (!grid[i][j]) ++res;
            }
         }

        out.print(res);
    }
}
