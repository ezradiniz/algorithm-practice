package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        char[] l1 = in.next().toCharArray();
        char[] l2 = in.next().toCharArray();
        char[] s = in.next().toCharArray();

        int[] table = new int[26];
        for (int i = 0; i < 26; ++i) {
            int ch = l1[i] - 'a';
            table[ch] = i;
        }

        for (char ch : s) {
            if (Character.isDigit(ch)) {
                out.print(ch);
                continue;
            }
            int i = table[Character.toLowerCase(ch) - 'a'];
            if (Character.isUpperCase(ch)) out.print(Character.toUpperCase(l2[i]));
            else out.print(l2[i]);
        }
    }
}
