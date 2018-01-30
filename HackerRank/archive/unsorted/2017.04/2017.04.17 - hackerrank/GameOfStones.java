package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class GameOfStones {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        for (int x=0; x<t; ++x) {
            int n = in.nextInt();

            if (n % 7 < 2) out.println("Second");
            else out.println("First");
        }
    }
}
