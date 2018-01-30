package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class AngryProfessor {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        int t = in.nextInt();
        for (int i=0; i<t; ++i) {
            int n = in.nextInt();
            int k = in.nextInt();
            int count = 0;
            for (int j=0; j<n; ++j) {
                int a = in.nextInt();
                if (a > 0) count++;
            }

            if (n-count >= k) out.println("NO");
            else out.println("YES");
        }
    }
}
