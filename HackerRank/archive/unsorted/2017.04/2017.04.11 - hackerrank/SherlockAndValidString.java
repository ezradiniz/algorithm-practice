package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class SherlockAndValidString {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        String str = in.next();
        String res = isValid(str);
        out.print(res);
    }

    private String isValid(String str) {
        long[] freq = new long[26];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        long min = str.length();
        long max = 1;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                min = Math.min(min, freq[i]);
                max = Math.max(max, freq[i]);
            }
        }

        int count = 0,
                cMin = 0,
                cMax = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > min && freq[i] < max) {
                count++;
            } else if (freq[i] == min) {
                cMin++;
            } else if (freq[i] == max) {
                cMax++;
            }
        }

        if (min == max || (count == 0 && (cMin == 1 || cMax == 1))) return "YES";
        return "NO";
    }
}
