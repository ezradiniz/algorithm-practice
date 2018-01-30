package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int k = in.nextInt(); // cost of the fisrt banana
        int n = in.nextInt(); // inital number of dollars
        int w = in.nextInt(); // number of bananas he wants

        int cost = 0;
        for (int i = 1; i <= w; ++i) {
            cost += k * i;
        }

        out.println((cost - n < 0) ? 0 : cost - n);
    }
}
