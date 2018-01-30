package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class MakingAnagrams {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        String s1 = in.next();
        String s2 = in.next();

        int res = makeAnagrams(s1, s2);
        out.print(res);
    }

    private int makeAnagrams(String s1, String s2) {
        int count = 0;

        int[] d1 = new int[26];
        int[] d2 = new int[26];

        for (int i=0; i<s1.length(); i++) {
            char ch1 = s1.charAt(i);
            d1[ch1-'a'] += 1;
        }

        for (int i=0; i< s2.length(); i++) {
            char ch2 = s2.charAt(i);
            d2[ch2-'a'] += 1;
        }

        for (int i=0; i<26; i++) {
            if (d1[i] != d2[i]) count += Math.abs(d1[i]-d2[i]);
        }

        return count;
    }
}
