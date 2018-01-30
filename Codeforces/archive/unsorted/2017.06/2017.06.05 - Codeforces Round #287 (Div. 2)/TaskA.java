package solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; ++i) {
            a[i][0] = in.nextInt();
            a[i][1] = i + 1;
        }
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return ints[0] - t1[0];
            }
        });
        int count = 0;
        int res = 0;
        for (int i = 0; i < n; ++i) {
            count += a[i][0];
            if (count > k) break;
            ++res;
        }
        out.println(res);
        for (int i = 0; i < res; ++i) {
            out.print(a[i][1] + " ");
        }
    }
}
