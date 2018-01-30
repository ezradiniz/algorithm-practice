package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.*;

public class TaskB {

    static class City {
        int id;
        Set<Integer> impossible = new HashSet<>();

        public City(int id) {
            this.id = id;
        }
    }

    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        City[] graph = new City[n];
        for (int i = 0; i < n; ++i) graph[i] = new City(i);

        out.println(n - 1);

        for (int i = 0; i < m; ++i) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            graph[u].impossible.add(v);
            graph[v].impossible.add(u);
        }

        City city = null;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            int s = graph[i].impossible.size();
            if (s < min) {
                min = s;
                city = graph[i];
            }
        }

        if (city == null) throw new RuntimeException();

        for (int i = 0; i < n; ++i) {
            if (city.id == i) continue;
            if (city.impossible.contains(i)) {
                for (int j = 0; j < n; ++j) {
                    if (i == j) continue;
                    if (!graph[i].impossible.contains(j)) {
                        out.println((i + 1) + " " + (j + 1));
                        break;
                    }
                }
            } else {
                out.println((city.id + 1) + " " + (i + 1));
            }
        }
    }
}
