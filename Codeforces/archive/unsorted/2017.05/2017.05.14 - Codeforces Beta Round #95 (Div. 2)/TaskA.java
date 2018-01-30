package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();
        char first = s.charAt(0);
        boolean onlyUpperCase = true;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == Character.toLowerCase(s.charAt(i))) onlyUpperCase = false;
        }
        if (onlyUpperCase && first == Character.toLowerCase(first)) {
            out.println(Character.toUpperCase(first) + s.substring(1).toLowerCase());
        } else if (onlyUpperCase) {
            out.println(s.toLowerCase());
        } else {
            out.println(s);
        }
    }
}
