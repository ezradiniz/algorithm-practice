package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class SherlockAndTheBeast {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        for (int x =0; x<t; ++x) {
            int n = in.nextInt();

            int threshold5 = n;
            boolean isValid = true;
            if ((5 *n) % 3 != 0) {

                int count5 = n;
                int count3 = 0;


                isValid = false;
                for (int i=n-1; i>=0; --i) {
                    count5--;
                    count3++;

                    if (count5 % 3 == 0 && count3 % 5 == 0) {
                        threshold5 = count5;
                        isValid = true;
                        break;
                    }
                }

                if (!isValid) {
                    if (3 * n % 5 == 0) {
                        isValid = true;
                        threshold5 = 0;
                    }
                }

            } else  {
                threshold5 = n;
            }

            if(isValid) {
                for (int i=0; i<n; i++) {
                    if (i < threshold5) out.print(5);
                    else out.print(3);
                }
                out.println();
            } else {
                out.println(-1);
            }
        }
    }
}
