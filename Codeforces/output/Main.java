import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastInput in = new FastInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastInput in, PrintWriter out) {
            int n = in.nextInt();
            int x = in.nextInt();
            if (n == 1) {
                out.print("YES\n" + x);
            } else if (n == 2 && x == 0) {
                out.print("NO");
            } else if (n == 2) {
                out.print("YES\n0 " + x);
            } else {
                int res = 0;
                out.print("YES\n");
                for (int i = 1; i <= n - 3; ++i) {
                    out.print(i + " ");
                    res ^= i;
                }

                final long pw1 = (1L << 17);
                final long pw2 = (1L << 18);

                if (res == x) out.print((pw1 + pw2) + " " + pw1 + " " + pw2);
                else out.print(pw1 + " " + ((pw1 ^ x) ^ res) + " 0");
            }
        }

    }

    static class FastInput {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public FastInput(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

