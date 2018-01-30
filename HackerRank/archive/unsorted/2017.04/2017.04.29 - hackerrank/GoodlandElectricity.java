package solutions;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.io.PrintWriter;

public class GoodlandElectricity {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int last = -1;
        int res = 0;

        for (int i = 0 ; i < n; ++i) {
            int p = in.nextInt();
            if (p == 1) last = i;
            a[i] = last;
        }

        for (int i = 0; i < n; ) {
            int take = a[Math.min(i+k-1, n-1)];
            if (take == -1 || take + k <= i) {
                res = -1;
                break;
            }
            i = take + k;
            res++;
        }


        out.print(res);
    }

}
