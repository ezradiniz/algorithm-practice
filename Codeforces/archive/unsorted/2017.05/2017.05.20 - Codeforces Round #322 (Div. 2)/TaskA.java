package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();

        int max = Math.max(a, b);
        int min = Math.min(a, b);


        out.print(min + " " + (max - min)/2);
    }
}
