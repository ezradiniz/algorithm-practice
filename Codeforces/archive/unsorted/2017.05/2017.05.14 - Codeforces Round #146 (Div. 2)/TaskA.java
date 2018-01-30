package solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String str = in.next();
        int[] letters = new int[128];
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            letters[ch]++;
        }

        int count = 0;

        for (int i = 0; i < 128; ++i) {
            int f = letters[i];
            if (f == 0) continue;
            if (f > 0) count++;
        }

        if (count % 2 == 1) out.println("IGNORE HIM!");
        else out.println("CHAT WITH HER!");
    }
}
