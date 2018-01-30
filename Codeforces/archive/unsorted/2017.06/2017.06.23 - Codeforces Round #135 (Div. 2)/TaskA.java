package solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int k = in.nextInt();
        String s = in.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        for (Integer v : map.values()) {
            if (v % k != 0) {
                out.print(-1);
                return;
            }
        }

        for (int i = 0; i < k; ++i) {
            for (Character c : map.keySet()) {
                for (int j = 0; j < map.get(c) / k; ++j) {
                    out.print(c);
                }
            }
        }

    }
}
