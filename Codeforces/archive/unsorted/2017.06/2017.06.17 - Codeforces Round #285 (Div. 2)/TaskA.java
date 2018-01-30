package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int m = Math.max(3 * a / 10, a - a / 250 * c);
        int n = Math.max(3 * b / 10, b - b / 250 * d);

        if (m == n) {
            out.print("Tie");
        } else if (m > n) {
            out.print("Misha");
        } else {
            out.print("Vasya");
        }
    }
}
