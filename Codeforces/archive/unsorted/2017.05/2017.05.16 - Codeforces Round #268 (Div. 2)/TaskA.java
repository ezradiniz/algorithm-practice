package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        boolean[] game= new boolean[n+1];
        int res = 0;
        int x = in.nextInt();
        for (int i = 0; i < x; ++i) {
            int lvl = in.nextInt();
            if (!game[lvl]) {
                res++;
            }
            game[lvl] = true;
        }
        x = in.nextInt();
        for (int i = 0; i < x; ++i) {
            int lvl = in.nextInt();
            if (!game[lvl]) {
                res++;
            }
            game[lvl] = true;
        }

        if (res == n) out.println("I become the guy.");
        else out.println("Oh, my keyboard!");
    }
}
