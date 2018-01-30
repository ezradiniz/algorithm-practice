package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        boolean isColored = false;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                char color = in.next().charAt(0);
                if (color == 'C' || color == 'M' || color == 'Y') isColored = true;
            }
        }
        if (isColored) out.print("#Color");
        else out.print("#Black&White");
    }
}
