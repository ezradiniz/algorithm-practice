package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        out.print(Math.max(x, Math.max(y, z)) - Math.min(x, Math.min(y, z)));
    }
}
