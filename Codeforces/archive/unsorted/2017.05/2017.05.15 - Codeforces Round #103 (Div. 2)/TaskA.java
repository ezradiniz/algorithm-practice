package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        int max = 1;
        int min = 101;
        int pMax = 0;
        int pMin = 0;

        for (int i = 0; i < n; ++i) {
            int soldiers = in.nextInt();
            if (soldiers > max) {
                max = soldiers;
                pMax = i + 1;
            }
            if (soldiers <= min) {
                min = soldiers;
                pMin = i + 1;
            }
        }

        if (max == min) out.println(0);
        else if (pMax > pMin)out.println(pMax - 1 + n - pMin - 1);
        else out.println(pMax - 1 + n - pMin);

    }
}
