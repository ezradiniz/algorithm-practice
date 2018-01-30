package solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.PrintWriter;

public class GamingArray {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int g = in.nextInt();
        String[] players = {"ANDY", "BOB"};
        for (int q=0; q<g; q++) {
            int n = in.nextInt();
            int[] a = new int[n];
            int max = 0;
            int threshold = n;
            for (int i=0; i<n; i++) {
                a[i] = in.nextInt();
                if (a[i] > max) {
                    max = a[i];
                    threshold = i;
                }
            }


            int x = 0;


            while (threshold != 0) {
               x ^= 1;
                max = 0;
                int limit = threshold;
                for (int i=0; i<limit; i++) {
                    if (a[i] > max) {
                        max = a[i];
                        threshold = i;
                    }
                }
            }

            x ^= 1;

            out.println(players[x]);
        }
    }
}
