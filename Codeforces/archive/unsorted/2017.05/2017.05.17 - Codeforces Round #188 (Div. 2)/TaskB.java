package solutions;

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Stack;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String str = in.next();
        long count = 0;

        long res = 0;
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (i+4 >= str.length()) break;
            if (ch == 'h') {
                if (str.substring(i, i+5).equals("heavy")) {
                    count++;
                    i += 4;
                }
            } else if (ch == 'm') {
                if (str.substring(i, i+5).equals("metal")) {
                    res += count;
                    i += 4;
                }
            }
        }

        out.print(res);
    }
}
