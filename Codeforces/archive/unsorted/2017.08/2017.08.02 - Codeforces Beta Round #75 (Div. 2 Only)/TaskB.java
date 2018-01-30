package solutions;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {

    static class NB {
        int d;
        public NB(int d) {this.d = d;}
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String x = in.next();
        int n = x.length();
        List<NB> bin = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            bin.add(new NB(x.charAt(i) - '0'));
        }
        int res = 0;
        while (bin.size() != 1) {
            int p = bin.size() - 1;
            NB nb = bin.get(p);
            if (nb.d == 0) bin.remove(p);
            else {
                for (int i = p; i >= 0; --i) {
                    NB nbd = bin.get(i);
                    if (nbd.d == 0) {
                        nbd.d = 1;
                        break;
                    } else {
                        nbd.d = 0;
                    }

                    if (i == 0) {
                        bin.add(0, new NB(1));
                    }
                }
            }

            ++res;
        }
        out.print(res);
    }
}
