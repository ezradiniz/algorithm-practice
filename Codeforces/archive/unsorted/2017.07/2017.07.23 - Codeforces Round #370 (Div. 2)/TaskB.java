package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();

        if (s.length() % 2 != 0) {
            out.print(-1);
            return;
        }

        int x = 0;
        int y = 0;

        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch == 'R') ++x;
            if (ch == 'L') --x;
            if (ch == 'U') ++y;
            if (ch == 'D') --y;
        }

        int res = (Math.abs(x) + Math.abs(y)) / 2;


        out.print(res);
    }
}
