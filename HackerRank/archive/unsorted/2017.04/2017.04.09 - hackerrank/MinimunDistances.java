package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class MinimunDistances {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; ++i) {
            arr[i] = in.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int i=0; i<n; ++i) {
            for (int j=i+1; j<n; ++j) {
                if (arr[i] == arr[j]) min = Math.min(min, j-i);
            }
        }

        out.print((min != Integer.MAX_VALUE) ? min : -1);
    }
}
