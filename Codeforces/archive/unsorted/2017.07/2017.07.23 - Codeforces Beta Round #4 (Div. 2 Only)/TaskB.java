package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {

    static class Time {
        int min;
        int max;

        public Time(int min, int max) {
            this.min = min;
            this.max = max;
        }
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int d = in.nextInt();
        int sumTime = in.nextInt();

        Time[] days = new Time[d];

        int sumMin = 0;
        int sumMax = 0;
        for (int i = 0; i < d; ++i) {
            int min = in.nextInt();
            int max = in.nextInt();
            days[i] = new Time(min, max);
            sumMin += min;
            sumMax += max;
        }

        if (sumMax < sumTime) {
            out.print("NO");
            return;
        }

        int diff = sumTime - sumMin;

        if (diff < 0) {
            out.print("NO");
            return;
        }

        int sumDiff = 0;
        for (int i = 0; i < d; ++i) {
            if (diff == 0) break;
            int val = days[i].max - days[i].min;
            if (val > diff) val = diff;
            days[i].min += val;
            diff -= val;
            sumDiff += val;
        }

        if (diff == 0) {
            if (sumDiff + sumMin == sumTime) {
                out.println("YES");
                for (int i = 0; i < d; ++i) {
                    out.print(days[i].min + " ");
                }
            } else {
                out.print("NO");
            }
        } else {
            out.print("NO");
        }
    }
}
