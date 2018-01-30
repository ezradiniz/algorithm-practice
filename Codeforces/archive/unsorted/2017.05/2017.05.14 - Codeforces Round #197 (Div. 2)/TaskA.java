package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String[] numb = in.next().split("\\+");
        Arrays.sort(numb);
        String res = String.join("+", numb);
        out.println(res);
    }
}
