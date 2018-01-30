package solutions;

import util.FastInput;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class TaskA {
    public void solve(int testNumber, FastInput in, PrintWriter out) {
        String s = in.next();
        int res = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); ++i) {
            char[] spell = new char[s.length()];
            for (int j = i, l = 0; j < i + s.length(); ++j, ++l) {
                spell[l] = s.charAt(j % s.length());
            }
            String sb = new String(spell);
            if (!set.contains(sb)) {
                set.add(sb);
                ++res;
            }
        }
        out.print(res);
    }
}
