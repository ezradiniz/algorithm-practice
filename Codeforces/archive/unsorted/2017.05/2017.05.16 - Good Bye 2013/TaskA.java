package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();

        // naive solution
        int res = a;
        int candles = a;
        while (candles / b != 0) {
            res += candles / b;
            candles = candles/b + candles % b;
        }

        out.println(res);

        /*
           X
           X
           X
           X
           [x,x]
           [x,x]
           [x,x,x,x]

           1
           2
           3
           4
           5
           6
           [1,2,3]
           [4,5,6]

         */
    }
}
