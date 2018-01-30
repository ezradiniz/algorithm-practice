package solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int s = in.nextInt();
        int n = in.nextInt();
        int[][] dragon = new int[n][2];
        for (int i = 0; i < n; ++i) {
            int x = in.nextInt();
            int y = in.nextInt();
            dragon[i][0] = x;
            dragon[i][1] = y;
        }

        Arrays.sort(dragon, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return ints[0] - t1[0];
            }
        });

        for (int i = 0; i < n; ++i) {
            if (s > dragon[i][0]) s += dragon[i][1];
            else {
                out.print("NO");
                return;
            }
        }
        out.print("YES");
    }
}
