package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    final static char[] COL = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                                'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        for (int t = 0; t < n; ++t) {
            String coord = in.next();

            StringBuilder res = new StringBuilder();

            if (coord.matches("R[0-9]{1,}C[0-9]{1,}")) {
                int r = Integer.parseInt(coord.substring(coord.indexOf('R')+1, coord.indexOf('C')));
                int c = Integer.parseInt(coord.substring(coord.indexOf('C')+1));

                while (c > 0) {
                    int d = c % 26;
                    if (d == 0) {
                        d = 26;
                        c -= 1;
                    }
                    res.insert(0, COL[d]);
                    c /= 26;
                }

                res.append(r);
            } else {
                int i = 0;
                int col = 0;
                for (; i < coord.length(); ++i) {
                    char c = coord.charAt(i);
                    if (c >= '0' && c <= '9') break;

                    col *= 26;
                    col += c - 64;
                }

                res.append('R');
                res.append(coord.substring(i));
                res.append('C');
                res.append(col);
            }

            out.println(res.toString());
        }
    }
}
