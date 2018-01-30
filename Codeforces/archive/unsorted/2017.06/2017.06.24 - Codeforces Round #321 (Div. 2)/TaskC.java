package solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public class Vertice {
        ArrayList<Integer> edges = new ArrayList<>();
        boolean hasCat = false;
        boolean visited = false;
        int cats = 0;
    }
    
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        Vertice[] graph = new Vertice[n];
        for (int i = 0; i < n; ++i) {
            int a = in.nextInt();
            graph[i] = new Vertice();
            if (a == 1) graph[i].hasCat = true;
        }
        for (int i = 0; i < n - 1; ++i) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            graph[x].edges.add(y);
            graph[y].edges.add(x);
        }

        int res = path(graph, m);
        out.print(res);
    }

    private int path(Vertice[] graph, int m) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        int res = 0;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            graph[cur].visited = true;
            if (graph[cur].hasCat) {
                graph[cur].cats++;
            } else {
                graph[cur].cats = 0;
            }

            if (graph[cur].cats > m) continue;

            for (Integer i : graph[cur].edges) {
                if (graph[i].visited) continue;
                queue.add(i);
                graph[i].cats += graph[cur].cats;
            }

            if (graph[cur].edges.size() == 1 && cur != 0) ++res;
        }

        return res;
    }
}
