package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class AlternatingCharacters {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        for (int x=0; x<t; x++) {
            char[] s = in.next().toCharArray();
            int count = 0;
            for (int i=1; i<s.length; i++) {
                if (s[i] != s[i-1]) continue;
                count++;
            }
            out.println(count);
        }
    }
}
