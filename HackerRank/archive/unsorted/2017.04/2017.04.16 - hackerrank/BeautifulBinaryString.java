package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class BeautifulBinaryString {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        char[] s = in.next().toCharArray();
        int count = 0;
        for (int i=0; i<s.length-2; i++) {
            if (s[i] == '0' && s[i+1] == '1' && s[i+2] == '0') {
                count++;
                i+=2;
            }
        }
        out.print(count);
    }
}
