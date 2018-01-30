package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class MaximizingXOR {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int l = in.nextInt();
        int r = in.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i=l; i<=r; i++) {
            for (int j=i; j<=r; j++) {
                max = Math.max(max, i ^ j);
            }
        }
        out.print(max);
    }
}
