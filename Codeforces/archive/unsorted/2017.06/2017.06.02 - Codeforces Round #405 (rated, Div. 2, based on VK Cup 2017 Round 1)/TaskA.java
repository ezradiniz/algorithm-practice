package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = 0; ; ++i) {
            if (a > b) {
                out.print(i);
                return;
            }
            a *= 3;
            b *= 2;
        }
    }
}
