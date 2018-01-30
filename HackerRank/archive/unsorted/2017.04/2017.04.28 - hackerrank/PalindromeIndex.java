package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class PalindromeIndex {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        int t = in.nextInt();
        for (int x = 0; x < t; ++x) {
            String s = in.next();
            int res = palindromeIndex(s);
            out.println(res);
        }
    }

    private int palindromeIndex(String s) {
        for (int i = 0; i < s.length()/2; ++i) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                if (s.charAt(i) == s.charAt(s.length()-2-i) && s.charAt(i+1) == s.charAt(s.length()-3-i)) return s.length()-1-i;
                else return i;
            }
        }
        return -1;
    }
}

