package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int res;
        if (a == 1 && c == 1) {
            res = a+b+c;
        } else if (a == 1 && b == 1) {
            res = (a+b)*c;
        } else if (b == 1 && c == 1) {
            res = a*(b+c);
        } else if (b == 1){
            int min = Math.min(a, c);
            int max = Math.max(a, c);
            res = (b+min)*max;
        } else if (c == 1) {
            res = a*(b+c);
        } else if (a == 1) {
            res = (a+b)*c;
        } else {
            res = a*b*c;
        }

        out.println(res);
    }
}
