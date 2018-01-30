package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String[][] m = new String[5][5];
        for (int i = 0; i< 5; ++i) {
            m[i] = in.nextLine().split(" ");
        }

        int x = 0;
        int y = 0;
        boolean found = false;
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                if (m[i][j].equals("1")) {
                    x = i;
                    y = j;
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        int res = 0;
//        if (x > 2) {
//            res += x - 2;
//        } else if (x < 2) {
//            res += 2 - x;
//        }
//
//        if (y > 2) {
//            res += y - 2;
//        } else if (y < 2) {
//            res += 2 - y;
//        }

        // optimo solution
         res = Math.abs(y-2) + Math.abs(x-2);

        out.println(res);
    }
}
