package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        int energy = 0;
        int res = a[0];
        for (int i = 1; i < n; ++i) {
            energy += a[i - 1] - a[i];
            if (energy < 0) {
                res += Math.abs(energy);
                energy = 0;
            }
        }
        out.print(res);
    }
}
