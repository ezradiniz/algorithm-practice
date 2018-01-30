package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class GradingStudents {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        for (int i = 0; i < n; ++i) {
            int g = in.nextInt();
            if (g < 38) {
                out.println(g);
            } else {
                if ((g + 1) % 5 == 0) {
                    out.println(g+1);
                } else if ((g + 2) % 5 == 0) {
                    out.println(g+2);
                } else {
                    out.println(g);
                }
            }
        }
    }
}
