package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class MaxMin {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }

        Arrays.sort(a);

        int res = Integer.MAX_VALUE;

        for (int i=0; i<(n-k)/2; i++) {
            res = Math.min(res, Math.min(a[i+k-1] - a[i], a[n-i-1] - a[n-i-k]));
        }

        out.print(res);
    }
}
