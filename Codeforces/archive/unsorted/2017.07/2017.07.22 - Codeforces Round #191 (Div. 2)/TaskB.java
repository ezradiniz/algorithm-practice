package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        for (int i = 1; i <= n; ++i) {
            out.print((5000000 + i) + " ");
        }
    }

}
