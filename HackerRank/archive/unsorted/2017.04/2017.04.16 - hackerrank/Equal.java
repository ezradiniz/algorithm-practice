package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;

public class Equal {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        for (int x=0; x<t; x++) {
            int n = in.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for (int i=0; i<n; i++) {
                set.add(in.nextInt());
            }
            int[] a = new int[set.size()];
            int i=0;
            for (Integer c : set) {
                a[i] = c;
                i++;
            }

            Arrays.sort(a);
            int count = 0;
            while (!isEqual(a)) {
                int[] p = minDiff(a);

                int j = p[0];
                int min = increment(p[1]);

                for (i=0; i<a.length; i++) {
                    if (i == j) continue;
                    a[i] += min;
                }
                count++;
                Arrays.sort(a);
            }

            out.println(count);
        }
    }

    public boolean isEqual(int[] a) {
        int v = a[0];
        for (int i=1; i<a.length; i++) {
            if (a[i] != v) return false;
        }
        return true;
    }

    public int[] minDiff(int[] a) {
        int p[] = new int[2];
        p[0] = p[1] = 0;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<a.length-1; i++) {
            if (a[i+1] - a[i] < min && a[i+1] - a[i] > 0) {
                min = a[i+1] - a[i];
                p[0] = i+1;
                p[1] = min;
            }
        }
        return p;
    }

    public int increment(int min) {
        if (min == 1) return 1;
        if (min == 2) return 2;
        return 5;
    }
}
