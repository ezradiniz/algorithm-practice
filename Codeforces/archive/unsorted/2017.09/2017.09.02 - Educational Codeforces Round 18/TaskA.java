package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = in.nextInt();
        Random rd = new Random();
        for (int i = 0; i < n; ++i) {
            int j =  rd.nextInt(n);
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 1; i < n; ++i) {
            int diff = Math.abs(a[i] - a[i - 1]);
            if (diff < min) {
                res = 1;
                min = diff;
            } else if (diff == min) {
                ++res;
            }
        }

        out.print(min + " " + res);
    }
}
