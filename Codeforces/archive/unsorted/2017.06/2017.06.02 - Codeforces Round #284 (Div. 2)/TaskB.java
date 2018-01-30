package solutions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < m; ++i) {
            String a = in.next();
            String b = in.next();
            map.put(a, b);
            map.put(b, a);

        }
        for (int i = 0; i < n; ++i) {

            String w = in.next();
            String a = map.get(w);
            if (a.length() == w.length()) {
                out.print(w + " ");
            } else if (a.length() < w.length()) {
                out.print(a + " ");
            } else {
                out.print(w + " ");
            }
        }
    }
}
