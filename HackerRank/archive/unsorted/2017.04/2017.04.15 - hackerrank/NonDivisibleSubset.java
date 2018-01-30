package solutions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;

public class NonDivisibleSubset {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        long[] a = new long[n];
        for (int i=0; i<n; i++) {
            a[i] = in.nextLong();
        }

        long[] r = new long[n];
        for (int i=0; i<n; i++) {
            r[i] = a[i] % k;
        }

    }
}
