package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        boolean hasPositive = false;
        for (int i= 0; i < n; ++i) {
            a[i] = in.nextInt();
            if (a[i] > 0) hasPositive = true;
        }
        Arrays.sort(a);
        int zero = Arrays.binarySearch(a, 0);
        if (hasPositive) {
            out.print("1 " + a[0] + "\n" + (n - zero - 1) + " ");
            for (int i = zero + 1; i < n; ++i) {
                out.print(a[i] + " ");
            }
            out.println();
            out.print(zero + " ");
            for (int i = 1; i < zero + 1; ++i) {
                out.print(a[i] + " ");
            }
        } else {
            out.print("1 " + a[0] + "\n" + 2 + " ");
            for (int i = 1; i < 3; ++i) {
                out.print(a[i] + " ");
            }
            out.println();
            out.print((zero - 2) + " ");
            for (int i = 3; i < n; ++i) {
                out.print(a[i] + " ");
            }
        }
    }
}
