package solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class LilysHomework {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }

        int x = solution(a);
        reverse(a);
        int y = solution(a);

        out.print(Math.min(x, y));
    }

    private static int solution(int[] a) {
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i=0; i<a.length; i++) {
            m.put(a[i], i);
        }

        int[] sorted = a.clone();
        Arrays.sort(sorted);
        int ret = 0;

        for (int i=0; i<a.length; i++) {
            if (a[i] != sorted[i]) {
                ret++;
                int swap = m.get(sorted[i]);
                m.put(a[i], m.get(sorted[i]));
                int tmp = a[i];
                a[i] = sorted[i];
                a[swap] = tmp;
            }
        }
        return ret;
    }

    private static void reverse(int[] a) {
        for(int i = 0; i < a.length / 2; i++)
        {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
    }

}
