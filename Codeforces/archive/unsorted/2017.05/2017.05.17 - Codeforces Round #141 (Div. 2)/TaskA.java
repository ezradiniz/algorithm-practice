package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long[] colors = new long[4];
        for (int i = 0; i < 4; ++i) colors[i] = in.nextLong();
        Arrays.sort(colors);
        int res = 0;
        for (int i = 1; i < 4; ++i) if (colors[i-1] == colors[i]) {
            res++;
        }
        out.print(res);
    }
}
