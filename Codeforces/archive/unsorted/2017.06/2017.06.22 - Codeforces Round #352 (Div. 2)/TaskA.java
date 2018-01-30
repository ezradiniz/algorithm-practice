package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int d = 0;
        for (int i = 1; ; ++i) {
            String digit = String.valueOf(i);
            for (int j = 0; j < digit.length(); ++j) {
                ++d;
                if (d == n) {
                    out.print(digit.charAt(j));
                    return;
                }
            }
        }
    }
}
