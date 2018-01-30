package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        float m = in.nextFloat();
        float n = in.nextFloat();

//       if (m % 2 == 0 && n % 2 == 0) {
//           out.println((int)(m/2 * n));
//       } else if (m % 2 == 0) {
//           out.println((int)(n * Math.ceil(m/2)));
//       } else if (n % 2 == 0) {
//           out.println((int)(m * Math.ceil(n/2)));
//       } else {
//           out.println((int)(Math.floor((n * m)/2)));
//       }
        out.println((int)Math.floor(n * m/2));
    }
}
