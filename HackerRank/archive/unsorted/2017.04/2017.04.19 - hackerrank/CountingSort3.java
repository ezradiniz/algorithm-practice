package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class CountingSort3 {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();
        int[] a = new int[100];
        for (long i=0; i<n; i++) {
            a[in.nextInt()]++;
            in.next();
        }
        int count = 0;
        for (int i=0; i<100; i++) {
            count += a[i];
            out.print(count + " ");
        }
    }
}
