package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();
        out.print(s.length() * 26 + 26 - s.length());
    }
}
