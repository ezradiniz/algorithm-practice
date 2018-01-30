package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n =  in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }

        int c1 = 0,
            c2 = 0;
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; ++i) {
            if (a[i] % 2 == 0) {
                c1++;
                even = i;
            } else {
                c2++;
                odd = i;
            }
        }

        if (c1 > c2) out.print(odd + 1);
        else out.print(even + 1);
    }
}
