package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n >>= 1;
        }
        out.print(res);
    }
}
