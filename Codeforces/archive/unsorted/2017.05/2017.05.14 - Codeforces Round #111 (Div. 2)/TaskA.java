package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] c = new int[n];
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            c[i] = in.nextInt();
            sum += c[i];
        }
        Arrays.sort(c);
        int res = 0;
        int diff = 0;
        for (int i = n-1; i >= 0; --i) {
            diff += c[i];
            sum -= c[i];
            res++;
            if (diff > sum) break;
        }

        out.println(res);
    }
}
