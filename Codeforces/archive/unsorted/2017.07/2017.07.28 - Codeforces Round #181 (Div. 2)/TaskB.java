package solutions;

import java.util.*;
import java.io.PrintWriter;

public class TaskB {

    static class Student {
        int id;
        List<Integer> link = new ArrayList<>();
        public Student(int id) {
            this.id = id;
        }
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        Student[] graph = new Student[n];
        for (int i = 0; i < n; ++i) {
            graph[i] = new Student(i + 1);
        }

        for (int i = 0; i < m; ++i) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;

            graph[a].link.add(b);
            graph[b].link.add(a);

        }

        if (m == 0) {
            int count = 0;
            for (int i = 0; i < n; ++i) {
                out.print((i + 1) + " ");
                ++count;
                if (count % 3 == 0) out.println();
            }
            return;
        }

        boolean[] isAlone = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        int alone = 0;
        for (int i = 0; i < n; ++i) {
            if (graph[i].link.size() == 0) {
                isAlone[i] = true;
                ++alone;
                q.add(i + 1);
            }
        }

        boolean[] mark = new boolean[n];
        for (int i = 0; i < n; ++i) {
            if (isAlone[i]) continue;
            if (mark[i]) continue;
            int res = dfs(graph, i, mark);
            if (res == 3) continue;
            if (res > 3) {
                out.print(-1);
                return;
            }
            if (alone == 0) {
                out.print(-1);
                return;
            }
            alone -= (3 - res);
        }

        Arrays.fill(mark, false);
        for (int i = 0; i < n; ++i) {
            if (isAlone[i] || mark[i]) continue;
            List<Integer> set = new ArrayList<>();
            makeSet(graph, i, mark, set);
            while (set.size() != 3) {
                set.add(q.poll());
            }
            for (Integer std : set) {
                out.print(std + " ");
            }
            out.println();
        }

        for (Integer std : q) {
            out.print(std + " ");
        }
    }

    private void makeSet(Student[] graph, int at, boolean[] mark, List<Integer> set) {
        mark[at] = true;
        set.add(at + 1);
        for (Integer next : graph[at].link) {
            if (!mark[next]) {
                makeSet(graph, next, mark, set);
            }
        }
    }

    private int dfs(Student[] graph, int at, boolean[] mark) {
        mark[at] = true;
        int res = 1;
        for (Integer next : graph[at].link) {
            if (!mark[next]) {
                res += dfs(graph, next, mark);
            }
        }
        return res;
    }
}
