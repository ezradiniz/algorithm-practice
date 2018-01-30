package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String s = in.next();
        char[] a = new char[n];
        char[] b = new char[n];

        for (int i = 0; i < n; ++i) a[i] = s.charAt(i);
        for (int i = n; i < 2 * n; ++i) b[i - n] = s.charAt(i);

        Arrays.sort(a);
        Arrays.sort(b);

        boolean isMore = false;

        if (a[0] > b[0]) {
            isMore = true;
        }

        for (int i = 1; i < n; ++i) {
            if (a[i] == b[i] || isMore && a[i] < b[i] || !isMore && a[i] > b[i]) {
                out.print("NO");
                return;
            }
        }

        out.print("YES");
    }
}
