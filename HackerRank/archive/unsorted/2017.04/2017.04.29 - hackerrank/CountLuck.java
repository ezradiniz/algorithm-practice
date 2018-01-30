package solutions;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class CountLuck {

    private boolean found;

    static class Vertice {
        char field;
        boolean visited = false;
        public Vertice(char field) {
            this.field = field;
        }

    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        for (int x  = 0; x < t; ++x) {
            int n = in.nextInt();
            int m = in.nextInt();

            int a = 0,
                b = 0;

            Vertice[][] forest = new Vertice[n][m];
            for (int i = 0; i < n; i++) {
                char[] row = in.next().toCharArray();
                for (int j = 0; j < m; j++) {
                    forest[i][j] = new Vertice(row[j]);
                    if (row[j] == 'M') {
                        a = i;
                        b = j;
                    }
                }
            }

            int k = in.nextInt();
            found = false;
            int res = wandTimesValid(forest, a, b, n, m);
            if (res == k) out.println("Impressed");
            else out.println("Oops!");
        }
    }
    private int wandTimesValid(Vertice[][] forest, int x, int y, int n, int m) {
        if (x < 0 || x >= n || y < 0 || y >= m) return 0;
        Vertice v = forest[x][y];
        if (v.visited) return 0;
        if (v.field == 'X') return 0;
        v.visited = true;

        if (v.field == '*') {
            found = true;
            return 0;
        }

        int r = hasPath(forest, x, y, n, m);

        if (!found) {
            r += wandTimesValid(forest, x+1, y, n, m);
        }

        if (!found) {
            r += wandTimesValid(forest, x, y+1, n, m);
        }
        if (!found) {
            r += wandTimesValid(forest, x-1, y, n, m);
        }
        if (!found) {
            r += wandTimesValid(forest, x, y-1, n, m);
        }

        return r;
    }

    private int hasPath(Vertice[][] forest, int x, int y, int n, int m) {
        int count = 0;
        if (x -1 >= 0 && forest[x-1][y].field != 'X' && !forest[x-1][y].visited) count++;
        if (x+1 < n && forest[x+1][y].field != 'X' && !forest[x+1][y].visited) count++;
        if (y -1 >= 0 && forest[x][y-1].field != 'X' && !forest[x][y-1].visited) count++;
        if (y+1 < m  && forest[x][y+1].field != 'X' && !forest[x][y+1].visited) count++;

        return (count > 1) ? 1 : 0;
    }
}
