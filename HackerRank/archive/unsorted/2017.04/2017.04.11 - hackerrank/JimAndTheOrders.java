package solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.PrintWriter;

public class JimAndTheOrders {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[][] process = new int[n][2];
        for (int i=0; i<n; i++) {
            process[i][0] = in.nextInt() + in.nextInt();
            process[i][1] = i+1;
        }

        Arrays.sort(process, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return ints[0] - t1[0];
            }
        });

        for (int i=0; i<n; i++) {
            out.print(process[i][1] + " ");
        }
    }
}
