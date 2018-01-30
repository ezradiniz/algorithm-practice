package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TheMaximumSubarray {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        for (int t = in.nextInt(); t >= 1; t--) {
            int n = in.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; ++i) {
                a[i] = in.nextInt();
            }

            int maxA = 0;
            int maxB = 0;
            int max = a[0];

            int sum = 0;
            for (int i = 0; i < n; ++i) {
                if (a[i] > 0) maxB += a[i];

                sum += a[i];

                if (sum < 0) sum = 0;

                maxA = Math.max(maxA, sum);
                
                max = Math.max(max, a[i]);
            }


            if (maxA == 0) {
                out.println(max + " " + max);
            } else {
                out.println(maxA + " " + maxB);
            }
        }
    }
}
