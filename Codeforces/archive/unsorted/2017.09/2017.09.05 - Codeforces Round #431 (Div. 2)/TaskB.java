package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int[][] y = new int[n][2];
        for (int i = 0; i < n; ++i) {
            y[i][0] = i + 1;
            y[i][1] = in.nextInt();
        }

        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++i) {

            }
        }
    }

    private double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
