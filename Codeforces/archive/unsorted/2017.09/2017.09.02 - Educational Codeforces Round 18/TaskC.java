package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.Arrays;

public class TaskC {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        char[] s = in.next().toCharArray();
        long sum = 0;
        char[] res = new char[s.length];
        for (int i = 0; i < s.length; ++i) {
            res[i] = s[i];
            sum += s[i] - '0';
        }
        Arrays.sort(s);

    }
}
