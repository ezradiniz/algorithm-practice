package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int s = in.nextInt();
        int v1 = in.nextInt();
        int v2 = in.nextInt();
        int t1 = in.nextInt();
        int t2 = in.nextInt();

        int r1 = v1 * s + 2 * t1;
        int r2 = v2 * s + 2 * t2;

        if (r1 == r2) out.print("Friendship");
        else if (r1 < r2) out.print("First");
        else out.print("Second");

    }
}
