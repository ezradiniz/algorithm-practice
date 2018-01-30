package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s1 = in.next();
        String s2 = in.next();

        int resP = 0;
        for (int i = 0; i < s1.length(); ++i) {
            resP += (s1.charAt(i) == '+' ? 1 : -1);
        }

        int finalP = 0;
        int moves = 0;
        for (int i = 0; i < s1.length(); ++i) {
            if (s2.charAt(i) == '?') ++moves;
            else finalP += (s2.charAt(i) == '+' ? 1 : -1);
        }

        int dist  = resP - finalP;
        double res;

        if ((dist + moves) % 2 != 0  || moves < Math.abs(dist)) res = 0;
        else {
            int m = (moves + Math.abs(dist)) / 2;
            int c = 1;
            for (int i = 0; i < m; ++i) {
                c *= moves - i;
            }
            for (int i = 2; i <= m; ++i) {
                c /= i;
            }

            res = (double)c / (1 << moves);
        }
        out.print(String.format("%.12f", res));
    }
}
