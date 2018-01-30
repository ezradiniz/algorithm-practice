package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        long n = in.nextLong();
        long root = 1;
        long sum = sumDigits(root);
        while (root < 100) {
            if (root * root + sum * root - n == 0) {
                out.print(root);
                return;
            }
            ++root;
            sum = sumDigits(root);
        }

        out.print("-1");
    }

    private long sumDigits(long n) {
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
