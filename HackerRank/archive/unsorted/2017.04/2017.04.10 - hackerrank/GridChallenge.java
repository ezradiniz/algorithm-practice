package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class GridChallenge {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        for (int a0=0; a0<t; ++a0) {
            int n = in.nextInt();
            char[][] grid = new char[n][n];
            for (int i=0; i<n; i++) {
                grid[i] = in.next().toCharArray();
            }

            String res = isPossible(grid);
            out.println(res);
        }
    }

    /* Lazy algorithm */
    private String isPossible(char[][] grid) {
        Arrays.sort(grid[0]);
        for (int i=1; i<grid.length; i++) {
            Arrays.sort(grid[i]);
            for (int j=0; j<grid.length; j++) {
                if (grid[i][j] < grid[i-1][j]) return "NO";
            }
        }

        return "YES";
    }
}
