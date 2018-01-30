package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {

    static final int MOD = (int)(1e9 + 7);

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        char[][] names = new char[n][m];
        for (int i = 0; i < n; ++i) {
            names[i] = in.next().toCharArray();
        }

        long res = 1;
        for (int j = 0; j < m; ++j) {
            long count = 0;
            boolean[] letters = new boolean[26];
            for (int i = 0; i < n; ++i) {
                int l = names[i][j] - 'A';
                if (!letters[l]) ++count;
                letters[l] = true;
            }
            res = ((res % MOD) * count) % MOD;
        }
        out.print(res);
    }
}
