package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        boolean cupon = false;
        for (int i = 0; i < n; ++i) {
            int a = in.nextInt();
            if (cupon) {
                if (a == 0) break;
                cupon = false;
                a--;
            }
            if (a % 2 == 1) cupon = true;
        }

        if (cupon) out.print("NO");
        else out.print("YES");
    }
}
