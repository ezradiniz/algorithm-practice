package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] uniformA = new int[101];
        int[] uniformB = new int[101];

        for (int i = 0; i < n; ++i) {
            int x = in.nextInt();
            int y = in.nextInt();
            uniformA[x]++;
            uniformB[y]++;
        }
        int res = 0;
        for (int i = 0; i < 101; ++i) {
            res += uniformA[i] * uniformB[i];
        }

        out.println(res);
    }
}
