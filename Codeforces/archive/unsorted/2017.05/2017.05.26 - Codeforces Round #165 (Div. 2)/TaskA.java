package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        for (int i = 0; i < t; ++i) {
            int a = in.nextInt();
            int n = 3;
            boolean ok = false;
            while (true) {
                int res = (n - 2) * 180;
                if (res % n == 0 && res/n == a) {
                    ok = true;
                    break;
                }
                if (res/n > a) break;
                n++;
            }
            if (ok) out.println("YES");
            else out.println("NO");
        }
    }
}
