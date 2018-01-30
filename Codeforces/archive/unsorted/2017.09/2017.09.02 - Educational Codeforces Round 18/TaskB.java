package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < k; ++i) a[i] = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; ++i) list.add(i + 1);

        int leader = 0;
        for (int i = 0; i < k; ++i) {
            int at = (leader + a[i]) % list.size();
            out.print(list.get(at) + " ");
            leader = at;
            list.remove(at);
        }
    }
}
