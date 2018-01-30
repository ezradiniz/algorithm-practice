package solutions;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    final static char[] HELLO = {'h', 'e', 'l', 'l', 'o'};

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();
        boolean isValid = false;
        int i = 0;
        for (char c : s.toCharArray()) {
            if (c == HELLO[i]) {
                i++;
            }
            if (i == HELLO.length) {
                isValid = true;
                break;
            }
        }
        if (isValid) out.println("YES");
        else out.println("NO");
    }
}
