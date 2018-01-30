package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TheLoveLetterMystery {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        for (int x=0; x<t; x++) {
            char[] s = in.next().toCharArray();
            int count = 0;
            for (int i=0; i<s.length/2; i++) {
                count += Math.abs(s[i] - s[s.length-i-1]);
            }
            out.println(count);
        }
    }
}
