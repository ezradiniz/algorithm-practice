package solutions;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class Gincana {

    static class Student {
        ArrayList<Integer> friends = new ArrayList<>();
        boolean mark = false;
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        Student[] graph = new Student[n];

        for (int i = 0; i < n; ++i) graph[i] = new Student();

        for (int i = 0; i < m; ++i) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            graph[u].friends.add(v);
            graph[v].friends.add(u);
        }

        int res = 0;

        for (int i = 0; i < n; ++i) {
            if (!graph[i].mark) ++res;
            dfs(graph, i);
        }

        out.print(res);
    }

    private void dfs(Student[] graph, int at) {
        graph[at].mark = true;

        for (Integer next : graph[at].friends) {
            if (!graph[next].mark) {
                dfs(graph, next);
            }
        }
    }

}
