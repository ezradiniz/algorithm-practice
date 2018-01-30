package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();
        String t = in.next();
        StringBuilder sb = new StringBuilder();
        int countS = 0;
        int countT = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (c1 == c2) {
                sb.append(c1);
            } else {
                if (countS == countT) {
                    sb.append(c1);
                    ++countS;
                } else if (countS > countT) {
                    sb.append(c2);
                    ++countT;
                } else {
                    sb.append(c1);
                    ++countS;
                }
            }
        }

        if (countS == countT) {
            out.print(sb.toString());
        } else {
            out.print("impossible");
        }
    }
}
