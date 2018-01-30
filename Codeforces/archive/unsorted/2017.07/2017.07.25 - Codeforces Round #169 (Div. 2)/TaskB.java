package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();
        int n = s.length();
        int count = 0;
        int[] letters = new int[26];
        for (int i = 0; i < n; ++i) {
            letters[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; ++i) {
            if (letters[i] % 2 == 1) ++count;
        }
        if (count <= 1 || count % 2 != 0) out.print("First");
        else out.print("Second");
    }
}
