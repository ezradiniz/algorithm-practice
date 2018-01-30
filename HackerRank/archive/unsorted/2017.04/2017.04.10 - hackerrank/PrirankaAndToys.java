package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class PrirankaAndToys {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        int n = in.nextInt();
        int[] weight = new int[n];

        for (int i=0; i<n; ++i) {
            weight[i] = in.nextInt();
        }

        int i = 0;
        int res = 0;

        Arrays.sort(weight);

        while (i < n) {
            res++;
            int next = weight[i] + 4;
            for (int j = i; j < n; j++) {
                if (next < weight[j]) break;
                i++;
            }
        }

        out.print(res);
    }
}
