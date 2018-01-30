package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s1 = in.next();
        String s2 = in.next();

        String res = isValid(s1, s2);
        out.println(res);
    }

    private String isValid(String s1, String s2) {
        if (s1.length() != s2.length()) return "NO";
        for (int i = 0; i < s1.length(); ++i) {
            if (s1.charAt(i) != s2.charAt(s1.length()-1-i)) return "NO";
        }
        return "YES";
    }
}
