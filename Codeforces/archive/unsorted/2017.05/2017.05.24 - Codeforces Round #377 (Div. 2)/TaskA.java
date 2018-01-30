package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int k = in.nextInt();
        int r = in.nextInt();
        int res = 1;
        for (int i = 1; (k * i) % 10 != 0 && (k * i) % 10 != r; ++i) res++;
        out.print(res);
    }
}
