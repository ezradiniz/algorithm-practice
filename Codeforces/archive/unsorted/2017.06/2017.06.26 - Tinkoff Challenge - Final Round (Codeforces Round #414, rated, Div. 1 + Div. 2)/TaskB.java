package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int h = in.nextInt();

        for (int i = 0; i < n - 1; ++i) {
            double res = h * Math.sqrt((i + 1.0) / n);
            out.print(String.format("%.12f", res) + " ");
        }
    }
}
