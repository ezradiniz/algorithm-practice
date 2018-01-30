package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.next();
        String[] lucky = s.split("(0|1|2|3|5|6|8|9|)");
        int count4 = 0;
        int count7 = 0;
        for (String str : lucky) {
            if (str.equals("4")) count4++;
            if (str.equals("7")) count7++;
        }

        if (count4 == 0 && count7 == 0) out.println("-1");
        else if (count4 >= count7) out.println("4");
        else out.println("7");
    }
}
