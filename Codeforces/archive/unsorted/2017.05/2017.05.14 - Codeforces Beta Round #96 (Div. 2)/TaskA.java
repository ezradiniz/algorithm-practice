package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String instructions = in.next();
        if (instructions.matches(".*(H|Q|9)+.*")) {
            out.println("YES");
        } else {
            out.println("NO");
        }
    }
}
