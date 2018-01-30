package solutions;

import java.util.*;
import java.io.PrintWriter;

public class TaskC {

    static class Part {
        int cost;
        List<Integer> rope = new ArrayList<>();
        Set<Integer> mark = new HashSet<>();

        public Part(int cost) {
            this.cost = cost;
        }
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        Part[] toy = new Part[n];
        for (int i = 0; i < n; ++i) {
            toy[i] = new Part(in.nextInt());
        }
        for (int i = 0; i < m; ++i) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            toy[x].rope.add(y);
        }
        
        int res = 0;
        for (int i = 0; i < n; ++i) {
            res += getCost(toy, i);
        }

        out.print(res);
    }

    private int getCost(Part[] toy, int at) {

        int res = 0;
        for (Integer t: toy[at].rope) {
            if (toy[t].mark.contains(t)) continue;
            res += Math.min(toy[t].cost, toy[at].cost);
            toy[at].mark.add(t);
        }

        return res;
    }
}
