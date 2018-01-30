package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int year = in.nextInt();
        int y = year + 1;
        while (true) {
            if (hasDistinctDigits(y)) break;
            y++;
        }
        out.println(y);
    }

    private boolean hasDistinctDigits(int y) {
        boolean[] digits = new boolean[10];

        while (y > 0) {
            int d = y % 10;
            if (digits[d]) return false;
            digits[d] = true;
            y /= 10;
        }

        return true;
    }
}
