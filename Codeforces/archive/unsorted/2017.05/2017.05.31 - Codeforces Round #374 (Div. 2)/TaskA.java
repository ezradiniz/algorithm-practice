package solutions;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String row = in.next();

        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; ++i) {
            char cur = row.charAt(i);
            if (cur == 'B') {
                count++;
                if (i == n-1) arr.add(count);
            } else {
                if (count != 0) arr.add(count);
                count = 0;
            }
        }
        out.println(arr.size());
        for (Integer nb : arr) out.print(nb + " ");
    }
}
