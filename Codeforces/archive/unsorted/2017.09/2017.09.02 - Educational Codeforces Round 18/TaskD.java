package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.TreeSet;

public class TaskD {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        long n = in.nextLong();
        long q = in.nextLong();

        int[] tree = new int[(int) n * 4];
        int root = (int) ((n + 1) / 2);

        int maxLevel = getLevel(n);

        tree[0] = root;

        for (int it = 0; it < q; ++it) {
            int u = in.nextInt();
            char[] s = in.next().toCharArray();
        }
    }

    private int getLevel(long n) {
        int res = 0;
        while (n > 0) {
            ++res;
            n >>= 1;
        }
        return res;
    }
}
