package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class TaskB {

    static class Segment {
        int left;
        int right;
        int count = 1;
    }

    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in .nextInt();
        Map<Integer, Segment> a = new HashMap<>();
        int max = 1;
        for (int i = 0; i < n; ++i) {
            int x = in.nextInt();
            if (!a.containsKey(x)) {
                Segment s = new Segment();
                s.left = i;
                s.right = i;
                a.put(x, s);
            } else {
                Segment s = a.get(x);
                s.count++;
                s.right = i;
                max = Math.max(max, s.count);
            }
        }
        int l = 0;
        int r = 0;
        int min = n + 1;
        for (Segment s : a.values()) {
            if (s.count == max) {
                if (s.right - s.left + 1 < min) {
                    l = s.left + 1;
                    r = s.right + 1;
                    min = s.right - s.left + 1;
                }
            }
        }
        out.print(l + " " + r);
    }
}
