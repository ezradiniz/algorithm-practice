package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        double min = Double.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            int x = in.nextInt();
            int y = in.nextInt();
            int v  = in.nextInt();

            double res = distance(a, b, x, y) / v;

            min = Math.min(min, res);
        }
        out.print(String.format("%.20f", min));
    }

    private double distance(int a, int b, int x, int y) {
        return Math.sqrt(Math.pow(a-x, 2) + Math.pow(b-y, 2));
    }
}
