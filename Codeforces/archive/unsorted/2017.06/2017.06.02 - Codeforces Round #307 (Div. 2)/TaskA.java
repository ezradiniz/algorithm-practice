package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        int[] p = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
            p[i] = a[i];
        }
        Arrays.sort(a);
        for (int i = 0; i < n; ++i) {
            out.print(search(a, p[i]) + " ");
        }
    }

    private int search(int[] a, int k) {
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > k) return a.length - i + 1;
        }
        return 1;
    }
}
