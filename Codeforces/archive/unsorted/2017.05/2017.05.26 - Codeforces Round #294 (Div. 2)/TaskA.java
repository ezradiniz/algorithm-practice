package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int white = 0;
        int black = 0;
        for (int i = 0; i < 8; ++i) {
            char[] s = in.next().toCharArray();
            for (Character c: s) {
                if (c == '.') continue;
                if (Character.isUpperCase(c)) {
                    if (c == 'Q') white += 9;
                    if (c == 'R') white += 5;
                    if (c == 'B') white += 3;
                    if (c == 'N') white += 3;
                    if (c == 'P') white += 1;
                 } else {
                    if (c == 'q') black += 9;
                    if (c == 'r') black += 5;
                    if (c == 'b') black += 3;
                    if (c == 'n') black += 3;
                    if (c == 'p') black += 1;
                }
            }
        }

        if (white == black) out.print("Draw");
        else if (white > black) out.print("White");
        else out.print("Black");
    }
}
