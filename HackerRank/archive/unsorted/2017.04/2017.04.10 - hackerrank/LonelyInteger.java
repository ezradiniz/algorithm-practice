package solutions;

import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class LonelyInteger {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            int num = in.nextInt();
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        for (Integer v : map.keySet()) {
            int res = map.get(v);
            if (res == 1) {
                out.print(v);
                break;
            }
        }
    }
}
