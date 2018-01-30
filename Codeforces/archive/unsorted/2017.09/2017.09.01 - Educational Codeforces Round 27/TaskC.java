package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class TaskC {

    static class Tv {
        int l;
        int r;
    }

    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        Tv[] t = new Tv[n];
        for (int i = 0; i < n; ++i) {
            int l = in.nextInt();
            int r = in.nextInt();
            t[i] = new Tv();
            t[i].l = l;
            t[i].r = r;
        }

        Arrays.sort(t, new Comparator<Tv>() {
            @Override
            public int compare(Tv tv, Tv t1) {
                if (tv.l == t1.l) return tv.r - t1.r;
                return tv.l - t1.l;
            }
        });

        int r1 = -1;
        int r2 = -1;
        for (int i = 0; i < n; ++i) {
            if (r1 < t[i].l) {
                r1 = t[i].r;
                continue;
            }
            if (r2 < t[i].l) {
                r2 = t[i].r;
                continue;
            }

            out.print("NO");
            return;
         }
         out.print("YES");
    }
}
