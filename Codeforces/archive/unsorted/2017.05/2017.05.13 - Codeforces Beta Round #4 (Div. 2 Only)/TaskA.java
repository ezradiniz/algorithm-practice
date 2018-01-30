package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int w = in.nextInt();
        if (w > 2  && w % 2  == 0) {
            out.println("YES");
        } else {
            out.println("NO");
        }
    }
}
