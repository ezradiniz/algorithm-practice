package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();
        if (n == 0) out.print(1);
        else if (n % 2  == 0) {
            if ((n / 2) % 2 == 1) out.print(4);
            else out.print(6);
        } else {
            if ((n / 2) % 2 == 1) out.print(2);
            else out.print(8);
        }
    }
}
