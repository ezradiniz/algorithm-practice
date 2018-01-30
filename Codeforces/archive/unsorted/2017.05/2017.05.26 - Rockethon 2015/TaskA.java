package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int k1 = in.nextInt();
        int k2 = in.nextInt();

        if (n1 > n2) out.print("First");
        else if (n1 < n2) out.print("Second");
        else out.print("Second");
    }
}
