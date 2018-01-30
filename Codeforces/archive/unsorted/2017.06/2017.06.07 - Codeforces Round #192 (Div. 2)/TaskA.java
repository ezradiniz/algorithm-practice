package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int r = in.nextInt();
        int c = in.nextInt();

        char[][] grid = new char[r][c];

        for (int i = 0; i < r; ++i) {
            String s = in.next();
            for (int j = 0; j < c; ++j) {
                grid[i][j] = s.charAt(i);
            }
        }

        int res = r * c;

        for (int i = 0; i < r; ++i) {
            boolean isEvil = false;
            for (int j = 0; j < c; ++j) {
                if (grid[i][j] == 'S')  {
                    isEvil = true;
                    break;
                }
            }
            if (isEvil) res -= c;
        }


        for (int j = 0; j < c; ++j) {
            boolean isEvil = false;
            for (int i = 0; i< r; ++i) {
                if (grid[i][j] == 'S') {
                    isEvil = true;
                    break;
                }
            }
            if (isEvil) res -= Math.abs(r - c);
        }

        out.print(res);
    }

}
