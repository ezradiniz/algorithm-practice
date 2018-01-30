package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class AccurateSorting {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        int q = in.nextInt();
        for (int x=0; x<q; ++x) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i=0; i<n; ++i) {
                a[i] = in.nextInt();
            }

            String res = canSort(a);
            out.println(res);
        }

    }

    private String canSort(int[] a) {

        boolean isSorted = true;
        for (int i=0; i<a.length-1; i++) {

            if (a[i] > a[i+1] && a[i] - a[i+1] == 1) {
                int tmp = a[i];
                a[i] = a[i+1];
                a[i+1] = tmp;
            }

            if (a[i] > a[i+1]) isSorted = false;
        }

        if (isSorted) return "Yes";

        return "No";
    }
}
