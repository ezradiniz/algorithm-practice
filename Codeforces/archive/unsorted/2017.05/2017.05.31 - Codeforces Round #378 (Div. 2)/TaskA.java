package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();
        int max = 0;
        int count = 1;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'Y') {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(count, max);
        }
        out.print(max);
    }
}
