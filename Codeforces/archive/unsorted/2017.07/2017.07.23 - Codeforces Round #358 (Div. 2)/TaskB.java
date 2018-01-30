package solutions;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextLong();
        }

        //Shuffle
        Random rd = new Random();
        for (int i = 0; i < n; ++i) {
            int j = rd.nextInt(n);
            long tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }

        Arrays.sort(a);

        for (int i = 0; i < n; ++i) {
            if (i == 0) {
                a[i] = i + 1;
            } else {
                if (a[i] >= a[i - 1] + 1) {
                    a[i] = a[i - 1] + 1;
                }
            }
        }

        out.print(a[n - 1] + 1);
    }
}
