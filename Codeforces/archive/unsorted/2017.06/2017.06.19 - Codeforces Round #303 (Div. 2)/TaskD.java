package solutions;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskD {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

//        int n = in.nextInt();
//        int[] q = new int[n];
//        for (int i = 0; i < n; ++i) q[i] = in.nextInt();
//        int res = solution(q);
//        out.print(res);

        int fails = 0;
        for (int i = 0; i < 1000; ++i) {
            int[] q = generateQueue();
            int res1 = solution(q);
            int res2 = bruteForce(q);

            if (res1 == res2) {
                out.println("Ok");
            } else {
                out.println("Fail - " + res1 + " != " + res2);
                ++fails;
            }
        }
        out.println("\nFAILS: " + fails);
    }

    private int[] generateQueue() {
        Random r = new Random();
        int n = r.nextInt(1000) + 1;
        int[] q = new int[n];

        for (int i = 0; i < n; ++i) {
            q[i] = r.nextInt(1000) + 1;
        }

        return q;
    }

    private int solution(int[] q) {
        Arrays.sort(q);
        int n = q.length;
        int res = 0;

        long sum = 0;
        int j = 0;

        for (int i = 0; i < n; ++i) {
            if (sum <= q[j]) {
                sum += q[j];
                ++res;
                ++j;
            } else {
                if (sum <= q[i]) {
                    int tmp = q[j -1];
                    q[j - 1] = q[i];
                    q[i] = tmp;
                    sum += q[j - 1];
                    ++j;
                    ++res;
                }
            }
        }
        return res;
    }

    private int bruteForce(int[] q) {
        int res = 0;
        Arrays.sort(q);
        int sum = 0;

        for (int i = 0; i < q.length; ++i) {
            if (sum <= q[i]) {
                ++res;
            } else {
                for (int j = i + 1; j < q.length; ++j) {
                    if (sum <= q[j]) {
                        int tmp = q[j];
                        q[j] = q[i];
                        q[i] = tmp;
                        ++res;
                        break;
                    }
                }
            }
            sum += q[i];
        }

        return res;
    }
}
