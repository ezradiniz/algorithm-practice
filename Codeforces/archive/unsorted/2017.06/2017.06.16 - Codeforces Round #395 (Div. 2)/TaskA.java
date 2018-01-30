package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int z = in.nextInt();

        int res = 0;
        for (int i = 1; i <=z; ++i) {
            if (i % n == 0 && i % m == 0) ++res;
        }
        out.println(res);
    }
}
