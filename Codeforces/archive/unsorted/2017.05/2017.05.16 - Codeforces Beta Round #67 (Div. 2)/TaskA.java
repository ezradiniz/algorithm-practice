package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        char[] a = in.next().toCharArray();
        char[] b = in.next().toCharArray();
        for (int i = 0; i < a.length; ++i) {
            out.print(a[i] ^ b[i]);
        }
        out.println();
    }
}
