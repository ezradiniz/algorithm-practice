package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        int k = 1;
        while (n != 0) {
            k *= fat(n % 10);
            n /= 10;
        }

        ArrayList<Integer> list = new ArrayList<>();
        int factor = 2;
        n = k;
        while (n != 1) {
            if (n % factor == 0) {
                list.add(factor);
                n /= factor;
            } else {
                factor++;
            }
        }

        System.out.println("!");
    }

    HashMap<Long, Long> memo = new HashMap<>();

    private long fat(int n) {
        if (memo.containsKey(n)) return memo.get(n);
        long f = 1;
        for (int i = 1; i <= n; ++i) {
            if (memo.containsKey(i)) f *= memo.get(i);
            else {
                f *= i;
                memo.put((long)i, f);
            }
        }
        return f;
    }
}
