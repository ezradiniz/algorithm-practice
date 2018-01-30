package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        List<Integer> digits = new ArrayList<>();
        while (n != 0) {
            digits.add(0, n % 10);
            n /= 10;
        }
        List<Integer> res = new ArrayList<>();
        int size = digits.size();
        for (int i = 0; i < size; ++i) {
            int d = digits.get(i);
            int value = (int)Math.pow(10, size - i -1);
            if (i == 0) {
                for (int j = 0; j < d; ++j) {
                    res.add(value);
                }
            } else {
                for (int j = 0; j < d; ++j) {
                    if (j >= res.size()) {
                        res.add(value);
                    } else {
                        res.set(j, res.get(j) + value);
                    }
                }
            }
        }
        out.println(res.size());
        for (Integer i : res) out.print(i + " ");
    }
}
