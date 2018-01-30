package solutions;

import java.util.Scanner;
import java.io.PrintWriter;


public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String n = in.next();
        out.print(n + reverse(n));
    }

    private String reverse(String n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n.length(); ++i) {
            sb.insert(0, n.charAt(i));
        }
        return sb.toString();
    }
}
