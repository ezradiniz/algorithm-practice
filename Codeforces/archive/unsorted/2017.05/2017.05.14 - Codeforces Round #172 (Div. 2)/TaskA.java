package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();
        out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1));
    }
}
