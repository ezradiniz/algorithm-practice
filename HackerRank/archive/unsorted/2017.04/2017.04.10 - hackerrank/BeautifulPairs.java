package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class BeautifulPairs {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        int n = in.nextInt();
        int[] set = new int[10001];

        int b = 0;
        for (int i=0;i<n; i++) {
            set[in.nextInt()]++;
        }

        for (int i=0; i<n; i++) {
            int v = in.nextInt();
            if (set[v] > 0) {
                set[v]--;
                b++;
            }
        }

        if (b == n) b--;
        else b++;

        out.print(b);

    }
}
