package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class HackerlandRadioTransmitters {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }

        Arrays.sort(a);

        int res = 0;

        for (int i = 0; i < n; i++) {
            int j = i;
            while (j < n && a[j] <= a[i]+k) ++j;
            i = j-1;
            while (j < n && a[j] <= a[i]+k) ++j;
            i = j-1;
            res++;
        }


        out.println(res);
    }
}
