package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        out.println(days(n, m));

        //naive solution
//        int day = 1;
//        while (n > 0) {
//            n--;
//            if (day % m == 0) n++;
//            day++;
//        }
//
//        out.println(day-1);
    }

    // O(1) solution
    private int days(int n , int m) {
        int s = 0;
        s = n + n/(m-1);
        if (n%(m-1) == 0) s--;
        return s;
    }
}
