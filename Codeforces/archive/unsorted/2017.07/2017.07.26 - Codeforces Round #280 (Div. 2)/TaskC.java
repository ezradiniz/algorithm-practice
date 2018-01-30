package solutions;

import java.util.*;
import java.io.PrintWriter;

public class TaskC {

    static class Grade {
        long a;
        long b;

        public Grade(long a, long b) {
            this.a = a;
            this.b = b;
        }
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextLong();
        long r = in.nextLong();
        long avg = in.nextLong();

        List<Grade> grade = new ArrayList<>();
        long sum = 0;
        for (int i = 0; i < n; ++i) {
            long a = in.nextLong();
            long b = in.nextLong();
            sum += a;
            if (a >= r) continue;
            grade.add(new Grade(a, b));
        }

        if ((float)sum/n >= avg) {
            out.print(0);
            return;
        }

        Collections.sort(grade, new Comparator<Grade>() {
            @Override
            public int compare(Grade grade, Grade t1) {
                int c = (int)(grade.b - t1.b);
                if (c == 0) {
                    return (int)(grade.a - t1.a);
                }
                return c;
            }
        });


        long res = 0;
        long times = n * avg - sum;
        for (TaskC.Grade cur : grade) {
            if (times == 0) break;
            if (cur.a + times >= r) {
                times = times - (r - cur.a);
                res += cur.b * (r - cur.a);
            } else {
                res += cur.b * times;
                times -= times;
            }
        }

        out.print(res);
    }
}
