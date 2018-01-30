package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int a3 = in.nextInt();

        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int b3 = in.nextInt();

        int n = in.nextInt();

        int cups = a1 + a2 + a3;
        int medals = b1 + b2 + b3;

        cups = cups/5 + ((cups % 5 > 0) ? 1 : 0);
        medals = medals/10 + ((medals % 10 > 0) ? 1 : 0);


        if (cups + medals <= n) out.print("YES");
        else out.print("NO");
    }
}
