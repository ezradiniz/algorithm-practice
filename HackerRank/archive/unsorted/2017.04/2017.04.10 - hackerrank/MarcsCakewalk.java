package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class MarcsCakewalk {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        int n = in.nextInt();
        int[] cupcake = new int[n];

        for (int i=0; i<n; ++i) {
            cupcake[i] = in.nextInt();
        }

        Arrays.sort(cupcake);
        long miles = 0;
        for (int i=n; i>0; --i) {
            miles += cupcake[i-1] * Math.pow(2, n-i);
        }
        out.print(miles);
    }
}
