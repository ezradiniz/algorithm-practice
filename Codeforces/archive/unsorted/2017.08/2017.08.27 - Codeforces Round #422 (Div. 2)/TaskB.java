package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        char[] s = in.next().toCharArray();
        char[] t = in.next().toCharArray();
        int min = t.length;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            res.add(i + 1);
        }
        for (int i = 0; i < t.length - s.length + 1; ++i) {
            List<Integer> pos = new ArrayList<>();
            for (int j = 0; j < s.length; ++j) {
                if (s[j] != t[i + j]) {
                    pos.add(j + 1);
                }
            }
            if (pos.size() < min) {
                min = pos.size();
                res = new ArrayList<>(pos);
            }
        }
        out.println(res.size());
        for (Integer i : res) out.print(i + " ");
    }
}
