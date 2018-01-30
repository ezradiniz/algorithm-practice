package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();

        int res = 0;

        int charge = (a < b) ? 1 : 2;

        while (true) {
            if (a == 1 && b == 1) break;
            if (a == 0 || b == 0) break;

            if (a < b) {
                if (a <= 2) charge = 1;
            }
            if (b < a) {
                if (b <= 2) charge = 2;
            }

            if (charge == 1) {
                a++;
                b -= 2;
            }
            if (charge == 2) {
                b++;
                a -= 2;
            }

            res++;
        }

        out.print(res);
    }
}
