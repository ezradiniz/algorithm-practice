package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s1 = in.next().toLowerCase();
        String s2 = in.next().toLowerCase();
        int res = s1.compareTo(s2);
        if (res < 0) out.println("-1");
        else if (res > 0) out.println("1");
        else out.println("0");
    }
}
