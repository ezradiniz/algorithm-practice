package solutions;

import util.FastInput;
import java.io.PrintWriter;

public class TaskD {

    static final int MOD = (int) (1e9 + 7);

    public void solve(int testNumber, FastInput in, PrintWriter out) {
        char[] s = in.next().toCharArray();
        int b = 0;
        int res = 0;
        for (int i = s.length - 1; i >= 0; --i) {
            if (s[i] == 'b') ++b;
            else {
                res = (res + b) % MOD;
                b = (b * 2) % MOD;
            }
        }
        out.print(res);
    }
    /*
        abbbbababba
        bbabbbbababba
        bbbbabbbababba
        bbbbbbabbababba
        bbbbbbbbabababba
        bbbbbbbbbbaababba
        bbbbbbbbbbabbaabba
        bbbbbbbbbbbbabaabba
        bbbbbbbbbbbbbbaaabba
        bbbbbbbbbbbbbbaabbaba
        bbbbbbbbbbbbbbabbababa
        bbbbbbbbbbbbbbbbabababa
     */
}
