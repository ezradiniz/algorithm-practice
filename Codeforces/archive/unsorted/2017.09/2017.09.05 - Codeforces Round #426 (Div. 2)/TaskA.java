package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        char start = in.next().charAt(0);
        char end = in.next().charAt(0);
        int n = in.nextInt();

        char[] positions = {'v', '<', '^', '>'};
        char[] cpositions = {'v', '>', '^', '<'};

        int p = -1;
        int q = -1;
        for (int i = 0; i < positions.length; ++i) {
            if (start == positions[i]) {
                p = i;
            }
            if (start == cpositions[i]) {
                q = i;
            }
        }

        char cw = positions[(p + n) % positions.length];
        char ccw = cpositions[(q + n) % cpositions.length];

        if (cw == end && ccw == end) {
            out.print("undefined");
        }else if (cw == end) {
            out.print("cw");
        } else {
            out.print("ccw");
        }
    }
}
