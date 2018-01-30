package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int events = 0;
        int res = 0;
        for (int i = 0; i < n; ++i) {
            events += in.nextInt();
            if (events < 0) {
                events = 0;
                res++;
            }
        }
        out.println(res);
    }
}
