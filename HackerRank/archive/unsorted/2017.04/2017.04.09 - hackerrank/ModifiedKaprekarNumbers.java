package solutions;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class ModifiedKaprekarNumbers {
    public void solve(int testNumber, Scanner in, PrintWriter out) {

        int p = in.nextInt();
        int q = in.nextInt();

        //out.print(isKaprekar(297));

        boolean has = false;
        for (int i=p; i<=q; ++i) {
            if (isKaprekar(i)) {
                has = true;
                out.print(i + " ");
            }
        }

        if (!has) out.print("INVALID RANGE");
    }

    private static boolean isKaprekar(int num) {
        long squared = (long) num * num;
        String str   = String.valueOf(squared);
        String left  = str.substring(0, str.length() / 2);
        String right = str.substring(str.length() / 2);
        int numL = (left.isEmpty())  ? 0 : Integer.parseInt(left);
        int numR = (right.isEmpty()) ? 0 : Integer.parseInt(right);
        return numL + numR == num;
    }
}
