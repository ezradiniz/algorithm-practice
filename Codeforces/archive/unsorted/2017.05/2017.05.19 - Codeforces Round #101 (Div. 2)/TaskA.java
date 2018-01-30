package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String guess = in.next();
        String host = in.next();
        String door = in.next();

        int[] letters = new int[127];
        for (int i = 0; i < guess.length(); ++i) letters[guess.charAt(i)]++;
        for (int i = 0; i < host.length(); ++i) letters[host.charAt(i)]++;

        int[] pile = new int[127];
        for (int i = 0; i < door.length(); ++i) pile[door.charAt(i)]++;

        boolean isValid = true;
        for (int i = 0; i < 127; ++i) {
            if (letters[i] != pile[i]) {
                isValid = false;
                break;
            }
        }
        if (isValid) out.print("YES");
        else out.print("NO");
    }
}
