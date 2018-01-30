package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        char[] c = in.next().toCharArray();
        if (c[a - 1] == c[b - 1]) out.print(0);
        else out.print(1);
    }
}
