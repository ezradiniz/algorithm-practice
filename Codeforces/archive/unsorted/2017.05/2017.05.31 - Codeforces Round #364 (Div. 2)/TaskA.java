package solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
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

        for (int i = 0; i < n/2; ++i) {
            out.println(a[i][1] + " " + a[n -i -1][1]);
        }
    }
}
