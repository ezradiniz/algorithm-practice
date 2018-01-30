package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TheGridSearch {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();

        for (int ts=0; ts<t; ++ts) {

            int r = in.nextInt();
            int c = in.nextInt();

            char[][] grid = new char[r][c];
            for (int i=0; i<r; ++i) {
                grid[i] = in.next().toCharArray();
            }

            int m = in.nextInt();
            int n = in.nextInt();

            char[][] pattern = new char[m][n];
            for (int i=0; i<m; ++i) {
                pattern[i] = in.next().toCharArray();
            }

            String res = searchPattern(grid, pattern);
            out.println(res);
        }
    }

    private String searchPattern(char[][] grid, char[][] pattern) {
        int r = grid.length;
        int c = grid[0].length;
        int m = pattern.length;
        int n = pattern[0].length;

        if (r == m && c == n) return "YES";

        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                if (grid[i][j] == pattern[0][0]) {
                    boolean res = search(grid, pattern, r, c, m, n, i, j);
                    if (res) return "YES";
                }
            }
        }

        return "NO";
    }

    private boolean search(char[][] grid, char[][] pattern, int r, int c, int m, int n, int x, int y) {
        int a = 0;
        int b = 0;
        int pos = y;
        for (int i = x; i < r; ++i) {
            int p = c - 1;
            for (int j = pos; j < c; ++j) {
                if (grid[i][j] == pattern[a][b]) {
                    b++;
                    p = Math.min(p, j);
                } else {
                   return false;
                }
                if (b == n) {
                    break;
                }
            }
            if (b == n) {
                b = 0;
                a++;
                pos = p;
            } else {
                return false;
            }
            if (a == m) {
                return true;
            }
        }
        return false;
    }
}
