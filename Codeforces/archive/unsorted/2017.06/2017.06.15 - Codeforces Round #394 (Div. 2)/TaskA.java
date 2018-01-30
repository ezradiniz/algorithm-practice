package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();

        int diff = Math.abs(a - b);
        if ((a == b && a != 0) || diff == 1) {
            out.println("YES");
        } else {
            out.println("NO");
        }
    }
}
