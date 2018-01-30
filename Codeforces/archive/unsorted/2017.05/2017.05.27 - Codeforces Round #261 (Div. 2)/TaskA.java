package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        if ((x1 != x2 && y1 != y2) && Math.abs(x1 - x2) != Math.abs(y1 - y2)) {
            out.print(-1);
            return;
        }

        if (x1 == x2) {
            out.print((x1 + Math.abs(y1 - y2)) + " " + y1 + "  " + (x2 + Math.abs(y1 - y2)) + " " + y2);
            return;
        }

        if (y1 == y2) {
            out.print(x1 + " " + (y1 + Math.abs(x1 - x2)) + " " + x2 + " " + (y2 + Math.abs(x1 - x2)));
            return;
        }


        out.print(x1 + " " + y2 + " " + x2 + " " + y1);
    }

}
