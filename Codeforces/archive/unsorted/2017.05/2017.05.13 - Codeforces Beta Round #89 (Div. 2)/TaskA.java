package solutions;

import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        HashSet<Character> set = new HashSet<>();
        set.add('A');
        set.add('O');
        set.add('Y');
        set.add('E');
        set.add('U');
        set.add('I');

        String str = in.next();

        StringBuilder s = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (set.contains(Character.toUpperCase(c))) continue;
            s.append('.');
            s.append(Character.toLowerCase(c));
        }

        out.println(s.toString());
    }
}
