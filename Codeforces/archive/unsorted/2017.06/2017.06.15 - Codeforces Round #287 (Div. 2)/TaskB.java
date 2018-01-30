package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int r = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int xx = in.nextInt();
        int yy = in.nextInt();

        int res = (int) Math.ceil(Math.sqrt(Math.pow(x - xx, 2) + Math.pow(y - yy, 2))/ (2.0 * r));

        out.println(res);
    }
}
