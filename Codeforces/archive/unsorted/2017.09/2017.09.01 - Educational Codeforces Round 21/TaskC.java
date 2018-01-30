package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class TaskC {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int w = in.nextInt();
        int[][] a = new int[n][2];
        int sumHalf = 0;


        for (int i = 0; i < n; ++i) {
            a[i][0] = in.nextInt();
            a[i][1] = i;
            int half = (int) Math.ceil((double) a[i][0] / 2);
            sumHalf += half;
        }
        if (sumHalf > w) {
            out.print("-1");
            return;
        }

        Arrays.sort(a, new Comparator<int[]>() {
                    @Override
                    public int compare(int[] ints, int[] t1) {
                        return t1[0] - ints[0];
                    }
                }
        );
        int[] x = new int[n];
        int diff = w - sumHalf;
        for (int i = 0; i < n; ++i) {
            int j = a[i][1];
            int v = a[i][0];
            x[j] = (int) Math.ceil((double) v / 2);
            if (diff == 0) continue;
            int put = v - x[j];
            if (diff - put < 0) put = diff;
            x[j] += put;
        }


        for (int i = 0; i < n; ++i) {
            out.print(x[a[i][1]] + " ");
        }
    }
}
