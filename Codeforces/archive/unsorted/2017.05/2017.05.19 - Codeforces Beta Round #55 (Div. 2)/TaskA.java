package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();
        int upper = 0;
        int lower = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) upper++;
            else lower++;
        }

        if (upper == 0 && lower == 0) out.print(s);
        else if (lower >= upper) out.print(s.toLowerCase());
        else out.print(s.toUpperCase());
    }
}
