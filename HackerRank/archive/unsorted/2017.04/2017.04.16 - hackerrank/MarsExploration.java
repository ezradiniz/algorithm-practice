package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class MarsExploration {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();
        int count = 0;
        for (int i=0; i<s.length(); i+=3) {
            if (s.charAt(i) != 'S') count++;
            if (s.charAt(i+1) != 'O') count++;
            if (s.charAt(i+2) != 'S') count++;
        }
        out.print(count);
    }
}
