package solutions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Stack;

public class ZeroOneGame {

    private static String[] player = {"Alice", "Bob"};
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        int g = in.nextInt();
        for (int x =0; x<g; ++x) {
            int n = in.nextInt();

            ArrayList<Integer> seq = new ArrayList<>();

            for (int i=0; i<n; i++) {
                seq.add(in.nextInt());
            }

            int p = getWon(seq);
            out.println(player[p]);
        }
    }

    private static int getWon(ArrayList<Integer> seq) {


        int x = 0;
        for (int i = 0; i < seq.size(); i++) {
            if (i - 2 >= 0) {
                if (seq.get(i - 2) == 0 && seq.get(i) == 0) {
                    seq.remove(i - 1);
                    i -= 2;
                    x ^= 1;
                }
            }
        }


        return x ^ 1;

    }
}
