package solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Set;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        Set<Integer> set = new HashSet<>(n);
        for (int i = 0; i < n; ++i) {
            set.add(in.nextInt());
        }

        ArrayList<Integer> res = new ArrayList<>();
        long sum = 0;
        for (int i = 1; ; ++i) {
            if (!set.contains(i)) {
                sum += i;
                if (sum > m) break;
                res.add(i);
            }
        }
        out.println(res.size());
        for (int i = 0; i < res.size(); ++i) out.print(res.get(i) + " ");
    }
}
