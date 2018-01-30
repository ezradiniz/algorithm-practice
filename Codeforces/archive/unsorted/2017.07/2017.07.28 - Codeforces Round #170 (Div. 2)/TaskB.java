package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();

        boolean[] l1 = new boolean[26];
        boolean[][] l2 = new boolean[26][26];

        for (int it = 0; it < n; ++it) {
            String s = in.next();

            for (int i = 0; i < s.length(); ++i) {
                char chr = s.charAt(i);
                l1[chr - 'a'] = true;
            }

            for (int i = 1; i < s.length(); ++i) {
                char chr1 = s.charAt(i - 1);
                char chr2 = s.charAt(i);
                l2[chr1 - 'a'][chr2 - 'a'] = true;
            }

        }


        for (int i = 0; i < 26; ++i) {
            if (!l1[i]) {
                out.print((char)(i + 'a'));
                return;
            }
        }

        for (int i = 0; i < 26; ++i) {
            for (int j = 0; j < 26; ++j) {
                if (!l2[i][j]) {
                    out.print((char)(i + 'a') + "" + (char)(j + 'a'));
                    return;
                }
            }
        }
    }
}
