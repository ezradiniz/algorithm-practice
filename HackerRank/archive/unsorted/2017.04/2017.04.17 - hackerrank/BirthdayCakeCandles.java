package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class BirthdayCakeCandles {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] c = new int[n];
        int max = 0;
        int res = 0;
        for (int i=0; i<n; i++) {
            c[i] = in.nextInt();
            if (c[i] > max) {
                max = c[i];
                res = 1;
            } else if (c[i] == max) res++;
        }
        out.print(res);
    }
}
