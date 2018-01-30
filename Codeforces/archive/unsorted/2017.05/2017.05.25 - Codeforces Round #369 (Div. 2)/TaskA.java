package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String[] rows = new String[n];
        boolean found = false;
        for (int i = 0; i < n; ++i) {
            String seats = in.next();
            if (!found && seats.contains("OO")) {
                seats = seats.replaceFirst("OO", "++");
                found = true;
            }
            rows[i] = seats;
        }
        if (found) {
            out.println("YES");
            for (String s : rows) out.println(s);
        } else {
            out.print("NO");
        }
    }
}
