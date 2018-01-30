package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();
        char[] colors = new char[4];
        boolean[] found = new boolean[4];

        int p = 0;
        for (int i = 0; i < s.length(); ++i) {
           char c =  s.charAt(i);
           if (p == 4) p = 0;
           if (c == '!') {
               ++p;
               continue;
           }
           found[p] = true; 
           colors[p] = c;
           ++p;
           boolean foundColors = true;
           for (int j = 0; j < 4; ++j) {
               if (!found[j]) {
                   foundColors = false;
                   break;
               }
           }
           if (foundColors) break;
        }

        int[] res = new int[4];
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '!') {
                char color = colors[i % 4];
                if (color == 'R') ++res[0];
                else if (color == 'B') ++res[1];
                else if (color == 'Y') ++res[2];
                else ++res[3];
            }
        }

        for (int i = 0; i < 4; ++i) {
            out.print(res[i] + " ");
        }
    }
}
