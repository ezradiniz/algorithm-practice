package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long[] rgb = new long[3];
        rgb[0] = in.nextLong();
        rgb[1] = in.nextLong();
        rgb[2] = in.nextLong();
        Arrays.sort(rgb);
        if (rgb[0] + rgb[1] <= rgb[2] / 2) {
            out.print(rgb[0] + rgb[1]);
        } else {
            out.print((rgb[0] + rgb[1] + rgb[2]) / 3);
        }
    }
}
