package solutions;

import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class StringReduction {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        for (int x=0; x<t; ++x) {
            String str = in.next();
            int res = Integer.MAX_VALUE;
            res = Math.min(res, reduction(str, 0));
            out.println(res);
        }
    }

    private static HashMap<String, String> memo = new HashMap<>();

    private int reduction(String str, int start) {

        if (str.length() <= 3) {
            boolean isValid = true;
            for (int i=0; i<str.length()-1; i++) {
                if (str.charAt(i) != str.charAt(i+1)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) return str.length();
        }


        int length = str.length();
        int min = length;
        for (int j=0; j<str.length(); j += 2) {
            for (int i = j; i<str.length()-1; i++) {
                char a = str.charAt(i);
                char b = str.charAt(i+1);

                if (a != b) {
                    String before = str.substring(0, i);
                    String current = getChr(a, b);
                    String after = str.substring(i+2);
                    str = before + current + after;

                    min = Math.min(min, reduction(str, j));
                }
            }
        }


        if (length == str.length()) return length;

        return min;
    }

    private static String getChr(char a, char b) {
        if (a == 'a' && b == 'b') return ""+'c';
        if (a == 'a' && b == 'c') return ""+'b';
        if (a == 'b' && b == 'a') return ""+'c';
        if (a == 'b' && b == 'c') return ""+'a';
        if (a == 'c' && b == 'a') return ""+'b';
        if (a == 'c' && b == 'b') return ""+'a';

        return "";
    }
}
