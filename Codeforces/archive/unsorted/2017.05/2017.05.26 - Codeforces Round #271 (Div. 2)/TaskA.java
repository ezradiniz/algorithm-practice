package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    final static String KEYBOARD = "qwertyuiopasdfghjkl;zxcvbnm,./";

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        char direction = in.next().charAt(0);
        char[] s = in.next().toCharArray();
        for (Character c : s) {
            int i = search(c);
            if (i == -1) throw new RuntimeException();
            out.print(KEYBOARD.charAt((direction == 'R') ? i - 1 : i + 1));
        }
    }

    private int search(Character c) {
        for (int i = 0; i < KEYBOARD.length(); ++i) {
            if (KEYBOARD.charAt(i) == c) return i;
        }
        return -1;
    }
}
