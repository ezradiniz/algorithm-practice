package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class RichieRich {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        char[] a = in.next().toCharArray();
        boolean[] pos = new boolean[n/2];

        int count = 0;
        for (int i = 0; i < n/2; ++i) {
            if (a[i] != a[n-i-1]) {
                a[i] = a[n-i-1] = (char)(Math.max(a[i]-'0', a[n-i-1]-'0')+'0');
                count++;
                pos[i] = true;
            }
        }

        if (count > k) {
            out.println(-1);
        } else {

            int diff = k - count;

            if (diff > 0) {

                for (int i = 0; i < n/2 && diff > 0; ++i) {
                    if (a[i] == '9') continue;
                    if (pos[i]) {
                        a[i] = a[n-i-1] = '9';
                        diff--;
                    } else {
                        if (diff - 2 >= 0) {
                            a[i] = a[n-i-1] = '9';
                            diff -= 2;
                        }
                    }
                }

                if (diff >= 1 && n % 2 == 1) {
                    a[n/2] = '9';
                }
            }

            out.println(new String(a));
        }
    }
}
