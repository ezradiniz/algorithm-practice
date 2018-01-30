package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; ++i) {
            int dx = in.nextInt();
            int dy = in.nextInt();
            if (dx > dy) x++;
            if (dx < dy) y++;
        }

        if (x > y) out.println("Mishka");
        else if (x < y) out.println("Chris");
        else out.println("Friendship is magic!^^");
    }
}
