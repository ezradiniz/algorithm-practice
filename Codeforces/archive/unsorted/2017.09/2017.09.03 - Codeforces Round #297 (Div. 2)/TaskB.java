package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaskB {
    final static int MAX = 200100;

    public void solve(int testNumber, FastInput in, PrintWriter out) {
        char[] s = in.next().toCharArray();
        int m = in.nextInt();
        int[] count = new int[MAX];
        for (int i = 0; i < m; ++i) {
            int x = in.nextInt();
            count[x - 1]++;
        }

        int n = s.length;
        int half = n / 2;
        int c = 0;
        for (int i = 0; i < half; ++i) {
            c += count[i];
            if (c % 2 == 1) {
                char tmp = s[i];
                s[i] = s[n - i - 1];
                s[n - i -1] = tmp;
            }
        }

        out.print(new String(s));
    }

//    private void reverse(char[] s, int k) {
//        int n = s.length;
//        for (int i = k; i < n / 2; ++i) {
//            char tmp = s[i];
//            s[i] = s[n - i - 1];
//            s[n - i - 1] = tmp;
//        }
//    }
}
