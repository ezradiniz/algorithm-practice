package solutions;

import java.math.BigInteger;
import java.util.Scanner;
import java.io.PrintWriter;

public class ChiefHopper {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; ++i) {
            h[i] = in.nextInt();
        }
        int res = 1;
        BigInteger energy = BigInteger.ZERO;
        boolean hasEnergy = true;
        while (hasEnergy) {
            for (int i = 0; i < h.length; ++i) {
                if (energy.compareTo(BigInteger.valueOf(h[i])) <  0) {
                    energy = energy.add(BigInteger.valueOf(h[i]).subtract(energy));
                    if (energy.compareTo(BigInteger.ZERO) > 0) {
                        hasEnergy = true;
                        res++;
                        energy = BigInteger.valueOf(res);
                        break;
                    }
                } else {
                    energy = energy.add(energy.subtract(BigInteger.valueOf(h[i])));
                }
                hasEnergy = false;
            }
        }

        out.println(res);
    }
}
