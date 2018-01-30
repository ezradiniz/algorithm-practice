package solutions;

import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;

public class BeautifulWord {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();

        HashSet<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('y');

        char prev = s.charAt(0);
        boolean isValid = true;
        for (int i=1; i<s.length(); i++) {
            char cur = s.charAt(i);
            if (prev == cur || vowel.contains(prev) && vowel.contains(cur)) {
                isValid = false;
                break;
            }
            prev = cur;
        }

        if (isValid) out.print("Yes");
        else out.print("No");
    }
}
