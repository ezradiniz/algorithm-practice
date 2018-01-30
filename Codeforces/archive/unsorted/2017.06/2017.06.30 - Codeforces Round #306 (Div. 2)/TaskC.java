package solutions;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String n = in.next();

        ArrayList<String> div = new ArrayList<>();
        for (int i = 0; i < 1000; ++i) {
            if (i % 8 == 0) div.add(String.valueOf(i));
        }


        for (String nb : div) {
            boolean isValid = true;
            int j = 0;
            for (int i = 0; i < nb.length(); ++i) {
                char d = nb.charAt(i);
                isValid = false;
                for ( ; j < n.length(); ++j) {
                    if (n.charAt(j) == d)  {
                        ++j;
                        isValid = true;
                        break;
                    }
                }
            }
            if (isValid) {
                out.println("YES");
                out.print(nb);
                return;
            }
        }

        out.print("NO");
    }
}
