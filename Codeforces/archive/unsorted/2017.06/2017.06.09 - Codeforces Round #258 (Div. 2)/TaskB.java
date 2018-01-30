package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }

        int l = 0;
        int r = 0;
        int rev = a[0];

        boolean isLessThan = false;

        for (int i = 1; i < n; ++i) {
            int cur = a[i];

            if (cur < rev) {
                r = i;
                isLessThan = true;
            } else {
                if (isLessThan) break;
            }

            if (!isLessThan) {
                l = i;
                r = i;
                rev = cur;
            }
        }

        if (isValid(a, l, r)) {
            out.println("yes");
            out.print((l + 1) + " " + (r + 1));
        } else {
            out.print("no");
        }
    }

    private boolean isValid(int[] a, int l, int r) {
        for (int i = 1; i < l; ++i) {
            if (a[i] < a[i - 1]) return false;
        }

        if (l > 0 && a[r] < a[l - 1]) return false;

        for (int i = r; i > l; --i) {
            if (a[i] > a[i - 1]) return false;
        }

        a[r] = a[l];
        for (int i = r + 1; i < a.length; ++i) {
            if (a[i] < a[i - 1]) return false;
        }
        return true;
    }
}
