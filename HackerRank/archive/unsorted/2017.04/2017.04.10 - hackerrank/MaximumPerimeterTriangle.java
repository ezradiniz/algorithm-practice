package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class MaximumPerimeterTriangle {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] length = new int[n];
        for (int i=0; i<n; i++) {
            length[i] = in.nextInt();
        }

        Arrays.sort(length);

        int max = Integer.MIN_VALUE;
        int[] triangle = {1, 2, 3};

        for (int i=0; i<n-2; i++) {
            int a = length[i],
                b = length[i+1],
                c = length[i+2];

            int p = a + b + c;

            if (isTriangle(a, b, c)) {
                if (p > max) {
                    triangle[0] = a;
                    triangle[1] = b;
                    triangle[2] = c;
                    max = p;
                }
            }
        }

        if (max == Integer.MIN_VALUE) {
            out.print(-1);
        } else {
            out.print(triangle[0] + " " + triangle[1] + " " + triangle[2]);
        }
    }

    private boolean isTriangle(int a, int b, int c) {
        return (a+b > c) && (a + c > b) && (b+c > a);
    }
}
