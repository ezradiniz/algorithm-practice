package solutions;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class JenanieRoute {

    static class City {
        int id;
        ArrayList<Integer[]> roads = new ArrayList<>(); //[0] = route, [1] weight
        public City(int id) {
            this.id = id;
        }
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();

        int[] letters = new int[k];
        for (int i=0; i<k; i++) {
            letters[i] = in.nextInt()-1;
        }

        City[] cities = new City[n];
        for (int i=0; i<n; i++) {
            cities[i] = new City(i);
        }

        for (int i=0; i<n-1; i++) {
            int u = in.nextInt()-1;
            int v = in.nextInt()-1;
            int d = in.nextInt();

            cities[v].roads.add(new Integer[] {u, d});
            cities[u].roads.add(new Integer[] {v, d});
        }

    }
}
