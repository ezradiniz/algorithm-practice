package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {

    final static int[] LUCKY = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 747, 744, 777};

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = in.nextInt();

        boolean isValid4 = false;
        boolean isValid7 = false;
        int n = N;
        while (n > 0) {
            if (n % 10 == 4) {
                isValid4 = true;
            } else if (n % 10 == 7) {
                isValid7 = true;
            } else {
                isValid4 = false;
                isValid7 = false;
                break;
            }

            n /= 10;
        }
        if (isValid4 && isValid7) out.println("YES");
        else {
            for (int i = 0; i < LUCKY.length; ++i) {
                if (LUCKY[i] <= N && N % LUCKY[i] == 0) {
                    out.println("YES");
                    return;
                }
            }

            out.println("NO");
        }
    }
}
