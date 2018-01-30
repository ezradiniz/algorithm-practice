package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String positions = in.next();
        if (positions.contains("0000000") || positions.contains("1111111")) out.println("YES");
        else out.println("NO");
    }
}
