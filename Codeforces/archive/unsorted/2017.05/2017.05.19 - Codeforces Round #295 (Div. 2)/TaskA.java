package solutions;

import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Set;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        String s = in.next().toLowerCase();
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) set.add(c);
        if (set.size() == 26) out.print("YES");
        else out.print("NO");
    }
}
