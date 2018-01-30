package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.nextLine();
        boolean[] letters = new boolean[128];
        int count = 0;
        for (int i = 1; i < s.length()-1; ++i) {
            char ch = s.charAt(i);
            if (!Character.isLetter(ch)) continue;
            if (!letters[ch]) count++;
            letters[ch] = true;
        }
        out.println(count);
    }
}
