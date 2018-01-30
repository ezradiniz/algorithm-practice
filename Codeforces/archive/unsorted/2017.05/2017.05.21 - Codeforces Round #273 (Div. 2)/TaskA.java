package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int coins = 0;
        for (int i = 0; i < 5; ++i) {
            coins += in.nextInt();
        }
        if (coins != 0 && coins % 5 == 0) out.print(coins/5);
        else out.print(-1);
    }
}
