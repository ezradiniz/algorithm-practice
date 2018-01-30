package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int x = 0;
        for (int n = in.nextInt(); n >= 1; --n) {
            String s = in.next();
            if (s.contains("+")) x++;
            else x--;
        }
        out.println(x);
    }
}
