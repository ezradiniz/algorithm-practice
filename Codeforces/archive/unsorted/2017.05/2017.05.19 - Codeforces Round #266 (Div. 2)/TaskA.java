package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt(); // rides
        int m = in.nextInt(); // rides by ticket
        int a = in.nextInt(); // price of one ride ticket
        int b = in.nextInt(); // price of an m ride ricket

        if (b <= a) {
            out.print((int)(Math.ceil((float)n/m)*b));
        } else {
            if (n/m == 0) out.print(Math.min(a*n, b));
            else out.print(Math.min(((n/m)*b + (n%m)*a), n*a));
        }
    }
}
