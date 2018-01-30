package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int countA = 0;
        int countD = 0;
        for (char c : in.next().toCharArray()) {
            if (c == 'A') countA++;
            else countD++;
        }
        if (countA == countD) out.print("Friendship");
        else if (countA > countD) out.print("Anton");
        else out.print("Danik");
    }
}
