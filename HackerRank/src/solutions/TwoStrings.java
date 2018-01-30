package solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;

public class TwoStrings {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int p = in.nextInt();
        for (int t = 0; t < p; ++t) {
            char[] a = in.next().toCharArray();
            char[] b = in.next().toCharArray();

            boolean[] letters = new boolean[127];

            for (int i = 0; i < a.length; ++i) letters[a[i]] = true;

            boolean isValid = false;
            for (int i = 0; i < b.length; ++i) {
                if (letters[b[i]]) {
                    isValid = true;
                    break;
                }
            }
            if (isValid) out.println("YES");
            else out.println("NO");
        }

    }

}
