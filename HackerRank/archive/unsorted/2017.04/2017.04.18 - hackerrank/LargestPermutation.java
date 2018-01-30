package solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.PrintWriter;

public class LargestPermutation {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        long k = in.nextLong();
        int[] a = new int[n];
        int[] index = new int[n+1];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
            index[a[i]] = i;
        }

        for (int i=0; i<n; i++) {
            if (a[i] != n-i) {

                a[index[n-i]] = a[i];
                index[a[i]] = index[n-i];
                a[i] = n-i;
                index[n-i] = i;
                k--;
            }
            if (k == 0) break;
        }

        for (int i=0; i<n; i++) {
            out.print(a[i] + " ");
        }
     }
}
