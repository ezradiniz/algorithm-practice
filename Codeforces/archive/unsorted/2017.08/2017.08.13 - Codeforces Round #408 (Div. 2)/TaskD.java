package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.*;

public class TaskD {

    static class City {
        boolean hasPolice = false;
        int minDistance;
        int link = -1;
        List<Road> roads = new ArrayList<>();

        public City(int minDistance) {
            this.minDistance = minDistance;
        }
    }

    static class Road {
        int road;
        int to;

        public Road(int road, int to) {
            this.road = road;
            this.to = to;
        }
    }

    public void solve(int testNumber, FastInput in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        int d = in.nextInt();

        City[] cities = new City[n];
        for (int i = 0; i < n; ++i) {
            cities[i] = new City(d);
        }

        Set<Integer> polices = new HashSet<>();
        for (int i = 0; i < k; ++i) {
            int p = in.nextInt() - 1;
            polices.add(p);
            cities[p].hasPolice = true;
            cities[p].minDistance = 0;
        }

        for (int i = 0; i < n - 1; ++i) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            cities[u].roads.add(new Road(i + 1, v));
            cities[v].roads.add(new Road(i + 1, u));
        }

        boolean[] mark = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        for (Integer p : polices) {
            q.add(p);
            mark[p] = true;
        }

        Set<Integer> res = new HashSet<>();
        while (!q.isEmpty()) {
            int at = q.poll();
            for (Road r : cities[at].roads) {
                int to = r.to;
                if (cities[at].hasPolice && cities[to].hasPolice) {
                    res.add(r.road);
                }
                if (cities[at].hasPolice) {
                    cities[to].link = at;
                    cities[to].minDistance = 1;
                } else if (cities[to].minDistance + 1 <= cities[at].minDistance) {
                    cities[at].minDistance = cities[to].minDistance + 1;
                    cities[at].link = to;
                }
                if (!mark[to]) {
                    mark[to] = true;
                    q.add(to);
                }
            }
        }

        Arrays.fill(mark, false);
        for (int i = 0; i < n; ++i) {
            if (cities[i].hasPolice || mark[i]) continue;
            mark[i] = true;
            for (Road r : cities[i].roads) if (cities[i].link != r.to && cities[r.to].link != i) {
                res.add(r.road);
            }
        }

        out.println(res.size());
        for (Integer r : res) {
            out.print(r + " ");
        }
    }

}
