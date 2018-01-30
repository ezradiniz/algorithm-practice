package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        char[] s = in.next().toCharArray();
        int[] d = new int[6];
        for (int i = 0; i < 6; ++i) d[i] = s[i] - '0';
        int left = 0;
        int right = 0;
        for (int i = 0; i < 3; ++i) left += d[i];
        for (int i = 3; i < 6; ++i) right += d[i];

        if (left == right) {
            out.print(left - right);
            return;
        }

        int[] b = Arrays.copyOfRange(d, 0, 3);
        int[] c = Arrays.copyOfRange(d, 3, 6);
        Arrays.sort(b);
        Arrays.sort(c);

        int l = left;
        int r =  right;

        int res = 0;
        for (int i = 0; i < 3; ++i) {
            if (left > right) {
                ++res;
                if (9 - b[3 - i - 1] <= c[3 - i - 1]) {
                    l = l - b[3 -i - 1] + 9;
                } else {

                }
            }
        }
        out.print(res);
    }
}
