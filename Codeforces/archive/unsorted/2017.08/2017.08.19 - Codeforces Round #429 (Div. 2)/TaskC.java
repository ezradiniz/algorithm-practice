package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class TaskC {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int m = in.nextInt();
        int[]a = new int[m];
        int[][] b = new int[m][2];
        for (int i = 0; i < m; ++i) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < m; ++i) {
            b[i][0] = in.nextInt();
            b[i][1] = i;
        }
        Arrays.sort(a);
        Arrays.sort(b, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return ints[0] - t1[0];
            }
        });

        int[] res = new int[m];
        for (int i = 0; i < m; ++i) {
            res[b[i][1]] = a[m - i - 1];
        }

        for (int i = 0; i < m; ++i) {
            out.print(res[i] + " ");
        }
    }
}
