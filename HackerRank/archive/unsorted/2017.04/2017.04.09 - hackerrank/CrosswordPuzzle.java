package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class CrosswordPuzzle {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String[][] grid = new String[10][10];

        for (int i=0; i<10; i++) {
            grid[i] = in.next().split("");
        }

        String[] words = in.next().split(";");

        fillGrid(grid, words);

        for (int i=0; i<grid.length; ++i) {
            for (int j=0; j<grid.length; ++j) {
                out.print(grid[i][j]);
            }
            out.println();
        }
    }

    private void fillGrid(String[][] grid, String[] words) {
        Arrays.sort(words);

    }
}
