package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        for (int n = in.nextInt(); n >= 1; --n) {
            String word = in.next();
            if (word.length() > 10) {
                out.println("" + word.charAt(0) + word.substring(1, word.length()-1).length() + word.charAt(word.length()-1));
            } else {
                out.println(word);
            }
        }
    }
}
