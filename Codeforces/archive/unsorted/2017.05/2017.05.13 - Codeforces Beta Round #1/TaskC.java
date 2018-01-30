package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        double xa = in.nextDouble();
        double ya = in.nextDouble();

        double xb = in.nextDouble();
        double yb = in.nextDouble();

        double xc = in.nextDouble();
        double yc = in.nextDouble();

        double area = Math.abs((xa*yb) + (ya*xc) + (xb*yc) - ((xc*yb) + (yc*xa) + (xb*ya)))/2;
        out.println(String.format("%.8f", area));
    }
}
