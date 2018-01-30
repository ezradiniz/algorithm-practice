package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] cubes = new int[n];
        for (int i = 0; i < n; ++i) cubes[i] = in.nextInt();
        Arrays.sort(cubes);
        for (int i = 0; i < n; ++i) {
            out.print(cubes[i] + " ");
        }
    }
}
