package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        boolean isCorrect = false;
        for (int i = 0; i < n; ++i) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a != b) isCorrect = true;
        }
        if (isCorrect) out.print("Happy Alex");
        else out.print("Poor Alex");
    }
}
