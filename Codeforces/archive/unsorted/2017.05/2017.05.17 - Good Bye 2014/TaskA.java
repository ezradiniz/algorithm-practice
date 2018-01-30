package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt()-1;
        int t = in.nextInt();
        int[] cell = new int[n];
        for (int i = 0; i < n; ++i) {
            cell[i] = in.nextInt();
        }
        String res = isPossible(n, t, cell);
        out.println(res);
    }

    private String isPossible(int n, int t, int[] cell) {
        int next = 0;
        while (next < n) {
            if (next+1 == t) return "YES";
            if (next+1 > t) return "NO";
            next += cell[next];
        }
        if (next+1 > t) return "NO";
        return "YES";
    }
}
