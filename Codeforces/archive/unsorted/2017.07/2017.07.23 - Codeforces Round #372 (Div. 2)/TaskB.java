package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        char[] s  = in.next().toCharArray();

        if (s.length < 26) {
            out.print(-1);
            return;
        }


        boolean found = false;
        int left = -1;
        boolean[] letters = new boolean[26];
        for (int x = 0; x < s.length - 26 + 1; ++x) {
            found = true;
            for (int i = x; i < x + 26; ++i) {
                char ch = s[i];
                if (ch == '?') continue;
                if (letters[ch - 'A']) {
                    found = false;
                    break;
                }
                letters[ch - 'A'] = true;
            }
            if (found) {
                left = x;
                break;
            }
            letters = new boolean[26];
        }

        if (found) {
            for (int i = 0, j = 0; i < s.length; ++i) {
                char ch = s[i];
                if (ch == '?') {
                    if (i >= left && i < left + 26) {
                        for (; j < 26; ++j) {
                            if (!letters[j]) {
                                s[i] = (char)(j + 'A');
                                ++j;
                                break;
                            }
                        }
                    } else {
                        s[i] = 'A';
                    }
                }
            }

            out.print(new String(s));
        } else {
            out.print(-1);
        }
    }
}
