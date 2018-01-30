package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int k = in.nextInt();
        int l = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int d = in.nextInt();

        int count = d;

        if (k == 1 || l == 1 || m ==1 || n ==1 ) {
            out.println(d);
        } else {
            for (int i=1; i <= d; ++i) {
                if (i % k != 0 && i%l != 0 && i%m != 0 && i%n != 0) count--;
            }
            out.println(count);
        }

    }
}
