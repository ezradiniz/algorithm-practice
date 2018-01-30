package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; ++i) x[i] = in.nextInt();
        for (int i = 0; i < n; ++i) {
            String res = getDistance(x, i);
            out.println(res);
        }
    }

    private String getDistance(int[] x, int i) {

        if (i > 0 && i + 1 < x.length) {
            int min = Math.min(diff(x[i-1], x[i]) ,diff(x[i], x[i + 1]));
            int max = Math.max(diff(x[i], x[x.length-1]), diff(x[i], x[0]));
            return min + " " + max;
        }

        if (i == 0) {
            int min = diff(x[i], x[i+1]);
            int max = diff(x[i], x[x.length-1]);
            return min + " " + max;
        }


        int min = diff(x[i], x[i-1]);
        int max = diff(x[0], x[i]);
        return min + " " + max;
    }

    private int diff(int a, int b) {
        if (a <= 0 && b <= 0) {
            return Math.abs(Math.abs(a) - Math.abs(b));
        } else if (a >= 0 && b >= 0) {
            return Math.abs(a - b);
        } else {
            return Math.abs(a) + Math.abs(b);
        }
    }
}
