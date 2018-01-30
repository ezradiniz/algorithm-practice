package solutions;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskA {
    final static String[] PLAYERS = {"Akshat", "Malvika"};

    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        if (n > m) {
            n = m;
        }

        if (n % 2 == 0) out.println("Malvika");
        else out.println("Akshat");

//        int points = n * m;
//
//        int p = 0;
//        while (points > 0) {
//            if (n < m) {
//                n--;
//                points -= m;
//            } else if (n > m) {
//                m--;
//                points -= n;
//            }
//            else {
//                points -= n + m - 1;
//                n--;
//                m--;
//            }
//            p ^= 1;
//        }
//
//        p ^= 1;
//
//        out.println(PLAYERS[p]);
    }
}
