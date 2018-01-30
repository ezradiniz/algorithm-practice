package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int x = in.nextInt();
        int y = in.nextInt();
        int a = y;
        int b = y;
        int c = y;

        int res = 0;
        while (!isValid(a, b, c, x)) {
            ++res;
            if (res % 3 == 1) a = b + c - 1;
            if (res % 3 == 2) b = a + c - 1;
            if (res % 3 == 0) c = a + b - 1;
        }

        out.print(res);
    }

    private boolean isValid(int a, int b, int c, int x) {
        return a >= x && b >= x && c >= x;
    }
}
