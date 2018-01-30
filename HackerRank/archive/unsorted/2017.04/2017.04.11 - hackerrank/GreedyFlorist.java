package solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.PrintWriter;

public class GreedyFlorist {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt(); //nb of flowers to purchase
        int k = in.nextInt(); //size of ur group of friends (including me)

        int[] freq = new int[n];
        int[] cost = new int[n];
        for (int i=0; i<n; i++) {
            cost[i] = in.nextInt();
        }

        Arrays.sort(cost);

        int res  = 0;
        int j = 0;
        for (int i = 0; i<n; ++i) {
            res += (freq[j % k] + 1) * cost[n-i-1];
            freq[j % k]++;
            j++;
        }

        out.print(res);
    }
}
