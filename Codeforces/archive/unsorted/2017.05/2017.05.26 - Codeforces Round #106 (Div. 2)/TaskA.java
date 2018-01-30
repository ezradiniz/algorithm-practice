package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int k = in.nextInt();
        int[] month = new int[12];
        for (int i = 0; i < 12; ++i) month[i] = in.nextInt();
        Arrays.sort(month);
        int grow = 0;
        int res = 0;
        for (int i = 11; i >= 0 && grow < k; --i) {
            grow += month[i];
            res++;
        }

        if (grow >= k) out.print(res);
        else out.print(-1);
    }
}
