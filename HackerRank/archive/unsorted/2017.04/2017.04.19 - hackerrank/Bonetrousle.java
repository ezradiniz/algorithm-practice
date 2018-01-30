package solutions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;

public class Bonetrousle {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        for (int x = 0; x < t; x++) {
            long n = in.nextLong(); //the number of sticks to buy
            long k = in.nextLong(); //the number of boxes the store has fore sale
            long b = in.nextInt(); //the number of boxes to buy

            long l = k*(k-b)/2;
            if (b > k || l < n) {
                out.println(-1);
                continue;
            }
            ArrayList<Integer> box = purchBox(n, k, b);
            for (Integer nb : box) {
                out.print(nb + " ");
            }
            out.println();
        }
    }

    private ArrayList<Integer> purchBox(long n, long k, long b) {
        ArrayList<Integer> box = new ArrayList<>();

        for (long i=1; i<=k; i++) {

        }
        return box;
    }
}
