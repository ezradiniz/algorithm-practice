package solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.PrintWriter;

public class LuckBalance {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();

        int luck = 0;
        int t = 0;
        int[][] contest = new int[n][2];
        for (int i=0; i<n; i++) {
            contest[i][0] = in.nextInt();
            contest[i][1] = in.nextInt();
            if (contest[i][1] == 1) t++;
            luck += contest[i][0];
        }

        Arrays.sort(contest, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                if (ints[1] == t1[1]) {
                    return ints[0] - t1[0];
                }

                return t1[1] - ints[1];
            }
        });

        for (int i=0; i<n; i++) {
            if (t-i <= k) break;
            luck -= 2*contest[i][0];
        }

        out.print(luck);
    }
}
