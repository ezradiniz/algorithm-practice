package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String[] remix = in.next().split("WUB");
        for (String word : remix) {
            if (word.equals("")) continue;
            out.print(word + " ");
        }
    }
}
