package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] gifts = new int[n];
        for (int i = 0 ; i < n; ++i) gifts[i] = in.nextInt();
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            res[gifts[i]-1] = i+1;
        }
        for (int i = 0; i < n; ++i) {
            out.print(res[i] + " ");
        }
    }
}
