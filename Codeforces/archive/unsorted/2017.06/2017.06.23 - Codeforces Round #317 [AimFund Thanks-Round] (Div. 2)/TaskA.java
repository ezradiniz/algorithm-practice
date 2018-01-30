package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int na = in.nextInt();
        int nb = in.nextInt();
        int k = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[na];
        int[] b = new int[nb];
        for (int i = 0; i < na; ++i) a[i] = in.nextInt();
        for (int i = 0; i < nb; ++i) b[i] = in.nextInt();
        int i = 0;
        while (i < k &&  a[i] < b[nb - m]) i++;

        if (i == k) {
            out.print("YES");
        } else {
            out.print("NO");
        }
    }
}
