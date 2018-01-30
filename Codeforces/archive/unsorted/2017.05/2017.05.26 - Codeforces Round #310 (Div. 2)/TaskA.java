package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        char[] s = in.next().toCharArray();
        int z = 0;
        int o = 0;
        for (Character c : s) {
            if (c == '0') z++;
            if (c == '1') o++;
        }

        int res = Math.abs(o - z);
        out.print(res);
    }
}
