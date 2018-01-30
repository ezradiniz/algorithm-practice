package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();
        String[] queue = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        long c = 1;
        while (c*5 < n) {
            n -= c*5;
            c <<= 1;
        }
        out.println(queue[(int)((n-1)/c)]);
    }
}
