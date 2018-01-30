package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class MinimumAbsoluteDifference {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; ++i) {
            arr[i] = in.nextInt();
        }
        int min = Integer.MAX_VALUE;

        Arrays.sort(arr);
        for (int i=1; i<n; i++) {
            min = Math.min(min, Math.abs(arr[i]-arr[i-1]));
            min = Math.min(min, Math.abs(arr[n-i-1] - arr[n-i]));
        }

        out.print(min);
    }
}
