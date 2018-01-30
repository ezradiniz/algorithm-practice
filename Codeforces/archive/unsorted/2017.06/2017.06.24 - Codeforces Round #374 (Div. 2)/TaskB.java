package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] length = new int[101];
        for (int i = 0; i < n; ++i) {
            length[in.next().length()]++;
        }
        int password = in.next().length();
        int res1 = 0;
        int res2 = 0;
        for (int i = 1; i < 101; ++i) {
            if (length[i] == 0) continue;
            if (i < password) {
                res1 += length[i];
                res2 += length[i];
            } else {
                res2 += length[i];
                break;
            }
        }

        res1 += (res1 / k) * 5 + 1;
        res2 += ((res2 - 1) / k) * 5;

        out.print(res1 + " " + res2);
    }
}
