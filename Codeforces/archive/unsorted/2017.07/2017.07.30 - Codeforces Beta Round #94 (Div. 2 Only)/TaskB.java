package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {

    static class Student {
        List<Integer> link = new ArrayList<>();
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        Student[] graph = new Student[n];
        for (int i = 0; i < n; ++i) graph[i] = new Student();


        int[] f = new int[n];
        int[] g = new int[n];

        for (int i = 0; i < m; ++i) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            graph[a].link.add(b);
            graph[b].link.add(a);

            f[a]++;
            f[b]++;
        }

        int res = 0;
        while (m > 0) {
            int c = 0;
            for (int i = 0; i < n; ++i) {
                if (f[i] == 1) {
                    for (Integer at : graph[i].link) {
                        if (f[at] > 0){
                            g[at]++;
                            f[i]--;
                            m--;
                        }
                        ++c;
                    }
                }
            }
            if (c == 0) break;
            ++res;
            for (int i = 0; i < n; ++i) {
                f[i] -= g[i];
                g[i] = 0;
            }
        }

        out.print(res);
    }

}
