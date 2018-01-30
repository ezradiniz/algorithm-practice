package solutions;

import java.math.BigInteger;
import java.util.*;
import java.io.PrintWriter;

public class GridlandMetro {

    static class Col implements Comparable{
        long c1;
        long c2;
        public Col(long c1, long c2) {
            this.c1 = c1;
            this.c2 = c2;
        }

        @Override
        public int compareTo(Object o) {
            Col c = (Col)o;
            if (c.c1 == c1) return (int)(c2-c.c2);
            return (int)(c1 - c.c1);
        }
    }
    static class Cell {
        ArrayList<Col> cols = new ArrayList<>();

        public void interval(long c1, long c2) {

            cols.add(new Col(c1, c2));

            Collections.sort(cols);

            Col prev = cols.get(0);
            for (int i=1; i<cols.size(); i++) {
                Col cur = cols.get(i);
                if (prev.c1 == cur.c1 || prev.c2 >= cur.c1) {
                    prev.c2 = Math.max(prev.c2, cur.c2);
                    cols.remove(i);
                    i--;
                }else {
                    prev = cur;
                }
            }
        }
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextInt();
        long m = in.nextInt();
        int k = in.nextInt();


        HashMap<Long, Cell> grid = new HashMap<>();

        for (int x=0; x<k; ++x) {
            long r = in.nextInt()-1;
            long c1 = in.nextInt()-1;
            long c2 = in.nextInt()-1;
            Cell c;
            if (!grid.containsKey(r)) {
                c = new Cell();
                grid.put(r, c);
            } else {
                c = grid.get(r);
            }
            c.interval(c1, c2);
        }

        long res = 0;
        for (Cell c : grid.values()) {
            for (Col col : c.cols) {
                res += col.c2-col.c1+1;
            }
        }
        out.print(n*m-res);
    }
}
