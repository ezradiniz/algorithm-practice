package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class AbsolutePermutation {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int t = in.nextInt();
        for (int a0=0; a0<t; ++a0) {
            int n = in.nextInt();
            int k = in.nextInt();


            boolean[] unique = new boolean[n];
            boolean isValid = true;
            if (k == 0) {
              for (int i= 0; i<n; i++) out.print(i+1 + " ");
              out.println();
            } else if (n %(k*2) != 0) {
                out.println(-1);
            } else {
                boolean add = true;
                int[] arr = new int[n];
                for (int i = 0; i < n; ++i) {
                    if (add) {
                        arr[i] = i +k +1;
                    } else {
                        arr[i] = i+1-k;
                    }

                    if ((i+1) % k == 0) {
                        if (add) {
                            add = false;
                        } else {
                            add = true;
                        }
                    }
                }

                for (int i=0; i<n; i++) out.print(arr[i] + " ");
                out.println();
            }
        }
    }
}
