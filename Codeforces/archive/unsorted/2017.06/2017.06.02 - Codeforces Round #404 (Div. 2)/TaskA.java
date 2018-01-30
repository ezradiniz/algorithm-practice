package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        long faces = 0;
        for (int i = 0; i < n; ++i) {
            String poly = in.next();
            if (poly.equals("Tetrahedron")) faces += 4;
            if (poly.equals("Cube")) faces += 6;
            if (poly.equals("Octahedron")) faces += 8;
            if (poly.equals("Dodecahedron")) faces += 12;
            if (poly.equals("Icosahedron")) faces += 20;
        }
        out.print(faces);
    }
}
