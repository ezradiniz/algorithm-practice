package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class Encrypton {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String text = in.next();
        int l = text.length();
        int fRoot = (int) Math.floor(Math.sqrt(l));
        int cRoot = (int) Math.ceil(Math.sqrt(l));

        String res = "";

        for (int c = 0; c <cRoot; ++c) {
            res += " " + text.charAt(c);
            int offset = cRoot;
            for (int r = 0; r<fRoot; ++r) {
                if (c + offset >= l) break;
                res += text.charAt(c + offset);
                offset += cRoot;
            }
        }

        out.print(res.trim());
    }
}
