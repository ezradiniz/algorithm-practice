package solutions;

import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class GameOfThrones {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String str = in.next();
        String res = isPalindrome(str);
        out.print(res);
    }

    private String isPalindrome(String str) {
        HashMap<Character, Integer> dic = new HashMap<>();

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (dic.containsKey(ch)) {
                dic.put(ch, dic.get(ch) +1);
            } else {
                dic.put(ch, 1);
            }
        }

        int odd = 0;

        for (Integer v : dic.values()) {
            if (v % 2 != 0) {
                odd++;
                if (odd > 1) return "NO";
            }
        }

        return "YES";
    }
}
