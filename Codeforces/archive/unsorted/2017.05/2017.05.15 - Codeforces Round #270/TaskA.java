package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        for (int i = 2; i <= n/2; ++i) {
            if (i + n-i == n && isComposite(i) && isComposite(n-i)) {
                out.print(i + "  " + (n-i));
                break;
            }
        }
    }

    private boolean isComposite(int n) {
        for (int i = 2;  i*i <= n; ++i) {
            if (n % i == 0) return true;
        }
        return false;
    }
}
