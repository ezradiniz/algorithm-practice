package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int v = in.nextInt();
        List<Integer> selles = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            boolean flag = false;
            int k = in.nextInt();
            for (int j = 0; j < k; ++j) {
                int s = in.nextInt();
                if (v > s && !flag) {
                    selles.add(i + 1);
                    flag = true;
                }
            }
        }
        out.println(selles.size());
        for (Integer i : selles) out.print(i + " ");
    }
}
