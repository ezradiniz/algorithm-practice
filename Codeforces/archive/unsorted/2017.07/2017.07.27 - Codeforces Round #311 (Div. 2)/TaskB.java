package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        double w = in.nextInt();

        double[] a = new double[n << 1];
        for (int i = 0; i < a.length; ++i) {
            a[i] = in.nextDouble();
        }

        Arrays.sort(a);
        double res = Math.min(a[0], a[n] / 2.0);
        res *= 3 * n;
        res = Math.min(res, w * 1.0);
        out.print(String.format("%.10f", res));
    }
}
