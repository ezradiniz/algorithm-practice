package solutions;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            int t = in.nextInt();
            if (t == 1) a.add(i + 1);
            if (t == 2) b.add(i + 1);
            if (t == 3) c.add(i + 1);
        }

        if (a.size() == 0 || b.size() == 0 || c.size() == 0) {
            out.print(0);
        } else {
            int w = Math.min(a.size(), Math.min(b.size(), c.size()));
            out.println(w);

            for (int i = 0, j = 0; i < w; ++i, ++j) {
                out.print(a.get(j) + " ");
                out.print(b.get(j) + " ");
                out.print(c.get(j) + " ");
                out.println();
            }
        }
    }
}
