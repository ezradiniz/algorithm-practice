package solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.PrintWriter;

public class PermutingTwoArrays {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int q = in.nextInt();
        for (int x=0; x<q; ++x) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i=0; i<n; i++) {
                a[i] = in.nextInt();
            }
            for (int i=0; i<n; i++) {
                b[i] = in.nextInt();
            }

            String res = isValidPermutations(a, b, k);
            out.println(res);
        }
    }

    private String isValidPermutations(int[] a, int[] b, int k) {
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i=0; i<a.length; i++) {
            if (a[i] + b[b.length-1-i] < k) return "NO";
        }
        return "YES";
    }
}
