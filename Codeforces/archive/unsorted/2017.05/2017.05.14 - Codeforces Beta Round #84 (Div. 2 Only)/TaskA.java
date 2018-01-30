package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String number = in.next();
        if (isNearlyLucky(number)) {
            out.println("YES");
        } else {
           out.println("NO");
        }
    }

    private boolean isNearlyLucky(String n) {
        int res = 0;
        for (Character c : n.toCharArray()) {
            if (c == '4' || c == '7') res++;
        }
        return isLucky(String.valueOf(res));
    }

    private boolean isLucky(String n) {
       boolean hasLucky = false;
       for (Character c : n.toCharArray()) {
           if (c == '4' || c == '7') hasLucky = true;
           else return false;
       }

       if (hasLucky) return true;
       else return false;
    }
}
