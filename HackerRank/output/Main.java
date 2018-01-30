import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        NewYearChaos solver = new NewYearChaos();
        solver.solve(1, in, out);
        out.close();
    }

    static class NewYearChaos {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int t = in.nextInt();
            for (int x = 0; x < t; x++) {
                int n = in.nextInt();
                int[] q = new int[n];
                for (int i = 0; i < n; i++) {
                    q[i] = in.nextInt();
                }

                boolean isValid = true;
                for (int i = 0; i < n; i++) {
                    int m = q[i] - 1;
                    if (m < i) continue;
                    int diff = Math.abs(m - i);
                    if (diff > 2) {
                        out.println("Too chaotic");
                        isValid = false;
                        break;
                    }
                }

                if (!isValid) continue;

                int count = 0;
                for (int i = 0; i < n; i++) {
                    boolean swap = false;
                    for (int j = 0; j < n - 1; j++) {
                        if (q[j] > q[j + 1]) {
                            int tmp = q[j];
                            q[j] = q[j + 1];
                            q[j + 1] = tmp;
                            count++;
                            swap = true;
                        }
                    }
                    if (!swap) break;
                }
                out.println(count);
            }
        }

    }
}

