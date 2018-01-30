package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; ++i) {
            score[i] = in.nextInt();
        }
        int count = 0;
        for (int i = 0; i < k; ++i) {
            if (score[i] > 0) count++;
        }

        if (count == 0) {
            out.println(count);
            return;
        }

        for (int i = k; i < n; ++i) {
            if (score[i] >= score[k-1] && score[i] > 0) count++;
        }

        out.println(count);
    }
}
